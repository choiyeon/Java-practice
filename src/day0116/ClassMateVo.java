package day0116;
//클래스를 하나 더 만들어 아래의 데이터를 저장할 수 있는 객체를 만들고 값을 입력
public class ClassMateVo {
	private String name;
	private String address;
	private int age;

	public ClassMateVo() {
	}//ClassMate
	
	/**
	 * class mate들의 정보
	 * @param name 이름
	 * @param address 주소
	 * @param age 나이
	 */
	public ClassMateVo(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}//ClassMate()

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}//class
