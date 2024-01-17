package day0117;

/**
 * 강아지 명사적 종류(치와와 시바견 허스키), 크기(소형견, 중형견, 대형견), 동사적 성격(사납다. 겁이 많다. 눈을 좋아한다. )
 */
public abstract class Dog {
	private int walk;
	private String type, size;

	/**
	 * 치와와 개 객체를 생성할 때 사용하는 기본 생성자
	 */
	public Dog() {
		this("개과", "품종에 띠라 상이함", 60);
//		type = "개과";
//		size = "품종에 띠라 상이함";
//		walk = 60;
	}

	/**
	 * 여러 품종의 개 객체를 생성할 때 사용하는 Overloading 생성자
	 * 
	 * @param type 개의 품종
	 * @param size 개의 크기
	 */
	public Dog(String type, String size, int walk) {
		setType(type);
		setSize(size);
		setWalk(walk);
	}

	/**
	 * 생성된 개 객체에 품종를 설정
	 * 
	 * @param type 개 품종
	 */
	public void setType(String type) {
		this.type = type;
	}// setType

	/**
	 * 생성된 개 객체에 품종를 반환
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
	 * 생성된 개 객체에 권장 산책시간를 설정
	 * 
	 * @param walk 권장 산책시간
	 */
	public void setWalk(int walk) {
		this.walk = walk;
	}// setWalk

	/**
	 * 생성된 개 객체에 권장 산책시간를 반환
	 * 
	 * @return walk
	 */
	public int getWalk() {
		return walk;
	}// getWalk

	/**
	 * 개가 좋아하는 간식과 먹을 수 있는 간식의 개수를 정의한 method
	 * @param menu 간식
	 * @param num 간식 개수
	 * @return
	 */
	public abstract String snack(String menu, int num);
	
	/**
	 * 개가 좋아하는 산책 내용을 정의한 method
	 * @param things
	 * @return
	 */
	public abstract String walkDay(String things);

}
