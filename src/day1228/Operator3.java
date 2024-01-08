/*
쉬프트 연산자
<< : left shift 비트를 왼쪽으로 밀고, 밀어서 빈칸을 항상 0으로 채움
>> : right shift 비트를 오른쪽으로 밀고, 밀어서 빈칸을 최상위 부호비트에 따라 양수면 0을 음수면 1을 채움
>>> : unsigned right shift 비트를 오른쪽으로 밀고, 밀어서 빈칸을 항상 0으로 채움
*/
package day1228;
class Operator3{
	public static void main(String[] args){
		int i = 5;
		System.out.println(i + "<< 3 =" + (i<<3));//5<<3 = 40 0000 0101 << 0010 1000 40

		i = 60;
		System.out.println(i + ">> 4 =" + (i>>4));//0011 1100 -> 0000 0011 = 3

		i = 75;
		System.out.println(i + ">> 2 =" + (i>>2));//0100 1011 -> 0001 0010 18

		i = 29;										//128 / 64 / 32 / 16 / 8 / 4 / 2 / 1
		System.out.println(i + ">>> 1 =" + (i>>>1));//0001 1101 -> 0000 1110 14

		i = 1;										
		System.out.println(i + "<< 31 =" + (i<<31));//int가 가질 수 있는 최소값 -2147483648
		i = 1;										
		System.out.println(i + "<< 32 =" + (i<<32));//되돌아와서 1
		i = 6;										
		System.out.println(i + "<< 31 =" + (i<<31));//0

		i = -1;										
		System.out.println(i + ">> 5 =" + (i>>5));//-1은 몇칸을 밀어도 -1
		i = -1;										
		System.out.println(i + ">>> 1 =" + (i>>>1));//양수의 최고값 2147483647
	}//main
}//class

