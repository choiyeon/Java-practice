package day0103;

/**
 * 다중 if (else ~ if) : 연관된 여러 조건을 비교할 때 사용
 * 
 * 문법) if(조건식){ 조건에 맞을 때 수행할 문장들... }else{ 조건에 맞지 않을 때 수행할 문장들.. }
 */
public class TestElseIf {

	// public static final int MONKEY = 0;

	public static void main(String[] args) {

		// 점수 판별
		// 점수는 0보다 작을 수 없고, 100보다 클 수 없다.
		// 0보다 작다면, "0보다 작아서 실패" 출력하고
		// 100보다 크다면, "100보다 커서 실패" 출력하고
		// 그렇지 않다면(0~100 사이) "성공"을 출력

		int score = 101;
		if (score < 0) {
			System.out.println("0보다 작아서 실패");
		} else if (score > 100) {
			System.out.println("100보다 커서 실패");
		} else {
			System.out.println("성공");
		} // end else

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// char 형의 변수에는 임의의 문자가 할당되어있다.
		// 할당된 문자가 "대문자(65-90)"인지, "소문자(97-123)"인지, "숫자(48-58)"인지
		// 그렇지 않다면 "영어나 숫자가 아닙니다."
		char word = 'a';
		if (word > 64 && word < 91) {

			System.out.println(word + "는 대문자입니다.");

		} else if (word > 96 && word < 123) {

			System.out.println(word + "는 소문자입니다.");

		} else if (word > 47 && word < 58) {

			System.out.println(word + "는 숫자입니다.");

		} else {

			System.out.println("영어나 숫자가 아닙니다.");

		} // end else

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// 태어난 해를 저장하는 변수를 선언하고, 자신의 태어난 해를 할당한다.
		// 태어난 해으 띠를 출력.
		// 0-원숭이, 1-닭, 2-개, 3-돼지, 4-쥐, 5-소, 6-호랑이, 7-토끼, 8-용, 9-뱀, 10-말, 11-양

		int birth_year = 2024;
		if (birth_year % 12 == Zodiac.MONKEY) {
			System.out.println(birth_year + "년생은 원숭이 띠입니다.");
		} else if (birth_year % 12 == Zodiac.ROOSTER) {
			System.out.println(birth_year + "년생은 닭 띠입니다.");
		} else if (birth_year % 12 == Zodiac.DOG) {
			System.out.println(birth_year + "년생은 개 띠입니다.");
		} else if (birth_year % 12 == Zodiac.PIG) {
			System.out.println(birth_year + "년생은 돼지 띠입니다.");
		} else if (birth_year % 12 == Zodiac.RAT) {
			System.out.println(birth_year + "년생은 쥐 띠입니다.");
		} else if (birth_year % 12 == Zodiac.COW) {
			System.out.println(birth_year + "년생은 소 띠입니다.");
		} else if (birth_year % 12 == Zodiac.TIGER) {
			System.out.println(birth_year + "년생은 호랑이 띠입니다.");
		} else if (birth_year % 12 == Zodiac.RABBIT) {
			System.out.println(birth_year + "년생은 토끼 띠입니다.");
		} else if (birth_year % 12 == Zodiac.DRAGON) {
			System.out.println(birth_year + "년생은 용 띠입니다.");
		} else if (birth_year % 12 == Zodiac.SNAKE) {
			System.out.println(birth_year + "년생은 뱀 띠입니다.");
		} else if (birth_year % 12 == Zodiac.HORSE) {
			System.out.println(birth_year + "년생은 말 띠입니다.");
		} else if (birth_year % 12 == Zodiac.LAMB) {
			System.out.println(birth_year + "년생은 양 띠입니다.");
		} else {
			System.out.println("출생년도를 다시 입력하세요.");
		}
		

	} // main
}// class
