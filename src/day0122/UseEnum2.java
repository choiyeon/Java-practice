package day0122;

public class UseEnum2 {

	public static void main(String[] args) {
		// 생성자를 가진 enum은 요소에 할당된 method를 통해 이름과 값을 얻을 수 있다.
		Week week = Week.MONDAY;
		System.out.println(week.getName());
		System.out.println(week.getValue());
		System.out.println(week.ordinal());

		System.out.println("-----------------------------------");
		for (Week w : week.values()) {
			System.out.println(w.getName() + " / " + w.getValue() + " / " + w.ordinal());
		} // end for

		System.out.println("-----------------------------------");
		// switch case 사용
		Week key = Week.MONDAY;
		switch (key) {
		case MONDAY:
			System.out.println(key.getName());
			break;
		case TUESDAY:
			System.out.println(key.getName());
			break;
		case WENSDAY:
			System.out.println(key.getName());
			break;

		default:System.out.println("error");
			break;
		}//end switch
		
		System.out.println("-----------------------------------");
		//if의 비교 == 으로 비교
		key = Week.WENSDAY;
		if (key == Week.MONDAY) {
			System.out.println("월");
		} else if(key == week.TUESDAY){
			System.out.println("화");
		}else {
			System.out.println("????");
		}
	}// main

}// class
