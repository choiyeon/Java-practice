package day0124;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HomeWork2 {
	private List<WorkVO> list;
	public static final int CSV_DATA = 3;
	
	public HomeWork2() {
		list = new ArrayList<WorkVO>();
	}

	int cnt = 0;

	public void inputMenu() {
		boolean exitFlag = false;
		String inputData = "";
		String[] inputArr = null;// csv 데이터 저장할 배열

		do {
			inputData = JOptionPane.showInputDialog("이름,자바점수,오라클점수 입력\n출력을 입력하면 출력됩니다.\n중료하실려면 Y,y를 눌러주세요");
			if (inputData != null) {
				inputArr = inputData.split(",");
				
				switch (inputArr.length) {
				case CSV_DATA:
					inputData(inputArr);
				default:
					if ("출력".equals(inputData)) {
						printData();
					} // end if
					exitFlag = "Y".equalsIgnoreCase(inputData);
				}// switch
			} // if
		} while (!exitFlag);
	}

	public void inputData(String[] inputArr) {
		String name = inputArr[0];
		int java = Integer.parseInt(inputArr[1]);
		int oracle = Integer.parseInt(inputArr[2]);

		WorkVO vo = new WorkVO(name, java, oracle);

		list.add(vo);
	}

	/**
	 * 출력 메서드
	 */
	public void printData() {
		System.out.println("번호\t이름\t자바\t오라클\t총점");
		WorkVO wVO = null;
		for (int i = 0; i < list.size(); i++) {
			wVO = list.get(i);
		} // for
		for (int i = 0; i < list.size(); i++) {
			System.out.print((i + 1) + "\t" + wVO.getName() + "\t" + wVO.getJava() + "\t" + wVO.getOracle() + "\t"
					+ (wVO.getOracle() + wVO.getJava()) + "\n");
		} // for
	}// printData

	/**
	 * 종료 메서드
	 */
//	private boolean exitProgram(char key) {
//		return key == 'Y'|| key == 'y';
//	}//exitProgram

	public static void main(String[] args) {

		HomeWork2 hm = new HomeWork2();
		hm.inputMenu();
	}//main
}//class
