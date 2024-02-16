package day0214;

/**
 * @FunctionalInterface annotation이 정의되면 인터페이스는 abstract method를 하나만 가져야 함.
 */
@FunctionalInterface
public interface Test {
	/**
	 * 반환형 없고, 매개변수 없는 형.
	 */
	public void temp();
//	public void temp2();//추상메서드 하나이상 선언하면 error
}
