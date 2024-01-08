package day0104;

/**
 *for문 : 시작과 끝을 알때 사용하는 반복문
 *문법)
 *for(시작값 ; 조건식(끝값) ; 증*감소식){
 *	반복수행될 문장들;
 *} 
 */
public class TestFor {

	public static void main(String[] args) {

		// 안녕하세요를 10번 출력하는 코드 작성.
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "번째 안녕하세요");
		} // end for
		
		// 위, 아래 결과 분리. 안쓰면 위 결과 뒤에 아래 결과가 붙어서 출력.
		System.out.println("-------------------------------------------------------------------");

		// 1부터 100까지 옆으로 출력하는 코드 작성.
		for (int i = 1; i < 101; i++) {
			System.out.print(i + " ");
		} // end for

		System.out.println();// 위, 아래 결과 분리. 안쓰면 위 결과 뒤에 아래 결과가 붙어서 출력.

		// 1에서 100까지 홀수만 옆으로 출력하는 코드 작성.
		int cnt = 0;
		// 증감식은 대상체의 값을 변화시키고 저장할 수 있는 모든 연산자를 사용할 수 있다.
		for (int i = 1; i < 101; i++) {// i++, i=i+1, i+=1
			cnt++;
			if (i % 2 != 0) {
				System.out.print(i + " ");
			} // end if
		} // end for
		System.out.println("\n" + cnt + "번");

		// 증감소식을 i+=2 이렇게 작성하면 if 없이 홀수만 출력 가능.
		for (int i = 1; i < 101; i += 2) {// i++, i=i+1, i+=1
			System.out.print(i + " ");
		} // end for

		System.out.println();// 위, 아래 결과 분리. 안쓰면 위 결과 뒤에 아래 결과가 붙어서 출력.

		// 100에서 1까지 옆으로 출력하는 코드 작성.
		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		} // end for

		System.out.println();// 위, 아래 결과 분리. 안쓰면 위 결과 뒤에 아래 결과가 붙어서 출력.
		System.out.println("-------------------------------------------------------------------");

		// 1에서 9까지 1씩 증가하는 값을 아래로 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("4 * " + i + " = " + i * 4);
		} // end for

		System.out.println("-------------------------------------------------------------------");

		// main method에서 처음 입력된 값이 구구단의 범위였을 때(2~9)
		// 해당 단의 구구단을 출력하는 코드 작성.
		int j = Integer.parseInt(args[0]);// Integer.parseInt() : 인수로 받은 문자열"숫자"를 숫자로 바꿔주는 메소드
		for (int i = 0; i < 10; i++) {
			System.out.println(j + " * " + i + " = " + j * i);
		} // end for

		System.out.println("-------------------------------------------------------------------");

		// 1부터 100까지의 합을 출력.
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		} // end for
		System.out.println("1부터 100까지의 합은 " + sum);

		System.out.println("-------------------------------------------------------------------");
		
		for (int i = 0; i < 2; i++) {
			for (int k = 0; k < 3; k++) {
				System.out.println(i + " " + k);
			}
		} // end for

	}// main

}// class
