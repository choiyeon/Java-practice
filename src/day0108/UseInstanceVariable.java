package day0108;

/**
 *instance variable
 *-객체마다 생성되고, 사용되는 변수(값을 따로 사용할 수 있다.)
 *-instance화를 하면 메모리에 올라가고, 객체사용이 종료되면 메모리에서 내려온다.
 *-자동초기화가 된다. (직접 사용하더라도 error를 발생 시키지 않는다.)
 *-꼭 instance화 후에 사용되어야 한다.(동일 영역에서는 객체명을 생략하고 사용할 수 있다.)
 */
public class UseInstanceVariable {
//접근지정자 사용가능
//	public int i;
//	protected int a;
//	int b;
//	private int c;
	
	int i;
	public void test() {
		i=10;//동일 영역(instance영역)에서는 객체명 없이 사용할 수 있다.
	}
	
	public static void main(String[] args) {
//		i =10; //영역이 다르면 (static영역) 객체화 수 사용해야한다. error
		//객체화 - 인스턴스 변수를 사용하기 위해서
		//클래스명 객체명=new 클래스명();
		//i라는 변수를 사용하기 위해 UseInstanceVariable클래스를 객체화 한다.
		UseInstanceVariable uiv=new UseInstanceVariable();
		UseInstanceVariable uiv2=new UseInstanceVariable();
		
		//인스턴스 변수는 특정 객체가 생성되면 그 안에 만들어지는 변수(member variable)
		//특정 객체만 사용하는 변수.
		uiv.i=2024;
		uiv2.i=1;
		
		//객체가 다르기 때문에 객체마다 다른 값을 가지게 된다.
		System.out.println("uiv객체가 가진 i변수 : " + uiv.i);
		System.out.println("uiv2객체가 가진 i변수 : " + uiv2.i);
	}//main

}//class
