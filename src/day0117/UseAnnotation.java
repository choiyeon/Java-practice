package day0117;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UseAnnotation {

	@Deprecated
	public void test(){
		System.out.println("오늘은 수요일");
		Date date = new Date();
		System.out.println(date.getYear()+1900);
	}//test
	
	@SuppressWarnings({"unused", "rawtypes"})
	public void test2() {
//		@SuppressWarnings("unused")
		int day;

//		@SuppressWarnings("rawtypes")
		List<String> list = new ArrayList();
	}//test2
	
	//Override는 부모클래스가 가지고 있는 method를 자식클래스에서 그대로 정의.
	public String toString() {
		 return "객체의 주소가 아닌 메시지";
	}
	
	public static void main(String[] args) {
		UseAnnotation ua = new UseAnnotation();
		ua.test();
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		
		System.out.println("-----------------------------------------------");
		System.out.println(ua);//내 객체 : 주소 > toString을 overriding하면 내가 원하는 값 출력
		System.out.println(d);//자바제공 객체 : 메시지
		System.out.println(sdf);//자바제공 객체 : 주소 
		
		System.out.println("-----------------------------------------------");
		int i = 10;
		System.out.println(i);
		long l = 20;
		System.out.println(l);
	}//main

}//class
