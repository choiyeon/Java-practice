package day0110;

/**
 *사람을 추상화하여 구현하는 클래스
 *명사적 특징 : 눈, 코, 입
 *동사적 특징 : 먹는 일
 *
 * 객체 생성을 하여 사용하는 일반 클래스.
 * 사용법)
 * Person 객체명=new Person();
 * 객체명.메소드()를 호출하여 사용
 */

public class Person {

	private int eye, nose, mouth, hight;
	private String name;
	public String nick; 
	
	/**
	 * 눈2개, 코1개, 입1개인 사람 객체를 생성할 때 사용하는 기본 생성자
	 */
	public Person() {
		eye = 2;
		nose = 1;
		mouth = 1;
	}
	
	/**
	 * 눈 n개, 코 n개, 입 n개인 사람 객체를 생성할 때 사용하는 Overloading 생성자
	 * @param eye 눈의 수
	 * @param nose 코의 수
	 * @param mouth 입의 수
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
	}
	
	/**
	 * 생성된 사람객체에 눈의 개수를 설정
	 * @param eye 눈의 개수
	 */
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye
	
	/**
	 * 생성된 사람객체가 가지고 있는 눈의 기수를 반환
	 * @return 눈의 개수
	 */
	public int getEye() {
		return eye;
	}//getEye
	
	/**
	 * 생성된 사람객체에 코의 개수를 설정
	 * @param nose 코의 개수
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}//setNose
	
	/**
	 * 생성된 사람객체가 가지고 있는 코의 기수를 반환
	 * @return 코의 개수
	 */
	public int getNose() {
		return nose;
	}//getNose
	
	/**
	 * 생성된 사람객체에 입의 개수를 설정
	 * @param mouth 입의 개수
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setMouth
	
	/**
	 * 생성된 사람객체가 가지고 있는 입의 기수를 반환
	 * @return 입의 개수
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	/**
	 * 생성된 사람객체에 키를 설정
	 * @param hight 키
	 */
	public void setHight(int hight) {
		this.hight = hight;
	}//setHight
	
	/**
	 * 생성된 사람객체의 키를 반환
	 * @return 키
	 */
	public int getHight() {
		return hight;
	}//getHight
	
	/**
	 * 생성된 사람객체에 이름을 설정
	 * @param name 설정할 이름
	 */
	public void setName(String name) {
		this.name = name;
	}//setName
	
	/**
	 * 생성된 사람객체의 이름을 반환
	 * @return 설정된 이름
	 */
	public String getName() {
		return name;
	}//getName
	
	/**
	 * 사람의 동사적인 특징중 집에서 밥을 먹는 일을 구현한 method
	 * @return 밥을 먹는 행동
	 */
	public String eat() {
		return name + "이(가) 집에서 밥을 먹는다.";
	}
	
	/**
	 * 사람의 동사적인 특징중 밖에서 밥을 먹는 일을 구현한 method
	 * @param menu 음식 종류
	 * @param price 음식 가격
	 * @return 밥을 먹는 행동
	 */
	public String eat(String menu, int price) {
		return name + "이(가) 식당에서 " + menu + "인 음식을 " + price + "원을 내고 사먹는다.";
	}//eat
	
	
}//class
