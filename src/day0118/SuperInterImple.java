package day0118;

import javax.swing.plaf.SliderUI;

/**
 *인터페이스 구현 클래스 
 *SuperInter에서 정의한 일을 구현함.
 */
public class SuperInterImple implements SuperInter {

	@Override
	public String toDay() {
		return "오늘 모교이ㄹ" ;
	}

	@Override
	public int getAge() {
		return 20;
	}
	
	public static void main(String[] args) {
//		//인터페이스는 객체화 될 수 없다.
//		SuperInter is = new SuperInter();
		
		//구현클래스가 생성되고 그 주소(객체)를 저장할 수 있다.
		SuperInter si = new SuperInterImple();
		System.out.println(si);
		//si 객체로 호출가능 override한 method 호출가능
		System.out.println(si.toDay());
		System.out.println(si.getAge());
		//JDK1.8이후 부터는 default method를 호출
		System.out.println(si.defMethod());
		
	}//main
}//class
