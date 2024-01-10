package day0109;

public class Ramyeon {
	private int spicy;
	private double time;
	private String name;

	/**
	 * 라면 객체의 맵기 지수 설정 
	 * 신라면 3400스코빌, 너구리 2300스코빌, 안성탕면 570스코빌
	 * @param 맵기 지수
	 */
	public void setSpicy(int spicy) {
		if (spicy > 10000) {
			spicy = 2100;	
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
			name = "처음보는 라면";
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

	/**
	 * 라면 객체의 적정 조리시간 설정 적정 조리시간 : 신라면 4.5분, 너구리 5분, 안성탕면 4.5분 조리시간 최소 3분, 최대 5분 이어야
	 * 맛있다.
	 * 
	 * @param 적정 조리 시간 설정
	 */
	public void setTime(double time) {
		if (time < 3 || time > 6) {
			time = 4.5;
		} // end if

		this.time = time;
	}// setSpicy

	/**
	 * 라면 객체의 적정 조리시간 반환
	 * 
	 * @param 적정 조리 시간
	 */
	public double getTime() {
		return time;

	}// getSpicy

}//class
