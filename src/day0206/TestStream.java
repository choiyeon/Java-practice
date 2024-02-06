package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestStream {

	public TestStream() throws IOException {
		// 1. 파일 생성
		File file = new File("c:/dev/temp/java_write4.txt");
		if (!file.exists()) {
			System.out.println(file.getAbsolutePath() + "을 생성합니다.");
			file = new File("c:/dev/temp/java_write4.txt");
			return;
		} else {
			
		}
		
		File readFile = new File("C:/dev/temp/java_read.txt");
		if (!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath() + "는 존재하지 않는다.");
			return;
		} // end if

		// 2. 스트림 생성
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			br = new BufferedReader(new FileReader(readFile));
			fw = new FileWriter(file);

			String str = "";
			while ((str = br.readLine()) != null) {
				// 3. 스트림에 데이터 기록
				fw.write(str);
			} // end while
			

			// 4. 스트림의 내용을 목적지로 분출
			fw.flush();
			
		} finally {
			// 5. 연결 끊기
			if (fw != null) {
				fw.close();
			}//end if
			
			if (br != null) {
				br.close();
			} // end if
		}
	}// TestStream

	public static void main(String[] args) {
		try {
			new TestStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
