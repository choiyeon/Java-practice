package day0124;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UseBorderLayout extends JFrame {
//1. 윈도우 컴포넌트 상속.
	public UseBorderLayout() {
		super("경계 레이아웃 연습");
		// 2. 컴포넌트 생성
		JButton jbtnNorth = new JButton("북쪽");// 버튼은 누를 수 있음.
		JButton jbtnWest = new JButton("서쪽");
		JLabel jlblEast = new JLabel("동쪽");// 라벨은 클릭 안됨
		JLabel jlblSouth = new JLabel("남쪽");

		JTextArea jtaCenter = new JTextArea("가운데");

		// 3. 배치관리자 생성하고 적용. Window Component의 기본 배치관리자는 BorderLayout
//		setLayout(new BorderLayout()); //기본이 BorderLayout이라 생성안해도 작동함.

		// 4. 생성된 컴포넌트를 배치관리자 특성에 맞게 배치 수행.
		add("North", jbtnNorth);// 문자열 상수를 사용해 배치
		add(BorderLayout.WEST, jbtnWest); // Constant 사용하여 배치. 위치, 컴포넌트
		add("Center", jtaCenter);
		add(jlblEast, "East"); // 컴포넌트, "위치"
		add(jlblSouth, BorderLayout.SOUTH);

		// 5. 윈도우 크기 설정
		setSize(500, 500);

		// 6. 사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);

		// 7. 윈도우종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseBorderLayout

	public static void main(String[] args) {
		new UseBorderLayout();
	}// main

}// class
