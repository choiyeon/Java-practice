package day0116;

//자신이 가장 잘하는 일을 method로 정의한 후 객체생성하여 사용
public class Choi extends Person {
	
	private int jlpt;
	
	public Choi() {
		jlpt = 100;
	}//Choi
	
	/**
	 * jlpt 시험에 합격하는 일
	 * @param myScore
	 * @return
	 */
	public String jlpt(int myScore) {
		String result = "";
		if (jlpt < myScore) {//합격하는 경우
			result = "합격입니다.";
			
		}else if(jlpt > myScore) {//불합격하는 경우
			result = "불합격입니다.";
			if(myScore < 100) {
				result = "더 공부하자";
			}//end if
		}
		return result;
	}//jlpt

	public int getJlpt() {
		return jlpt;
	}//getScore

}//class
