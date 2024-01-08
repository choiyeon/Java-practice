package day1226;
class Mybirth{
	//main method : 클래스를 단독으로 실행 시켜야할 때 정의하는 method
	//단독으로 실행가능한 프로그램 : java application

	public static void main(String[] args){

	//1. 올해를 저장할 수 있는 변수를 선언하고 초기값으로 올해를 할당.
	//2. 자신의 나이를 저장할 수 있는 변수를 선언하세요.
	int year = 2023;//초기화 값
	int myAge = 0;

	//3. 2번의 변수에 자신의 나이를 할당하세요.
	myAge = 23;

	//4. 두개의 변수를 사용하여 자신이 태어난 해를 출력.
	System.out.print("내가 태어난 해 : " + (year - myAge) + "년");

	}//main

}//class