package day0131;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class MemoFontDesign extends JDialog {

	private JTextField jtfFont, jtfStyle, jtfSize;
	private JList<String> jlFont, jlStyle, jlSize;
	private DefaultListModel<String> dlmFont, dlmStyle, dlmSize;
	private JLabel jlPreview;
	private JButton jbtnCheck, jbtnCancel;

	public MemoFontDesign(JavaMemoDesign jmd) {
		super(jmd, "글꼴", false);
		
		//
		JLabel jlbFont = new JLabel("글꼴(F):");
		JLabel jlbStyle = new JLabel("글꼴 스타일(Y):");
		JLabel jlbSize = new JLabel("크기(S):");
		JLabel jlbPreview = new JLabel("보기");
		
		//JTextField
		jtfFont = new JTextField(10);
		jtfStyle = new JTextField(10);
		jtfSize = new JTextField(10);

		//DefaultListModel
		dlmFont = new DefaultListModel<String>();
		dlmStyle = new DefaultListModel<String>();
		dlmSize = new DefaultListModel<String>();
		
		//JList
		jlFont = new JList<String>(dlmFont);
		jlStyle = new JList<String>(dlmStyle);
		jlSize = new JList<String>(dlmSize);
		
		JScrollPane jspFont = new JScrollPane(jlFont);
		JScrollPane jspStyle = new JScrollPane(jlStyle);
		JScrollPane jspSize = new JScrollPane(jlSize);

		//JLabel
		jlPreview = new JLabel("미리보기");

		//JButton
		jbtnCheck = new JButton("확인");
		jbtnCancel = new JButton("취소");
		
		//JPanel 설정 어떻게 배치해야하는지 모르겠다
//		JPanel jpFont = new JPanel();
//		jpFont.setBorder(new TitledBorder("글꼴(F):"));
//		jpFont.add(jtfFont);
//		jpFont.add(jlFont);
//		
//		
//		JPanel jpStyle = new JPanel();
//		jpStyle.setBorder(new TitledBorder("글꼴 스타일(Y):"));
//		jpStyle.add(jtfStyle);
//		jpStyle.add(jlStyle);
//		
//		
//		JPanel jpSize = new JPanel();
//		jpSize.setBorder(new TitledBorder("크기(S):"));
//		jpSize.add(jtfSize);
//		jpSize.add(jlSize);
//		
//		JPanel jpPreview = new JPanel();
//		jpPreview.setBorder(new LineBorder(Color.GRAY));
//		jpPreview.setBorder(new TitledBorder("보기"));
//		jpPreview.add(jlPreview);
//		
//		JPanel jpBtn = new JPanel();
//		jpBtn.add(jbtnCheck);
//		jpBtn.add(jbtnCancel);
		
		//컴포넌트 배치
		setLayout(null);
		
		jlbFont.setBounds(30, 0, 130, 30);
		jtfFont.setBounds(30, 30, 130, 30);
		jspFont.setBounds(30, 60, 130, 100);
		
		jlbStyle.setBounds(170, 0, 130, 30);
		jtfStyle.setBounds(170, 30, 130, 30);
		jspStyle.setBounds(170, 60, 130, 100);
		
		jlbSize.setBounds(310, 0, 130, 30);
		jtfSize.setBounds(310, 30, 130, 30);
		jspSize.setBounds(310, 60, 130, 100);
		
		jlbPreview.setBounds(200, 180, 150, 30);
		jlPreview.setBounds(200, 210, 150, 100);
		
		jbtnCheck.setBounds(300, 300, 60, 30);
		jbtnCancel.setBounds(380, 300, 60, 30);
		
		//추가
		add(jlbFont);
		add(jtfFont);
		add(jspFont);
		
		add(jlbStyle);
		add(jtfStyle);
		add(jspStyle);
		
		add(jlbSize);
		add(jtfSize);
		add(jspSize);
		
		add(jlbPreview);
		add(jlPreview);
		
		add(jbtnCheck);
		add(jbtnCancel);
		
		//has a관계
		MemoFontEvent mfe = new MemoFontEvent(this);
		jbtnCheck.addActionListener(mfe);
		jbtnCancel.addActionListener(mfe);

		setBounds(jmd.getX() + 125, jmd.getY() + 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}// MemoHelpDesign

	public JTextField getJtfFont() {
		return jtfFont;
	}

	public JTextField getJtfStyle() {
		return jtfStyle;
	}

	public JTextField getJtfSize() {
		return jtfSize;
	}

	public JList<String> getJlFont() {
		return jlFont;
	}

	public JList<String> getJlStyle() {
		return jlStyle;
	}

	public JList<String> getJlSize() {
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
		return jlPreview;
	}

	public JButton getJbtnCheck() {
		return jbtnCheck;
	}

	public JButton getJbtnCancel() {
		return jbtnCancel;
	}

}// class
