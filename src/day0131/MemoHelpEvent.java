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
		JTextArea jta = new JTextArea();
		
		JButton jbtn = new JButton("닫기");
		JPanel jp = new JPanel();
		jp.add(jbtn);
		
		add("Center", jta);
		add("South", jp);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}
	@Override
	public void windowClosing(WindowEvent e) {
	}

}
