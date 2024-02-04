package day0131;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;

public class MemoFontEvent extends WindowAdapter implements ActionListener, MouseListener {

	private MemoFontDesign mfd;
	
	private String font = "고딕체";
	private int style = Font.PLAIN;
	private int size = 12;
	
	public MemoFontEvent(MemoFontDesign mfd) {
		this.mfd = mfd;
		Font font = new Font(this.font, this.style, this.size);
		this.mfd.getJlPreview().setFont(font);
	}//MemoFontEvent
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mfd.getJbtnCheck()) {
			//확인 버튼
			mfd.getJmd().getJtaNote().setFont(new Font(this.font, this.style, this.size));
			mfd.dispose();
			
		}
		if(ae.getSource() == mfd.getJbtnCancel()) {
			//취소 버튼
			mfd.dispose();
		}
	}//actionPerformed
	
	@Override
	public void mouseReleased(MouseEvent me) {
		//눌린 마우스에 떼어질때 
		
		//글꼴
		if(me.getSource() == mfd.getJlFont()) {
			
			int index = mfd.getJlFont().getSelectedIndex();
			if(index != -1) {
				
				String temp = mfd.getDlmFont().getElementAt(index);
				mfd.getJtfFont().setText(temp);
				this.font = temp;
				Font setFont = new Font(this.font, this.style, this.size);
				mfd.getJlPreview().setFont(setFont);
				
			}//end if
		}//if 폰트 변경
		
		//글꼴 스타일
		if(me.getSource() == mfd.getJlStyle()) {
			int index = mfd.getJlStyle().getSelectedIndex();
			if(index != -1) {
				
				String temp = mfd.getDlmStyle().getElementAt(index);
				mfd.getJtfStyle().setText(temp);
				switch(temp) {
				case "일반":
					this.style = Font.PLAIN;
					break;
				case "굵게":
					this.style = Font.BOLD;
					break;
				case "기울림꼴":
					this.style = Font.ITALIC;
					break;
				case "굵은 기울임꼴":
					this.style = Font.BOLD | Font.ITALIC;
					break;
				}
				
				Font setFont = new Font(this.font, this.style, this.size);
				mfd.getJlPreview().setFont(setFont);
				
			}//end if
		}//if 스타일 변경
		
		//크기
		if(me.getSource() == mfd.getJlSize()) {
			int index = mfd.getJlSize().getSelectedIndex();
			if(index != -1) {
				
				String temp = mfd.getDlmSize().getElementAt(index);
				mfd.getJtfSize().setText(temp);
				this.size = Integer.parseInt(temp);
				Font setFont = new Font(this.font, this.style, this.size);
				mfd.getJlPreview().setFont(setFont);
				
			}//end if
		}//if 크기 변경
		
	}//mouseReleased
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//마우스가 눌렸을 때와 떼어질 때, 마우스가 같은 지점에 머무를 때 
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//마우스가 눌렸을 때
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}


}//class
