package day0116;

/**
 * 사람의 공통 특징은 부모클래스인 person에 정의되어있고, <br>
 * 자식 클래스인 HongGilDong은 자신의 특별한 기능만 정의<br>
 * 싸움레벨은 1~10까지 존재
 */
public class HongGilDong extends Person{

	private int level;
	/**
	 * 홍길동의 기본 생성자, 눈2개, 코1개, 입1개인 사람이 태어남<br>
	 * 홍길동은 싸움을 평민보다 잘한다.
	 */
	public HongGilDong() {
		//super();
		level = 6;
	}
	
	/**
	 * 싸움하는일
	 * @param yourlevel 상대의 레벨
	 * @return 싸움의 결과
	 */
	public String fight (int yourlevel) {
		String result = "";
		if (level < yourlevel) {//싸움에서 지는 경우
			result = "OTL 싸움에서 졌음";
			level--;
			if(level < 1) {
				level = 1;
			}//end if
					
		}else if(level> yourlevel) {//싸움에서 이기는 경우
			result = "이김Vv";
			level++;
			if(level > 10) {
				level = 10;
			}//end if
		}else {//비기는 경우
			result = "비김T-T";
		}//end else
		return result;
	}//fight

	public int getLevel() {
		return level;
	}
}//class
