package day0122;

/**
 * Enumeration : 열겨형 - 값을 나열하여 사용하는 데이터 형
 */
public enum Week {
	MONDAY("월요일", 10), TUESDAY("화요일", 20), WENSDAY("수요일", 30), THURSDAY("목요일", 40), FRIDAY("금요일", 50),
	SATERDAY("토요일", 60), SUNDAY("일요일", 70); // 상수로 사용되므로 대문자로 작성

	private String name;
	private int value;

	// 요소에 이름과 값을 사용하려면 생성자가 필요
	private Week(String name, int value) {
		this.name = name;
		this.value = value;
	}// Week
	
	//요소로 할당된 이넘 객체에 저장된 값의 이름을 얻는 일
	//Week w = Week.MONDAY; w.getName() => 월요일
	public String getName() {
		return name;
	}//getName
	
	//요소로 할당된 이넘 객체에 저장된 값을 얻는 일
	//Week w = Week.MONDAY; w.getValue() => 10
	public int getValue() {
		return value;
	}//getValue
	
}// enum Week
