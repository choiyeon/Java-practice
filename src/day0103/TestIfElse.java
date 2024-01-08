package day0103;

/**
 * if~else : 둘 중 하나의 코드를 실행해야 할 때 사용.
 *
 * 문법) 
 * if(조건식){ 
 * 	조건에 맞을 때 수행할 문장 들... 
 * } else{ 
 * 	조건에 맞지 않을 때 수행할 문장 들.... }
 */
public class TestIfElse {

	public static void main(String[] args) {

		// 임의의 정수가 홀수 인지 짝수인지 구별하여 출력하는 코드.
		int i = 3;

		System.out.print(i + "는(은)");
		if (i % 2 != 0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		} // end if

		// 임의의 점수를 저장하는 변수를 만들고, main method arguments 첫번째를 받아서
		// 0~100이면 "유효점수" 출력하고, 그렇지 않다면 "무효점수"를 출력.
		int x = Integer.parseInt(args[0]);
		if (x > -1 && x < 101) {
			System.out.println(x + "는 유효점수");
		} else {
			System.out.println(x + "는 무효점수");
		}//end else
		
	}// main

}// class
