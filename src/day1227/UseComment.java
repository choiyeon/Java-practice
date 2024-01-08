/*
이 클래스는 주석을 연습하기 위한 클래스로,
자바에서는 3가지의 주석이 제공된다.
*/
package day1227;
class UseComment {
	//main method : Java application - 단독으로 실행가능한 프로그램 
	public static void main(String[] args) {
		System.out.println("Hello World!");
		/* 여러줄 주석
		System.out.println("오늘은 수요일.");
		System.out.println("내일은 목요일.");
		*/

		System.out.println("오늘은 수요일.");
		///////////////영역분리////////////////////////////
		System.out.println("내일은 목요일.");

		char c = 'A'; //''는 문자 한개만 저장 'AB';error
	}//main
}//class
