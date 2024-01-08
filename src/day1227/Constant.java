/*
constant : 변수를 상수처럼 사용.
*/
package day1227;
class  Constant{

	public static final int MAX_SCORE=100;//기준값
	
	public static void main(String[] args) {

		int myScore = 80;
		//MAX_SCORE = 99; //constant는 값을 변경할 수 없다.

		

		System.out.println("최고점수와 획득점수 간의 차 " + (MAX_SCORE - myScore));

	}
}
