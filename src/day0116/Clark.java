package day0116;

/**
 * 사람의 공통 특징은 부모클래스인 person에 정의되어있고, <br>
 * 자식 클래스인 Clark은 자신의 특별한 기능만 정의<br>
 * 힘의 레벨은 1~10까지 존재
 */
public class Clark extends Person {

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
}//class
