package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;

public class MemoFontEvent extends WindowAdapter implements ActionListener, MouseListener {

	private MemoFontDesign mfd;
	
	public MemoFontEvent(MemoFontDesign mfd) {
		this.mfd = mfd;
	}//MemoFontEvent
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mfd.getJbtnCheck()) {
			applyFont();
			
		}
		if(ae.getSource() == mfd.getJbtnCancel()) {
			closeFontDialog();
		}
	}//actionPerformed
	
	private void setPreview() {
		
	}//setPreview
	
	private void applyFont() {
		System.out.println("확인");
	}//applyFont
	
	private void closeFontDialog() {
		mfd.dispose();
	}//closeFontDialog
	
	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}


}//class
