/*
삼항(조건)연산자
전항 ? 항1 : 항2
*/
package day0102;
class Operator6 {
	public static void main(String[] args) {
		int num=1;
		System.out.println(num + "은(는)" + (num >=0 ? "양수":"음수"));
		//num이 홀수인지 짝수인지 판단하여 출력.
		System.out.println(num + "은(는)" + (num % 2 == 0 ? "짝수":"홀수"));

		//점수를 저장하는 변수를 선언하고, 임의의 값을 할당
		//할당된 값이 0~100사이라면 "유효점수"를 출력, 
		//그렇지 않다면 "무효점수" 출력.
		int score = 101;//-1, 0~100, 101 : 경계값 테스트
		//System.out.println(score + "은(는)" + ((score >=0) && (score <=100)? "유효점수":"무효점수"));
		System.out.println(score + "은(는)" + ((score >-1) && (score <101)? "유효점수":"무효점수"));//위보다 더 좋음


	}//main
}//class
