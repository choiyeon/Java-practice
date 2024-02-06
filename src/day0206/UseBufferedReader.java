package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;

/**
 * BufferedReader를 사용한 줄단위 읽기
 */
public class UseBufferedReader {

	public UseBufferedReader() throws FileNotFoundException, IOException {// FileNotFoundException : 파일이 존재하지 않을 때 예외.
																			// IOException : 입출력 예외.
		// 1. File 생성
		File readFile = new File("C:/dev/temp/java_read.txt");
		if (!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath() + "는 존재하지 않는다.");
			return;
		} // end if

		// 2. 스트림 생성
//		//파일과 연결
//		FileInputStream fis = new FileInputStream(readFile);
//		//8bit Stream + 16bit Stream 연결
//		InputStreamReader isr = new InputStreamReader(fis);
//		//연결된 파일에서 줄단위로 읽어들인다.
//		BufferedReader br = new BufferedReader(isr);

		// 위의 과정 한 줄로 적기.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(readFile)));

			// 3. 스트림에 연결된 파일의 내용읽기
			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			} // end while
			
		} finally {
			if (br != null) {
				br.close();
			}// end if
		}// finally

	}// UseBufferedReader

	public static void main(String[] args) {
		try {
			new UseBufferedReader();
		} catch (FileNotFoundException e) {
			System.err.println("파일 경로를 확인해주세요.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("파일을 읽는 동안 문제 발생.");
			e.printStackTrace();
		}
	}// main

}// class
