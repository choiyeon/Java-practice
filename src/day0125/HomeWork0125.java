package day0125;

import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HomeWork0125 extends JFrame {
	public static final int START_DAY = 1;

	public HomeWork0125() {
		super("월의 달력");

	}// HomeWork0125

	public String calendarMonth(int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month - 1);// 원하는 달보다 1하나 적게 설정
		int day = 0;
		int dayOfWeek = 0;// 요일 저장

		StringBuilder sb = new StringBuilder();
		for (int tempDay = 1;; tempDay++) {// 끝나는 날 모른다 가정
			// 일이 증가하는 것을 달력 객체에 설정
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			day = cal.get(Calendar.DAY_OF_MONTH);// 설정된 일자 day에 넣기
			if (day != tempDay) {// 설정된 일자와 임시일자가 같지 않으면, 월이 끝났기 때문에 반복문 탈출
				// tempDay는 계속증가하지만, day는 마지막일이 지나면 다음달 1일 시작함.
				break;
			} // 빠져나가는 조건
			sb.append(day).append(",");// 일자 출력
		}
		String days = sb.toString();
		return days;
	}// calendarMonth

	public void printcalendar(String days) {
		String[] daysArr = days.split(",");
		JButton[] jbnArr = new JButton[daysArr.length];

		setLayout(new GridLayout(5, 7));
		for (int i = 0; i < daysArr.length; i++) {
			jbnArr[i] = new JButton(daysArr[i]);
			add(jbnArr[i]);
		} // end for
		
		//색 변경 어케하지?
		

		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// printcalendar

	public static void main(String[] args) {
		HomeWork0125 hw = new HomeWork0125();
		String days = hw.calendarMonth(1);// 달 입력
		hw.printcalendar(days);
	}// main

}// class
