package day0109;

/**
 * Variable Arguments(가변인수 - 파라메터는 하나이나 입력 값이 동적)
 * 문법
 * 데이터형 ... 변수명
 *  
 */
public class UseVariableArguments {
	public void testVA(int... i) {
		// parameter는 참조형 데이터 형인 배열로 처리된다.
//		System.out.println(i);//주소만 출력 [I@3d012ddd
		// 배열을 반복문으로 처리한다.
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		} // end for
	} // testVA
	
	//V.A는 가장 마지막에만 정의할 수 있다.
	public void test(int i,  char c, String s, double d, int ... j) {
		
	}
	
	//error : The variable argument type int of the method test2 must be the last parameter
//	public void test2(int i,  char c, String s, int ... j, double d) {
//	}

	public static void main(String[] args) {

		UseVariableArguments uva = new UseVariableArguments();// 객체화 : class명 객체명 = new class명();

		// V.A는 호출할 때 데이터형만 일치하면 값의 개수에 상관없이 호출가능
//		uva.testVA();//주소만 출력 [I@3d012ddd
//		uva.testVA(2024);//2024 출력
		uva.testVA(2024, 1, 2, 10);

	}

}
