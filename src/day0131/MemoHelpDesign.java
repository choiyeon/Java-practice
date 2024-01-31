package day0131;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MemoHelpDesign extends JDialog {

	private JTextArea jtaMemoInfo;
	private JButton jbtnClose;

	public MemoHelpDesign(JavaMemoDesign jmd) {
		super(jmd, "메모장 정보", false);
		jtaMemoInfo = new JTextArea();
		jbtnClose = new JButton("닫기");
		JPanel jp = new JPanel();
		jp.add(jbtnClose);

		MemoHelpEvent mhe = new MemoHelpEvent(this);
		jbtnClose.addActionListener(mhe);
		
		add("Center", jtaMemoInfo);
		add("South", jp);
		
		setBounds(jmd.getX()+125, jmd.getY()+100, 250, 250);
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}// MemoHelpDesign

	public JTextArea getJtaMemoInfo() {
		return jtaMemoInfo;
	}

	public JButton getJbtnClose() {
		return jbtnClose;
	}

}// class
