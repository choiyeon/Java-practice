package day0118;

/**
 * 1. 아래의 데이터로 배열을 만들고, 임의의 방하나의 값을 출력<br>
 * "어쩔, 저쩔, 뇌절, 안물, 안궁, 때리, 못때리, 개킹"<br>
 * 2. 8자리의 영문자, 숫자로 구성된 임의의 비밀번호를 생성하여 반환하는 일을 하는 method작성하고 출력<br>
 * 3. 로또번호(1~45의 수 중 하나를 뽑고, 6자리 세트)구하여 반환하는 method를 작성하고 사용.<br>
 * (중복값이 들어가면 안되고, 오름차순 정렬되어 출력)
 */
public class MathHomeWork {

	/**
	 * "어쩔, 저쩔, 뇌절, 안물, 안궁, 때리, 못때리, 개킹" 중에 하나 출력
	 */
	public MathHomeWork() {
		String[] noJam = "어쩔, 저쩔, 뇌절, 안물, 안궁, 때리, 못때리, 개킹".replaceAll(" ", "").split(",");//method chain 메소드 연결시키기
//		int i = (int) (Math.random() * noJam.length);
		System.out.println("1번 출력 : " + noJam[(int) (Math.random() * noJam.length)]);
	}// MathHomeWork

	/**
	 * 8자리의 영문자, 숫자로 구성된 임의의 비밀번호 반환
	 * 
	 * @return 8자리 비밀번호
	 */
	public static final int UPPER_CASE = 0; // 가독성을 위해 고정 변수만들기
	public static final int LOWER_CASE = 1;
	public static final int DECIAML = 3;
	public String printPassWord() {
		// 대문자(65-90)26자 소문자(97-122)26자 숫자(48-57)10자
		char[] secret = new char[8];
		int num = 0;
		for (int i = 0; i < secret.length; i++) {
			
			//배열이 완성될 때까지 계속 돈다.
//			num = (int) (Math.random() * 122) + 1;//1~122
//			if((num > 47 && num < 58) || (num > 64 && num < 91) || (num > 96 && num < 123)) {
//				secret[i] = (char)num;
//			}else {
//				i--;
//			}//else
			
			switch ((int) (Math.random() * 3)) {
			case DECIAML:
				secret[i] = (char) ((Math.random() * 10) + 48);// 숫자
				break;
			case UPPER_CASE:
				secret[i] = (char) ((Math.random() * 26) + 65);// 대문자영어
				break;
			case LOWER_CASE:
				secret[i] = (char) ((Math.random() * 26) + 97);// 소문자영어
//				break;
			}// switch

		} // for
		
//		//이렇게도 만들 수 있음 charAt() & random() & length()
//		String passWordSet = "0123456789tyugiojmcdvtyfubgihomjpCVBNDRFGYHULKHGFDS!@#$%^&*((*&^";
//		for(int i = 0; i < secret.length; i++) {
//			secret[i] = passWordSet.charAt((int)(Math.random()*passWordSet.length()));
//		}//end for
		
		
		String passWord = new String(secret);
		return "2번 비밀번호 : " + passWord;
	}// printPassWord

	/**
	 * 3. 로또번호(1~45의 수 중 하나를 뽑고, 6자리 세트)구하여 반환하는 method를 작성하고 사용.<br>
	 * (중복값이 들어가면 안되고, 오름차순 정렬되어 출력)
	 * 
	 * @return
	 */
	public String printLotto() {
		int[] lottoList = new int[6];
//		int next = 0;
//		int num = 0;
//		boolean duplicationFlag = false;
//
//		do {
//			num = (int) (Math.random() * 45) + 1;
//			duplicationFlag = false;
//			
//			// 중복 체크
//			for (int j = 0; j < lottoList.length; j++) {
//				if (lottoList[j] == num) {
//					duplicationFlag = true;
//					break;
//				} // if
//			} // for
//
//			// 중복이 없으면 추가
//			if (!duplicationFlag) {
//				lottoList[next] = num;
//				next++;
//			} // if
//		} while (next < lottoList.length);
		
		//i-- 이건 생각못했네..
		for(int i = 0; i < lottoList.length; i++) {
			lottoList[i] = (int) (Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {//발생된 난수가 이전 방에 존재하는가? 중복체크용 반복
				if(lottoList[i] == lottoList[j]) {//현재방이 이전방과 같다면
					i--;//현재방의 값을 다시 설정하기 위해 외부for의 인덱스를 줄이고
					break;//안쪽for를 빠져나간다.
				}//if
			}//for
		}//for

		// 배열 정렬 : 오름차순 정렬
		int temp = 0;
		for (int i = 0; i < lottoList.length; i++) {
			for (int j = i + 1; j < lottoList.length; j++) {
				if (lottoList[i] > lottoList[j]) {
					temp = lottoList[i];
					lottoList[i] = lottoList[j];
					lottoList[j] = temp;
				} // if
			} // for j
		} // for i

		// 배열 출력
		String lotto = "";
		for (int i = 0; i < lottoList.length; i++) {
			lotto += " " + lottoList[i];
		}
		return "3번 로또번호 :" + lotto;
	}// printLotto

	public static void main(String[] args) {
		MathHomeWork mhw = new MathHomeWork();
		System.out.println(mhw.printPassWord());
		System.out.println(mhw.printLotto());
		
	}// main

}// class
