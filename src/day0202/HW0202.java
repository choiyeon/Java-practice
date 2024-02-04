package day0202;

/**
 * - 입력받은 단을 사용하여 구구단을 출력하는 method를 작성합니다. 
 * - 구구단을 출력하는 위의 method를 호출하는 method를
 * 작성합니다. ( main method에서 호출 )
 * 
 * 유효성 : 구구단은 2~9단까지이며, 입력된 단이 해당범위가 아닐 때에는 예외를 발생시켜 처리합니다.
 * 
 * -구구단 예외는 Java API에서는 제공되지 않으니 사용자 정의 예외처리 클래스로 작성해 보세요. 
 * ( Compile Exception으로 작성할 것 )
 * 
 */

/**
 * 사용자 정의 예외처리 클래스
 */
@SuppressWarnings("serial")
class GuguException extends Exception {
	public GuguException(String message) {
		super(message);
	}
}// GuguException

public class HW0202 {
	public HW0202(int dan) {
		try {
			if (dan < 2 || dan > 9) {
				throw new GuguException(dan + "단을 입력하셨습니다. 2~9단을 입력하세요");
			}

			System.out.println(dan + "단을 출력합니다.");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " X " + i + " = " + (dan * i));
			} // for

		} catch (Exception e) {
			System.err.println("오류발생");
			e.printStackTrace();
		} // catch

	}// HW0202

	public static void main(String[] args) {
		new HW0202(10);//단 입력
	}// main

}// class
