package day0126;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJComboBox extends JFrame {

	public UseJComboBox() {
		super("JComboBox 사용");

		// 1. Model 생성
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();

		// 2. Model과 has a 관계로 View( JComboBox ) 생성
		JComboBox<String> jcb = new JComboBox<String>(dcbm);
		
		// 3. 데이터 추가 => Model객체 사용. // 콤보박스에 데이터(선택지) 넣기
		dcbm.addElement("고한별");
		dcbm.addElement("김도원");
		dcbm.addElement("김병년");

		JPanel jp = new JPanel(); // 패널 생성
		jp.setBorder(new TitledBorder("MVC 패턴을 도입한 클래스들")); // 패널에 보더라인그리고 보더 제목 넣기
		jp.add(jcb); // 패널에 콤보박스 넣기

		add("North", jp); // 패널을 상단에 배치

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}// UseJComboBox

	public static void main(String[] args) {
		new UseJComboBox();
	}// main

}// class
