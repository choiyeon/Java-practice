package day0117;

/**
 *추상 클래스 : 직접 객체화될 수 없다.
 *상속을 위해 만들어지는 클래스
 */
public abstract class AbstractSuper {

	public AbstractSuper() {
		System.out.println("부모의 기본생성자");
	}//AbstractSuper
	
	public void test() {
		System.out.println("일반 메소드");
	}//test
	
	public abstract String msg();//abstract method
	public abstract String msg(String msg);//abstract method
	
//	public static void main(String[] args) {
//		new AbstractSuper(); //직접 객체화 할 수 없다.
//	}
}
