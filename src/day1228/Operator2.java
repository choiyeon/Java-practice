		/*
		산술연산자
		+, -, *, /, %(나머지)
		*/
package day1228;
class Operator2 {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i + "를 2로 나눈 나머지 : " + (i % 2)); //0 또는 1
		i = 116849;
		System.out.println(i + "를 2로 나눈 나머지 : " + (i % 2));//0 또는 1

		int birth = 2024;
		System.out.println(birth + "를 2로 나눈 나머지 : " + (birth % 12));
		//0-원숭이, 1-닭, 2-개, 3-돼지, 4-쥐, 5-소, 6-호랑이, 7-토끼, 8-용, 9-뱀, 10-말, 11-양

		//정수 / 정수 = 정수
		int num = 10;
		int num2 = 3;
		System.out.println(num + "/" + num2 + "=" + (num / num2));

		//정수/실수=실수 : 연산 결과를 실수로 얻으려면 나누는 수 중 하나는 실수여야한다.
		System.out.println(num + "/" + num2 + "=" + (num / (double)num2));

		//쉬프트 대입
		i <<= 4; //i = i << 4; //0000 0010 << 4 = 0010 0000
		i >>= 1; //i = i >> 1; //0010 0000 >> 1 = 0001 0000
		i >>>= 2; //i = i >>> 2; //0001 0000 >>> 2 = 0000 0100

		//비트논리 대입
		i &= 20; //i = i&20; //0000 0100 & 0001 0100 = 0000 0100 (4)

		System.out.println(i);

	}//main
}//class
