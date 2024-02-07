package day0207;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class FileCopy2 extends JFrame implements ActionListener {
	private JLabel jlOutput;

	public FileCopy2() {
		super("NIO를 사용한 파일 복사");

		JButton jbtnCopy = new JButton("복사할 파일 선택");
		jlOutput = new JLabel("복사할 파일을 선택해주세요.");
		JPanel jpCenter = new JPanel();
		jpCenter.add(jbtnCopy);

		jlOutput.setBorder(new TitledBorder("출력"));

		add("Center", jpCenter);
		add("South", jlOutput);

		jbtnCopy.addActionListener(this);

		setBounds(100, 100, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// FileCopy

	public void fileCopy() throws IOException {
		// 원본파일명 얻기
		FileDialog fdOpen = new FileDialog(this, "복사할 파일 선택", FileDialog.LOAD);
		fdOpen.setVisible(true);

		if (fdOpen.getDirectory() == null) {// 취소했을때
			return;
		}

		File fileOrigin = new File(fdOpen.getDirectory() + fdOpen.getFile());
		if (!fileOrigin.exists()) {
			JOptionPane.showMessageDialog(this, "파일이 존재하지 않습니다.");
			return;
		} // if

		// 복사할 파일명 생성 : 원본파일명_bak.확장자
		StringBuilder tempFileName = new StringBuilder(fileOrigin.getAbsolutePath());
		tempFileName.insert(tempFileName.lastIndexOf("."), "_bak");
		File fileCopy = new File(tempFileName.toString());

		// NIO를 사용한 파일 복사
		Path originPath = Path.of(fileOrigin.getAbsolutePath());
		Path copyPath = Path.of(fileCopy.getAbsolutePath());

		try {
			Files.copy(originPath, copyPath, StandardCopyOption.REPLACE_EXISTING);
			jlOutput.setText(fileCopy.getName() + "파일명 복사됨");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "파일복사 중 문제발생");
			e.printStackTrace();
		}

	}// FileCopy

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			fileCopy();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}// actionPerformed

	public static void main(String[] args) {
		new FileCopy2();
	}// main

}// class
