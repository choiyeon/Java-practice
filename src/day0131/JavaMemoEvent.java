package day0131;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 이벤트를 모아 처리하기 위해 작성
 */
public class JavaMemoEvent extends WindowAdapter implements ActionListener, WindowListener {

	private JavaMemoDesign jmd;

	public JavaMemoEvent(JavaMemoDesign jmd) {
		this.jmd = jmd;
	}// JavaMemoEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jmd.getJmiNew()) {
			newMemo();
		}
		if (ae.getSource() == jmd.getJmiOpen()) {
			openMemo();
		}
		if (ae.getSource() == jmd.getJmiSave()) {
			saveMemo();
		}
		if (ae.getSource() == jmd.getJmiClose()) {
			jmd.dispose();
		}
		if (ae.getSource() == jmd.getJmiFont()) {
			fontDialog();
		}
		if (ae.getSource() == jmd.getJmiHelp()) {
			helpDialog();
		}
	}// actionPerformed

	private void newMemo() {
		jmd.getJtaNote().setText("");
	}// newMemo

	private void openMemo() {
		System.out.println("열기");
		FileDialog fdOpen = new FileDialog(jmd, "열기 모드", FileDialog.LOAD);// 부모창에서 파일다이얼로그 열기 버튼을 누르면 파일 열기가 로드 됨.
		fdOpen.setVisible(true);

		String path = fdOpen.getDirectory();
		String fName = fdOpen.getFile();
		jmd.setTitle("열기 " + path + fName);

	}// openMemo

	private void saveMemo() {
		FileDialog fdSave = new FileDialog(jmd, "저장 모드", FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();
		jmd.setTitle("저장 " + path+fName);
		

	}// saveMemo

	private void helpDialog() {
		new MemoHelpDesign(jmd);
	}

	private void fontDialog() {
		new MemoFontDesign(jmd);

	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		int flag = JOptionPane.showConfirmDialog(jmd, "정말 종료하시겠습니까?");
		// 예 가 눌려지면 프로그램이 종료되지만,
		// 아니오 나 취소 가 눌리면, 종료면 안된다. 창을 숨겨만 둔다.
		switch (flag) {
		case JOptionPane.OK_OPTION:
			jmd.dispose();// 그래서 예 인 경우에만 dispose
		}// switch
	}// windowClosing

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(JFrame.ABORT);
	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}// class
