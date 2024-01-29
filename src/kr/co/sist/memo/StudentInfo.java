package kr.co.sist.memo;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class StudentInfo extends JFrame {

	public StudentInfo() {
		super("숙제");

		// 라벨
		JLabel jlblName = new JLabel("이름");
		JLabel jlblAge = new JLabel("나이");
		JLabel jlblGender = new JLabel("성별");
		JLabel jlblPhone = new JLabel("전화번호");

		// 텍스트 필드
		JTextField jtfName = new JTextField(10);
		JTextField jtfPhone = new JTextField(10);

		// 나이 콤보 박스
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
		JComboBox<String> jcb = new JComboBox<String>(dcbm);
		for(int i = 20; i < 41; i++) {
			dcbm.addElement(String.valueOf(i));
		}

		// 라디오 버튼
		JRadioButton man = new JRadioButton("남자");
		JRadioButton woman = new JRadioButton("여자");

		// 리스트
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		JList<String> jl = new JList<String>(dlm);
		dlm.addElement("1. 진수현, 남, 010-1234-5678");
		dlm.addElement("2. 김동섭, 남, 010-2345-6789");
		JScrollPane jsp = new JScrollPane(jl);

		// 버튼
		JButton jbtnAdd = new JButton("추가");
		JButton jbtnChange = new JButton("변경");
		JButton jbtnDelete = new JButton("삭제");
		JButton jbtnEnd = new JButton("종료");
//////////////////////////////////////////////////////////////////////////////////		
		// 수동배치
		setLayout(null);

		// 라벨 크기 & 위치 설정
		jlblName.setSize(50, 30);
		jlblName.setLocation(45, 50);

		jlblAge.setSize(50, 30);
		jlblAge.setLocation(45, 90);

		jlblGender.setSize(50, 30);
		jlblGender.setLocation(45, 130);

		jlblPhone.setSize(50, 30);
		jlblPhone.setLocation(45, 170);

		// 텍스트 필드 크기 위치 설정
		jtfName.setSize(90, 30);
		jtfName.setLocation(75, 50);

		jtfPhone.setSize(90, 30);
		jtfPhone.setLocation(100, 170);

		// 콤보 박스 크기 & 위치 설정
		jcb.setBounds(75, 95, 90, 30);

		// 라디오 버튼 크기 & 위치 설정
		man.setSize(50, 30);
		man.setLocation(80, 130);

		woman.setSize(50, 30);
		woman.setLocation(132, 130);
		
		//리스트 크기 위치 설정
		jsp.setBounds(250, 30, 120, 120);
//		jsp.setSize(150, 130);
//		jsp.setLocation(350, 45);

		// 버튼 크기 & 위치 설정
		jbtnAdd.setSize(60, 30);
		jbtnAdd.setLocation(60, 240);

		jbtnChange.setSize(60, 30);
		jbtnChange.setLocation(130, 240);

		jbtnDelete.setSize(60, 30);
		jbtnDelete.setLocation(200, 240);

		jbtnEnd.setSize(60, 30);
		jbtnEnd.setLocation(270, 240);
///////////////////////////////////////////////////////////////////////////////		
		// 라디오 그룹
		ButtonGroup bg = new ButtonGroup();
		bg.add(man);
		bg.add(woman);
///////////////////////////////////////////////////////////////////////////////		
		// 컴포넌트 넣기
		// 라벨 추가
		add(jlblName);
		add(jlblAge);
		add(jlblGender);
		add(jlblPhone);

		// 텍스트 필드 추가
		add(jtfName);
		add(jtfPhone);

		// 콤보박스 추가
		add(jcb);

		// 라디오 버튼 추가
		add(man);
		add(woman);
		
		//리스트 추가
		add(jsp, BorderLayout.EAST);

		// 버튼 추가
		add(jbtnAdd);
		add(jbtnChange);
		add(jbtnDelete);
		add(jbtnEnd);

		// 윈도우 배치
		setSize(600, 400);
		setResizable(false);//크기 변경 방지
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// HW0126

	public static void main(String[] args) {
		new StudentInfo();
	}// main

}// class
