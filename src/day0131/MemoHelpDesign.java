package day0131;

import javax.swing.JDialog;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MemoHelpDesign extends JDialog {

	private JTextArea jtaMemoInfo;
	public MemoHelpDesign(JavaMemoDesign jmd) {
		super(jmd, "메모장 정보", false);
	}//MemoHelpDesign
}//class
