package day0129;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class HWLogin extends JFrame implements ActionListener{

	private JTextField jtf;
	private JPasswordField jpf;
	private JLabel jl;

	public HWLogin() {
		super("로그인");
		setLayout(null);
		login();
		passWord();
		result();

		setSize(400, 400);
		setVisible(true);
		// 윈도우 종료 이벤트 처리
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});// addWindowListener

	}// HWLogin

	/**
	 * 로그인
	 */
	public void login() {
		jtf = new JTextField();
		jtf.setBorder(new TitledBorder("아이디"));
		jtf.addActionListener(this);
		jtf.setBounds(20, 20, 350, 70);
		add(jtf);
	}// login
	
	/**
	 *비밀번호로 커서 이동
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		jtf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {//키 누르고 있을 때
				//눌린 키의 키코드와 키 값을 얻어온다.
				char c = ke.getKeyChar();
				int code = ke.getKeyCode();
				
				//엔터키가 눌렸을 때 JTA에 "엔터눌림"을 추가
				if(code == 10) {
					jpf.requestFocus();
				}//if
			}//keyPressed
		});//addKeyListener
		
	}//actionPerformed

	/**
	 * 비밀번호
	 */
	public void passWord() {
		jpf = new JPasswordField();
		jpf.setBorder(new TitledBorder("비밀번호"));
		jpf.addActionListener(this);
		jpf.setBounds(20, 100, 350, 70);
		add(jpf);
	}// passWord

	/**
	 * 결과
	 */
	public void result() {
		jl = new JLabel("뭐가 나와야지");
		jl.setBorder(new TitledBorder("결과"));
		jl.setBounds(20, 180, 350, 70);
		add(jl);
	}// result

	public static void main(String[] args) {
		new HWLogin();
	}// main


}// class
