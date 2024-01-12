package day0112;

public class IdHomeWork {
private String idNum;//instance 변수 생성
	
	//생성자
	public IdHomeWork(String idNum) {
		setIdNum(idNum);
	}
	
	/**
	 * 주민번호 설정
	 * @param idNum
	 */
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}//setIdNum

	/**
	 * 주민번호 반환
	 * @return
	 */
	public String getIdNum() {
		return idNum;
	}//getIdNum
	
	
	/**
	 * 주민번호 글자수가 14자리인지 체크
	 * @return
	 */
	public Boolean checkIdNum() {
		if (this.idNum.length() == 14) {
			return true;
		}
		return false;
	}
	
	/**
	 * 주민번호 7번째 자리가 -인지 체크
	 * @return
	 */
	public Boolean checkHyphen() {
		if (this.idNum.charAt(6) == '-') {
			return true;
		}
		return false;
	}
	
	/**
	 * 주민번호로 생년월일 연산
	 * 판단 기준
	 * –뒤의 문자가 1,2,5,6이 라면 1900년 대생, 
	 * 3,4,7,8 이라면 2000년 대생,
	 * 9,0이라면 1800년 대생
	 * @return
	 */
	public String idbirth() {
		if (this.idNum)
	}
}
