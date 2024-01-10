package day0110;

/**
 * Person 클래스를 사용하기 위해 만드는 클래스<br>
 */
public class UsePerson {

	private void usePerson() {
		////////////////////자신을 객체화하여 사용하는 코드 작성//////////////////////////
		Person choi = new Person();//사람으로 치면 탄생 => 기본으로 가지고 있어야할 값을 가지지 않았다.
		//객체가 생성될 때 기본적으로 가지고 있어야 할 값을 설정하는 코드 어디에선가 작성해야함.
		
		choi.setHight(166);
		choi.setName("최수연");
		
		System.out.printf("%s의 이름은 %s이고, 눈 %d개, 코 %d개, 입 %d개를 가지고 있으며, 키는 %dcm이다.  \n",
				choi.getName(), choi.getName(), choi.getEye(), choi.getNose(), choi.getMouth(), choi.getHight());
		
		//동사적인 특징 : Overloading
		System.out.println(choi.eat());
		System.out.println(choi.eat("떡볶이", 3000));
		
		System.out.println("");
		//천진반 객체를 생성
		Person jinban = new Person(3, 1, 1);
		jinban.setName("천진반");
		System.out.printf("이름은 %s이고, 눈 %d개, 코 %d개, 입 %d개를 가지고 있다.  \n",
				jinban.getName(), jinban.getEye(), jinban.getNose(), jinban.getMouth());
		
		
	}//usePerson
	
	public static void main(String[] args) {

		UsePerson up = new UsePerson();
		up.usePerson();
		
	}//main

}//class
