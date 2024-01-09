package day0108;
//클래스 하나를 정의하고 아래의 일을 할 수 있는 instance method를 구현하고 호출하기.

/**
 *1. 자신의 이름을 출력하는 method
 *2. 자신의 이름 중에 "성"을 반환하는 method
 *
 *3. 점수를 입력받아 점수의 판정을 출력하는 method 작성
 *	점수는 0~100사이일 때만 판정을 하고 그렇지 않으면 "잘못된 점수"를 출력.
 *	0~39-과락, 40~59-다른 과목을 참조, 60~100-합격
 *
 *4. 문자를 입력받아 해당 문자가 "대문자", "소문자", "숫자"인지를 판단하여 출력하는 method
 *A-대문자
 *그외 이에는 $ - 대문자 소문자 숫자가 아닙니다. 출력
 *
 *5. 태어난 해를 입력받아 나이를 반환하는 method
 *6. 3개의 수를 입력 받아 가장 "작은 수"를 반환하는 method
 */
public class HomeWork0108 {

	public void name() {//고정일
		System.out.print("1. 자신의 이름을 출력하는 method : ");
		System.out.println("최수연");
	}

	public char lastName() {//고정값
		System.out.print("2. 자신의 이름 중에 성을 반환하는 method : ");
		return '최';
	}

	public void score(int i) {//가변일
		System.out.println("3. 점수를 입력받아 점수의 판정을 출력하는 method : ");
		if (i > -1 && i < 101) {
			if (i > -1 && i < 40) {
				System.out.println(i + "점은 과락입니다.");
			} else if (i > 39 && i < 60) {
				System.out.println(i + "점은 다른 과목을 참조하세요.");
			} else {
				System.out.println(i + "점은 합격입니다.");
			}
		} else {
			System.out.println("점수를 잘못입력하셨습니다.");
		}
	}

	public void string(char i) {//가변일
		System.out.println("4. 문자를 입력받아 해당 문자가 대문자, 소문자, 숫자인지를 판단하여 출력하는 method : ");
		if (i > 47 && i < 123) {
			if (i > 47 && i < 58) {
				System.out.println(i + "는 숫자입니다.");
			} else if (i > 64 && i < 91) {
				System.out.println(i + "는 대문자입니다.");
			} else if (i > 96 && i < 123) {
				System.out.println(i + "는 소문자입니다.");
			}
		} else {
			System.out.println("입력하신 문자는 대문자, 소문자, 숫자 가 아닙니다.");
		}
	}

	public int birth(int i) {//가변 값
		System.out.println("5. 태어난 해를 입력받아 나이를 반환하는 method : ");
		int age = (2024 - i);
		return (age);
	}

	public int number(int num, int num2, int num3) {
		int result = 0;
		System.out.println("6. 3개의 수를 입력 받아 가장 작은 수를 반환하는 method : ");
		// 입력받은 수 중에 중복값이 있을 때
		if (num == num2) {
			if (num < num3) {
				result = num;
				return (result);
			} else {
				result = num3;
				return (result);
			}
		} else if (num == num3 && num2 == num3) {
			if (num < num2) {
				result = num;
				return (result);
			} else {
				result = num2;
				return (result);
			}
			// 입력받은 값 중 중복되는 값이 없을 때
		} else if (num < num2 && num < num3) {
			result = num;
			return (result);
		} else if (num2 < num && num3 < num) {
			if (num2 < num3) {
				result = num2;
				return (result);
			} else {
				result = num3;
				return (result);
			}
		}
		return result;
	}// end number

	public static void main(String[] args) {

		HomeWork0108 work = new HomeWork0108();

		// 1. 자신의 이름을 출력
		work.name();

		// 2. 자신의 이름 중에 "성"을 반환
		
		char myName = work.lastName(); 
		System.out.println(myName);
//		System.out.println(work.lastName()); 이것도 가능
				

		// 3. 점수를 입력받아 점수의 판정을 출력하는 method
		work.score(1);

		// 4. 문자를 입력받아 해당 문자가 "대문자", "소문자", "숫자"인지를 판단하여 출력
		work.string('G');

		// 5. 태어난 해를 입력받아 나이를 반환하는 method
		int born = work.birth(2000);
		System.out.println(born + "살 입니다.");

		// 6. 3개의 수를 입력 받아 가장 "작은 수"를 반환하는 method
		int smallest = work.number(0, 0, 0);
		System.out.println("가장 작은 수 : " + smallest);
		
		
	}

}
