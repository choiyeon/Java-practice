package day0205;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UseFileInputStream {

	public UseFileInputStream() throws IOException {
		// 1. File 생성
		File file = new File("c:/dev/temp/java.read.txt");
		if (!file.exists()) {
			JOptionPane.showMessageDialog(null, file + "은 존재하지 않습니다. 파일 경로나 파일명을 확인해주세요.");
			return;
		}
		// 2. File을 읽기 위한 Stream 연결
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// 3. 반복문을 돌려서 값을 얻어 사용.
			int readData = 0;
			while ((readData = fis.read()) != -1) {// 1byte 읽어들여 값이 존재하면
				System.out.println((char) readData);
			} // while
		} finally {
			if(fis != null) {fis.close();}//end
		}
	}// UseFileInputStream

	public static void main(String[] args) {

//		try {
//			new UseFileInputStream();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}// main

}// class
