package day0109;

/**
 * V.A를 사용하여 console에 출력하는 method
 * System.out.format(), System.out.printf() - 출력 후 줄 변경을 하지 않는다. 줄변경 필요할 때 \n
 */
public class UseVariableArguments2 {
	public static void main(String[] args) {

		int year = 2024, month = 1, day = 9;
		System.out.println("오늘은 " + year + "년 " + month+ "월 " + day + "일 입니다.");
		System.out.format("오늘은 %d년 %d월 %d일 입니다.\n", year, month, day);
		
		System.out.printf("정수 출력 : [%d][%5d][%-5d]\n", 19, 19, 19);
		System.out.printf("문자 출력 : [%c][%5c][%-5c]\n", 'A', 'A', 'A');
		System.out.printf("불린 출력 : [%b][%5b][%-5b]\n", true, true, true);
		System.out.printf("실수 출력 : [%f]\n", 2024.0109);
		System.out.printf("실수 출력 : [%f][%10.2f]\n", 2024.0109, 2024.0109);
		System.out.printf("실수 출력 : [%f][%10.2f][%.2f]\n", 2024.0109, 2024.0109, 2024.0109);
		System.out.printf("문자열 출력 : [%s][%10s][%-10s]\n", "자바", "자바", "자바");
		
		System.out.println("");
		
		String name = "홍길동";
		int javaScore = 89;
		int oracleScore = 94;
		int htmlScore = 79;
		
		//X님 Java SE ?점, Oracle ?점, HTML ?점
		//총점 : ?점 평균 ?점
		System.out.printf("%s님, ", name);
		System.out.printf("Java SE %d점, Oracle %d점, HTML %d점\n", javaScore, oracleScore, htmlScore);
		System.out.printf("총점 : %d점 평균 %.2f점", (javaScore + oracleScore + htmlScore), (javaScore + oracleScore + htmlScore)/3.0);//실수로 나누면 결과도 실수
		
		

	}//main

}//class
