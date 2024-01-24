package day0124;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 키와 값의 쌍으로 이루어진 데이터 형
 */
public class UseMap {

	/**
	 * 기본생성자를 사용하여 생성하면 11개의 행이 생성되는 Hashtable.<br>
	 * 속도 느림
	 */
	public void useHashtable() {
		// 1. Map 생성
		Map<String, String> map = new Hashtable<String, String>();
		// 2. Map 값 설정) map.put(키, 값) - 순서대로 입력되지 않는다.
		map.put("A", "세심하다. 친절하다.");
		map.put("B", "성질드럽다.");
		map.put("AB", "싸이코");
		map.put("O", "우유부단");

		// 키가 중복되면 같은 키의 덮어쓴다.
		map.put("A", "소심하다");
		// 키가 다르면 중복 값 허용.
		map.put("a", "소심하다");

		// 맴에 키가 존재하는지 확인
		System.out.println(map.containsKey("a"));// true
		System.out.println(map.containsKey("c"));// false

		// 검색 : 키를 사용하여 값을 검색 map.get(key)
		String key = "A";
		if (map.containsKey(key)) {// 키가 없으면 null반환
			String value = map.get(key);
			System.out.println(key + "의 특징 : " + value);
		} else {
			System.out.println(key + "에 대한 값은 없음.");
		} // end else

		// 값 삭제
		map.remove("a");
		map.clear();

		System.out.println(map.isEmpty());

		System.out.println(map);
	}// useHashTable

	/**
	 * 기본생성자를 사용하여 생성하면 16개의 행이 생성되는 HashMap.<br> 속도 빠름
	 */
	public void useHashMap() {
		// 1. Map 생성
		Map<String, String> map = new HashMap<String, String>();
		// 2. Map 값 설정) map.put(키, 값) - 순서대로 입력되지 않는다.
		map.put("A", "세심하다. 친절하다.");
		map.put("B", "성질드럽다.");
		map.put("AB", "싸이코");
		map.put("O", "우유부단");

		// 키가 중복되면 같은 키의 덮어쓴다.
		map.put("A", "소심하다");
		// 키가 다르면 중복 값 허용.
		map.put("a", "소심하다");

		// 맴에 키가 존재하는지 확인
		System.out.println(map.containsKey("a"));// true
		System.out.println(map.containsKey("c"));// false

		// 검색 : 키를 사용하여 값을 검색 map.get(key)
		String key = "A";
		if (map.containsKey(key)) {// 키가 없으면 null반환
			String value = map.get(key);
			System.out.println(key + "의 특징 : " + value);
		} else {
			System.out.println(key + "에 대한 값은 없음.");
		} // end else

		// 값 삭제
		map.remove("a");
		map.clear();

		System.out.println(map.isEmpty());

		System.out.println(map);
	}// useHashMap

	public static void main(String[] args) {
		UseMap um = new UseMap();
		System.out.println("--------------Hashtable------------");
		um.useHashtable();
		System.out.println("--------------HashMap------------");
		um.useHashMap();
	}// main

}// class
