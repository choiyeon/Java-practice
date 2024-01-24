package day0124;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UseFlowLayout extends JFrame {

	public UseFlowLayout() {
		super("FlowLayout 연습");
		
		//2. 컴포넌트 생성. 컴포넌트의 유형과 하는 일을 붙어서 작명함(헝가리안 네이밍).
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);//10자 정도 보이게 크기 설정
		JCheckBox jcbSave = new JCheckBox("저장");
		JButton jbtnInput = new JButton("입력");
		
		//3. 배치관리자 생성(non-visual Component)
		setLayout(new FlowLayout());
		
		//4. 컴포넌트 배치
		add(jlblName);
		add(jtfName);
		add(jcbSave);
		add(jbtnInput);
		
		// 5. 윈도우 크기 설정
		setSize(500, 400);

		// 6. 사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);

		// 7. 윈도우종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseFlowLayout
	
	public static void main(String[] args) {
		new UseFlowLayout();
	}//main

}//class
