package day0108;

/**
 * 시작과 끝을 모를 때 사용하는 반복문.
 * 최소 1번 수행에 최대 조건까지 수행
 * 문법)
 * do{
 * 	반복수행문장들
 * }while(조건식);
 * 
 */
public class TestDoWhile {

	public static void main(String[] args) {

		int i=0;
		do {
			i++;
			System.out.println(i);
		}while (i < 10);
		
		//1~100까지 합 출력
		int j = 0;
		int sum = 0;
		do {
			j++;
			sum += j;
			System.out.println("j는 " + j + "현재 합은 " + sum);
		} while (j < 101);
		System.out.println("1부터 100까지의 합은 " + sum);
	}//main

}//class
