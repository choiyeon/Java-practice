package day0108;

/**
 *static method 작성. 
 */
public class TestStaticMethod {

	public static void plus(int num, int num2) {
		int result = 0;
		result = num + num2;
		System.out.println(result);
	}// plus

	// 구구단을 입력받아 구구단의 범위였을 때 출력하는 method 작성, 호출
	public static void multiplicationTable(int i) {//i 매개변수 => 지역변수
		// int num=0; parameter와 동일한 변수는 선언할 수 없다. => 영역이 같기 때문에

		if (i > 1 && i < 10) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			} // end for
		} else {
			System.out.println("2~9까지의 숫자만 넣어주세요.");
		}//end if

	}// end multiplicationTable

	public static void main(String[] args) {

		TestStaticMethod.plus(1, 8);// 덧셈 출력

		TestStaticMethod.multiplicationTable(9);// 구구단 출력

	}// main

}//class
