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
public class HWLogin extends JFrame implements ActionListener {

	private JTextField jtf;
	private JPasswordField jpf;
	private JLabel jl;

	public HWLogin() {
		super("로그인");
		setLayout(null);
		login();
		passWord();

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
	 * 엔터 후 커서 이동
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jtf) {//이벤트가 일어나면 커서 이동
			jpf.requestFocus();
		} else if (e.getSource() == jpf) {
			result();
//			revalidate();
//			repaint();
		}// if
	}// actionPerformed

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
		jl = new JLabel();
		jl.setBorder(new TitledBorder("결과"));
		jl.setBounds(20, 180, 350, 70);

		String login = jtf.getText();
		char[] passWordChar = jpf.getPassword();
		String passWord = new String(passWordChar);
		if (login != null && passWord != null) {
			if (login.equals("root") && passWord.equals("1234") || login.equals("admin") && passWord.equals("password")
					|| login.equals("temp") && passWord.equals("q1w2e3r4")) {
				jl.setText("아이디님 로그인");
			} else {
				jl.setText("로그인 실패");
			}
		}
		add(jl);
	}// result

	public static void main(String[] args) {
		new HWLogin();
	}// main

}// class
