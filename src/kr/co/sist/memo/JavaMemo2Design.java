package kr.co.sist.memo;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JavaMemo2Design extends JFrame {
	private JTextField jtfName, jtfPhoneNumber;
	private JRadioButton jrbMen, jrbWomen;
	private DefaultComboBoxModel<String> dcbmAge;
	private DefaultListModel<String> dlm;

	public JavaMemo2Design() {
		super("숙제");
		setLayout(null);
		JavaMemo2Event jme = new JavaMemo2Event(this);
		addInfo();
		addText();
		addComboBox();
		addRadioButton();
		addList();
		addButton(jme);
		addWindowListener(jme);

		// 컴포넌트 설정
		setSize(450, 300);
		setVisible(true);
//		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}//JavaMemo2Design

	public void addInfo() {
		String[] userInfo = { "이름", "나이", "성별", "전화번호" };
		JLabel[] jlArr = new JLabel[4];
		for (int i = 0; i < jlArr.length; i++) {
			jlArr[i] = new JLabel(userInfo[i]);
			jlArr[i].setBounds(20, (i) * 40, 180, 50);
			add(jlArr[i]);
		} // end for
	}//addInfo

	public void addText() {
		jtfName = new JTextField(10);
		jtfPhoneNumber = new JTextField(15);
		jtfName.setBounds(60, 13, 150, 30);
		jtfPhoneNumber.setBounds(75, 130, 150, 30);
		add(jtfName);
		add(jtfPhoneNumber);
	}//addText

	public void addComboBox() {

		// 콤보박스 Model 객체 생성
		dcbmAge = new DefaultComboBoxModel<String>();
		// 콤보박스 Model 객체와 has a 관계 View 객체 생성
		JComboBox<String> jcb = new JComboBox<String>(dcbmAge);
		for (int i = 20; i <= 40; i++) {
			dcbmAge.addElement(String.valueOf(i));
		}
		jcb.setBounds(60, 56, 100, 20);

		add(jcb);
	}//addComboBox

	public void addRadioButton() {
		jrbMen = new JRadioButton("남자");
		jrbWomen = new JRadioButton("여자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbMen);
		bg.add(jrbWomen);
		jrbMen.setBounds(60, 90, 60, 30);
		jrbWomen.setBounds(120, 90, 80, 30);
		add(jrbMen);
		add(jrbWomen);
	}//addRadioButton

	public void addList() {
		// 리스트 모델 객체 생성
		dlm = new DefaultListModel<String>();
		// View생성 => 리스트 Model과 has a 관계
		JList<String> jl = new JList<String>(dlm);
		// 리스트에 값넣기
		dlm.addElement("진수현,남자,010-1234-5678");
		dlm.addElement("김동섭,남자,010-1234-5678");
		dlm.addElement("김병년,남자,010-1234-5678");
		dlm.addElement("이예찬,남자,010-1234-5678");
		
		JScrollPane jsp = new JScrollPane(jl);

		jsp.setBounds(250, 30, 170, 120);
		add(jsp, BorderLayout.EAST);
	}//addList

	private JButton[] jbtArr;
	public void addButton(JavaMemo2Event jme) {
		String[] btn = { "추가", "변경", "삭제", "종료" };
		 jbtArr = new JButton[4];

		for (int i = 0; i < jbtArr.length; i++) {
			jbtArr[i] = new JButton(btn[i]);
			jbtArr[i].setBounds((i * 70)+20, 180, 60, 30);
			jbtArr[i].addActionListener(jme);
			add(jbtArr[i]);
		}//for
		
	}//addButton
	
	public JButton[] getJbtArr() {
		return jbtArr;
	}
	
	public JTextField getJtfName() {
		return jtfName;
	}
	
	public JTextField getJtfPhoneNumber() {
		return jtfPhoneNumber;
	}
	
	public JRadioButton getJrbMen() {
		return jrbMen;
	}
	
	public JRadioButton getJrbWomen() {
		return jrbWomen;
	}
	
	public DefaultComboBoxModel getDcbmAge() {
		return dcbmAge;
	}
	
	public DefaultListModel getDlm() {
		return dlm;
	}

	public static void main(String[] args) {
		
	}//main

}//class
