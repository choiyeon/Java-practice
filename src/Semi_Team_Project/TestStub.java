package Semi_Team_Project;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

public class TestStub {

	// 1. 디자인 클래스에선 List<LogInfoVO> listLogInfo을 instance 변수로 선언
	List<LogInfoVO> listLogInfo;
	StubExtractRequirementsInfo eri;

	public TestStub() {
		String pathFile = "C:/Temp/sist_input_1.log";

		// 2. 파일 다이어그램으로 선택한 파일을 File로 만들기
		File file = new File(pathFile);

		StubReadLogFile rlf = null;
		try {
			// 3. 로그 데이터 파일을 읽기
			rlf = new StubReadLogFile(file);

			// 4. 읽어들인 로그 데이터 파일의 값을 필드별로 분류 (csv 데이터 분리)
			// 매개변수 true: 원칙대로 URL의 Path와 Parameter의 구분자인 '?' 기호가 있어야만 Parameter가 있는 것으로 취급
			// 매개변수 false: '?'가 없어도 URL에 Parameter로 추정되는 값이 있으면 Parameter로 인식
			listLogInfo = rlf.getLogInfo(false);
			eri = new StubExtractRequirementsInfo(listLogInfo);

			// 5. 각종 컴파일 예외 처리
		} catch (NoSuchFileException nsfe) {
			System.err.println("해당 파일을 찾을 수 없습니다");

		} catch (LooksLikeNotLogFileException llnlfe) {
			System.err.println("해당 파일은 이 프로그램이 사용하는 로그 데이터 파일이 아니거나 데이터가 오염된 것 같습니다");
			llnlfe.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} // catch

		// 6. 분류된 데이터를 분석하여 원하는 값 얻기
		StubExtractRequirementsInfo eri = new StubExtractRequirementsInfo(listLogInfo);

		// 7. 테스트용 콘솔 출력 메소드 호출
		printRequirementsInfo(eri);
	} // TestStub

	public void printRequirementsInfo(StubExtractRequirementsInfo eri) {
		System.out.println("1. 최다 사용 키의 이름과 횟수: " + eri.getOftenKeyName() + " / " + eri.getOftenKeyNum());
		System.out.println("2. 브라우저별 접속 횟수, 비율: ");
		List<BrowserRatioVO> brvo = eri.getBrowserRatio();
		for (BrowserRatioVO b : brvo) {
			System.out.printf("%s: %d회, %.1f%%\n", b.getBrowser(), b.getCount(), b.getRatio());
		} // end for
		System.out
				.println("3. 서비스를 성공적으로 수행한(200) 횟수,실패(404) 횟수: " + eri.getService200() + " / " + eri.getService404());
		System.out.println("4. 요청이 가장 많은 시간: " + eri.getOftenHour() + "시");
		System.out.printf("5. 비정상적인 요청(403)이 발생한 횟수,비율: %d / %.1f%%\n", eri.getService403(), eri.getService403Ratio());
		System.out.printf("6. books에 대한 요청 URL중 에러(500)가 발생한 횟수, 비율: %d / %.1f%%\n", eri.getReqBooksErrNum(),
				eri.getReqBooksErrRatio());
	} // printRequirementsInfo

	public static void main(String[] args) {
		new TestStub();
	} // main
} // class
