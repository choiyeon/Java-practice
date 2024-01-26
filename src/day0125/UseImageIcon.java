package day0125;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class UseImageIcon extends JFrame {

	public UseImageIcon() {
		super("이미지 연습");
		
		ImageIcon ii = new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img1.png");
		ImageIcon ii2 = new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img4.png");
		ImageIcon ii3 = new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img2.png");
		
		JLabel jl = new JLabel(ii);
		JButton jbtn = new JButton("헤헿", ii2);//텍스트와 이미지 같이 넣기
		JButton jbtn2 = new JButton("클릭");
		
		setLayout(null); //수동배치
		jl.setBounds(100, 100, 300, 200);
		jbtn.setBounds(420, 100, 300, 200);
		jbtn2.setBounds(193, 174, 100, 50);
		
		//버튼 제어
		//풍선 도움말. 마우스 대면 나옴
		jbtn.setToolTipText("지림");
		
		//텍스트를 특정 위치로 보내기
		jbtn.setVerticalTextPosition(JButton.TOP); //TOP, CENTER, BOTTOM
		jbtn.setHorizontalTextPosition(JButton.CENTER);//LEFT, CENTER, RIGHT
		
		//RollOver 마우스 올리면 그림바뀜.
		jbtn.setRolloverIcon(ii3);
		
		//Frame에 컴포넌트 배치
		add(jbtn2);//순서중요. 나중에 추가될 수록 뒤로 감. 버튼을 위로 올리고 싶으면 먼저 추가
		add(jl);
		add(jbtn);
		
		setBounds(100, 100, 800, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseImageIcon
	public static void main(String[] args) {
		new UseImageIcon();
	}//main

}//class
