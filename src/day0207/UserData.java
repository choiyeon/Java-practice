package day0207;

import java.io.Serializable;

/**
 * 직렬화 방지 키워드 : transient 
 */
public class UserData implements Serializable{

	/**
	 * 이 객체를 식별할 수 있는 ID
	 */
	private static final long serialVersionUID = -5854305321529184078L;
	//참조형 데이터형은 직렬화가되지 않음.Serializable과 transient을 같이 쓰면,
	//transient 우선
	private /*transient*/ String name;//참조형 데이터형은 직렬화가 되지 않음.
	private double height;//기본형 데이터 형은 직렬화가 지원된다.
	private transient double weight;//
	
	public UserData() {
		
	}//UserData
	
	public UserData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}//UserData
	
	@Override
	public String toString() {
		return "UserData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
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
	


}//class
