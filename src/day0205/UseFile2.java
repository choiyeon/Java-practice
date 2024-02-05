package day0205;

import java.io.File;

/**
 *디렉토리 생성 
 */
public class UseFile2 {

	public static void main(String[] args) {

		//1. file 생성
		File file = new File("c:/dev/ywc");
		
		//2. 생성
		//부모디렉토리(dev)가 존재하면 mkdir()이나 mkdirs() 모두 하위 디렉토리를 잘 생성.
//		System.out.println(file.mkdir());
		System.out.println(file.mkdirs());
		
		File file2 = new File("c:/temp2/test");
		//부모디렉토리(temp2)가 존재하지 않으면 하위디렉토리를 만들지 못한다.
//		System.out.println(file2.mkdir());
		
		//mkdirs()부모디렉토리가 없으면 부모와 하위디렉토리 모두를 만든다.
		System.out.println(file2.mkdirs());
		
	}//main

}//class
