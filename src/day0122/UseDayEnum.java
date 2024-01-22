package day0122;

public class UseDayEnum {

	public static void main(String[] args) {

		//Day enum의 모든 값
		for(Day day : Day.values()) {
			System.out.println(day);
		}//end for
		System.out.println("--------------------------------");
		
		//특정 값 하나 얻기
		System.out.println(Day.MONDAY);
		//특정 요소의 번호 : ordinal()
		System.out.println(Day.MONDAY.ordinal());
		System.out.println(Day.TUESDAY.ordinal());
		System.out.println(Day.WENSDAY.ordinal());
	}//main

}//class
