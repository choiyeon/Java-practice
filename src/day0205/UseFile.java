package day0205;

import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * File클래스를 사용한  파일접근
 */
public class UseFile {
	
	public static void main(String[] args) {
		//1. 생성
		File file = new File("C:/DEV/TEMP/JAVA.READ.TXT");
		System.out.println(file);
		
		if(!file.exists()){
			System.out.println("파일 없음");
			return;
		}
		
		System.out.println(file.isFile()?"파일":"디렉토리");
		System.out.println(file.isDirectory()?"디렉토리":"파일");
		System.out.println(file.canRead()?"읽을 수 있":"읽을 수 없");
		System.out.println(file.canWrite()?"쓸을 수 있":"쓸 수 없");
		System.out.println(file.isHidden()?"숨김파일":"일반파일");
		System.out.println(file.canExecute()?"실행가능":"실행불가능");
		System.out.println("파일 크기 : " + file.length() + "byte");
		System.out.println("절대 경로 : " + file.getAbsolutePath());
		try {
			System.out.println("규범 경로 : " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("경로 : " + file.getParent());
		System.out.println("파일명 : " + file.getName());
		
		long lastModified = file.lastModified();
		System.out.println("파일이 마지막으로 수정된 날짜 : " + file.lastModified());
		System.out.println("파일이 마지막으로 수정된 날짜 : " + 
		new Date(lastModified));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("파일이 마지막으로 수정된 날짜 : " + 
				sdf.format(new Date(lastModified)));
		
	}//main

}//class
