package day0115;

public class SocialSecurityNumber {
	private String ssn;

	/**
	 * 주민등록번호를 입력받아 instance 변수에 저장하는 생성자.
	 * 
	 * @param ssn 주민등록번호
	 */
	public SocialSecurityNumber(String ssn) {
		this.ssn = ssn;
	}// SocialSecurityNumber

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}// setSsn

	public String getSsn() {
		return ssn;
	}// getSsn

	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민들록번호의 (member 변수, instance 변수) 자릿수가 14자리인지 체크
	 * 
	 * @return 14자리인지의 결과
	 */
	public boolean checkDigit() {
		return ssn.length() == 14;
	}// checkDigit

	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민들록번호의 -의 위치를 체크.
	 * 
	 * @return-가 정상적인 위치에 존재.
	 */
	public boolean checkDash() {
		return ssn.indexOf("-") == 6;
	}// checkDash

	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민등록번호를 사용하여 생년월일을 구하여 xxxx년 xx월 xx일의 문자열로 반환
	 * 
	 * @return 생년월일
	 */
	public String birthDays() {
		String birthday = ssn.substring(0, 6);
		String year = "";
		String yearBirth = "";
		String result = "";

		int genderFlag = ssn.charAt(7) - '0';

		if (genderFlag == '1' || genderFlag == '2' || genderFlag == '5' || genderFlag == '6') {
			year = "19";
			// 19940728/ \\d{4}년\\d{2}월\\d{2}일 //$1년$2월$일
		} else if (genderFlag == '3' || genderFlag == '4' || genderFlag == '7' || genderFlag == '8') {
			year = "20";
		} else {
			year = "18";
		}
		yearBirth = year.concat(birthday);
		result = yearBirth.replaceAll("(\\d{4})(\\d{2})(\\d{2})", "$1년$2월$3일");
		return result;
	}// birthDays

	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민등록번호를 사용하여 나이를 연산하는 일
	 * 
	 * @return 연산된 나이
	 */
	public int age() {
		String birthday = ssn.substring(0, 2);

		int genderFlag = Integer.parseInt(ssn.substring(7, 8));
		String year = "18";
		String yearBirth = "";
		int numBirth = 0;

		if (genderFlag == '1' || genderFlag == '2' || genderFlag == '5' || genderFlag == '6') {
			year = "19";
			// 19940728/ \\d{4}년\\d{2}월//d{2}일 //$1년$2월$일
		} else if (genderFlag == '3' || genderFlag == '4' || genderFlag == '7' || genderFlag == '8') {
			year = "20";
		} // else를 사용하지 않는 이유는, 변수선언시 초기값이 들어가 있기 때문.
		yearBirth = year.concat(birthday);
		numBirth = Integer.parseInt(yearBirth);
		return 2024 - numBirth + 1;
	}// age

	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민등록번호를 사용하여 성별을 연산
	 * @return 성별(남자, 여자)
	 */
	public String gender() {
//		String gender = "여자";
//		if (genderFlag == '1' || genderFlag == '3' || genderFlag == '5' || genderFlag == '7'
//				|| genderFlag == '9') {
//			gender = "남자";
//		}
//		return gender;
		
		int genderFlag = ssn.charAt(7)-'0';
		String[]genderText = {"여자", "남자"};
		return genderText[genderFlag%2];
	}// gender
//  7. 입력된 주민번호에서 띠를 구하여 문자열로 반환하는 method를 작성하세요.

	/**
	 * 생성자를 통해 객체가 저장하고 있는 주민등록번호를 사용하여 띠를 연산하는 일
	 * @return 연산된 띠를 반환
	 */
	public String zodiac() {
		String birthday = ssn.substring(0, 2);
		int genderFlag = Integer.parseInt(ssn.substring(7, 8));
		
		String[] tempYear = {"18", "19", "19", "20", "20", "19", "19", "20", "20", "18"};
		String yearBirth = tempYear[genderFlag].concat(birthday);
		String[] zodiacTitle = {"쥐띠", "소띠", "호랑이띠", "토끼띠", "용띠", "뱀띠", "말띠", "양띠", "원숭이띠", "닭띠", "개띠", "돼지띠"};
		
		return zodiacTitle[Integer.parseInt(yearBirth)%12];
		
	}// zodiac

}// end class
