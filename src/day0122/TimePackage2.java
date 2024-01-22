package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimePackage2 {

	public void useDate() {
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getYear() + " " + ld.getMonth() + " " + ld.getMonthValue() + " - " +
		ld.getDayOfMonth() + " 오늘 이번 년도의 몇번째 날 : " + ld.getDayOfYear() +
		" / 요일 : " + ld.getDayOfWeek() + " / 요일의 수 : " + ld.getDayOfWeek().getValue());

	}// useDate

	public void useTime() {
		LocalTime lt = LocalTime.now();
		System.out.println(lt.getHour() + " : " + lt.getMinute() + " : " + lt.getSecond() + " " + lt.getNano());

	}// useTime

	public void useDateTime() {
		//1. 날짜 관련 클래스 생성
		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt.getYear() + "-" + ldt.getMonthValue() + "-" + ldt.getDayOfMonth() + " " + ldt.getHour()
//				+ ":" + ldt.getMinute() + ":" + ldt.getSecond() + " " + ldt.getDayOfWeek());
		
		//2. formatter 클래스 생성
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-DD HH:mm:ss a EEEE", Locale.KOREA);
		
		//3. 날짜 관련 클래스의 format method 호출하여 formatter 할당
		String dateFormat = ldt.format(dtf);
		System.out.println(dateFormat);
	}// useDateTime

	public static void main(String[] args) {
		TimePackage2 tp2 = new TimePackage2();
		System.out.println("------------LocalDate------------------");
		tp2.useDate();
		System.out.println("------------LocalTime------------------");
		tp2.useTime();
		System.out.println("------------LocalDateTime------------------");
		tp2.useDateTime();
	}// main

}// class
