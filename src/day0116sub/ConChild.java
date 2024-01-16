package day0116sub;

public class ConChild extends ConParent{
	public ConChild() {
		this(100);//나를 호출
		System.out.println("자식의 기본생성자");
	}//ConChild
	
	public ConChild(int i) {
		super(100);//부모 호출
		System.out.println("자식의 인자생성자" + i);
	}//ConChild()
	
	public static void main(String[] args) {
//		new ConChild(10);
		new ConChild();
	}

}//class
//부모 인자2024 > 부모 기본 > 자식 기본 > 자식인자10
//부모 기본 > 부모인자100 > 자식인자100 > 자식기본
