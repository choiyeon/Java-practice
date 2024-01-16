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

	public static void main(String[] args) {

		ClassMateVo[] cmVOArr = new ClassMateVo[7];
		cmVOArr[0] = new ClassMateVo("고한별", "서울시 강남구 역삼동", 25);
		cmVOArr[1] = new ClassMateVo("김동수", "경기도 수원시 영통구 영통통", 20);
		cmVOArr[2] = new ClassMateVo("김동섭", "서울시 강남구 서초동", 28);
		cmVOArr[3] = new ClassMateVo("정명호", "마계서울시 부평구 부평동", 26);
		cmVOArr[4] = new ClassMateVo("양수민", "경기도 부천시 부천동",25);
		cmVOArr[5] = new ClassMateVo("진수현", "서울시 동대문구 동대문동", 27);
		cmVOArr[6] = new ClassMateVo("수연", "서울시 구로구 구로동", 26);
		
		ClassMateVo cmVo = null;
		for (int i = 0; i < cmVOArr.length; i++) {
			cmVo = cmVOArr[i];
			System.out.printf("이름 : %s\t주소 : %s\t나이 : %d\n", 
					cmVo.getName(), cmVo.getAddress(), cmVo.getAge());
//			if (cmVOArr[i][1]) {
//				
//			}
		}//end for
		
	}//main

}//class
