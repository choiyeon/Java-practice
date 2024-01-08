package day0104;

/**
 * 다중 for : 인덱스를 두개 사용하여 반복해야할 떼
 * 문법)
 * for (초기값;조건식;증감소식){
 * 		반복수행문장//단인 for의 영역
 * 		
 * 		for (초기값;조건식;증감소식){
 * 		반복수행문장 //다중 for의 영역
 * 		
 * 		}
 * 
 * 		반복 수행 문장//단일 for의 영역
 * }
 * 
 */
public class TestFor2 {
	public static void main(String[] args) {

		// 다중 for의 동작 : 바깥 for가 한번 반복할 때, 안쪽 for는 몇 번 반복하는가?
		for (int i = 0; i < 5; i++) {// 5번 반복
			for (int j = 0; j < 3; j++) {// 3번 반복
				System.out.println("i: " + i + " j: " + j);
			} // end for

			System.out.println("---------------------------------------------");

		} // end for

		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단 입니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			} // end for

			System.out.println("---------------------------------------------");

		} // end for

		System.out.println("---------------------------------------------");

		// 안쪽 for가 0에서부터 바깥for의 현재 번째까지 반복
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(i + " " + j + " ");
			} // end for
			System.out.println();
		} // end for

		System.out.println("---------------------------------------------");

		// 안쪽 for의 시작이 바깥 for의 현재보다 1큰 지점에서 5까지 반복
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 6; j++) {
				System.out.print(i + " " + j + " ");
			} // end for
			System.out.println();
		} // end for

		System.out.println("---------------------------------------------");

		int k = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(k++ + " ");
			} // end for
			System.out.println();
		} // end for

	}// main

}// class
