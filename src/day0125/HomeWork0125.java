package day0125;

import java.awt.Color;
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

	/**
	 * 입력된 달에 맞게 일 얻기
	 * @param month
	 * @return
	 */
	public String calendarMonth(int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month - 1);// 입력된 달보다 1하나 적게 설정
		int day = 0;

		StringBuilder sb = new StringBuilder();
		for (int tempDay = 1;; tempDay++) {// 끝나는 날 모른다 가정
			// 일이 증가하는 것을 달력 객체에 설정
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			day = cal.get(Calendar.DAY_OF_MONTH);// 설정된 일자 day에 넣기
			if (day != tempDay) {
				// 설정된 일자와 임시일자가 같지 않으면, 월이 끝났기 때문에 반복문 탈출
				// tempDay는 계속증가하지만, day는 마지막일이 지나면 다음달 1일 시작함.
				break;
			} // end if
			
			//악 양쪽끝에 지난달, 다음날 일 어떻게 만드는데..!
			
			sb.append(day).append(",");// 일자 출력
		}
		String days = sb.toString();
		return days;
	}// calendarMonth

	/**
	 * 일을 컴포넌트에 색 변경해서 배치
	 * @param days
	 */
	public void printcalendar(String days) {
		String[] daysArr = days.split(",");
		JButton[] jbnArr = new JButton[daysArr.length];

		setLayout(new GridLayout(5, 7));
		for (int i = 0; i < daysArr.length; i++) {
			jbnArr[i] = new JButton(daysArr[i]);
			
			//색 변경
			jbnArr[i].setOpaque(true);
			jbnArr[i].setBackground(new Color(0x000000));//버튼 검은색
			jbnArr[i].setForeground(new Color(0xFFFFFF));//폰트 흰색
			
			//컴포넌트 배치
			add(jbnArr[i]);
		} // end for
		
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// printcalendar

	public static void main(String[] args) {
		HomeWork0125 hw = new HomeWork0125();
		String days = hw.calendarMonth(2);// 달 입력
		hw.printcalendar(days);
	}// main

}// class
