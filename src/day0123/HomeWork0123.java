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
 */
public class HomeWork0123 {
	//입력받기
	String inputData = JOptionPane.showInputDialog("\"이름,자바점수,오라클점수\" 입력\n\"출력\"을 입력하면 출력됩니다.\n 종료하시면 \"Y / y\"을 입력해주세요");
	
	public HomeWork0123() {
		
	}//HomeWork0123
	
	
	/**
	 * 메뉴 입력받기
	 */
	public void inputMenu() {
		
	}//inputMenu
	
	
	/**
	 * 입력받은 값 쪼개기
	 * @return name, javaScore, oracleScore
	 */
	@SuppressWarnings("unchecked")
	public WorkVO workData() {
		WorkVO wkVO = null;
		StringTokenizer stk = new StringTokenizer(inputData, ", ");
		
		int tokenCnt = stk.countTokens();
		List dataList = new ArrayList();
		
		while(stk.hasMoreTokens()) {
			String data = stk.nextToken();
			dataList.add(data);
		}//end while
		
		String name = (String) dataList.get(0);
		int javaScore = (int) dataList.get(1);
		int oracleScore = (int) dataList.get(2);
		
		wkVO = new WorkVO(name, javaScore, oracleScore);
		
		return wkVO;
	}//workData
	
	/**
	 * 데이터 입력받아서 리스트에 넣기
	 */
	public void inputData() {
		WorkVO wkVO = workData();
		wkVO.getName();
		wkVO.getJavaScore();
		wkVO.getOracleScore();
		
	}//inputData
	
	/**
	 * 데이터 출력
	 */
	public void printData() {
		WorkVO wkVO = workData();
		int i = 1;
		if(("출력").equals(inputData)) {
			System.out.println("번호\t이름\t자바\t오라클\t총점\n");
			System.out.println(i + "\t" + wkVO.getName()+ "\t" + wkVO.getJavaScore() + "\t" + 
			wkVO.getOracleScore() + "\t" + "총점");
		}
		
	}//printData
	
	/**
	 * 프로그램 종료
	 */
	public void exitProgram() {
		if(("Y").equals(inputData) || ("y").equals(inputData)) {
			System.out.println("입력을 종료합니다.");
		}
	}//exitProgram
	
	public static void main(String[] args) {
		HomeWork0123 hw = new HomeWork0123();
//		hw.workData();

//		String inputData = JOptionPane.showInputDialog("이름을 입력해주세요","홍길동");
//		StringBuilder sb = new StringBuilder();
//		if("윤웅찬".equals(inputData)) {
//			sb.append("조원동의 자랑 ");
//		}
//		sb.append(inputData).append("님");
//		System.out.println(sb);

	}// main

}// class
