package kr.co.sist.chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class MultiChatClient extends JFrame implements ActionListener, Runnable {

	private JTextField jtfServerIp, jtfNick, jtfTalk;
	private JTextArea jtaTalkDisplay;
	private JScrollPane jspJtaTalk;
	private JButton jbtnConnectServer, jbtnCapture;

	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;

	private Thread threadRead;
	
	public MultiChatClient() {
		super("채팅 클라이이언트");

		jtfServerIp = new JTextField("192.168.10.", 10);
		jtfNick = new JTextField(7);
		jtfTalk = new JTextField();
		jtaTalkDisplay = new JTextArea();
		jtaTalkDisplay.setEditable(false);
		jspJtaTalk = new JScrollPane(jtaTalkDisplay);

		jbtnConnectServer = new JButton("서버접속");
		jbtnCapture = new JButton("대화저장");

		JPanel jpNorth = new JPanel();

		jpNorth.add(new JLabel("서버주소"));
		jpNorth.add(jtfServerIp);
		jpNorth.add(new JLabel("대화명"));
		jpNorth.add(jtfNick);
		jpNorth.add(jbtnConnectServer);
		jpNorth.add(jbtnCapture);

		add("North", jpNorth);
		add("Center", jspJtaTalk);
		add("South", jtfTalk);

		jbtnConnectServer.addActionListener(this);
		jbtnCapture.addActionListener(this);
		jtfTalk.addActionListener(this);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					closeWin();
				} catch (IOException e1) {
					e1.printStackTrace();
				} // end catch
			}// windowClosing

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(JFrame.ABORT);
				
			}//windowClosed
			
			

		});// addWindowListener

		setBounds(100, 100, 700, 400);
		setVisible(true);

	}// MultiChatClient

	public void closeWin() throws IOException {
		try {
			if (someClient != null) {
				someClient.close();
			} // end if
		} finally {
			dispose();
		} // end finally
	}// closeWin

	@Override
	public void run() {
		// 메시지를 무한 루프로 읽어들여 jta에 추가
		String msg = "";
		try {
			while (true) {
				//읽어들인 데이터를 jta에 추가
				jtaTalkDisplay.append(disReadStream.readUTF() + "\n");
				//수직 스크롤바를 최고값을 얻어서, 다시 수직 스크롤 바에 설정하면, 가장 아래로 내려간다.
				jspJtaTalk.getVerticalScrollBar().setValue(jspJtaTalk.getVerticalScrollBar().getMaximum());
			} // end while
		} catch (IOException ie) {
			JOptionPane.showMessageDialog(this, "서버와의 연결이 끊어졌습니다.");
			ie.printStackTrace();
		} // end catch
	}// run

	private void connectToServer() throws UnknownHostException, IOException {
		String ip = jtfServerIp.getText().trim();
		String nick = jtfNick.getText().trim();

		if (nick.isEmpty()) {
			JOptionPane.showMessageDialog(this, "대화명은 필수 입력입니다.");
			jtfNick.setText("");
			jtfNick.requestFocus();
			return;
		} // end if

		if (someClient != null) {
			JOptionPane.showMessageDialog(this, "서버에 접속 중 입니다.");
			return;
		} // end if

		someClient = new Socket(ip, 2024);
		// 메시지를 읽기위한 스트림
		disReadStream = new DataInputStream(someClient.getInputStream());
		// 메시지를 쓰기위한 스트림
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
		dosWriteStream.writeUTF(nick);//닉네임을 서버로 보냄.
		dosWriteStream.flush();

		// 데이터를 읽기 위한 thread
		threadRead = new Thread(this);
		threadRead.start();// run 호출

	}// connectToServer

	/**
	 * 서버로 메시지 보내기
	 * 
	 * @throws IOException
	 */
	public void sendMsg() throws IOException {
		if (dosWriteStream != null) {// 서버에 연결된 경우에만 메시지 전송
			String nick = jtfNick.getText().trim();
			String talk = jtfTalk.getText();

			// 입력된 대화를 스트림에 쓰고
			dosWriteStream.writeUTF("[ " + nick + " ]" + talk);
			// 목적지로 분출
			dosWriteStream.flush();
			// 대화 내용의 초기화
			jtfTalk.setText("");
		} // end if
	}// sendMsg

	public void capture() throws IOException {
		File saveDir = new File("c:/dev/chat_backup/");
		if (!saveDir.exists()) {
			saveDir.mkdirs();
		} // end if

		File saveFile = new File(saveDir.getAbsolutePath() + "/capture_" + System.currentTimeMillis() + ".dat");
		System.out.println(saveFile);
		FileWriter fw = null;

		try {
			fw = new FileWriter(saveFile);
			fw.write(jtaTalkDisplay.getText());
			fw.flush();
		} finally {
			if (fw != null) {
				fw.close();
			} // end if
		} // end finally
	}// capture

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jbtnConnectServer) {// 서버 연결
			try {
				connectToServer();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "서버와 연결이 종료되었습니다.");
				e.printStackTrace();
			}
		} // end if
		if (ae.getSource() == jtfTalk) {// 대화 입력
			try {
				sendMsg();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end if
		if (ae.getSource() == jbtnCapture) {// 대화 내용 캡쳐 > 갈무리
			try {
				capture();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end if
	}// actionPerformed

	
	

}// class
