package day0125;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class Numpad extends JFrame {
	public Numpad() {
		super("번호");
		String[] numArr = {"1","2","3","4","5","6","7","8","9","*","0","#"};
		
		JButton[] jrbArr = new JButton[numArr.length];
		
		setLayout(new GridLayout(4, 3));
		for(int i = 0; i < numArr.length; i++) {
			jrbArr[i] = new JButton(numArr[i]);
			add(jrbArr[i]);
		}//end for
		
		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		//2. 컴포넌트 생성
//		JButton jrb1 = new JButton("1");
//		JButton jrb2 = new JButton("2");
//		JButton jrb3 = new JButton("3");
//		JButton jrb4 = new JButton("4");
//		JButton jrb5 = new JButton("5");
//		JButton jrb6 = new JButton("6");
//		JButton jrb7 = new JButton("7");
//		JButton jrb8 = new JButton("8");
//		JButton jrb9 = new JButton("9");
//		JButton jrb0 = new JButton("0");
//		JButton jrbShap = new JButton("#");
//		JButton jrbStar = new JButton("*");
//		
//		//3. 배치관리자 생성 & 설정
//		setLayout(new GridLayout(4, 3));
//		
//		//4. 컴포넌트 배치
//		add(jrb1);
//		add(jrb2);
//		add(jrb3);
//		add(jrb4);
//		add(jrb5);
//		add(jrb6);
//		add(jrb7);
//		add(jrb8);
//		add(jrb9);
//		add(jrbShap);
//		add(jrb0);
//		add(jrbStar);
//		
//		//5. 윈도우 크기 설정
//		setSize(350,400);
//		
//		//6. 사용자에게 보여주기
//		setVisible(true);
//		
//		//7. 윈도우 종료처리
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}// Numpad

	public static void main(String[] args) {
		new Numpad();
	}// main

}// class
