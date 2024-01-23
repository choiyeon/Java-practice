package day0123;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 * 입력데이터가 csv형태(이름, 자바점수, 오라클점수)라면 WorkVO객체를 생성하여 입력값을 할당하고<br>
 * java.util.List에 추가하는 작업을 수행<br>
 * csv형태가 아닌 "출력"이 입력되면, java.util.List에 들어있는 값을 모두 다 console에 출력<br>
 * 
 * 번호 이름 자바 오라클 총점<br>
 * 1 윤웅찬 100 100 200<br>
 * 2 김병년 95 89 184<br>
 * 
 * csv형태가 아닌 Y나 y입력되면 종료
 * 
 * 값을 쪼개서 변수에 넣고, list.add로 get값 넣고, list크기만큼 출력. list.get. y나Y면 break
 */
public class HomeWork0123 {
	String informData;
	static Boolean LOOP = true;
	List<String> nameList = new ArrayList<String>();
	List<Integer> javaScoreList = new ArrayList<Integer>();
	List<Integer> oracleScoreList = new ArrayList<Integer>();

	public HomeWork0123() {
	}// HomeWork0123

	public void inputMenu() {
		informData = JOptionPane.showInputDialog("\"이름,자바점수,오라클점수\" 입력\n\"출력\"을 입력하면 출력됩니다.\n 종료하시면 \"Y / y\"을 입력해주세요");
	}// inputMenu

	/**
	 * 입력받은 값 쪼개기
	 * 
	 * @return name, javaScore, oracleScore
	 */
	public WorkVO workData() {
		WorkVO wkVO = null;
		StringTokenizer stk = new StringTokenizer(informData, ",");

		String name = stk.nextToken().trim();
		int javaScore = Integer.parseInt(stk.nextToken().trim());
		int oracleScore = Integer.parseInt(stk.nextToken().trim());

		wkVO = new WorkVO(name, javaScore, oracleScore);

		return wkVO;
	}// workData

	/**
	 * 데이터 입력받아서 리스트에 넣기..?
	 * 
	 */
	public void inputData() {
		WorkVO wkVO = workData();
		nameList.add(wkVO.getName());
		javaScoreList.add(wkVO.getJavaScore());
		oracleScoreList.add(wkVO.getOracleScore());
	}// inputData

	/**
	 * 데이터 출력
	 */
	public void printData() {
		System.out.println("번호\t이름\t자바\t오라클\t총점");
		System.out.println("========================================");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println((i + 1) + "\t" + nameList.get(i) + "\t" + javaScoreList.get(i) + "\t"
					+ oracleScoreList.get(i) + "\t" + (javaScoreList.get(i) + oracleScoreList.get(i)));
		} // end for
	}// printData

	/**
	 * 프로그램 종료
	 */
	public void exitProgram() {
		System.out.println("입력을 종료합니다.");
		LOOP = false;
	}// exitProgram

	public static void main(String[] args) {
		HomeWork0123 hw = new HomeWork0123();
		while (LOOP) {
			hw.inputMenu();
			if (("출력").equals(hw.informData)) {
				hw.printData();
			} else if (("Y").equals(hw.informData) || ("y").equals(hw.informData)) {
				hw.exitProgram();
			} else if (hw.informData != null) {
				hw.inputData();// 값 넣기 호출
			}
		} // while

	}// main

}// class
