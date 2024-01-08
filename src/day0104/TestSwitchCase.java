package day0104;

/**
 * swith~case 사용 : 일치하는 정수를 비교할 때 사용 
 * 문법) 
 * switch(변수명){ 
 * 		case 상수 : 변수가 상수와 일치했을 때 수행 문장들 
 * 		case 상수 : 변수가 상수와 일치했을 때 수행 문장들 
 * 		default : 변수가 일치하는 상수가 없었을 때 수행될 문장들 
 * }
 * break; : break를 안하면 그 아래 모든 case까지 출력됨. 상황에 따라 적용. 필수는 아님.
 */
public class TestSwitchCase {

	public static final int GRADE_A_PLUS = 10;
	public static final int GRADE_A = 9;
	public static final int GRADE_B = 8;
	public static final int GRADE_C = 7;
	public static final int GRADE_D = 6;

	public static void main(String[] args) {

		int i = 0;
		switch (i) {
		case 0:
			System.out.println("영");

//			break;
		case 1:
			System.out.println("일");

//			break;
		case 2:
			System.out.println("이");

			break;
		case 3:
			System.out.println("삼");

//			break;

		default:
			System.out.println("변수와 일치하는 상수 없음");
			break;
		}
		
		//점수에 대한 학점 구하기 => 범위에 대한 값(if가 더 적절)
//		a = 90~100		score/10	100 => 10
//		b = 80~89					90~99 => 9
//		c = 70~79					80~89 => 8
//		d = 60~69					70~79 => 7
//		f = 0~59					60~69 => 6	
		
		int score = 97;
//		char grade = '\u0000';// 정수 / 정수 = 정수
//		switch (score / 10) {
//		case GRADE_A_PLUS:
//
//			break;
//		case GRADE_A:
//			grade = 'A';
//			break;
//		case GRADE_B:
//			grade = 'B';
//			break;
//		case GRADE_C:
//			grade = 'C';
//			break;
//		case GRADE_D:
//			grade = 'D';
//			break;
//
//		default:
//			grade = 'F';
//			break;
//		}// end switch
		
		score = 90;
		char grade = 64; // 대문자(65-90), 소문자(97-122), 숫자(48-57(0~9))
		switch (score / 10) {
		case GRADE_D:
			grade++; // grade 64->65
		case GRADE_C:
			grade++;// grade 65->66
		case GRADE_B:
			grade++;// grade 66->67
		case GRADE_A:
		case GRADE_A_PLUS:
			grade++;
			break;// grade 67->68 => char D = 68; 60점의 학점은 D

		default:
			grade += 6;// char 70 = F
			break;
		}
		System.out.println(score + "점의 학점은 " + grade);

		score = 110;
		grade = 64;
		if (score > -1 && score < 101) {
			switch (score / 10) {
			case GRADE_D:
				grade++; // grade 64->65
			case GRADE_C:
				grade++;// grade 65->66
			case GRADE_B:
				grade++;// grade 66->67
			case GRADE_A:
			case GRADE_A_PLUS:
				grade++;
				break;// grade 67->68 => char D = 68; 60점의 학점은 D

			default:
				grade += 6;
				break;
			}// end switch

			System.out.println(score + "점의 학점은 " + grade);

		} else {
			System.out.println(score + "점은 잘못된 점수입니다.");
		} // end else

		////////////////// 대문자(65-90), 소문자(97-122)(소문자-32=대문자),
		////////////////// 숫자(48-57(0~9))///////////////////////////////
		char ii = '9';
		System.out.println(ii);

	}// main

}// class
