package day0117;

import day0118.Fly;

/**
 * 사람의 공통 특징은 부모클래스인 person에 정의되어있고, <br>
 * 자식 클래스인 Clark은 자신의 특별한 기능만 정의<br>
 * 힘의 레벨은 1~10까지 존재
 */
public class Clark extends Person implements Fly{

	public int power;
	/**
	 * Clark의 기본 생성자, 눈2개, 코1개, 입1개인 사람이 태어남<br>
	 * Clark은 힘이 세다.
	 */
	public Clark(){
		power = 10;
	}//Clark
	
	/**
	 * 돌의 종류에 따라 힘의 강도가 달라진다.
	 * @param stone 돌의 종류
	 * @return 결과
	 */
	public String power(String stone) {
		String result="";
		if(stone.equals("다이아몬드")) {
			result = "감사~~~~~~~";
			power = 10;
		}else if (stone.equals("크립토나이트")) {
			result = "아이고 힘빠져";
			power = 0;
		} else {
			result = "열받음----";
			power = 12;
		}//end else
		return result;
	}
	

	/**
	 *집에서 밥을 먹는 일에서 빵을 먹는 일로 override하나 method
	 */
	@Override // override 잘 되고 있는지 확인
	public String eat() {
		return getName() + "이(가) 집에서 빵을 먹는다.";
	}//eat
	
	@Override
	public String eat(String menu, int price) {
		return getName() +"이 레스토랑에서 " + menu + "인 음식을 " + price + "$을 내고 사먹는다";
	}

	@Override
	public String drivingForece() {
		return "무릎을 꿇어서";
	}

	@Override
	public String lift() {
		return "망토를 매고";
	}
	
	
}//class
