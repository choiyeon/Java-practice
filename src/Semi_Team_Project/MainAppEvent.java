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
import java.text.ParseException;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.MaskFormatter;

import JavaMemoUpgrade.MemoHelpDesign;

public class MainAppEvent extends WindowAdapter implements ActionListener {
	MainAppDesign md;
	private boolean opened = false;
	private String logData;
	private JTextArea getInfo;
	List<LogInfoVO> listLogInfo;

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
//		FileDialog openFile = new FileDialog(md, "열기", FileDialog.LOAD);
//		openFile.setVisible(true);
//		String path = openFile.getDirectory();
//		String file = openFile.getFile();
//
//		if (path != null && file != null) { // 파일 선택 여부 확인
//			StringBuilder sb = new StringBuilder();
//			BufferedReader br = null;
//
//			try {
//				br = new BufferedReader(new FileReader(new File(path, file)));
//
//				String data;
//				while ((data = br.readLine()) != null) {
//					sb.append(data).append("\n");
//				}
//			} finally {
//				if (br != null) {
//					br.close();
//				}
//			}
//
//			// 텍스트 영역에 표시
//			md.getInfo().setText(sb.toString());
//			System.out.println(md.getInfo().getText());
//			opened = true;
//		} else {
//			// 파일 선택을 취소한 경우
//			JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.");
//		}
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
	 * 파일 읽고 데이터 가져오기
	 */
	public void ReadLogFile() {
		// 2. 파일 다이어그램으로 선택한 파일을 가져오기
		// (추후 File로 받는게 나은지 String으로 받는게 나은지 테스트해야)
//						File file = new File(pathFile);
		String pathFile = "C:/Temp/sist_input_1.log";

		List<String> logLines = null;
		ClassifyLogLines cll = null;
		try {
			// 3. 로그 데이터 파일을 읽기
			logLines = new StoreData(pathFile).loadData();

			// // 4. 읽어들인 로그 데이터 파일의 값을 필드별로 분류 (csv 데이터 분리)
			// boolean 매개변수 true: 원칙대로 URL의 Path와 Parameter의 구분자인 '?' 기호가 있어야만 Parameter가 있는
			// 것으로 취급
			// boolean 매개변수가 없거나 false: '?'가 없어도 URL에 Parameter로 추정되는 값이 있으면 Parameter로 인식
			cll = new ClassifyLogLines(logLines);

			// 5. 각종 컴파일 예외 처리
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LooksLikeNotLogFileException e) {
			e.printStackTrace();
		} // end catch

		// 6. 분류한 데이터를 인스턴스 변수에 저장
		listLogInfo = cll.getLogInfo();
	}

	/**
	 * 입력된 시작라인과 끝라인 안의 정보만 출력
	 */
	public void printLineView() {
		// JTextArea 초기화
		md.getInfo().setText("");
		
		// JFormattedTextField에서 값을 가져옴
		Integer startLogValue = (Integer) md.getStartLog().getValue();
		Integer endLogValue = (Integer) md.getEndLog().getValue();

		StringBuffer sb = new StringBuffer();

		// null 여부 확인
		if (startLogValue != null && endLogValue != null) {
			// 데이터 불러오기
			ReadLogFile();
			ExtractRequirementsInfo eriPart = new ExtractRequirementsInfo(listLogInfo, startLogValue.intValue(),
					endLogValue.intValue());

			sb.append("1. 최다 사용 키의 이름과 횟수: " + eriPart.getOftenKeyName() + " / " + eriPart.getOftenKeyNum() + "\n");
			sb.append("2. 브라우저별 접속 횟수, 비율: " + "\n");
			List<BrowserRatioVO> brvo = eriPart.getBrowserRatio();
			for (BrowserRatioVO b : brvo) {
				sb.append(String.format("\t%s: %d회, %.1f%%\n", b.getBrowser(), b.getCount(), b.getRatio()));
			} // end for
			sb.append("3. 서비스를 성공적으로 수행한(200) 횟수,실패(404) 횟수: " + eriPart.getService200() + " / "
					+ eriPart.getService404() + "\n");
			sb.append("4. 요청이 가장 많은 시간: " + eriPart.getOftenHour() + "시" + "\n");
			sb.append(String.format("5. 비정상적인 요청(403)이 발생한 횟수,비율: %d / %.1f%%\n", eriPart.getService403(),
					eriPart.getService403Ratio()));
			sb.append(String.format("6. books에 대한 요청 URL중 에러(500)가 발생한 횟수, 비율: %d / %.1f%%\n",
					eriPart.getReqBooksErrNum(), eriPart.getReqBooksErrRatio()));

			// JTextArea에 정보 출력
			String requirementsInfo = String.valueOf(sb);
			md.getInfo().append(requirementsInfo);
		} else {
			// 값이 비어있을 경우 예외 처리 또는 메시지 출력
			md.getInfo().append("시작 또는 끝 라인 값이 비어있습니다.");
		} // end else

	}// printLineView

	public void fileReport() {

	}

}
