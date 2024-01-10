
/**
 * polymorphism
 * method overloading:
 * 하나의 클래스 안에서 같은 이름의 method를 여러개 정의하는 것.
 * 편의성을 위해.
 */
public class TestOverloading {

	//별 하나 출력
//	private int printStar() {// 접근지정자와 반환형은 달라도 된다.
	public void printStar() {
		System.out.print("★");
//		return 0;
	}//printStar
	
	//입력되는 수만큼 별을 옆으로 출력
	public void printStar(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.print("☆");
		}//end for
	}//printStar
	
	public static void main(String[] args) {

		TestOverloading staring = new TestOverloading();
		staring.printStar();//overload된 method 호출
		staring.printStar(10);//overload된 method 호출
	}//main

}//class
