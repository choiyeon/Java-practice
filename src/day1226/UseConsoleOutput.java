//표준 출력 스트림 사용
package day1226;
class UseConsoleOutput{

	public static void main(String[] args){
		/*
		System.out.println("안녕.");
		System.out.println("하세요.");
		*/

		//상수
		System.out.println("2023");//정수상수
		System.out.println("10.26");//실수상수
		System.out.println('0');//문자상수 - 문자의 0
		System.out.println(true);//불린(boolean)상수
		System.out.println("오늘은 화요일입니다.");//문자열 상수 

		//변수
		int i = 26;
		System.out.println(i);

		//연산식 : 연산의 결과만 출력
		System.out.println(12 + 26);
		System.out.println("12 + 26");
		System.out.println("12 + 26 = " + 12+26);//결과 12 + 26 = 1226
		System.out.println("12 + 26 = " + (12+26));//결과 12 + 26 = 38
	}//main

}//class

//2. 저장 : 클래스명.java (Hello.java)