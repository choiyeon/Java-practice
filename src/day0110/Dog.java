package day0110;

/**
 * 강아지 명사적 종류(치와와 허스키 시바견), 크기(소형견, 대형견, 중형견), 동사적 성격(사납다. 눈을 좋아한다. 겁이 많다.)
 */
public class Dog {
	private String type, size;

//	/**
//	 * 치와와 개 객체를 생성할 때 사용하는 기본 생성자
//	 */
//	public Dog() {
//		eye = 2;
//		nose = 1;
//		mouth = 1;
//	}

	/**
	 * 여러 종류의 개 객체를 생성할 때 사용하는 Overloading 생성자
	 * 
	 * @param type 개의 종류
	 * @param size 개의 크기
	 */
	public Dog(String type, String size) {
		this.type = type;
		this.size = size;
	}

	/**
	 * 생성된 개 객체에 종류를 설정
	 * 
	 * @param type 개 종류
	 */
	public void setType(String type) {
		this.type = type;
	}// setType

	/**
	 * 생성된 개 객체에 종류를 반환
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}// getType

	/**
	 * 생성된 개 객체에 크기를 설정
	 * 
	 * @param size 개 크기
	 */
	public void setSize(String size) {
		this.size = size;
	}// setSize

	/**
	 * 생성된 개 객체에 크기를 반환
	 * 
	 * @return size
	 */
	public String getSize() {
		return size;
	}// getSize

	/**
	 * 개의 성격을 구현한 method
	 * 
	 * @param menu  음식 종류
	 * @param price 음식 가격
	 * @return 밥을 먹는 행동
	 */
	public String personality(String type, String personality) {
		return type + "은 " + personality + "하다.";
	}// eat

}
