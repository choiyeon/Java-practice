package day1227;
class Exam1227 {
	public static void main(String[] args) {
		//출력 1. 내이름은 홍길동이고, 이니셜은 H, G, D입니다. 태어난 해는 XXXX년으로, 나이는 XX살이다.

		char firstInitial = 'H';
		char secondInitial = 'G';
		char thirdInitial = 'D';
		int birth = 2000;
		System.out.println("출력 1. 내이름은 홍길동이고, 이니셜은 " + firstInitial + ", " + secondInitial + ", " + thirdInitial + "입니다. 태어난 해는 " + birth + "년으로, 나이는 " + (2023-birth) + "살이다.");

		//출력 2. 왼눈 시력은 XX이고, 오른눈 시력은 XX이고 양안 시력 XX.X입니다. //(왼눈 + 오른눈)/2

		double leftVA = 0.2;
		double rightVA = 0.3;
		System.out.println("출력 2. 왼눈 시력은 " + leftVA + "이고, 오른눈 시력은" + rightVA + "이고, 양안 시력은 " + (leftVA + rightVA)/2 + "입니다.");

		//출력 3. 편도차비 xx원 왕복차비는 xx원, 한달 20일 출근하면 월 교통비는 총 xx원입니다.

		int oneWay = 1500;
		System.out.println("출력 3. 편도차비는 " + oneWay + "원이고, 왕복차비는 " + (oneWay*2) + "원이고, 한달 20일 출근하면 월 교통비는 총 " + (oneWay*2)*20 + "원 입니다.");

		//출력 4. 대문자 'A'의 유니코드 값은 65입니다. A+32를 더하면 소문자'a'를 만들 수 있다.
		
		char aUnicode = 'A';
		System.out.println("출력 4. 대문자 'A'의 유니코드 값은 " + (int)aUnicode + "입니다. A+32를 더하면 소문자'" + (char)(aUnicode+32) + "'를 만들 수 있다.");
	}
}
