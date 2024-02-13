package day0213;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.management.openmbean.OpenDataException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SimpleChatClient extends JFrame implements ActionListener, Runnable {
	private JTextArea jtaTalkDisplay;
	private JTextField jtfTalk;
	private JScrollPane jspTalk;

	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;

	public SimpleChatClient() {
		super(":::::::채팅클라이언트:::::::");
		jtaTalkDisplay = new JTextArea();
		jtaTalkDisplay.setEditable(false);
		jtfTalk = new JTextField();
		jspTalk = new JScrollPane(jtaTalkDisplay);

		jspTalk.setBorder(new TitledBorder("대화내용"));
		jtfTalk.setBorder(new TitledBorder("대화"));

		add("Center", jspTalk);
		add("South", jtfTalk);

		setBounds(100, 100, 500, 600);
		setVisible(true);

		try {
			connectToServer();
		} catch (IOException e) {
			e.printStackTrace();
		}

		jtfTalk.addActionListener(this);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					closeClient();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					dispose();
				}
			}// windowClosing
		});// addWindowListener

	}// SimpleChatServer

	private void closeClient() throws IOException {
		if (dosWriteStream != null) {
			dosWriteStream.close();
		}
		if (disReadStream != null) {
			disReadStream.close();
		}
		if (someClient != null) {
			someClient.close();
		}
	}// closeClient

	private void connectToServer() throws UnknownHostException, IOException {
		// 2. 소켓 생성 // 서버로 연결을 시도.
//		someClient = new Socket("127.0.0.1", 2024);// loop back //192.168.10.
		someClient = new Socket("192.168.10.219", 2024);// loop back //192.168.10.

		// 4. 데이터를 주고, 받을 수 있도록 스트림을 연결
		disReadStream = new DataInputStream(someClient.getInputStream());
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());

		// Thread 생성. 내 클래스와 has a관계로 생성.
		Thread t = new Thread(this);
		t.start();// run()호출.
	}// connectToServer

	/**
	 * 접속자가 보내오는 메시지를 계속 읽어들인다.
	 * 
	 * @throws IOException
	 */
	public void run() {
		// Thread로 코드가 동작한다.
		if (disReadStream != null) {
			String msg = "";

			try {
				while (true) {
					// 접속자가 보낸 메시지 읽기
					msg = disReadStream.readUTF();
					jtaTalkDisplay.append(msg + "\n");
				} // end while
			} catch (IOException ie) {
				JOptionPane.showMessageDialog(this, "접속자가 연결을 끊었습니다.");
				ie.printStackTrace();
			} // end catch
		} // end if
	}// readMsg


	private void sendMsg() throws IOException {
		if (dosWriteStream == null) {
			JOptionPane.showMessageDialog(this, "서버에 연결 전입니다.");
			return;
		} // end if

		String msg = jtfTalk.getText();
		if (!msg.isEmpty()) {
			// 메시지를 스트림에 쓰기
			dosWriteStream.writeUTF("banana : " + msg);

			// 스트림의 내용을 목적지로 분출
			dosWriteStream.flush();

			// jtf 초기화
			jtfTalk.setText("");
		} // end if

	}// sendMsg

	public void actionPerformed(ActionEvent e) {
		try {
			sendMsg();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}// actionPerformed

	public static void main(String[] args) {
		new SimpleChatClient();
	}// main

}// class
