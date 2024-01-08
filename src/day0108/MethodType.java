package day0108;

/**
 *method의 형태 :  
 */
public class MethodType {

	//고정 일 : 반환 형 없고(void), 매개변수 없는 형
	public void typeA(){//instance method(static없음)
		System.out.println("고정 일");
	}
	
	public void typeB(int i){
		System.out.println("가변 일 : " + i);
	}
	
	//고정 값 : 반환형 있고, 매개변수 없는 형
	//반드시 method의 가장 마지막줄에 return이 나와야한다.
	public int typeC() {
		int i = 2024;
		return i;
	}
	
	//가변 값 : 반환형 있고, 매개 변수 있는 형
	public int typeD(double d) {
		return (int)d;
	}
	public static void main(String[] args) {

		//객체화 : 인스턴스 변수나 인스턴스 method를 사용하기 위해서
		//클래스명 객체명=new 클래스명();
		MethodType first=new MethodType();
		
		//고정 일 method 호출 => 여러번 호출해도 같은 일 한다.
		first.typeA();
		
		//가변 일 method 호출 => 외부 값(arguments)에 대해 다른 일을 수행
		first.typeB(5);
		
		//고정 값 : 반환형에 일치하는 데이터 형으로 변수를 만들고, 반환 값을 저장하여 사용한다.
		int i = first.typeC();
		System.out.println("고정 값 : " + i);
		
		//가변 값 :  반환 형에 일치하는 데이터형으로 변수를 만들고,반환 값을 저장하여 사용한다.
		i = first.typeD(1.08);
		System.out.println("가변 값 : " + i);
		i = first.typeD(5.8);
		System.out.println("가변 값 : " + i);
	}

}
