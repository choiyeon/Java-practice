/*
강제형번환 : 개발자가 필요한 데이터형으로 일시적 변환을 하는 것.
-원본 값은 유지되지만, 상황에 따라 값 손실이 발생할 수 있음.
-기본형에서 참조형으로 가능, 참조형에서 기본형으로 변환불가능.
-boolean은 동일형으로만 casting 가능.
*/
package day1227;
class Casting {

	//System.out.println("ased t"); //클래스 필드에서는 프린트를 불러올 수 없음

	public static void main(String[] args) {

		float d = 2023.12F;
		//int i = d; 크기와 값의 종류가 달라 error
		//casting 문법:(변환할 데이터형)값;
		int i = (int)d;
		System.out.println(i + "," + d);

		float f = (float)1.2345678987;//리터럴의 값을 4byte로 변환하여 할당
		System.out.println(f);

		byte num1 = 10;
		byte num2 = 20;
		byte result = 0;
		
		result = (byte)(num1 + num2); //casting을 통해서 연산결과를 result에 할당.
		System.out.println(result);

		char c = '0';
		System.out.println(c + "의 유니코드는 " + (int)c);

		//boolean형은 boolean으로만 casting 가능
		boolean b = true;
		boolean b1 = (boolean)b;//똑같음. 아무의미없음.
		System.out.println(b +","+ b1);
		//int ii = (int)b; 다른 형으로는 캐스팅 불가능

		/*error
		//기본형을 참조형으로, 참조형을 기본형으로 참조 불가능.
		int today = 27;
		String strToday = today;//String은 참조형 데이터, int는 기본형 데이터.
		*/

		/*error
		String strToday = "27";//참조형
		int intToday = strToday;//기본형
		*/
		
		//연습문제


	}//main
}//class
