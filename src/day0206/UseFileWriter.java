package day0206;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UseFileWriter {

	public UseFileWriter() throws IOException {
		// 1. 파일 생성
		File file = new File("c:/dev/temp/java_write2.txt");

		// 2. 스트림 생성
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);

			String str = "문자열 데이터가 Java에서 생성";
			// 3. 스트림에 데이터 기록
			fw.write(str);

			// 4. 스트림의 내용을 목적지로 분출
			fw.flush();
		} finally {
			// 5. 연결 끊기
			if (fw != null) {
				fw.close();
			}
		}

	}// UseFileWriter

	public static void main(String[] args) {
		try {
			new UseFileWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main

}// class
