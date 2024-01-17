package day0117;

public class Malamute extends Dog {

	@Override
	public String snack(String menu, int num) {
		return getType() + "은 간식 \"" + menu + "\"를 좋아한다. 권장 개수는 " + num + "개이다.";
	}

	@Override
	public String walkDay(String things) {
		return getType() + "은 " + things + "을/를 좋아한다. 권장 산책시간은 " + getWalk() + "분이다.";
	}

}//class
