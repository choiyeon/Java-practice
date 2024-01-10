package day0110;

public class UseDog {
	private void useDog() {
		Dog puppy = new Dog("치와와", "소형견");
		
		System.out.printf("종류는 %s이고, 크키는 %s이다.\n", puppy.getType(), puppy.getSize());
	}// useDog

	public static void main(String[] args) {

		UseDog doggie = new UseDog();
		doggie.useDog();
	}

}
