package day0131;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.catalog.CatalogFeatures;

@SuppressWarnings("serial")
public class ParentFrame extends JFrame implements ActionListener {
	private JButton jbtn, jbtnOpen, jbtnSave;

	public ParentFrame() {
		super("다이얼로그 연습");
		jbtn = new JButton("다이얼로그");
		jbtnOpen = new JButton("파일다이얼로그 열기");
		jbtnSave = new JButton("파일다이얼로그 저장");

		JPanel jp = new JPanel();
		jp.add(jbtn);
		jp.add(jbtnOpen);
		jp.add(jbtnSave);

		jbtn.addActionListener(this);
		jbtnOpen.addActionListener(this);
		jbtnSave.addActionListener(this);

		add("Center", jp);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// ParentFrame

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jbtn) {
			new SubJDialog(this);// 액션이 있으면 SubJDialog 실행
		}
		if (ae.getSource() == jbtnOpen) {
			open();
		}
		if (ae.getSource() == jbtnSave) {
			save();
		}
	}// actionPerformed

	private void open() {
		FileDialog fdOpen = new FileDialog(this, "파일 열기", FileDialog.LOAD);// 부모창에서 파일다이얼로그 열기 버튼을 누르면 파일 열기가 로드 됨.
		fdOpen.setVisible(true);

		String path = fdOpen.getDirectory();
		String fName = fdOpen.getFile();
		if (path != null) {//취소를 누르면 경로나 파일명에 null 입력
			if (path.length() > 10) {
				path = path.substring(0, 9) + "...";
			}// end if
			
			setTitle(path+fName);
		}
	}//open

	private void save() {
		FileDialog fdSave = new FileDialog(this, "파일 저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();
		if (path != null) {//취소를 누르면 경로나 파일명에 null 입력
			if (path.length() > 10) {
				path = path.substring(0, 9) + "...";
			}// end if
			
			setTitle("저장 " + path+fName);
		}
		
	}//save

	public static void main(String[] args) {
		new ParentFrame();
		
	}// main

}// class
