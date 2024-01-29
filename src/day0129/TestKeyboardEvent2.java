package day0129;

import java.awt.event.KeyAdapter;
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
public class TestKeyboardEvent2 extends JFrame {
	//3. 이벤트처리와 관련있는 컴포넌트를 선언.
	private JTextField jtf;
	private JTextArea jta;
	
	public TestKeyboardEvent2() {
		super("키보드 이벤트");
		
		jtf=new JTextField();
		jta=new JTextArea();
		
		JScrollPane jsp = new JScrollPane(jta);
		
		jtf.setBorder(new TitledBorder("아무키나 누르세요"));
		jsp.setBorder(new TitledBorder("눌린 키의 정보"));
		
		//jtf에 이벤트가 발생하면 이벤트를 감지할 수 있도록 이벤트객체에 등록하자
		//2. anonymouse inner class로 이벤트 처리
		jtf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent ke) {//키 누르고 있을 때
				//눌린 키의 키코드와 키 값을 얻어온다.
				char c = ke.getKeyChar();
				int code = ke.getKeyCode();
				//JTextArea에 추가
				jta.append("문자 : " + c + " 코드 : " + code + "\n");
				
				//esc키가 눌렸을 때 프로그램을 종료
				if(code == KeyEvent.VK_ESCAPE) {
					dispose();//anonymouse inner class를 사용하면 JFrame의 자식 바로 사용 가능.
				}//if
				
				//엔터키가 눌렸을 때 JTA에 "엔터눌림"을 추가
				if(code == 10) {
					jta.append("엔터눌림\n");
				}//if
			}//keyPressed
			
		});
		
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
	
	public static void main(String[] args) {
		new TestKeyboardEvent2();
	}//main

}//class
