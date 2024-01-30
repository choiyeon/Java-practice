package day0130;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UseGetSource extends JFrame implements ActionListener {

	private JButton jbtn;
	private JButton jbtn2;
	private JTextField jtf;
	
	public UseGetSource() {
		super("주소를 사용한 이벤트 발생객체 비교");
		
		jbtn = new JButton("버튼");
		jbtn2 = new JButton("버튼2");
		jtf = new JTextField(10);
		
		//컴포넌트를 이벤트에 등록
		jbtn.addActionListener(this);
		jbtn2.addActionListener(this);
		jtf.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(jbtn);
		add(jbtn2);
		add(jtf);
		
		setBounds(100,100,400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseActionCommand
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//getSource() 이벤트를 발생시킨 객체의 주소가 반환
		if(ae.getSource() == jbtn) {
			System.out.println("버튼이 눌렸을 때 제공할 코드");
		}
		if(ae.getSource() == jbtn2) {
			System.out.println("버튼2이 눌렸을 때 제공할 코드");
			
		}
		//j.t.f도 주소를 사용하면 입력값이 무엇이든 비교 가능.
		if(ae.getSource() == jtf) {
			System.out.println("텍스트 필드에서 엔터가 눌렸을 때 제공할 코드");
			
		}
	}//actionPerformed

	public static void main(String[] args) {
		new UseGetSource();
	}//main

}//class
