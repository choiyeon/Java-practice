package day0122;

import java.text.DecimalFormat;

public class UseDecimalFormat {

	public UseDecimalFormat() {
		int i = 9_750_000;//JDK1.7에서부터는 숫자의 가독성을 향상시키기 위해서
		//숫자에 _를 넣을 수 있도록 기능을 제공.
		int j = 900_000_000;
		System.out.println(i);//_는 출력되지 않음
		System.out.println(j);
		
		System.out.println("--------------------------------");
		//데이터가 없으면 0을 채워서 반환
		DecimalFormat df = new DecimalFormat( "0,000,000" );
		System.out.println( df.format( 2024 ) ); //0,002,024

		//데이터가 존재하는 것 까지만 반환
		DecimalFormat df2 = new DecimalFormat( "#,###,###" );
		System.out.println( df2.format( 2024 ) ); //2,024

		//데이터가 존재하는 것 까지만 반환
		DecimalFormat df3 = new DecimalFormat( "0,000,000.00" );
		System.out.println( df3.format( 2024.0122 ) ); //0,002,024.01
		
		//3자리 마다 ,를 넣어서 반환
		DecimalFormat df4 = new DecimalFormat( "#,###" );
		System.out.println( df4.format( 214846545 ) ); //2,024
		
	}//UseDecimalFormat
	public static void main(String[] args) {
		new UseDecimalFormat();
	}

}
