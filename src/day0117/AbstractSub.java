package day0117;

/**
 * 추상클래스를 구현한 자식 클래스
 * 부모 클래스의 모든 abstract method를 override해야함. 
 */
public class AbstractSub extends AbstractSuper {
	
	public AbstractSub() {
		System.out.println("자식의 생성자");
	}//AbstractSub

	@Override
	public String msg() {
		return "Override한 method";
	}//msg



	@Override
	public String msg(String msg) {
		//부모의 msg는 추상메서드로 body가 없어 호출될 수 없다.
//		super.msg("안녕");
		return msg + "입니다.";
	}//msg()

	public static void main(String[] args) {
		AbstractSub aSub = new AbstractSub();
		System.out.println(aSub.msg());
		System.out.println("");
		System.out.println(aSub.msg("수요일"));
	}//main
}//class
