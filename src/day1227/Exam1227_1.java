package day1227;
class Exam1227_1 {
	public static final int MONTH_ALLOWANCE = 300000;
	public static final int ALLOWANCE_PER_DAY = 20;
	public static void main(String[] args) {
		//출력 1. 한달 용돈은 x원, 하루 용돈은 20일 기준으로 x원입니다. 하루 지출은 편도 교통비 x원, 왕복교통비 x원 점심 식대 x원으로, 총 x원이 지출됩니다.
		//		한달이 지나면 잔액은 x원입니다.
		int oneWay = 1500;
		int lunchCost = 7500;

		System.out.println("한달 용돈은 " + MONTH_ALLOWANCE + "원, 하루 용돈은" + ALLOWANCE_PER_DAY + "일 기준으로 " + (MONTH_ALLOWANCE/ALLOWANCE_PER_DAY) + "원입니다. 하루 지출은 편도 교통비 " +
							oneWay + "원, 왕복교통비 " + (oneWay*2) + "원, 점심 식대 " + lunchCost + "원으로, 총 " + ((oneWay*2)*20 + (lunchCost*20)) + "원이 지출됩니다. 한달이 지나면 잔액은 " +
							(MONTH_ALLOWANCE - ((oneWay*2)*20 + (lunchCost*20))) + "원입니다.");
		
		//출력 2. API에서 Wrapper class를 찾아보고, 최대값과 최소값을 가지고 있는 Constant가 존재하는지 확인한 후, Constant가 존재한다면 아래와 같이 출력
		//byte 최소값-128, 최대값 127

		//Byte
		//System.out.println("byte 바이트 : " + Byte.BYTES);
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE);
		//System.out.println("byte 사이즈 : " + Byte.SIZE);
		//System.out.println("byte 타입 : " + Byte.TYPE);

		/*
		//Boolean
		System.out.println("Boolean 거짓 : " + Boolean.FALSE);
		System.out.println("Boolean 참 : " + Boolean.TRUE);
		System.out.println("Boolean 타입 : " + Boolean.TYPE);
		*/

		//char

		//double
		System.out.println("double 최대값 : " + Double.MAX_VALUE);
		System.out.println("double 최소값 : " + Double.MIN_VALUE);

		//float
		System.out.println("float 최대값 : " + Float.MAX_VALUE);
		System.out.println("float 최소값 : " + Float.MIN_VALUE);

	}//main
}//class
