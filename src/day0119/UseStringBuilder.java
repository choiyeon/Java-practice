package day0119;

public class UseStringBuilder {
	
	public void useStringBuffer() {
		//1.객체화
		StringBuffer sb = new StringBuffer();
		//2. 객체가 제공하는 method사용
		//값을 sb객체 참조하는 공간에 추가
		sb.append("안녕");
		sb.append(true);
		sb.append(2024);
		
		//특정 위치에 값 추가하기
		sb.insert(6, "에에엥");
		
		//특정 범위의 값 삭제
		//delete(시작인덱스, 끝인덱스+1)
		sb.delete(5, 7);
		
		//전체 삭제
		sb.delete(0, sb.length());
		
		sb.append("hello");
		
		//sb가 참조하는 메모리에는 hello들어있는지 비교하는 코드 작성.
		//hello와 같으면 true 출력
		System.out.println( sb.toString().equals("hello") );
		
		//sb에는 hello가 소문자로 들어가 있음. => 대문자로 출력
		System.out.println(sb.toString().toUpperCase());
		
		System.out.println(sb);
		
	}//useStringBuffer
	
	public void useStringBuilder() {
		//1.객체화
		StringBuilder sb = new StringBuilder();
		//2. 객체가 제공하는 method사용
		//값을 sb객체 참조하는 공간에 추가
		sb.append("안녕");
		sb.append(true);
		sb.append(2024);
		
		//특정 위치에 값 추가하기
		sb.insert(6, "에에엥");
		
		//특정 범위의 값 삭제
		//delete(시작인덱스, 끝인덱스+1)
		sb.delete(5, 7);
		
		//전체 삭제
		sb.delete(0, sb.length());
		
		sb.append("hello");
		
		//sb가 참조하는 메모리에는 hello들어있는지 비교하는 코드 작성.
		//hello와 같으면 true 출력
		System.out.println( sb.toString().equals("hello") );
		
		//sb에는 hello가 소문자로 들어가 있음. => 대문자로 출력
		System.out.println(sb.toString().toUpperCase());
		
		System.out.println(sb);
	}

	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		System.out.println("------------StringBuffer----------");
		usb.useStringBuffer();
		System.out.println("------------StringBuilder----------");
		usb.useStringBuilder();
		System.out.println("------------------------------------");
		String str = "안녕";
		//String에 +=을 사용하거나 +연산하게되면 JDK1.5부터는
		//StringBuilder객체를 생성하여 문자열저장하고 append를 수행한다.
		str += "하세요?";
		str += "오늘은";
		System.out.println(str + "추운 월요일" + "아우 추워");
		
		StringBuilder sb = new StringBuilder("안녕");
		sb.append("하세ㅛㅇ/").append("오늘은");
		System.out.println(sb.append("추운 원요리입니다.").append("오지게 춰워"));
		
		
	}

}
