package day0109;

/**
 * 아래의 대상을 추상화하여 클래스를 생성하고, 객체화하여 사용해보세요. -명사적 : 이름, 포장지 색 -동사적 : 맵기
 */

public class HomeWork0109 {
	public static void main(String[] args) {

		Ramyeon noodle = new Ramyeon(3400, "신라면", 4.5);

		System.out.printf("맴기지수 : %d스코빌, 라면 이름 : \"%s\", %s 라면의 적정 조리시간 : %.1f 분 \n", noodle.getSpicy(), noodle.getName(), noodle.getName(), noodle.getTime());
																								

	}
}
