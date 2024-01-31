package day0131;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemoDesign extends JFrame{
	private JMenuItem jmiNew, jmiOpen, jmiSave, jmiClose, jmiFont, jmiHelp;
	private JTextArea jtaNote;
	private JScrollPane jspJtaNote;

	public JavaMemoDesign() {
		super("이런게 메모장..?");
		// 1. 메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		jtaNote = new JTextArea();

		// 2. 메뉴 생성
		JMenu file = new JMenu("파일");
		JMenu format = new JMenu("서식");
		JMenu help = new JMenu("도움말");

		// 3. 메뉴 아이템 설정
		jmiNew = new JMenuItem("새글");
		jmiOpen = new JMenuItem("열기");
		jmiSave = new JMenuItem("저장");
		jmiClose = new JMenuItem("종료");

		jmiFont = new JMenuItem("글꼴");
		jmiHelp = new JMenuItem("메모장 정보");

		// 4. 메뉴에 아이템 배치
		file.add(jmiNew);
		file.addSeparator();// 구분선 넣기
		file.add(jmiOpen);
		file.add(jmiSave);// 메뉴에 메뉴넣기. 배치되면 하위메뉴를 선택할 수 있다.
		file.addSeparator();// 구분선 넣기
		file.add(jmiClose);

		format.add(jmiFont);
		help.add(jmiHelp);

		// 5. 메뉴바에 메뉴 배치
		jmb.add(file);
		jmb.add(format);
		jmb.add(help);

		// 6. 프레임에 메뉴바 배치
		setJMenuBar(jmb);

		// 스크롤바 생성 & 배치
		jspJtaNote = new JScrollPane(jtaNote);
		add(jspJtaNote);
		
		//has a 관계 이벤트 등록
		JavaMemoEvent hme = new JavaMemoEvent(this);
		jmiNew.addActionListener(hme);
		jmiOpen.addActionListener(hme);
		jmiSave.addActionListener(hme);
		jmiClose.addActionListener(hme);
		jmiFont.addActionListener(hme);
		jmiHelp.addActionListener(hme);
		// "예" 했을때만 창닫기
		addWindowListener(hme);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		setSize(500, 400);
		setVisible(true);
	}// JavaMemoDesign

	public JMenuItem getJmiNew() {
		return jmiNew;
	}

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	public JMenuItem getJmiClose() {
		return jmiClose;
	}
	
	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getJmiHelp() {
		return jmiHelp;
	}

	public JTextArea getJtaNote() {
		return jtaNote;
	}

	public JScrollPane getJspJtaNote() {
		return jspJtaNote;
	}

	public static void main(String[] args) {
		new JavaMemoDesign();
	}// main

}// class
