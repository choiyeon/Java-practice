package kr.co.sist.memo;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class RunJavaMemo extends JFrame {

	public RunJavaMemo() {
		new JavaMemo();
	}//RunJavaMemo
	
	public static void main(String[] args) {
		new RunJavaMemo();
	}//main

}//class
