package day0125;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UseJScrollPane extends JFrame {

	public UseJScrollPane() {
		super("스크롤 바 연습");
		
		JTextArea jta = new JTextArea("aslidhfaoiwhs");
		String[] dataArr = "자바,오라클,JDBC,HTML,JSP/JSON/AJAX".split("[,/]");
		JList<String> jl = new JList<String>(dataArr);
		
		//BorderLayout -> GridLayout으로 배치관리자 변경
		setLayout(new GridLayout(1,2));
		
		//스크롤바가 필요한 컴포넌트를 위해 JScrollPane 생성
		JScrollPane jsp = new JScrollPane(jta);
		JScrollPane jsp2 = new JScrollPane(jl);
		
		add(jsp);
		add(jsp2);
		
		setBounds(100,100,300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJScrollPane
	public static void main(String[] args) {
		new UseJScrollPane();
	}//main

}//class
