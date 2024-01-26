package kr.co.sist.memo;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemo extends JFrame {
	public JavaMemo() {
		super("메모장");
		// 1. 메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		JTextArea jta = new JTextArea();

		// 2. 메뉴 생성
		JMenu file = new JMenu("파일");
		JMenu help = new JMenu("도움말");

		// 3. 메뉴 아이템 설정
		JMenuItem newPost = new JMenuItem("새글");
		JMenuItem open = new JMenuItem("열기");
		JMenuItem save = new JMenuItem("저장");
		JMenuItem end = new JMenuItem("종료");

		JMenuItem noteInfo = new JMenuItem("메모장 정보");
		
		// 4. 메뉴에 아이템 배치
		file.add(newPost);
		file.addSeparator();// 구분선 넣기
		file.add(open);
		file.add(save);// 메뉴에 메뉴넣기. 배치되면 하위메뉴를 선택할 수 있다.
		file.addSeparator();// 구분선 넣기
		file.add(end);

		help.add(noteInfo);

		// 5. 메뉴바에 메뉴 배치
		jmb.add(file);
		jmb.add(help);

		// 6. 프레임에 메뉴바 배치
		setJMenuBar(jmb);
		
		//스크롤바 생성 & 배치
		JScrollPane jsp = new JScrollPane(jta);
		add(jsp);

		setSize(800, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// JavaMemo

	public static void main(String[] args) {
		new JavaMemo();
	}// main

}// class
