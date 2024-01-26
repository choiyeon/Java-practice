package kr.co.sist.memo;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HW0126 extends JFrame {

	public HW0126() {
		super("숙제");
		
		//라벨 & 텍스트 필드
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);
		JLabel jlblPhone = new JLabel("전화번호");
		JTextField jtfPhone = new JTextField(10);
		
		//콤보 박스
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
		JComboBox<String> jcb = new JComboBox<String>(dcbm);
		for(int i = 20; i < 41; i++) {
			String age = Integer.toString([i]);
			dcbm.addElement(age);
		}
		
		//라디오 버튼
		JLabel jlblGender = new JLabel("성별");
		JRadioButton man = new JRadioButton("남자");
		JRadioButton woman = new JRadioButton("여자");
		
		//버튼
		JButton jbtnAdd = new JButton("추가");
		JButton jbtnChange = new JButton("변경");
		JButton jbtnDelete = new JButton("삭제");
		JButton jbtnEnd = new JButton("종료");
		
		//수동배치
		setLayout(null);
		
		//라벨 크기 & 위치 설정
		jlblName.setSize(50, 30);
		jlblName.setLocation(45, 50);
		jtfName.setSize(90, 30);
		jtfName.setLocation(75, 50);
		
		jlblPhone.setSize(50, 30);
		jlblPhone.setLocation(45, 170);
		jtfPhone.setSize(90, 30);
		jtfPhone.setLocation(100, 170);
		
		//콤보 박스 크기 & 위치 설정
		
		
		//라디오 버튼 크기 & 위치 설정
		jlblGender.setSize(50, 30);
		jlblGender.setLocation(45, 130);
		
		man.setSize(50, 30);
		man.setLocation(80, 130);
		
		woman.setSize(50, 30);
		woman.setLocation(132, 130);
		
		//버튼 크기 & 위치 설정
//		woman.setSize(50, 30);
//		woman.setLocation(160, 171);
		
		//라디오 그룹
		ButtonGroup bg = new ButtonGroup();
		bg.add(man);
		bg.add(woman);

		
		// 컴포넌트 넣기
		add(jlblName);
		add(jtfName);
		add(jlblPhone);
		add(jtfPhone);
		
		add(jlblGender);
		add(man);
		add(woman);
		
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// HW0126

	public static void main(String[] args) {
		new HW0126();
	}// main

}// class
