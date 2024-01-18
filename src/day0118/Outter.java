package day0118;

/**
 * inner class : 디자인 클래스안에서 이벤트를 처리할 때 사용.
 * -안쪽클래스를 인스턴스 변수처럼 사용할때.
 */
public class Outter {
	int outI;
	
	public Outter() {
		System.out.println("바깥클래스의 생성자");
	}//Outter
	
	public void outMethod() {
		System.out.println("바깥클래스의 method");
//		inI = 12; // 안쪽클래스의 자원을 사용할 수 있다.
		
		//바깥에서 안쪽 클래스의 자원을 사용하려면 객체화해야 함.
		Outter.Inner in = this.new Inner();//out.new 대신 this.new 하거나 그냥 new 만 해도 된다.
		in.inI = 12;
		in.inMethod();
	}//outMethod
	
	///////////////////////////////Inner class 시작/////////////////////////////////////
	public class Inner{
		int inI;
		public Inner() {
			System.out.println("안쪽클래스의 생성자");
		}//Inner
		
		public void inMethod() {
			System.out.println("안쪽클래스의 method");
			
			//바깥 클래스의 자원을 직접 사용 가능.
			outI = 2024;
			System.out.println(outI);
		}//inMethod
		
		
	}//class Inner
	///////////////////////////////Inner class 끝/////////////////////////////////////
	

	public static void main(String[] args) {
		//1. 바깥 클래스의 객체화
		Outter out = new Outter();
		out.outMethod();
		//2. 안쪽 클래스의 객체화 : 바깥클래스명.안쪽클래스명 객체명 = 바깥클래스객체명.new 안쪽생성자();
		Outter.Inner in = out.new Inner();
	}//main

}//class Outter
