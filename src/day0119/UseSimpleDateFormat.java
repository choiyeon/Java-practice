package day0119;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *입력된 형식으로 날짜를 만들어 제공하는 클래스. 
 */
public class UseSimpleDateFormat {

	public UseSimpleDateFormat() {
		//1. 객체 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh):mm:ss EEEE", Locale.JAPAN);
		//2. method호출
		System.out.println(sdf.format(new Date()));
	}//UseSimpleDateFormat
	public static void main(String[] args) {

		new UseSimpleDateFormat();
	}//main

}//class
