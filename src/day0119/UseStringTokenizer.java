package day0119;

import java.util.StringTokenizer;

/**
 *문자열을 짧은 한 마디로 분리하는 클래스 
 */
public class UseStringTokenizer {
	public UseStringTokenizer() {
		String data = "월요일 화요일 수요일 목요일 금요일 퇼";
		
		//데이터를 자르기위해 StringTokenizer에 할당
		StringTokenizer stk = new StringTokenizer(data);//공백으로 자른다.

		while(stk.hasMoreElements()){//토큰이 존재하는지 모르지만 존재한다면, 현재 토큰을 얻고 포인터를 다음으로 옮긴다.
			System.out.println(stk.nextToken());
		}//end while
		
		System.out.println("------------------------------------------");
//		stk = new StringTokenizer(data);
		//토큰은 다 추출하면 다음 번에 사용할 수 없다.
		while(stk.hasMoreElements()){
			System.out.println(stk.nextToken());
		}
		System.out.println("토큰의 수 : " + stk.countTokens());
		
		//특정 문자열로 구분하는 생성자
		String data2 = "Java,Oracle~JDBC,HTML.CSS.JavaScript,JavaScript Library";
		StringTokenizer stk2 = new StringTokenizer(data2, ",~. ",false);

		while(stk2.hasMoreElements()) {//현재 포인터 위치에서 토큰이 존재하는가?
			System.out.println(stk2.nextToken());
		}//while
	}//UseStringTokenizer
	
///////////////////////////////////////////////////////////////////////////////////////////////	
	
	public TokenDataVO csvData() {
		TokenDataVO tdVO = null;
		
		String data = "오늘은,불금.입니다.주말엔 역시 자바공부죠! 그쵸? 아님말고?";
		//위의 문자열을 , 공백, . ! 로 구분하여 배열과 총 토큰 수를 반환
		
		StringTokenizer stk = new StringTokenizer(data, ",!. ");
		
		int tokenCnt = stk.countTokens();
		String[] temp = new String[tokenCnt];
		
		int i = 0;
		while(stk.hasMoreTokens()) {
			temp[i] = stk.nextToken();
			i++;
		}//end while
		
		tdVO = new TokenDataVO(temp, tokenCnt);
		
		return tdVO;
	}//csvData
	
	public void useCsvDate() {
		//csvData method를 호출하여 배열에 담긴 값과 토큰 수를 출력.
		TokenDataVO tdVo = csvData();
		String[] temp = tdVo.getData();
		int cnt = tdVo.getCountToken();
		System.out.println("얻어낸 토큰 수" + cnt);
		
		for(String value : temp) {
			System.out.println(value);
		}
	}
	

	public static void main(String[] args) {
		UseStringTokenizer ust = new UseStringTokenizer();
		ust.useCsvDate();
	}//main

}//class
