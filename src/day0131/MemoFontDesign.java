package day0131;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class MemoFontDesign extends JDialog {

	private JTextField jtfFont, jtfStyle, jtfSize;
	private JList<String> jlFont, jlStyle, jlSize;
	private DefaultListModel<String> dlmFont, dlmStyle, dlmSize;
	private JLabel jlbPreview;
	private JButton jbtnCheck, jbtnCancel;
	private JavaMemoDesign jmd;

	public MemoFontDesign(JavaMemoDesign jmd) {
		super(jmd, "글꼴", false);
		this.jmd = jmd;

		JLabel jlbFont = new JLabel("글꼴(F):");
		JLabel jlbStyle = new JLabel("글꼴 스타일(Y):");
		JLabel jlbSize = new JLabel("크기(S):");

		// JTextField
		jtfFont = new JTextField("고딕체");
		jtfStyle = new JTextField("일반");
		jtfSize = new JTextField("12");

		// DefaultListModel
		dlmFont = new DefaultListModel<>();
		dlmStyle = new DefaultListModel<>();
		dlmSize = new DefaultListModel<>();

		// JLabel
		jlbPreview = new JLabel("AaBbXxYy");
		jlbPreview.setBorder(new TitledBorder("보기"));

		// DefaultListModel에 데이터 넣기
		dlmFont.addElement("고딕체");
		dlmFont.addElement("궁서체");
		dlmFont.addElement("Consolas");
		dlmFont.addElement("새굴림");
		dlmFont.addElement("맑은 고딕");

		dlmStyle.addElement("일반");
		dlmStyle.addElement("굵게");
		dlmStyle.addElement("기울임꼴");
		dlmStyle.addElement("굵은 기울임꼴");

		dlmSize.addElement("8");
		dlmSize.addElement("9");
		dlmSize.addElement("10");
		for (int i = 12; i < 81; i += 2) {
			dlmSize.addElement(Integer.toString(i));// 문자열 결합
		}

		// JList
		jlFont = new JList<>(dlmFont);
		jlStyle = new JList<>(dlmStyle);
		jlSize = new JList<>(dlmSize);

		jlFont.setSelectedIndex(0);
		jlStyle.setSelectedIndex(0);
		jlSize.setSelectedIndex(0);

		JScrollPane jspFont = new JScrollPane(jlFont);
		JScrollPane jspStyle = new JScrollPane(jlStyle);
		JScrollPane jspSize = new JScrollPane(jlSize);

		// JButton
		jbtnCheck = new JButton("확인");
		jbtnCancel = new JButton("취소");

		// 컴포넌트 배치
		setLayout(null);

		setComponents(jlbFont, jtfFont, jspFont, 30, 0);
		setComponents(jlbStyle, jtfStyle, jspStyle, 170, 0);
		setComponents(jlbSize, jtfSize, jspSize, 310, 0);

		jlbPreview.setBounds(200, 190, 230, 80);

		jbtnCheck.setBounds(300, 300, 60, 30);
		jbtnCancel.setBounds(380, 300, 60, 30);

		addComponents(jlbPreview, jbtnCheck, jbtnCancel);

		// has a관계
		MemoFontEvent mfe = new MemoFontEvent(this);

		addWindowListener(mfe);
		jbtnCheck.addActionListener(mfe);
		jbtnCancel.addActionListener(mfe);

		jtfFont.addMouseListener(mfe);
		jtfStyle.addMouseListener(mfe);
		jtfSize.addMouseListener(mfe);

		jlFont.addMouseListener(mfe);
		jlStyle.addMouseListener(mfe);
		jlSize.addMouseListener(mfe);

		// 윈도운 배치 & 띄우기
		setBounds(jmd.getX() + 125, jmd.getY() + 100, 500, 400);
		setVisible(true);

	}// MemoHelpDesign

	// 컴포넌트 배치 메서드
	private void setComponents(JLabel lb, JTextField jtf, JScrollPane jsp, int x, int y) {
		lb.setBounds(x, y, 130, 30);
		jtf.setBounds(x, 30, 130, 30);
		jsp.setBounds(x, 60, 130, 100);
		addComponents(lb, jtf, jsp);
	}

	// 컴포넌트 추가 메서드 - ellipsis(...) : 메서드에 전달하는 인자 개수가 가변적일 때 사용.
	private void addComponents(JComponent... components) {
		for (JComponent component : components) {
			add(component);
		}
	}

	public JavaMemoDesign getJmd() {
		return jmd;
	}

	public JTextField getJtfFont() {
		return jtfFont;
	}

	public JTextField getJtfStyle() {
		return jtfStyle;
	}

	public JTextField getJtfSize() {
		return jtfSize;
	}

	public JList getJlFont() {
		return jlFont;
	}

	public JList getJlStyle() {
		return jlStyle;
	}

	public JList getJlSize() {
		return jlSize;
	}

	public DefaultListModel<String> getDlmFont() {
		return dlmFont;
	}

	public DefaultListModel<String> getDlmStyle() {
		return dlmStyle;
	}

	public DefaultListModel<String> getDlmSize() {
		return dlmSize;
	}

	public JLabel getJlPreview() {
		return jlbPreview;
	}

	public JButton getJbtnCheck() {
		return jbtnCheck;
	}

	public JButton getJbtnCancel() {
		return jbtnCancel;
	}

}// class
