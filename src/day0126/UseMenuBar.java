package day0126;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseMenuBar extends JFrame {

	public UseMenuBar() {
		super("메뉴바 연습");
		// 1. 메뉴바 생성
		JMenuBar jmb = new JMenuBar();

		// 2. 메뉴 생성
		JMenu jm1 = new JMenu("1번 메뉴");
		JMenu jm1_1 = new JMenu("1번의 하위 메뉴");
		JMenu jm2 = new JMenu("2번 메뉴");

		// 3. 메뉴 아이템 설정
		JMenuItem jmi1 = new JMenuItem("1번의 하위메뉴 아이템");
		JMenuItem jmi1_1 = new JMenuItem("1번의 두번째 메뉴아이템");
		JMenuItem jmi1_2 = new JMenuItem("1번의 세번째 메뉴아이템");

		JMenuItem jmi2 = new JMenuItem("2번의 하위메뉴 아이템");
		JMenuItem jmi2_1 = new JMenuItem("2번의 두번째 메뉴아이템");
		JMenuItem jmi2_2 = new JMenuItem("2번의 세번째 메뉴아이템");

		JMenuItem jmi1_1_1 = new JMenuItem("하위메뉴1번의 첫번째 메뉴아이템");
		JMenuItem jmi1_1_2 = new JMenuItem("하위메뉴1번의 두번째 메뉴아이템");

		// 메뉴 안에 하위 메뉴넣고, 하위메뉴에 아이템 넣기
		jm1_1.add("하위메뉴1");
		jm1_1.add(jmi1_1_1);
		jm1_1.add(jmi1_1_2);
		jm1_1.addSeparator();// 구분선 넣기

		jm1_1.add("하위메뉴2");
		jm1_1.add("하위메뉴3");
		jm1_1.add("하위메뉴4");

		// 4. 메뉴에 아이템 배치
		jm1.add(jmi1);
		jm1.addSeparator();// 구분선 넣기
		jm1.add(jm1_1);// 메뉴에 메뉴넣기. 배치되면 하위메뉴를 선택할 수 있다.
		jm1.addSeparator();// 구분선 넣기
		jm1.add(jmi1_1);
		jm1.add(jmi1_2);

		jm2.add(jmi2);
		jm2.add(jmi2_1);
		jm2.add(jmi2_2);

		// 5. 메뉴바에 메뉴 배치
		jmb.add(jm1);
		jmb.add(jm2);

		// 6. 프레임에 메뉴바 배치
		setJMenuBar(jmb);

		setSize(800, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseMenuBar

	public static void main(String[] args) {
		new UseMenuBar();
	}// main

}// class
