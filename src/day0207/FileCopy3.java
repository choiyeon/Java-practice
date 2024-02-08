package day0207;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
public class FileCopy3 extends JFrame implements ActionListener {
	private JLabel jlOutput;

	public FileCopy3() {
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

		// 16bit 연결
		// 읽기 - 단순txt, HTML, XML, json, java ..., 불가능 : 그외
		BufferedReader br = null;
		// 쓰기
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader(fileOrigin));
			bw = new BufferedWriter(new FileWriter(fileCopy));

			String temp = "";
			// 줄단위로 읽기. \n 전까지 읽어들음.
			while ((temp = br.readLine()) != null) {
				bw.write(temp);// 읽어들인 내용을 스트림에 기록
			} // end while
			bw.flush();// 스트림에 존재하는 내용을 목적지로 분출

			jlOutput.setText(fileCopy.getName() + "파일명 복사됨");

		} finally {// 연결 끊기
			if (br != null) {
				br.close();
			}
			if (bw != null) {
				br.close();
			}
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
		new FileCopy3();
	}// main

}// class
