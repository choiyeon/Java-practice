package day0202;

public class UseRuntimeException {

	public static void main(String[] args) {
		// main method의 arguments를 두개 입력받아 나눈 연산을 수행한 후
		// 결과를 보여주는 일.
		int num = 0;
		int num2 = 0;
		int result = 0;

		try {
			num = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);

			result = num / num2;
			System.out.println(num + " / " + num2 + " = " + result);

			// 배열에 문제가 생김
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("실행법) javaUseRuntimeException 값 값");
			System.err.println("간단한 메시지 " + aioobe.getMessage());
			System.err.println("예외클래스와 메시지 " + aioobe);
			System.err.print("자세한 예외메시지 ");
			aioobe.printStackTrace();

			// 값의 데이터형에 문제가 있음.
		} catch (NumberFormatException nfe) {
			System.err.println("값은 숫자여야 한다.");
			System.err.println("간단한 메시지 " + nfe.getMessage());
			System.err.println("예외클래스와 메시지 " + nfe);
			System.err.print("자세한 예외메시지 ");
			nfe.printStackTrace();

			// 수에 문제가 생김.
		} catch (ArithmeticException ae) {
			System.err.println("0으로 나눌 수 없다.");
			System.err.println("간단한 메시지 " + ae.getMessage());
			System.err.println("예외클래스와 메시지 " + ae);
			System.err.print("자세한 예외메시지 ");
			ae.printStackTrace();

			// 부모(Exception)는 모든 예외 잡을 수 있다.
		} catch (Exception e) {
			e.printStackTrace();
			
			//에러가 있든 없든 무조건 실행해야 하는 코드.
		}finally {
			System.out.println("반드시 실행해야 할 코드");
		}//end finally
	}// main
}// class
