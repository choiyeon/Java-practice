package day0115;

/**
 * 학생들의 점수를 처리하는 클래스
 * 
 */
public class UseArray2Work {

	public void scorePrint() {
		String[] namesArr = { "루피", "상디", "쵸파", "나미", "로빈" };
		int[][] scoreArr = { { 89, 91, 86 }, 
							 { 91, 93, 90 }, 
							 { 98, 100, 99 }, 
							 { 74, 85, 83 }, 
							 { 88, 90, 95 } };
		int korean = 0;
		int english = 0;
		int math = 0;
		int highestTotal = 0;
		int topStudentIndex = 0; 

		System.out.printf("시험 응시 인원[%d]명\n", namesArr.length);
		System.out.println("번호\t이름\t국어\t영여\t수학\t총점\t평균\n");
		System.out.println("------------------------------------------------------------");

		for (int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%d\t%s\t", i + 1, namesArr[i]);
			for (int j = 0; j < scoreArr[i].length; j++) {
				System.out.printf("%d\t", scoreArr[i][j]);
				
				int studentTotal = totalScore(scoreArr[i]);
				if (studentTotal > highestTotal) {
					highestTotal = studentTotal;
					topStudentIndex = i;
				}
			}//end for
			korean += scoreArr[i][0];//국어점수
			english += scoreArr[i][1];//영어점수
			math += scoreArr[i][2];//수학점수
			System.out.print(totalScore(scoreArr[i]));// 인당 총점
			System.out.println("\t" + (totalScore(scoreArr[i]) / scoreArr[0].length));//인당 평균
		} // end for
		System.out.println("------------------------------------------------------------");
		System.out.printf("\t총점 \t%d\t%d\t%d\n", korean, english, math);//각 과목의 총점
		System.out.printf("\t평균 \t%d\n", (korean/namesArr.length));//국어만 평균
		
		System.out.printf("1등학생의 번호[%d], 이름[%s], 점수[%d]\n", topStudentIndex+1, namesArr[topStudentIndex], highestTotal);//1등학생
	}// scoreProcess
	
	/**
	 * 일차원 배열의 총점을 구하여 반환
	 * @return
	 */
	public int totalScore(int[] subjectScore) {
		int total = 0;
		for (int score : subjectScore) {
			total+=score;
		}//end for
		return total;
	}//totalScore
	
	

	public static void main(String[] args) {

		UseArray2Work uaw = new UseArray2Work();
		uaw.scorePrint();
	}// main

}// class
