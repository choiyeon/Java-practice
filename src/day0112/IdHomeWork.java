package day0112;

public class IdHomeWork {
	private String idNum;// instance 변수 생성
	private int birthYear;// 생년 instance 변수
	private int sevenIndex;// '-'뒤 7번째 인덱스

	// 생성자
	public IdHomeWork(String idNum) {
		setIdNum(idNum);
	}

	/**
	 * 주민번호 설정
	 * 
	 * @param idNum
	 */
	public void setIdNum(String idNum) {
		// 매개변수(idNum)와 method내 변수(idNum)이름이 같을 때 this 사용.
		// 이름이 같으니 구분하기 위함.
		// BUT 이름이 다른경우 안써도 되지만, 쓰면 알기 쉽다.
		this.idNum = idNum;
	}// setIdNum

	/**
	 * 주민번호 반환
	 * 
	 * @return 주민번호
	 */
	public String getIdNum() {
		return idNum;
	}// getIdNum

	/**
	 * 2. 주민번호 글자수가 14자리인지 체크
	 * 
	 * @return 14자인지 체크
	 */
	public Boolean checkIdNum() {
		return this.idNum.length() == 14;
	}//checkIdNum

	/**
	 * 3. 주민번호 7번째 자리가 -인지 체크
	 * 
	 * @return - 체크
	 */
	public Boolean checkHyphen() {
		return this.idNum.charAt(6) == '-';
	}//checkHyphen

	/**
	 * 4. 주민번호로 생년월일 연산 판단 기준 –뒤의 문자가 1,2,5,6이 라면 1900년 대생, 3,4,7,8 이라면 2000년 대생,
	 * 9,0이라면 1800년 대생
	 * 
	 * @return 생년월일
	 */
	public String idBirth() {
		this.sevenIndex = Integer.parseInt(this.idNum.substring(7, 8));
		String year = this.idNum.substring(0, 2);
		String month = this.idNum.substring(2, 4);
		String day = this.idNum.substring(4, 6);

		if (this.sevenIndex == 1 || this.sevenIndex == 2 || this.sevenIndex == 5 || this.sevenIndex == 6) {
			// 1900년대생
			birthYear = 1900 + Integer.parseInt(year);
			return "19" + year + "년 " + month + "월 " + day + "일";
		} else if (this.sevenIndex == 3 || this.sevenIndex == 4 || this.sevenIndex == 7 || this.sevenIndex == 8) {
			// 2000년대생
			this.birthYear = 2000 + Integer.parseInt(year);
			return "20" + year + "년 " + month + "월 " + day + "일";
		} else if (this.sevenIndex == 9 || this.sevenIndex == 0) {
			// 1800년대생
			this.birthYear = 1800 + Integer.parseInt(year);
			return "18" + year + "년 " + month + "월 " + day + "일";
		}
		return "idBirth() 문제발생";
	}

	/**
	 * 5.입력된 주민번호에서 나이를 구해서 정수로 반환
	 * 
	 * @return 나이
	 */
	public String idAge() {
		return (2024 - this.birthYear) + "살";
	}

	/**
	 * 6.입력된 주민번호에서 성별을 구해 문자열로 반환 판단기준) 뒤의 문자가 1,3,5,7,9 – 남자, 2,4,6,8,0 – 여자
	 * 
	 * @return 성별
	 */
	public String idSex() {
		if (this.sevenIndex == 1 || this.sevenIndex == 3 || this.sevenIndex == 5 || this.sevenIndex == 7
				|| this.sevenIndex == 9) {
			return "남자";
		} else if (this.sevenIndex == 2 || this.sevenIndex == 4 || this.sevenIndex == 6 || this.sevenIndex == 8
				|| this.sevenIndex == 0) {
			return "여자";
		}
		return "idAge() 문제발생";
	}

	/**
	 * 7. 입력된 주민번호에서 띠를 구하여 문자열로 반환
	 * 
	 * @return 띠
	 */
	public String idZodiac() {
		int zodiacIndex = Math.abs((this.birthYear - 1924) % 12);
		String[] zodiacArr = { "쥐띠", "소띠", "호랑이띠", "토끼띠", "용띠", "뱀띠", "말띠", "양띠", "원숭이띠", "닭띠", "개띠", "돼지띠" };
		return zodiacArr[zodiacIndex];
	}

}