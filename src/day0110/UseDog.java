package day0110;

public class UseDog {
	private void useDog() {

		Dog dog = new Dog();
		System.out.printf("품종은 %s이고, 크키는 %s이고, 권장 산책시간은 %d분이다.\n", dog.getType(), dog.getSize(), dog.getWalk());
		System.out.println("");

		Dog chiwawa = new Dog("치와와", "소형견", 20);
		System.out.printf("품종은 %s이고, 크키는 %s이고, 권장 산책시간은 %d분이다.\n", chiwawa.getType(), chiwawa.getSize(), chiwawa.getWalk());
		System.out.println("");

		Dog siba = new Dog("시바견", "중형견", 60);
		System.out.printf("품종은 %s이고, 크키는 %s이고, 권장 산책시간은 %d분이다.\n", siba.getType(), siba.getSize(), siba.getWalk());
		System.out.println("");

		Dog husky = new Dog("허스키", "대형견", 120);
		System.out.printf("품종은 %s이고, 크키는 %s이고, 권장 산책시간은 %d분이다.\n", husky.getType(), husky.getSize(), husky.getWalk());
		System.out.println(chiwawa.personality("허스키", "눈을 좋아한다.", "대형견", 120));// String 품종, String 성격, String 크기, int 권장 산책시간(분)

	}// useDog

	public static void main(String[] args) {

		UseDog doggie = new UseDog();
		doggie.useDog();
	}

}
