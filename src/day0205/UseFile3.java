package day0205;

import java.io.File;

import javax.swing.JOptionPane;

/**
 * 파일 삭제
 */
public class UseFile3 {

	public static void main(String[] args) {

//		//1. 삭제할 파일명을 가진 File객체를 생성
//		File file = new File("c:/dev/temp/java.read2.txt");
//		//2. 삭제
//		System.out.println(file.delete());

//		//1. 이전이름을 가진 파일객체 생성
//		File file = new File("c:/dev/temp/java.read2.txt");
//		//2. 변경할 파일명을 저장한 객체 생성
//		File file2 = new File("c:/dev/temp/ywc.txt");
//		//3. 변경
//		System.out.println(file.renameTo(file2));

		String path = JOptionPane.showInputDialog("삭제할 파일명과 경로를 적어주세요.", "c:/dev/temp/ywc.txt");
		File removeFile = new File(path);

		if (!removeFile.exists()) {
			JOptionPane.showMessageDialog(null, removeFile + "은 존재하지 않습니다. 파일 경로나 파일명을 확인해주세요.");
			return;
		}
		switch (JOptionPane.showConfirmDialog(null, removeFile.getName() + "파일을 삭제하시겠습니까?")) {
		case JOptionPane.OK_OPTION:
			removeFile.delete();
			JOptionPane.showMessageDialog(null, removeFile + "파일이 삭제되었습니다.");
		}
	}// main

}// class
