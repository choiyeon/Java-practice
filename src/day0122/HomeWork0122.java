package day0122;

import java.time.LocalDate;
import java.util.*;

/**
 * 1. calendar 클래스를 사용하여 1월의 달력을 출력(1일~31일)<br>
 * 2.매개변수로 년, 월을 입력받아 해당 년,월에 대한 마지막일 까지를 일차원 배열에<br>
 * 할당하여 반환하는 일을 하는 method를 작성해 보세요.<br>
 * ( 마지막 일을 하는 method를 찾아볼 것. - LocalDate클래스를 사용해 볼 것)
 */
public class HomeWork0122 {

	public void January() {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		//1월 첫날 구하기
		cal.set(Calendar.MONTH, 0);//1월, 1적게 설정. 
		cal.set(Calendar.DAY_OF_MONTH, 1);//1일 설정
		
		//1월 마지막 날 구하기(2월 첫날에서 -1하기)
		cal2.set(Calendar.MONTH, 1);//2월, 1적게 설정. 
		cal2.set(Calendar.DAY_OF_MONTH, 1);//1일
		cal2.set(Calendar.DAY_OF_MONTH, cal2.get(Calendar.DAY_OF_MONTH)-1);//1월의 마지막 날구하기
		
		int[] days = new int[cal2.get(Calendar.DAY_OF_MONTH)];
		for (int i = 0; i < days.length; i++) {
			days[i] = cal.get(Calendar.DAY_OF_MONTH);
			System.out.print(days[i] + " ");
			cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)+1);
			
			//일주일씩 줄바꿈...?
			if((i+1) % 7 == 0) {
				System.out.println();
			}
		}//end for
		
	}//January
	
	public void yearMonth(int year, int month) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		//입력받은 년,월
		cal.set(Calendar.YEAR, year);//년 변경
		cal.set(Calendar.MONTH, month-1);//월 변경 1적게 설정
		cal.set(Calendar.DAY_OF_MONTH, 1);//1일 설정
		
		//입력받은 월 마지막 날 구하기(다음달 첫날에서 -1하기)
		cal2.set(Calendar.YEAR, year);//년 변경
		cal2.set(Calendar.MONTH, cal.get(Calendar.MONTH)+1);//다음달 설정.
		cal2.set(Calendar.DAY_OF_MONTH, 1);//1일
		cal2.set(Calendar.DAY_OF_MONTH, cal2.get(Calendar.DAY_OF_MONTH)-1);//입력월의 마지막 날구하기
		
		System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1) + "월\n");
		
		//배열 할당
		int[] days = new int[cal2.get(Calendar.DAY_OF_MONTH)];
		for (int i = 0; i < days.length; i++) {
			days[i] = cal.get(Calendar.DAY_OF_MONTH);
			
			LocalDate ld = LocalDate.of(year, month, days[i]);
			System.out.print(ld.getDayOfMonth() + "일 ");
			
			//다음 날짜로 이동
			cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)+1);
		}//end for
		
		
	}//yearMonth
	
	public static void main(String[] args) {
		HomeWork0122 hw0122 = new HomeWork0122();
		hw0122.January();
		System.out.println("\n----------------------------------");
		hw0122.yearMonth(2028, 2);
	}//main

}//class
