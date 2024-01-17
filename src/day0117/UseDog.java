package day0117;

/**
 *1. 강아지클래스의 공통 특징을 추상클래스로 만들고, 강아지의 일 중 하나를 추상 method로 만들어서 정의.
 * 2. 1번클래스를 상속받는 치와와 클래스와 말라뮤트 클래스를 만들기
 * 3. 객체를 생성하고 사용.
 * 4. 클래스 다이어그램 그리기
 */
public class UseDog {
	private void useDog() {

		Dog mal = new Malamute();
		mal.setType("말라뮤트");
		mal.setSize("대형견");
		mal.setWalk(120);
		System.out.printf("품종은 %s이고, 크키는 %s이고, 권장 산책시간은 %d분이다.\n", mal.getType(), mal.getSize(), mal.getWalk());
		System.out.println(mal.snack("오리목뼈", 2));
		System.out.println(mal.walkDay("눈썰매 끌기"));
		System.out.println("");

		Dog chi = new Chiwawa();
		chi.setType("치와와");
		chi.setSize("소형견");
		chi.setWalk(60);
		System.out.printf("품종은 %s이고, 크키는 %s이고, 권장 산책시간은 %d분이다.\n", chi.getType(), chi.getSize(), chi.getWalk());
		System.out.println(chi.snack("습식간식", 1));
		System.out.println(chi.walkDay("주인 품에 안겨있기"));

	}// useDog

	public static void main(String[] args) {

		UseDog doggi = new UseDog();
		doggi.useDog();
	}//main

}//class
