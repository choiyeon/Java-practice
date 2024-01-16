package day0116;

/**
 * 사용자 정의 자료형 - 순수하게 값만 저장하기 위해서 만든다.<br>
 * (분할된 여러 값들을 묶어서 저장할 수 있다.)<br>
 * 학생은 학번, 이름, 나이, 몸무게, 키, 이메일의 정보가 저장되어야 한다.
 */
public class StudentInfoVo {
	private int num;
	private String name;
	private double height;
	private double weight;
	private String email;

	/**
	 * 기본 생성자 - 인스턴스 변수에 default value값이 할당되어 객체가 생성된다.<br>
	 * 인스턴스 변수에 값 변경은 setter method를 사용하여 변경한다.
	 */
	public StudentInfoVo() {
	}// StudentInfo

	/**
	 * Overload된 생성자. 객체를 생성할 때 default value가 아닌 사용자가 원하는 값으로<br>
	 * 설정한 후 객체를 생성하는 생성자<br>
	 * 인스턴스 변수에 값 변경은 setter method를 사용하여 변경한다.
	 * 
	 * @param num    학번
	 * @param name   이름
	 * @param height 키
	 * @param weight 몸무게
	 * @param email  이메일
	 */
	public StudentInfoVo(int num, String name, double height, double weight, String email) {
		this.num = num;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.email = email;
	}// StudentInfo()

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}// class

//가나디
//	   / \
//	  / /\\__
//	  (      @\___
//	   /          0
//	  /   (_____/
//	 /_____/   U

// 고냥이
// /\_/\ 
//( o.o )
// > ^ <

// 햄
//(\__/)
//(='.'=)
//(")__(")




