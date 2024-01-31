package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MemoHelpEvent extends WindowAdapter implements ActionListener {
	
	private MemoHelpDesign mhd;
	
	public MemoHelpEvent(MemoHelpDesign mhd) {
		this.mhd = mhd;
		String info = "Java 메모장 정보입니다.";
		mhd.getJtaMemoInfo().append(info);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mhd.getJbtnClose()) {
			mhd.dispose();
		}
	}
	@Override
	public void windowClosing(WindowEvent e) {
		mhd.dispose();
	}

}
