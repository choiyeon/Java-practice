package day0213;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SimpleChatServer extends JFrame implements ActionListener, Runnable {
	private JTextArea jtaTalkDisplay;
	private JTextField jtfTalk;
	private JScrollPane jspTalk;

	private ServerSocket server;
	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;

	public SimpleChatServer() {
		super(":::::::채팅서버:::::::");
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
			openServer();
		} catch (IOException e) {
			e.printStackTrace();
		} // end catch

		jtfTalk.addActionListener(this);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //이걸로는 스트림을 끊을 수 없음
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					closeServer();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					dispose();
				} // end finally
			}// windowClosing

		});

	}// SimpleChatServer

	private void closeServer() throws IOException {
		if (dosWriteStream != null) {
			dosWriteStream.close();
		} // end if
		if (disReadStream != null) {
			disReadStream.close();
		} // end if
		if (someClient != null) {
			someClient.close();
		} // end if
		if (server != null) {
			server.close();
		} // end if
	}

	/**
	 * 서버 소켓을 생성하고, 스트림을 열어서 대화를 읽어들일 준비
	 * 
	 * @throws IOException
	 */
	private void openServer() throws IOException {
		// 1. 서버소켓을 생성
		server = new ServerSocket(2024);

		// 3. 접속자 소켓이 있다면 접속자 소켓을 받기
		someClient = server.accept();

		// 4. 메시지를 읽기위한 스트림과 메시지를 보내기위한 스트림을 소켓에서 연결
		disReadStream = new DataInputStream(someClient.getInputStream());
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());

		jtaTalkDisplay.setText("접속자가 접속했습니다.");

		// Thread 생성. 내 클래스와 has a관계로 생성.
		Thread t = new Thread(this);
		t.start();// run()호출.
	}// openServer

	/**
	 * 연결된 스트림을 사용하여 메시지를 무한루프로 읽어 들여 JTextArea에 출력
	 * 
	 * @throws IOException
	 */
	@Override
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

	/**
	 * 스트림에 메시지를 써서 접속자 소켓으로 보내는 일.
	 * 
	 * @throws IOException
	 */
	private void sendMsg() throws IOException {
		String msg = jtfTalk.getText();
		if (dosWriteStream == null) {
			JOptionPane.showMessageDialog(this, "접속자가 존재하지 않습니다.");
			return;
		} // end if

		if (!msg.isEmpty()) {
			// 스트림에 데이터 쓰기
			dosWriteStream.writeUTF("서버 : " + msg);

			// 스트림에 기록된 데이터 분출
			dosWriteStream.flush();

			// jta 내용 초기화
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
		new SimpleChatServer();
	}// main

}// class
