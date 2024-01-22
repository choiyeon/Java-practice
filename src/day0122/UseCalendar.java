package day0122;

import java.util.Calendar;

import java.util.GregorianCalendar;

/**
 *단편적인 날짜 정보를 얻을 때 
 */
public class UseCalendar {

	public UseCalendar() {
		//1. 객체생성 : 추상클래스이므로 직접 객체화 되지 않는다.
//		Calendar cal = new Calendar();
		//- static method인 getInstance()를 사용
		Calendar cal = Calendar.getInstance();
		//- 자식 클래스를 사용하는 방법(is a관계의 객체화)
		Calendar cal2 = new GregorianCalendar();
		System.out.println("cal : " + cal);
		System.out.println("cal2 : " + cal2);
		System.out.println("--------------------------------------");
		
		StringBuilder sb = new StringBuilder();
		int year = cal.get(Calendar.YEAR);//년도 얻기
//		int year = cal.get(1);//가독성 좋지 않음.
		int month = cal.get(Calendar.MONTH)+1;//년도 얻기
		sb.append(year).append("년 ");
		sb.append(month).append("월 ");
		sb.append(cal.get(Calendar.DAY_OF_MONTH)).append("일\n");
		sb.append("오늘은 이번 년도의 ").append(cal.get(Calendar.DAY_OF_YEAR)).append("번째 날 \n");
		//요일을 문자열로 출력 1-일 2-월 3-화,,,,7-토
//		String[] yoill = {"일", "월", "화", "수", "목", "금", "토"};
//		sb.append(yoill[cal.get(Calendar.DAY_OF_WEEK)-1]).append("요일");
		int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);
		sb.append(dayofWeek).append("요일 ");
		sb.append("일,월,화,수,목,금,토".split(",")[dayofWeek-1]).append("요일 ");//문자열 배열 사용
		
		//오전 오후
		int amPm = cal.get(Calendar.AM_PM);
		sb.append(amPm).append(" ");
		sb.append("오전,오후".split(",")[amPm]).append(" ");
		// 시
		sb.append(cal.get(Calendar.HOUR)).append("(")//12시간
		.append(cal.get(Calendar.HOUR_OF_DAY)).append(") : ");//24시간
		// 분
		sb.append(cal.get(Calendar.MINUTE)).append(" : ");
		// 초
		sb.append(cal.get(Calendar.SECOND)).append(" ");
		
		System.out.println(sb);
		
		System.out.println("--------------------------");
		//생성된 객체의 특정 일 변경
		cal.set(Calendar.YEAR,2023);//년 변경
		cal.set(Calendar.MONTH, 3);//월 변경 1적게 설정
//		cal.set(Calendar.DAY_OF_MONTH, 2);//일 변경
		//현재 월에 존재하지 않는 일로 설정하면 자바에 자동으로 다음 달 1일로 변경
		cal.set(Calendar.DAY_OF_MONTH, 31);

		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}//UseCalendar
	
	public static void main(String[] args) {
		new UseCalendar();
	}//main

}//class
