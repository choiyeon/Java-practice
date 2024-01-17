package day0117;

/**
 *부모클래스. 
 */
public class OverrideSuper {
	int i;
	public OverrideSuper() {
		System.out.println("부모의 생성자");
	}//OverrideSuper
	
	public void test() {
		System.out.println("부모의 method");
	}
	
	/**
	 *final이 정의 method는 override를 막을 수 있다.
	 *자식 클래스에서 부모클래스의 기능을 변경없이 그대로 사용해야할 때. 
	 */
	protected /*final*/ void printI() {
		System.out.println("부모의 method" + i);
	}
	
}//class
