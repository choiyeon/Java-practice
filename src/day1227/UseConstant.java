/*
다른 클래스에 존재하는 Constant사용.
*/
package day1227;
class UseConstant{
	public static final int WIN_SCORE=0;
	public static void main(String[] args) {
		int myScore = 80;

		System.out.println("최고점수: " + Constant.MAX_SCORE +", "+ WIN_SCORE);
		System.out.println("Byte의 최고값: " + Byte.MAX_VALUE + 
							", 최저값:" + Byte.MIN_VALUE);
	}//main
}//class
