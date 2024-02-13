package day0208;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class SimpleClient {

	public void msgClient() throws IOException {
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Socket client = null;
		OutputStream ops = null;

		try {
			String ip = JOptionPane.showInputDialog("서버의 ip입력 주세요\n사용가능 ip) 210,211,212,213,214,215,216,217,218,"
					+ "219,220,221,222,223,224,225,226,227,228,229,230,231,232");
			// 2. 소켓 생성 : 서버에 연결(3-way handshaking)하여 회선 확립 시도
			client = new Socket("192.168.10." + ip, 7770);

			// 4. 스트림 열기
			dis = new DataInputStream(client.getInputStream());

			// 7. 값 얻기
			String msg = dis.readUTF();
			JOptionPane.showMessageDialog(null, "친구의 메시지 " + msg);

			// 서버에 메시지 보내기
			OutputStream output = client.getOutputStream();
			String sendMsg = "클라이언트가 보내는 메시지";
			byte[] bytes = sendMsg.getBytes();

			output.write(bytes);
			output.flush();

		} finally {
			// 8. 연결 끊기
			if (dis != null) {
				dis.close();
			}
			if (client != null) {
				client.close();
			}
		} // end finally
	}

	public static void main(String[] args) {
		SimpleClient sc = new SimpleClient();
		try {
			sc.msgClient();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main

}// class
