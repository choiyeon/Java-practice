package day0111;

public class TestThis {

	int i;
	int j;
	
	/**
	 * this를 사용하지 않고 인스턴스 변수 i에 할당된 값을 설정해보세요.
	 * instance method
	 * @param i
	 */
	public void setI(int i, TestThis t) {
		t.i = i;
	}
	
	public void setJ(int j) {
		System.out.println(this + " : 번지에서 호출");
		this.j = j;
	}
	
	public static void main(String[] args) {

		TestThis t = new TestThis();
		System.out.println(t + " : 객체의 주소");
		t.setI(2000, t);
		System.out.println(t.i);//0
		
		t.setJ(2024);
		System.out.println(t.j);//2024
		System.out.println("---------------------------------------------");
		
		TestThis t2 = new TestThis();
		System.out.println(t2 + " : 객체의 주소");
		t2.setJ(1);
		
//		System.out.println(this);
//		static 영역을 객체명 없이 호출가능 => this가 있을 수 없다.
	}//main

}//class
