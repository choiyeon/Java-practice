package day0129;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import kr.co.sist.memo.StudentInfo;

//1. Window Component상속, 이벤트 처리 Listener를 구현
@SuppressWarnings("serial")
public class TestEvent extends JFrame implements ActionListener {// implements ActionListener (중요!!)

	public TestEvent() {
		super("이벤트 연습");
		JButton jbtn = new JButton("버튼");
		JPanel jp = new JPanel();

//////////////////////////// 중요!!! //////////////////////////////////////////
		// 3. 컴포넌트를 이벤트에 등록
		jbtn.addActionListener(this);
///////////////////////////////////////////////////////////////////////

		jp.add(jbtn);

		add("Center", jp);

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// TestEvent

//////////////////////////// 중요!!! ///////////////////////////////////////////
	
	// 2. Listener에 abstract method를 override한다.
	// 이벤트가 발생했을 때 제공할 코드 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
//		JOptionPane.showMessageDialog(this, "버튼 누름"); //액션(버튼누름)이 일어나면 메시지 띄움
		new StudentInfo();// 버튼을 누르면 StudentInfo 윈도우가 뜸
	}// actionPerformed
	
///////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		new TestEvent();
	}// main

}// class
