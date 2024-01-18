package day0118;

public class UseMath {

	public UseMath() {
//		Math m = new Math(); //생성자가 없으므로 객체화 할 수 없다.
		double d = Math.abs(-2024.01);
		int i = Math.abs(-2024);
		
		System.out.println(d + ", " + i);
		d = -10.5;
		long l = Math.round(d);
		System.out.println(d + ", " + l);
		
		d = -10.3;
		System.out.println(Math.ceil(d));

		d = 10.9;
		System.out.println(Math.floor(d));
		
		d = 12.3456;
		System.out.println((int)d);
		
		System.out.println("---------------------난수 random--------------------");
		System.out.println(Math.random());
		
		double num = Math.random();//0.00000~16 ~ 0.9999~16의 수 중 하나가 나옴.
		System.out.println("발생한 난수 : " + num);
		System.out.println("범위의 난수 : " + num*10); // 0~9까지 10개의 난수
		System.out.println("정수 범위의 난수 : " + (int)(num*10)); // 0~9까지 10개의 난수
		//1~10까지 10개의 난수 발생
		System.out.println((int)(num*10)+1);//(int)(num*10)은 0~9까지 나오니까 거기에 +1하면 1~10까지 나옴
		
		char[] randomUpperCase = new char[8];
		//위의 배열에 무작위의 알파벳 대문자를 입력 대문자(26자 65-90 -난수를 0~25 26개의 난수를 발생. 65 더하기)
		for (int j = 0; j < randomUpperCase.length; j++) {
			randomUpperCase[j] = (char)((Math.random()*26)+65);
		}
		System.out.println(randomUpperCase);
	}//UseMath
	
	public static void main(String[] args) {
		new UseMath();
	}

}
