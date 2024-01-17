package day0116;
//고한별, 서울시 강남구 역삼동, 25

//김동수, 경기도 수원시 영통구 영통통, 20
//김동섭, 서울시 강남구 서초동, 28
//정명호, 마계서울시 부평구 부평동, 26
//양수민, 경기도 부천시 부천동,25
//진수현, 서울시 동대문구 동대문동, 27
//수연,    서울시 구로구 구로동,26

//2. 값을 출력 : 이름, 주소, 나이
//3. 이름에 "수"가 들어가는 사람의 수를 출력 : 4명
//4. 서울시에 살고 있는 사람을 출력 : 4명
//5. 나이의 합산을 출력 : 
public class UseClassMateVO {
	
	public void classMatePrint() {

		ClassMateVo[] cmVOArr = initializeClassMates();
		
		printClassMate(cmVOArr);

		int count = SuInName(cmVOArr);
		System.out.println("이름에 \"수\"가 들어가는 사람의 수 : " + count);

		count = SeoulInAdd(cmVOArr);
		System.out.println("서울시에 살고 있는 사람의 수 : " + count);

		int totalAge = totalAge(cmVOArr);
		System.out.println("나이의 총합 : " + totalAge);
	}// classMatePrint

	/**
	 * classmate 정보입력
	 * @return
	 */
	private ClassMateVo[] initializeClassMates() {
		return new ClassMateVo[] { new ClassMateVo("고한별", "서울시 강남구 역삼동", 25),
				new ClassMateVo("김동수", "경기도 수원시 영통구 영통통", 20), new ClassMateVo("김동섭", "서울시 강남구 서초동", 28),
				new ClassMateVo("정명호", "마계서울시 부평구 부평동", 26), new ClassMateVo("양수민", "경기도 부천시 부천동", 25),
				new ClassMateVo("진수현", "서울시 동대문구 동대문동", 27), new ClassMateVo("수연", "서울시 구로구 구로동", 26) };
	}// initializeClassMates

	/**
	 * classmate 이름 주소 나이 출력
	 * @param cmVOArr
	 */
	private void printClassMate(ClassMateVo[] cmVOArr) {
		for (ClassMateVo cmVo : cmVOArr) {
			System.out.printf("이름 : %s\t주소 : %s\t나이 : %d\n", cmVo.getName(), cmVo.getAddress(), cmVo.getAge());
		} // end for
	}// printClassMate

	/**
	 * 이름에 "수"가 들어가는 사람의 수를 출력
	 * @return 이름에 "수"가 있는 사람 수
	 */
	private int SuInName(ClassMateVo[] cmVOArr) {
		int count = 0;
		for (ClassMateVo cmVo : cmVOArr) {
			if (cmVo.getName().contains("수")) {
				count++;
			} // end if
		} // end for
		return count;
	}// SuInName

	/**
	 * 서울시에 살고 있는 사람을 출력
	 * @return 서울시에 사는 사람 수
	 */
	private int SeoulInAdd(ClassMateVo[] cmVOArr) {
		int count = 0;
		for (ClassMateVo cmVo : cmVOArr) {
			if (cmVo.getAddress().startsWith("서울시")) {
				count++;
			} // end if
		} // end for
		return count;
	}// SeoulInAdd

	/**
	 * 나이의 합산을 출력
	 * @return 나이 총합
	 */
	private int totalAge(ClassMateVo[] cmVOArr) {
		int total = 0;
		for (ClassMateVo cmVo : cmVOArr) {
			total += cmVo.getAge();
		} // end for
		return total;
	}// totalAge

	public static void main(String[] args) {
		UseClassMateVO ucmVO = new UseClassMateVO();
		ucmVO.classMatePrint();
	}// main

}// class
