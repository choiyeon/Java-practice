/*
자동형변환 (promotion, demotion)
JVM이 상황에 따라 크기를 변경해주는 것.
*/
package day1227;
class Promotion {
	public static void main(String[] args) {
		
		byte num1 = 10;//-128~127
		byte num2 = 20;
		//byte result = 0;//int의 하위형태끼리(byte&short)의 합은 결과가 int가 되므로(promotion) byte인 result에 할당될 수 없음 
		int result = 0;//promotion을 고려해 int로 변수를 선언.

		result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
	}
}
