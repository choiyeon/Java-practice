package day0205;

import java.io.IOException;

/**
 * 키보드의 입력값 받기
 */
public class UseKeyboardInput {

	public UseKeyboardInput() throws IOException {

		System.out.println("아무키나 누르고 엔터");
//		int readData = System.in.read();
//		System.out.println("입력 값 : " + readData);

		//입력한 모든 문자열이 그대로 출력되는 코드를 작성해보세요.
		int readData = 0;
		while ((readData = System.in.read()) != 13) {//13은 \n
			System.out.print((char)readData);
		}//while
	}// UseKeyboardInput

	public static void main(String[] args) {
		try {
			new UseKeyboardInput();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main

}// class
