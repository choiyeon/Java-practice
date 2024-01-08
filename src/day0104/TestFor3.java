package day0104;

/**
 * 다양한 for의 형태
 * -무한 루트
 * for (초기값; ; 중감소식){ 
 * 
 * 	}
 * 
 * for (; ;){
 * 
 * }
 */
public class TestFor3 {

	public static void main(String[] args) {

//		for(int i=0; ; i++) {
//			
//			System.out.println(i);
//			
//		}
//		//System.out.println("무한루프"); 무한루프 아래에 있는 문장은 실행될 수 없다.
//		//무한루프는 증가하는 수를 세지 않는다.
		
//		for (; ; ) {
//			System.out.println("무한루프");
//		}
		
		// 여러개의 초기값을 가진 for
		// 조건식 변수는 하나만.
		// 원하는 변수만 증감식 써도 됨.
//		for (int i = 0, j = 0, k = 0; i < 10; i++, j += 100) {
//
//			System.out.println("i: " + i + " j: " + j + " k: " + k);
//		} // end for
//
//		// continue 반복 건너뛰기(주로 if안에서 사용)
//		// 1에서 100까지 홀수만 출력
//		for (int i = 1; i < 101; i++) {
//			if (i % 2 == 1) {
//				continue;
//
//			} // end if
//
//			System.out.println(i + " ");
//		} // end for
		
		
		////////////////////////////////////////////////////////////////////////////
		//숙제 구구단 전체를 옆으로 출력
		for (int i = 1; i < 10; i++) {//
			for (int j = 2; j < 10; j++) {//
				System.out.print(" " + j + " X " + i + " = " + i*j + " /");
			}//end for
			System.out.println(" ");
		}//end for
		
		System.out.println("---------------------------------------------");
		
		//아래와 같은 형태로 숫자 앞에 공백을 넣어서 출력
//		0
//		 1
//		  2
//		   3
//		    4
		int x = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}//end for
			System.out.println(x++);
		}//end for
		
		System.out.println("---------------------------------------------");
		
		//1에서 100까지의 수 중 3의 배수 합을 출력
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				sum = sum + i;
			}//end if
		}//end for
		
		System.out.println("1에서 100까지의 수 중 3의 배수 합은 " + sum + "입니다");
		
		
		
	}//main

}//class
