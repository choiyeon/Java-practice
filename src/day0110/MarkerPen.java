package day0110;

/**
 * 마카펜을 대상으로하여 추상화한 후 작성하는 클래스 
 */

public class MarkerPen {
	private int cap,  body;
	private String color;//검정, 파랑, 빨강
	
	/**
	 * 뚜껑 1개, 몸체 1개, 마카펜을 생성할 때 사용하는 기본 생성자
	 */
	public MarkerPen() {
		cap=1;
		body=1;
		color="검은";
	}//MarkerPen

	/**
	 * 입력된 값으로 마카펜 객체를 생성하는 인자있는 생성자(overloading된 생성자)
	 * 
	 * 색은 검은, 파란, 빨간 만 설정할 수 있다.
	 * 그 이외의 색이 입력되면 검은색으로 인스턴스 변수를 설정
	 * 
	 * @param cap 뚜껑 수
	 * @param body 몸체 수
	 * @param color 색
	 */
	public MarkerPen(int cap, int body, String color) {
//		this.cap=cap;
//		this.body=body;
//		this.color=color;
		setCap(cap);
		setBody(body);
		setColor(color);
	}//MarkerPen
	
	/**
	 * 생성된 마카팬 객체 뚜껑 개수를 설정
	 * @param cap 뚜껑의 개수
	 */
	public void setCap(int cap) {
		if(cap !=1) {
			cap=1;
		}//end if
		
		this.cap=cap;
	}//setCap
	
	/**
	 * 생성된 마카팬 객체 뚜껑 개수를 반환
	 * @param 마카팬 뚜껑의 개수
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * 생성된 마카팬 객체의 몸체 개수를 설정
	 * @param body 설정할 몸체의 수
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	
	/**
	 * 생성된 마카팬 객체의 몸체 개수를 반환
	 * @param 몸체의 개수
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * 생성된 마카팬 객체의 색을 설정.
	 * 색은 검은, 파란, 빨간 만 설정할 수 있다.
	 * 그 이외의 색이 입력되면 검은색으로 인스턴스 변수를 설정
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
		if (!(color.equals("검은")||color.equals("파란")||color.equals("빨간"))) {
			color = "검은";
		} 
		this.color=color;
	}//setColor
	/**
	 * 생성된 마카팬 객체의 색을 반환
	 * @param 설정되 색
	 */
	public String getColor() {
		return color;
	}//getColor

	/**
	 * 마카팬 객체의 칠판에 쓰는 일을 (동사적인 특징) 구현
	 * @param msg 쓰고싶은 메세지
	 * @return msg
	 */
	public String write(String msg) {
		
		return "\"" + msg + "\" 라고 " + color + "색으로 칠판에 쓴다.";
	}//write

}//class
