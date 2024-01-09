package day0109;

public class ramyeon {
	private int spicy;
	private String name, color;

	/**
	 * 라면 객체의 맵기 지수 설정
	 * 
	 * @param 맵기 지수
	 */
	public void setSpicy(int spicy) {
		if (!(spicy < 11)) {
			spicy = 5;
		} // end if

		this.spicy = spicy;
	}// setSpicy

	/**
	 * 라면 객체의 맵기 지수 반환
	 * 
	 * @param 맵기 지수
	 */
	public int getSpicy() {
		return spicy;

	}// getSpicy

	/**
	 * 생성된 라면 객체 이름 설정
	 * 
	 * @param 설정되 라면
	 */
	public void setName(String name) {
		if (!(name.equals("너구리") || name.equals("신라면") || name.equals("안성탕면"))) {
			name = "이름 모를 라면";
		}
		this.name = name;
	}// setName

	/**
	 * 생성된 라면 객체 이름 반환
	 * 
	 * @param 라면 이름
	 */
	public String getName() {
		return name;
	}// getName

}//class
