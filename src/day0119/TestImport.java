package day0119;

import java.util.ArrayList;
import java.util.Date;
//import java.sql.Date; //다른 패키지 같은 클래스명이면 둘 중 하나만 사용가능.
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *다른 패키지에 존재하는 클래스를 가져다 사용할 때. 
 */
public class TestImport {

	public static void main(String[] args) {
		Date d = new Date();
		java.sql.Date d2 = null;//util이 아닌 squl의 Date를 사용하려면 full path.
		Date d3 = null;
		
		List l = new ArrayList();
		List l2 = new ArrayList();
		Map m = new HashMap();
	}

}
