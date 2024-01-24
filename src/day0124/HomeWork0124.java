package day0124;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 1. 입력, 검색, 종료 메뉴를 받을 수 있는 Dialog를 제공한다.<br>
 * 
 * 2. 위의 Dialog에서 “1”이 입력 되면 학생번호,이름,자바,오라클 점수를 입력 받을 수 있는 <br>
 * InputDialog를 제공한다. <br>
 * CSV형식의 데이터를 입력받아, 학생의 번호가 존재한다면 “이미 존재하는 번호입니다.”<br>
 * 를 MessageDialog에 보여주세요. 그렇지 않으면 VO에 입력.<br>
 * 
 * 3.1번 메뉴에서 “2”가 입력되면 저장된 모든 값을 console에 출력하는 코드 작성<br>
 * 번호 이름 자바점수 오라클점수 합계 평균<br>
 * 1 xxx 90 90 90 90.xx<br>
 * 
 * 4. 1메뉴에서 “3” 이 입력되면 프로그램을 종료한다.
 * 
 * 1 입력, 학생정보 받기. 학생번호 이미 있으면 메시지 다이얼로그. 없으면 정보 저장.
 * 
 * 2 입력 모든 값 출력 map 키 값(정보), set넣고 iterator로 값찾아서 while출력 번호 이름 자바 오라클 합계 평균
 * 
 * 3 입력 프로그램 종료
 * 
 */
@SuppressWarnings("serial")
public class HomeWork0124 extends JFrame {
	private final String INPUT = "1";
	private final String SEARCH = "2";
	private final String END = "3";
	public static final int CSV_DATA = 4;
	private Map<Integer, StudentVO> map;
	public static int i = 1;

	public HomeWork0124() {
		map = new HashMap<Integer, StudentVO>();
	}// HomeWork0124

	public void inputMenu() {
		boolean exitFlag = false;
		String inputData = "";
		String selectMenu = "";
		String[] inputArr = null;// csv 데이터 저장할 배열

		do {
			selectMenu = JOptionPane.showInputDialog("메뉴\n1.입력 2. 검색 3. 종료");
			switch (selectMenu) {
			case INPUT:
				inputData = JOptionPane.showInputDialog("학생의 정보를 아래와 같이 입력해주세요.\n예)학생번호,이름,자바점수,오라클점수");
//				JOptionPane.showMessageDialog(null, "이미 존재하는 번호입니다.");
				if (inputData != null) {
					inputArr = inputData.split(",");

					if (inputArr.length == CSV_DATA) {
						inputData(inputArr);
					} // if
				} // if
			case SEARCH:
				printData();
			case END:
				exitFlag = true;
			}// switch
		} while (!exitFlag);
	}// inputMenu

	/**
	 * 정보 저장
	 * 
	 * @param inputArr
	 */
	public void inputData(String[] inputArr) {
		int studentNum = Integer.parseInt(inputArr[0]);
		String name = inputArr[1];
		int java = Integer.parseInt(inputArr[2]);
		int oracle = Integer.parseInt(inputArr[3]);

		StudentVO vo = new StudentVO(studentNum, name, java, oracle);

		map.put(i, vo);
		i++;
	}// inputData

	/**
	 * 출력 메서드 Set<키Generic> set = map.keySet();
	 * 
	 * Iterator<키Generic> ita = set.iterator();
	 * 
	 * while(ita.hasNext()){ value = map.get(ita.next()); }
	 */
	public void printData() {
		Set<Integer> set = map.keySet();
		Iterator<Integer> ita = set.iterator();
		StudentVO value;
		System.out.println("번호\t학생번호\t이름\t자바점수\t오라클점수\t총점\t평균\n"); 
		while (ita.hasNext()) {
			value = map.get(ita.next());
			System.out.println(value);
		}

//		StudentVO sVO = null;
//		for (int i = 0; i < list.size(); i++) {
//			wVO = list.get(i);
//		} // for
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print((i + 1) + "\t" + wVO.getName() + "\t" + wVO.getJava() + "\t" + wVO.getOracle() + "\t"
//					+ (wVO.getOracle() + wVO.getJava()) + "\n");
//		} // for
	}// printData

	public static void main(String[] args) {
		HomeWork0124 hw = new HomeWork0124();
		hw.inputMenu();
	}// main

}// class
