package day0115;

import java.util.Iterator;

public class UseArray3 {

	/**
	 * 삼차원 배열 : 면,행,열로 구성된 배열<br>
	 * 면의 수 : 배열명.length<br>
	 * 행의 수 : 배열명[면의 번호].length<br>
	 * 열의 수 : 배열명[면의 번호][행의 번호].length<br>
	 */
	public UseArray3() {
//		1. 선언 ) 데이터형[][][] 배열명 = null;
		int[][][] arr3 = null;

		// 2. 생성 배열명=new 데이터형[면][행][열];
		arr3 = new int[2][2][3];

		// 3. 값 할당) 배열명[면][행][열]=값;
		arr3[0][1][1] = 2024;
		arr3[1][1][1] = 1;

		// 일괄처리
		for (int i = 0; i < arr3.length; i++) {// 면
			for (int j = 0; j < arr3[i].length; j++) {// 행
				for (int k = 0; k < arr3[i][j].length; k++) {// 열
					System.out.printf("arr[%d][%d][%d] = %d\t", i, j, k, arr3[i][j][k]);
				} // end for
				System.out.println();
			} // end for
			System.out.println();
		} // end for
		// 기본형 형식의 사용

	}// UseArray3

	public void useArray3() {
		// 기본형 형식의 사용.
		int[][][] arr3 = new int[][][] { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11, 12 } } };
		System.out.printf("%d면 %d행 %d열\n", arr3.length, arr3[0].length, arr3[0][0].length);
		
		//개선된 for
		//삼차원 배열의 한 면은 이차원 배열로 이루어져있다.
		for(int[][] arr2 : arr3) {
			//이차원 배열의 한 행은 일차원 배열로 이루어져있다.
			for(int[] arr1 : arr2) {
				//일차원 배열의 한 열은 단일형으로 이루어져있다.
				for(int value : arr1) {
					System.out.printf("%d\t", value);
				}//end for
				System.out.println();
			}//end for
			System.out.println();
		}//end for
	}// useArray3

	public static void main(String[] args) {
		new UseArray3().useArray3();
	}// main

}// class
