package Semi_Team_Project;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import JavaMemoUpgrade.MemoHelpDesign;

public class MainAppEvent extends WindowAdapter implements ActionListener {
	MainAppDesign md;
	private boolean opened = false;
	private String logData;
	private JTextArea getInfo;

	public MainAppEvent(MainAppDesign md) {
		this.md = md;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == md.getBrowse()) {
			try {
				printLog();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (ae.getSource() == md.getView()) {
			printView();
		}
		if (ae.getSource() == md.getLineView()) {
			printLineView();
		}
		if (ae.getSource() == md.getReport()) {
			fileReport();
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
		md.dispose();
	}

//	public void printLog() throws IOException {
//	    FileDialog openFile = new FileDialog(md, "열기", FileDialog.LOAD);
//	    openFile.setVisible(true);
//	    String path = openFile.getDirectory();
//	    String file = openFile.getFile();
//	    
//	    if (path != null && file != null) { // 파일 선택 여부 확인
//	        StringBuilder sb = new StringBuilder();
//	        BufferedReader br = null;
//	        
//	        try {
//	            br = new BufferedReader(new FileReader(new File(path, file)));
//	            
//	            String data;
//	            while ((data = br.readLine()) != null) {
//	                sb.append(data).append("\n");
//	            }
//	        } finally {
//	            if (br != null) {
//	                br.close();
//	            }
//	        }
//	        
//	        // 텍스트 영역에 표시
//	        md.getInfo().setText(sb.toString());
//	        System.out.println(md.getInfo().getText());
//	        opened = true;
//	    } else {
//	        // 파일 선택을 취소한 경우
//	        JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.");
//	    }
//	}
	public void printLog() throws IOException {
		FileDialog openFile = new FileDialog(md, "열기", FileDialog.LOAD);
		openFile.setVisible(true);
		String path = openFile.getDirectory();
		String file = openFile.getFile();

		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;

		File selectFile = new File(path);
		try {
			br = new BufferedReader(new FileReader(selectFile + "/" + file));

			String data = "";
			while ((data = br.readLine()) != null) {
				sb.append(data + "\n");
			}
		} finally {
			if (br != null) {
				br.close();
			}
		}
		opened = true;
		md.getInfo().setText(sb.toString());
	}

	public void printView() {

	}

	/**
	 * 입력된 시작라인과 끝라인 안의 정보만 출력
	 */
	public void printLineView() {
		//JTextArea 초기화
		md.getInfo().setText("");
		
		// JFormattedTextField에서 값을 가져옴
		Integer startLogValue = (Integer) md.getStartLog().getValue();
		Integer endLogValue = (Integer) md.getEndLog().getValue();
		
		// TestStub 클래스의 인스턴스를 생성
		TestStub testStub = new TestStub();
		
		// null 여부 확인
		if (startLogValue != null && endLogValue != null) {
			// 값을 가지고 있는 경우에만 getRequirementsInfoIine() 메소드 호출
			String requirementsInfo = testStub.getRequirementsInfoIine(startLogValue.intValue(),
					endLogValue.intValue());

			// JTextArea에 정보 출력
			md.getInfo().append(requirementsInfo);
			
		} else {
			// 값이 비어있을 경우 예외 처리 또는 메시지 출력
			md.getInfo().append("시작 또는 끝 라인 값이 비어있습니다.");
		}//end else

	}// printLineView

	public void fileReport() {

	}

}
