package day0117;

/**
 * OverrideSub는 OverrideSuper의 자식클래스
 */
public class OverrideSub extends OverrideSuper {

	int j;

	public OverrideSub() {
		System.out.println("자식클래스의 생성자");
	}// OverrideSub

	public void temp() {
		System.out.println("자식의 method");
	}// temp

	/**
	 * Override의 규칙 : 접근지정자는 광의의 접근 지정자(protected -> public)로 달라도 되고,<br>
	 * 반환형, method명, 매개변수는 동일하게 만든다.
	 */
	@Override
	protected void printI() {
		super.printI();
		System.out.println("자식 : " + j + ", i : " + this.i);//super.i도 가능.
	}// printI

	public static void main(String[] args) {
		// 자식클래스로 객체화
		// : 부모의 모든 자원과 자식의 모든 자원을 사용할 수 있다.
		OverrideSub oSub = new OverrideSub();
		oSub.i = 2024;//부모의 변수
		oSub.j = 1;//자식의 변수
		oSub.test();//부모의 메소드
		oSub.temp();//자식의 메소드
		oSub.printI();//자식의 메소드
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		//is a관계의 객체화 : 
		OverrideSuper oSuper = new OverrideSub();
		oSuper.i = 12;
//		oSuper.j = 40; // 자식의 변수는 사용불가.
		oSuper.test();//부모method
//		oSuper.temp();//자식method 사용불가.
		oSuper.printI();//자식이 override한 method
	
		
	}// main

}// class
