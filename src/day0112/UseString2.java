package day0112;

/**
 * 문자열 클래스의 사용
 */
public class UseString2 {

	public static void main(String[] args) {

		String fileName = "Test.bat";
		System.out.println("파일명 : " + fileName.substring(0, fileName.lastIndexOf(".")));//"."이 여러개 있을 수 있으니 마지막"."을 찾아 자르기
		System.out.println("확장자 : " + fileName.substring(fileName.lastIndexOf(".")+1));
		
		String str = "";//""로 초기화 => String 클래스에서 제공하는 instance method는 사용 가능.
		String str1 = null;//null로 초기화 => String 클래스에서 제공하는 instance method는 사용 불가능.
		
		System.out.println(fileName + "는 비었나? : " + fileName.isEmpty());//false
		System.out.println(str + "는 비었나? : " + str.isEmpty());//true
//		System.out.println(str1 + "는 비었나? : " + str1.isEmpty());//error
		//null로 초기화된 객체의 method를 호출하면 error 발생.
		
		str = "   A BC   ";
		String temp = str.trim();
		System.out.printf("[%s][%s]\n", str, temp);//[   A BC   ][A BC]
		
		str = "Java Oracle JDBC JSON";
//		temp = str.replace("J", "j");
		temp = str.replaceAll("J", "j");
		System.out.println("변경된 문자열 : " + temp);
		
		String msg = "    a야 씨방 ㅆㅣ방";
		//method chain method를 이어붙이는 거
		String filter = msg.replaceAll("야", "*").replaceAll("방", "*").replaceAll("ㅆ", "*");
		System.out.println(filter);
		
		temp = msg.concat("데헷").replaceAll("씨방", "**").trim().toUpperCase();
		System.out.println(temp);
		
		msg = "내 전화번호는 010-1234-5678 내 친구 전화번호는 010-2222-3333 내 나이는 20살";
		temp = msg.replaceAll("\\d", "*");
		System.out.println(temp);
		
		msg = "내 전화번호는 010-1234-5678 내 친구 전화번호는 010-2222-3333" +
				" 내 나이는 20살 이전 전화번호는 011-123-4567 태어난 해는 1995년" +
				" 집 전화번호는 02-123-4567 듀얼번호는 010-3345-7788";
		temp = msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "XXX-XXXX-XXXX");
		System.out.println(temp);
		
		msg = "내 전화번호는 010-1234-5678 내 친구 전화번호는 010-2222-3333" +
				" 내 나이는 20살 이전 전화번호는 011-123-4567 태어난 해는 1995년" +
				" 집 전화번호는 02-123-4567 듀얼번호는 010-3345-7788";
		temp = msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "$1-XXXX-$3");
		System.out.println(temp);
		
		msg = "전화번호는 010-1234-5678";
		temp = msg.replaceAll("(\\d{3}-)\\d{1}(\\d{3}-\\d{4})", "$1x$2");
		System.out.println(temp);//010-x234-5678
		
		msg = "내 메일 주소는 test@daum.net 과 hello12 Java test@sist.co test@sist.co.kr";
		temp = msg.replaceAll("[a-z]", "");//전체에서 소문자만 지우기
		System.out.println(temp);//
		temp = msg.replaceAll("[A-Z]", "");//전체에서 대문자만 지우기
		System.out.println(temp);//
		temp = msg.replaceAll("[0-9]", "");//전체에서 숫자만 지우기
		System.out.println(temp);//
		temp = msg.replaceAll("[ㄱ-힣]", "");//전체에서 한글만 지우기
		System.out.println(temp);//
		temp = msg.replaceAll("[da]", "");//범위(-)가 아니면 각각의 문자가 된다.
		System.out.println(temp);//
		temp = msg.replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-z0-9.-]+\\.[a-zA-z]{2,}", "xxxx@xxx.xxx");//범위(-)가 아니면 각각의 문자가 된다.
		System.out.println(temp);//
		
		int i = 12;
		temp = String.valueOf(i);
		System.out.println(temp);
		//12

		double d = 2024.01;
		temp = String.valueOf(d);
		System.out.println(temp);
		//2024.01
		
//		String csvData = "Java,Oracle,JDBC";
		String[] strArr = "Java,Oracle,JDBC".split(",");
		for (String data : strArr) {
			System.out.println(data);
		}//for
		
		String[] strArr2 = "어쩔.저쩔.뇌절".split("[.]");
		for (String data : strArr2) {
			System.out.println(data);
		}//for
		
				
	}

}
