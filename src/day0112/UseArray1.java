package day0112;

/**
 * 일차원 배열 : 열로만 구성된 배열 선언) 데이터형[] 배열명 = null;
 *
 * 생성) 배열명 = new 데이터형[방의 수] 데이터형[] 배열명 = new 데이터형[방의 수]
 *
 * 값 할당) - 존재하지 않는 배열 인덱스를 사용하면 error 발생 배열명[방의 번호] = 값;
 *
 * 값 사용) 배열명[방의 번호]
 *
 * 일괄처리 -방의 수 : 배열명.length for(int i = 0; i < 배열명.length; i++){ 배열명[i] }
 *
 */
public class UseArray1 {

	public UseArray1() {
		// 1. 선언
		int[] arr = null;// default 값 null
		// 2.생성 - heap에 생성되고, 모든 방의 값은 0으로 초기화된다.
		arr = new int[5];
		// 3. 값할당
		arr[0] = 2024;
		arr[1] = 1;
		arr[2] = 12;
		arr[3] = 14;
		arr[4] = 44;
//		arr[5] = 1; //error : Index 5 out of bounds for length 5
		System.out.println(arr + ", " + "방의 수 : " + arr.length + "개");
		System.out.println("처음 방 " + arr[0] + " 두번째방 " + arr[1]);
		// 4. 값 얻기
		System.out.println(arr[0] + "~" + arr[4]);
		// 5. 일괄처리(한꺼번에 처리)
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
			sum += arr[i];
		}
		System.out.println(sum);
	}// UseArray1

	public void scoreProcess() {
		System.out.println("---------------------------------------------");
		String[] nameArr = {"루피", "샹크스", "나미", "조로", "쵸파"};
		String[] addrArr = {"서울시 강남구 역삼도", "서울시 동대문구 동대문동", "인천시 미추홀구", "서울특별시 구로구", "수원시 영통구 영통동"};
		int[] scoreArr = {94, 95, 75, 83, 100};//new int[]를 생략
//		int[] scoreArr = new int[]{94, 95, 75, 83, 100};//new int[]를 명시, [5] 방을 명시하면 error
		int top = scoreArr[0];
		int flow = scoreArr[0];
		
		int sum = 0;
		int cnt = 0;
		int num = 0;
		System.out.printf("번호\t이름\t점수\t거주시\n");
		for (int i = scoreArr.length - 1; i > -1; i--) {
			if(addrArr[i].startsWith("서울시")) {
				System.out.printf("%d\t%s\t%d\t%s\n", i+1, nameArr[i], scoreArr[i], addrArr[i]);
				sum += scoreArr[i];	
				cnt++;
			}
		}//end for
		System.out.println("---------------------------------------------");
		System.out.printf("총점 [%d]점 평균[%.2f]점\n", sum, (double)sum/cnt);
		System.out.println("---------------------------------------------");

		//scoreArr의 마지막번째 방부터 출력
		
		//Flowchart를 코드로 옮겨보세요.
		for (int i = 0; i < scoreArr.length; i++) {
			if (top < scoreArr[i]) {
				top = scoreArr[i];
			}
		}
		System.out.println("top : " + top);
		
		for (int i = 0; i < scoreArr.length; i++) {
			if (flow > scoreArr[i]) {
				flow = scoreArr[i];
			}
		}
		System.out.println("flow : " + flow);
		System.out.println("---------------------------------------------");
		
		//Flowchart를 코드로 옮겨보세요.
		int temp = 0;
		for (int i = 0; i < scoreArr.length - 1; i++) {
			for (int j = i+1; j < scoreArr.length; j++) {
				if (scoreArr[i] < scoreArr[j]) {
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				}
			}
		}
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println(scoreArr[i]);
		}
		
	}// scoreProcess

	public static void main(String[] args) {

		new UseArray1().scoreProcess();
	}// main

}// class
