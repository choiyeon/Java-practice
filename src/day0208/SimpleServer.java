package day0208;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class SimpleServer {

	public void msgServer() throws IOException {
		// 1. 서버소켓 생성
		ServerSocket server = null;
		Socket client = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			server = new ServerSocket(7770);
			String msg = "서버가 보내는 메시지";
			while (true) {

				// 3. 접속자 소켓을 받는다.
				client = server.accept();

				// 4. 메시지를 보내기 위한 스트림을 소켓에서 얻는다.
				dos = new DataOutputStream(client.getOutputStream());
				
				// 5. 스트림에 메시지 쓰기
				dos.writeUTF(msg);

				// 6. 목적지(socket)로 스트림의 내용을 분할
				dos.flush();
				
				
				// 클라이언트의 메시지 받기
				String clientMsg = dis.readUTF();
				JOptionPane.showMessageDialog(null, "클라이언트의 메시지 " + clientMsg);
			}//end while

		} finally {
			// 7. 연결 끊기
			if (server != null) {
				server.close();
			}
			if (client != null) {
				client.close();
			}
			if (dos != null) {
				dos.close();
			}
		} // end finally

	}// msgServer

	public static void main(String[] args) {
		SimpleServer ss = new SimpleServer();
		try {
			ss.msgServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main

}// class
