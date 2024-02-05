package day0205;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HW0205 {

	public HW0205() {
		String inputfile = JOptionPane.showInputDialog("파일 경로를 입력해주세요", "c:/dev");
		File files = new File(inputfile);
		File[] fList = files.listFiles();
		
		if (!files.exists()) {
			JOptionPane.showMessageDialog(null, files + "은 존재하지 않습니다. 파일 경로나 파일명을 확인해주세요.");
			return;
		}

		// JTextArea 설정
		JTextArea jta = new JTextArea(10, 50);
		JScrollPane jsp = new JScrollPane(jta);
		jta.setEditable(false);
		jta.append("이름\t수정한날짜\t\t유형\t크기\n");
		jta.append("eclipse\tyyyy-MM-dd HH:mm:ss\t폴더 \n");
		jta.append("env.bat\tyyyy-MM-dd HH:mm:ss\t파일\t4byte \n");

		File file = null;
		for (int i = 0; i < fList.length; i++) {
			if (fList[i].isFile()) {
				file = fList[i];
			} else if (fList[i].isDirectory()) {
				file = fList[i];
			}

			// JTA에 파일 경로 추가
			// 이름
			jta.append(file.getName() + "\t");

			// 수정한 날짜
			long lastModified = file.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			jta.append(sdf.format(new Date(lastModified)) + "\t");

			// 유형
			jta.append(file.isFile() ? "파일\t" : "폴더\t");

			// 크기
			jta.append(file.length() + "byte\n");
		}

		// 결과 띄우기
		JOptionPane.showMessageDialog(null, jsp);

	}// HW0205

	public static void main(String[] args) {
		new HW0205();
	}// main

}// class
