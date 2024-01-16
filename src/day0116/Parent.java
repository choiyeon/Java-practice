package day0116;

/**
 *부모클래스<br>
 *모든 자식이 가져야할 공통 특징을 정의.
 */
public class Parent {
	int age;
	String msg;
	
	public Parent() {
		System.out.println("부모생성자");
		msg = "이 편지는 영국 발";
	}//Parent
	
	/**
	 * 부모의 method
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 부모의 method
	 * @return
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printMsg() {
		System.out.println("부모 : " + msg);
	}

	
}//class
