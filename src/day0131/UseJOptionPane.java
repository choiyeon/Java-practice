package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputAdapter;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener, WindowListener {
	private JMenuItem jmiInput, jmiMessage, jmiConfirm;

	public UseJOptionPane() {
		super("JOptionPane 사용");
		
		JMenuBar jmb = new JMenuBar();//메뉴바 생성
		JMenu jm = new JMenu("사용");// 메뉴 생성
		
		//메뉴아이템 생성
		jmiInput = new JMenuItem("input dialog");
		jmiMessage = new JMenuItem("message dialog");
		jmiConfirm = new JMenuItem("confirm dialog");
		
		//메뉴아이템 > 메뉴 배치
		jm.add(jmiInput);
		jm.add(jmiMessage);
		jm.add(jmiConfirm);
		
		//메뉴 > 메뉴바 배치
		jmb.add(jm);
		
		//메뉴바 > 프레임 설정
		setJMenuBar(jmb);
		
		//이벤트 등록
		jmiInput.addActionListener(this);
		jmiMessage.addActionListener(this);
		jmiConfirm.addActionListener(this);
		
		setSize(400,400);
		setVisible(true);
		
		//x버튼이 눌려쓸 때 아무것도 하지 않도록 설정
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(this);//윈도우 이벤트가 발생하면 현재 클래스안에서 이벤트 처리
		//예 를 눌렀을 때만 창이 닫힘.
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseJOptionPane
	
	private void useInput() {
		String data = JOptionPane.showInputDialog("이름을 입력해주세요.", "홍길동");//메시지, 기본값
		if(data != null) {
			System.out.println(data);
		}
	}//useInput
	private void useMessage() {
		JOptionPane.showMessageDialog(this, "오늘은 수요일 입니다.", "그럼 내일은", JOptionPane.INFORMATION_MESSAGE);
		//부모, 메시지, 타이틀바, 아이콘 설정(아이콘 안쓰기 : PLAIN_MESSAGE)
	}//useMessage
	private void useConfirm() {
		int flag = JOptionPane.showConfirmDialog(this, "오늘 수업은 여기까지 하겠습니까?");
		switch(flag) {
		case JOptionPane.OK_OPTION:
			JOptionPane.showMessageDialog(this, "와우");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(this, "진행해");
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(this, "진심?");
			break;
		}
	}//useConfirm
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jmiInput) {
			useInput();
		}//end if
		if(ae.getSource() == jmiMessage) {
			useMessage();
			
		}//end if
		if(ae.getSource() == jmiConfirm) {
			useConfirm();
			
		}//end if
	}//actionPerformed

	public static void main(String[] args) {
		new UseJOptionPane();
	}//main

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	/**
	 *윈도우에 x버튼을 누르면 windowClosing이 호출된다.
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		int flag = JOptionPane.showConfirmDialog(this, "정말 종료하시겠습니까?");
		//예 가 눌려지면 프로그램이 종료되지만,
		//아니오 나 취소 가 눌리면, 종료면 안된다. 창을 숨겨만 둔다.
		switch(flag) {
		case JOptionPane.OK_OPTION:
			dispose();//그래서 예 인 경우에만 dispose
		}//switch
	}//windowClosing

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(JFrame.ABORT);
	}//windowClosed

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

}//class
