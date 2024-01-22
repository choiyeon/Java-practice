package day0122;

import java.util.Calendar;

/**
 * 1. calendar 클래스를 사용하여 1월의 달력을 출력(1일~31일)<br>
 * 2.매개변수로 년, 월을 입력받아 해당 년,월에 대한 마지막일 까지를 일차원 배열에<br>
 * 할당하여 반환하는 일을 하는 method를 작성해 보세요.<br>
 * ( 마지막 일을 하는 method를 찾아볼 것. - LocalDate클래스를 사용해 볼 것)
 */
public class HomeWork0122 {

	public void January() {
		Calendar cal = Calendar.getInstance();
		StringBuilder sb = new StringBuilder();
		sb.append(cal.get(Calendar.DAY_OF_MONTH)).append("일\t");
		int today = cal.get(Calendar.DAY_OF_MONTH);
		
		int[] days = new int[31];
		for(int i = 0; i < 31; i++) {
			days[i] = i+1;
			System.out.println(days[i]);
			sb.append(days[i]).append("일\t");
		}
		System.out.println(sb);
		
	}//January
	
	public String yearMonth(int year, int month) {
		
		return null;
	}//yearMonth
	
	public static void main(String[] args) {
		HomeWork0122 hw0122 = new HomeWork0122();
		hw0122.January();
		hw0122.yearMonth(2024, 1);
	}//main

}//class
