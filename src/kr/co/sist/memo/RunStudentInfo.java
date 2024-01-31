package kr.co.sist.memo;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class RunStudentInfo extends JFrame {

	public RunStudentInfo() {
		new StudentInfoDesign();
	}//RunJavaMemo
	
	public static void main(String[] args) {
		new RunStudentInfo();
	}//main

}//class
