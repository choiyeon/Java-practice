/*5. 논리연산자
일반논리 : 여러 개의 관계연산자를 붙여서 연산해야 할 때
&&(and) : 전항과 후항이 모두 true일때만 true반환. 하나라도 false면 false
||(or) : 전항과 후항이 모두 false일때만 false반환. 하나라도 true면 true

비트논리 : 비트를 연산
&(and) : 상위비트와 하위 비트가 모두 1일때만 1내림 0있으면 0내림
|(or) : 상위비트와 하위 비트가 모두 0일때만 0내림 1있으면 1내림
^(xor) : 상위비트와 하위 비트가 둘 중 하나만 1일때 1내림, 1이 두개면 0내림

*/
package day1228;
class Operator5{
	public static void main(String[] args) {
		boolean flag=true, flag2=false, flag3=true, flag4=false;
		System.out.println("--------------AND--------------");
		System.out.println(flag + " && " + flag3 + " = " + (flag&&flag3));//true
		System.out.println(flag + " && " + flag2 + " = " + (flag&&flag2));//false
		System.out.println(flag2 + " && " + flag3 + " = " + (flag2&&flag3));//false
		System.out.println(flag2 + " && " + flag4 + " = " + (flag&&flag4));//false

		System.out.println("--------------OR--------------");
		System.out.println(flag + " || " + flag3 + " = " + (flag||flag3));//true
		System.out.println(flag + " || " + flag2 + " = " + (flag||flag2));//true
		System.out.println(flag2 + " || " + flag3 + " = " + (flag2||flag3));//true
		System.out.println(flag2 + " || " + flag4 + " = " + (flag2||flag4));//false

		//&& : 전항이 false라면 후항을 연산하지 않는다.
		//|| : 전항이 true라면 후항을 연산하지 않는다.

		flag=false;
		flag2=false;
		flag3=false;

		flag3 = (flag = 3<2) && (flag2 = 5<6);
		System.out.println(flag + " && " + flag2 + " = " + flag3);

		int octalNum=0;//임의의 한자리의 양의수;//0~9
		//octalNumd이 8진수의 범위라면 true를 그렇지 않다면 false를 출력.
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		octalNum=1;
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		octalNum=2;
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		octalNum=3;
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		octalNum=4;
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		octalNum=5;
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		octalNum=6;
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		octalNum=7;
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		octalNum=8;
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		octalNum=9;
		System.out.print(octalNum + " 은(는) ");
		System.out.println((octalNum > -1) && (octalNum < 8));

		int tel=01012341234;//0으로 시작하는 수는 8진수
		System.out.println(tel);
		//8진수를 출력하면 10진수로 나온다. => 문자열로 해결
		
		
		////////////////////////////////////////////////////////////////////
		//비트논리

		//20 & 15 = 4
		//0001 0100
		//0000 1111
		//0000 0100 4

		//128 64 32 16 8 4 2 1
		//0010 0101 & 0000 1110 = 0000 0100 (4)
		//0010 0101 | 0000 1110 = 0010 1111 (47)
		//0010 0101 ^ 0000 1110 = 0010 1011 (43)

		int i =37, j = 14;
		System.out.println(i + "&" + j + "=" + (i&j));
		System.out.println(i + "|" + j + "=" + (i|j));
		System.out.println(i + "^" + j + "=" + (i^j));


	}//main
}//class
