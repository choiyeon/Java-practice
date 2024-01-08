package day0108;

/**
 * 시작과 끝을 모를 때 사용하는 반복문
 * 최소 0번 수행에서 부터 최대 조건 수행
 * 문법)
 * while(조건식){
 * 	반복수행문장들
 * }
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 0;// 초기값
		while (i < 10) {
			System.out.println("i=" + i);//반복수행 문장들
			i++;//증감소식
		} // end while
		
		//구구단 5단 출력
		 i = 1;// 초기값
		while (i < 10) {
			System.out.println("5 x " + i + " = " + 5*i);//반복수행 문장들
			i++;//증감소식
		} // end while
		

	}// main

}// class
