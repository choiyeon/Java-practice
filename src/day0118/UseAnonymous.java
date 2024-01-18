package day0118;

import day0117.Clark;

public class UseAnonymous {

	public void testFly(Fly fly) {
		// 객체다형성 : fly는 어느때에는 FlyImple이 되고, Clark이 될 수 있다.
		System.out.println("추력 : " + fly.drivingForece());
		System.out.println("양력 : " + fly.lift());
	}//testFly
	
	public static void main(String[] args) {

		//testFly method 호출
		UseAnonymous ua = new UseAnonymous();
//		ua.testFly(fly); //인터페이스(Fly)는 객체화할 수 없다.
		ua.testFly(new FlyImple());
		ua.testFly(new Clark());
		
		//클래스 파일(소스코드)를 별도로 만들지 않고, 객체를 생성하여 arguments값을 할당할 때.
		ua.testFly(new Fly() {

			@Override
			public String drivingForece() {
				return "추추추추추";
			}

			@Override
			public String lift() {
				return "야야야야야양";
			}
			
		});
	}//main

}//class
