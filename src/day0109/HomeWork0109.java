package day0109;

/**
 * 아래의 대상을 추상화하여 클래스를 생성하고, 객체화하여 사용해보세요. -명사적 : 이름, 포장지 색 -동사적 : 맵기
 */

public class HomeWork0109 {
	public static void main(String[] args) {

		ramyeon noodle = new ramyeon();
		noodle.setSpicy(10);
		noodle.setName("신라면");
//	black.setColor("그레이");
		System.out.printf("맴기지수 %d스코빌, 라면 이름 %s 라면 \n", noodle.getSpicy(), noodle.getName());// , 포장지 색 %s 색
																								// black.getColor()

	}
}
