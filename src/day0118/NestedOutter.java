package day0118;

/**
 * nested class<br>
 * 안쪽클래스를 static변수처럼 사용할 때.(객체화 없이 직접 사용할 때.)
 */
public class NestedOutter {
	int outI;
	static int outJ;

	public NestedOutter() {
		System.out.println("바깥클래스 생성자");
	}// NestedOutter

	public void outInsMethod() {
		System.out.println("바깥클래스의 인스턴스 method");
	}// outInsMethod

	public static void outStaMethod() {
		System.out.println("바깥클래스의 static method");
	}// outStaMethod

	//////////////////////////////////// nested class 시작/////////////////////////////////
	static class Inner {// nested클래스에서 inner클래스는 주로 안에서만 쓰이기 때문에 접근지정자를 안쓴다.(붙여도 되나 무쓸모)
		// 일반클래스 아님. 생성자 만들지 않음.
		static int inI;// 변수나 method는 static으로 만들어 객체없이 사용하도록 한다.

		public static void inMethod() {
			System.out.println("안쪽 클래스의 method");// 바깥클래스 객체 선언 안해도 쓸 수 있음.
//			outI = 10; // instance영역의 변수와 method는 사용할 수 없다. 선언하면 쓸 수 있음.

			outJ = 20;
			NestedOutter.outStaMethod();// static 자원은 객체없이 쓸 수 있음.
		}// inMethod
	}// NestedInner
		//////////////////////////////////// nested class 끝/////////////////////////////////

	public static void main(String[] args) {
//		NestedOutter nesOut = new NestedOutter();
		Inner.inMethod(); // nested class는 객체없이 클래스명으로 직접 사용가능.
	}// main

}// class
