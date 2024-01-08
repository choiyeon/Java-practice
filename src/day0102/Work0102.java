package day0102;

public class Work0102 {

	public static void main(String[] args) {
		//1.두 정수를 저장할 수 있는 변수를 만들고, 임의의 값을 할당.
		//위의 변수 중에 큰 값을 반환하는 삼항 연산자 코드 작성
		int x = 10;
		int y = 30;
		System.out.println("x는 " + x + ", y는 " + y + "이다. 둘 중 " + (x > y? "x가 더 크다":"y가 더 크다"));
		
		//2.세개의 정수를 저장할 수 있는 변수를 만들고, 각각의 변수의 임의의 값을 할당
		//세개의 숫자 중 가장 작은 값을 찾아서 출력하는 코드를 만들기(삼항 연산자)
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println((a < b && a < c) ? a : (b < c ? b : c));
		int xx = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		System.out.println( xx + "이 가장 작다.");//삼항연산자 중첩가능
		
		//3. int temp1=10, temp2=20 이 할당된 변수를 선언하고 아래 코드를 작성했을 때 어떤 값이 출력되는지 예상해보고, 어떻게 그런 결과가 나왔는지 주석을 열고 간단히 작성.
		int temp1 = 10, temp2 = 20;
		System.out.println(++temp1 + temp2--);//temp1=11 temp2=프린트 후 19
		System.out.println("tmep1 : " + temp1 + " temp2: "+ temp2);
		
		//4.Integer.MAX_VALUE Constant를 사용하여 Integer의 하위 2byte값이 출력되도록 비트 논리연산자를 사용하여 출력(65535가 나와야함)
		int aa=Integer.MAX_VALUE;
		System.out.println(aa+ "의 하위 2byte 값: " + (Integer.MAX_VALUE&0x0000ffff));
	
	}//main

}//class
