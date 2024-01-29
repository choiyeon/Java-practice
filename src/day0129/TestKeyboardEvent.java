package day0129;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
//1. keyListener 구현
public class TestKeyboardEvent extends JFrame implements KeyListener {
	//3. 이벤트처리와 관련있는 컴포넌트를 선언.
	private JTextField jtf;
	private JTextArea jta;
	
	public TestKeyboardEvent() {
		super("키보드 이벤트");
		
		jtf=new JTextField();
		jta=new JTextArea();
		
		JScrollPane jsp = new JScrollPane(jta);
		
		jtf.setBorder(new TitledBorder("아무키나 누르세요"));
		jsp.setBorder(new TitledBorder("눌린 키의 정보"));
		
		//jtf에 이벤트가 발생하면 이벤트를 감지할 수 있도록 이벤트객체에 등록하자
		jtf.addKeyListener(this);
		
		add("North", jtf);
		add("Center", jsp);
		
		
		setSize(400, 400);
		setVisible(true);
		
		//윈도우 종료 이벤트 처리
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
	}//TestKeyboardEvent

	
	//2. abstract method override

	@Override
	public void keyTyped(KeyEvent ke) {
		System.out.println("keyTyped " + ke.getKeyCode() + " / " + ke.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent ke) {// 키 누르고 있을 때
		System.out.println("keyPressed " + ke.getKeyCode() + " / " + ke.getKeyChar());
//		System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent ke) {//키 누르다가 뗐을 때
		System.out.println("keyReleased " + ke.getKeyCode() + " / " + ke.getKeyChar());
//		System.out.println("keyReleased");
		
	}
	
	public static void main(String[] args) {
		new TestKeyboardEvent();
	}//main

}//class
