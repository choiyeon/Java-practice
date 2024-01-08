/*
기본형 데이터형 : 변수에 상수값을 저장하는 데이터 형
*/
package day1227;
class PrimitiveDataType {
	public static void main(String[] args) {
	///////////////정수 상수를 저장할 수 있는 데이터 형///////////////
	byte a = 10;//byte는 -128 ~ 127
	//byte b = 128; //데이터 형은 저장할 수 있는 범위를 초과하면 error발생
	short b = -32768;
	int c = -2147483638;//21억
	long d = 10;

	//자신이 평생 모으고 싶은 현실적인 자산을 변수에 할당
	int cost = 1000000000;
	long asset = 2147483648L;//리터럴의 크기를 변경하여 상수를 저장하고, 변수에 저장

	System.out.println("byte : " + a + ", short : " + b + ", int : " + c + 
						", long :" + d + "모으고 싶은 자산 : " + cost + asset);
	/////////////char형/////////////
	//char e = 'A'//문자에 해당하는 2byte의 unicode값이 할당
	char e = 65;//A의 유니코드 값 65
	char ff = 48;//'0';
	char g = 44032;//'가';
	char h = '\u0000';//unicode 0
	System.out.println("char : " + e + ff + g + h);

	///////////////실수형/////////////////////
	//float f  = 12.27;//실수 리터럴은 8byte이고, float 형은 4byte이기 때문에 크기가 같지 않아서 값이 할당 될 수 없다.

	float f = 12.27F;//8byte의 리터럴이 4byte로 축소 실수에서 F / f 필수 
	float f_ = 12.27f;

	double k = 2023.12;//2023.12D; d/D 생략 가능
	
	System.out.println("float : " + f +", "+ f_ + " double :" + k);

	///////////////////boolean/////////
	boolean l = true;
	boolean m = false;
	//true / false 이외의 값은 저장 안됨
	//boolean n=0;error
	System.out.println("boolean : " + l +", "+ m);

	}//main
}//class
