package day0116;

/**
 *자식 클래스<br>
 *공통특징은 부모에서 제공하는 것을 사용하고, 자신의 특징적인 일을 구현하여 사용 
 *
 */
public class Child extends Parent{
	String name;
	String msg;
	
	public Child() {
		System.out.println("자식 생성자");
		msg = "이 편지는 아프리카 발";
	}//Child

	/**
	 * 자식의 method
	 * @return
	 */
	public String getName() {
		return name;
	}//getName

	/**
	 * 자식의 method
	 * @return
	 */
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public void printMsg() {
//		System.out.println("자식 : " + super.msg + ", " + this.msg);
		System.out.println("자식 : " + msg);
		super.printMsg();//부모의 method호출 같은 이름의 method일때 super를 붙이면 부모 호출
	}

	public static void main(String[] args) {
		//상속 관계에서는 자식 클래스로 객체화한다. => 부모가 먼저 만들어진다.
		Child c = new Child();
		//코드의 재사용성.(부모가 가진 변수나 메소드를 자식에서 자신의 객체명(c)로 사용할 수 있는 것.)
		c.setAge(20);
		c.setName("차일드");
		System.out.println(c.getAge()); // 코드의 재사용성
		System.out.println(c.getName()); // 
		
		c.printMsg();
		

	}//main

}//class
