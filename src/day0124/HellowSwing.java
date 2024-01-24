package day0124;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 1. Window Component 상속 
 */
@SuppressWarnings("serial")
public class HellowSwing extends JFrame {
	
	public HellowSwing() {
		super("스윙 연습");//상단바에 글자 입력
		
		//2. 컴포넌트 생성
		JButton jbtn = new JButton("안녕 Swing");//컴포넌트 버튼에 문자 입력
		
		//3. 배치 => 부모의 method 사용, 배치관리자를 사용할 수 있다.
		add(jbtn);
		
		//4. 윈도우 크기 설정
		setSize(400, 250);
		
		//5. 사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);
		
		//6. 윈도우종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//HellowSwing

	public static void main(String[] args) {
		new HellowSwing();
	}//main

}//class
