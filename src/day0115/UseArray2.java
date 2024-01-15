package day0115;

/**
 *이차원 배열의 사용 <br>
 *-행과 열로 구성된 배열.<br>
 *-이차원 배열의 한 행은 일차원 배열로 이루어져 있다.<br>
 *
 */
public class UseArray2 {

	public UseArray2(){
		//이차원 배열의 사용.
		//1. 선언) 데이터형[][] 배열명=null;
		int[][] arr2=null;
		//2. 생성 배열명=new 데이터형[행의 수][열의 수];
		arr2 = new int[3][4]; //heap에 생성되며, 모든 방은 초기화 된다.
		System.out.println("행의 수 : " + arr2.length+"행");
		System.out.println("열의 수 : " + arr2[0].length+"열");
		
		//3. 값 설정) 배열명[행의번호][열의번호]=값;
		//행에는 값을 할당할 수 없다.(행에는 일차원 배열을 할당할 수 있다.)
		//arr2[0]=10;
		arr2[0][0]=2024;
		arr2[1][2]=1;
		arr2[2][3]=15;
		
		//4. 값 사용) 배열명[행번호][열번호]
		System.out.println("arr2[0][0]=" + arr2[0][0]);
		System.out.println("arr2[1][1]=" + arr2[1][1]);
		System.out.println();
		
		//5. 일괄처리
		
		
		for(int i = 0; i<arr2.length;i++) {//행
			for (int j = 0; j < arr2[i].length; j++) {//열
				System.out.printf("arr2[%d][%d]=%d\t", i, j, arr2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		//String으로 구구단 2~9단까지 저장할 수 있는 이차원 배열을 만들고 2~9단까지의 구구단을
		//저장하고 출력.
		
		String[][] multiplicationTable = new String[8][9];
		int num = 1;
		int num2 = 1;
		for (int i = 2; i < multiplicationTable.length; i++) {//행
			num++;
			for (int j = 1; j < multiplicationTable[i].length; j++) {//열
				multiplicationTable[i][j] = num + " X " + num2 + " = " + num*num2;
				System.out.printf("%s\t",multiplicationTable[i][j]);
				num2++;
			}//end for
			num2=1;
			System.out.println();
		}//end for
		
		System.out.println("-----------------------------------------------------------------");
		
	}//UseArray2
	
	public void useArray2() {
		//기본형 형식의 사용. new를 사용하지 않는다.
		int[][] arr2 = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
		
		System.out.printf("%d행 %d열\n", arr2.length, arr2[0].length);
		
		arr2[0][2] = 300;
		arr2[1][3] = 800;
		arr2[2][0] = 900;
		
//		//일괄처리
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.printf("%d\t", arr2[i][j]);
//			}//end for
//			System.out.println();
//		}//end for
		
		//향상된 for : 배열의 처음 방부터 끝방까지 출력!!!!
		//이차원 배열의 한 행은 일차원 배열로 이루어져있다.
		for (int[] arr : arr2) {
			//일차원 배열의 한 열은 단일형으로 이루어져 있다.
			for(int value : arr) {
				System.out.println(value + "\t");
			}//end for
			System.out.println();
		}//end for
		
		System.out.println("-------------------------------------");
		//이차원 배열의 한 행은 일차원 배열로 이루어져 있다.
		//=>행을 차원 배열에 할당할 수 있다. 
		int[] temp = arr2[0];
		for(int i :temp) {
			System.out.println(i);
		}
	}//useArray2
	
	
	public static void main(String[] args) {
		new UseArray2().useArray2();
	}//main

}//class
