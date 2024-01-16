package day0116sub;

public class ConParent {
	public ConParent() {
		System.out.println("부모의 기본생성자");
	}//ConParent
	
	public ConParent(int i) {
		this();
		System.out.println("부모의 인자 생성자" + i);
	}//ConParent()

}
