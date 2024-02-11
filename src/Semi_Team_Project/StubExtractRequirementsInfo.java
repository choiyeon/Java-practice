package Semi_Team_Project;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (분류한 로그 데이터를) 분석하여 요구사항이 요구하는 데이터를 생성해내는 클래스<br><br>
 * 
 * 요구사항이 요구하는 값은 인스턴스 변수로 설정되어 있기 때문에 getter method로 바로 가져올 수 있고<br><br>
 * 
 * 요구사항이 요구하는 값 외에 추가로 구하고 싶은 값이 있다면<br>
 * 데이터 분석에 쓰인 Map을 getter method로 가져와서 연산할 수 있다<br><br>
 * 
 * 이 클래스는 retainAllModified() 메소드를 제공하기 때문에<br> 
 * 엑셀의 '필터' 버튼처럼 column별 겹치는 라인이 몇 번인지를 구할 수 있다<br>
 */
public class StubExtractRequirementsInfo {

	/**
	 * HTTP 요청에 대한 응답의 상태 코드 (예시: 200, 403, 404, 500, ...)를 key로, 
	 * 해당하는 라인의 List를 값으로 갖는 Map
	 */
	private Map<Integer, List<Integer>> statusCode;	
	/**
	 * 요청 경로 (예시: books)를 key로, 해당하는 라인의 List를 값을 갖는 Map 
	 */
	private Map<String, List<Integer>> reqPath;	
	/**
	 * 쿼리의 key에 대한 값을 key로, 해당하는 라인의 List를 값을 갖는 Map
	 */
	private Map<String, List<Integer>> queryKey;	
	/**
	 * 사용자가 접속한 브라우저를 key로, 해당하는 라인의 List를 값을 갖는 Map
	 */
	private Map<String, List<Integer>> browser;	
	/**
	 * 요청에 대한 응답을 수행한 날짜와 '시'를 key로, 해당하는 라인의 List를 값을 갖는 Map
	 */
	private Map<LocalDateTime, List<Integer>> reqHour;	
	
	/**
	 * 1. 최다사용 키의 이름
	 */
	private String oftenKeyName;
	/**
	 * 1. 최다사용 키의 횟수
	 */
	private int oftenKeyNum;
	/**
	 * 2. 브라우저별 접속횟수, 비율
	 */
	private List<BrowserRatioVO> browserRatio;
	/**
	 * 3. 서비스를 성공적으로 수행한(200) 횟수
	 */
	private int service200;
	/**
	 * 3. 서비스 실패(404) 횟수
	 */
	private int service404;
	private int service500, serviceEtc;
	/**
	 * 4. 요청이 가장 많은 시간
	 */
	private int oftenHour;
	/**
	 * 5. 비정상적인 요청(403)이 발생한 횟수
	 */
	private int service403;
	/**
	 * 5. 비정상적인 요청(403)이 발생한 비율
	 */
	private double service403Ratio;
	/**
	 * 6. books에 대한 요청 URL중 에러(500)가 발생한 횟수
	 */
	private int reqBooksErrNum;
	/**
	 * 6. books에 대한 요청 URL중 에러(500)가 발생한 비율
	 */
	private double reqBooksErrRatio;
	
	/**
	 * 데이터의 첫 번째 라인에 해당하는 인덱스는 0번
	 */
	private static final int FIRST = 0;
	/**
	 * 데이터의 마지막 라인에 해당하는 인덱스는 -1번
	 */
	private static final int LAST = -1;
	
	/**
	 * 요구사항 6번에서 URL의 말단 path가 가리키는 경로
	 */
	private static final String PATH_BOOKS = "books";
	/**
	 * 요구사항 6번에서 URL 요청 중 에러에 해당하는 상태 코드
	 */
	private static final int SERVICE_500 = 500;
	
	/**
	 * 요구사항이 요구하는 값을 만들기 위해 데이터를 분석해 저장할 Map을 만드는 기본 생성자 
	 */
	private StubExtractRequirementsInfo() {
		statusCode = new HashMap<Integer, List<Integer>>();
		reqPath = new HashMap<String, List<Integer>>();
		queryKey = new HashMap<String, List<Integer>>();
		browser = new HashMap<String, List<Integer>>();
		reqHour = new HashMap<LocalDateTime, List<Integer>>();
	} // ExtractRequirementsInfo
	
	/**
	 * (분류한 로그 데이터를) 모두 분석하여 요구사항이 요구하는 데이터를 생성한다<br><br>
	 * 
	 * 요구사항이 요구하는 값은 인스턴스 변수로 설정되어 있기 때문에 getter method로 바로 가져올 수 있고<br><br>
	 * 
	 * 요구사항이 요구하는 값 외에 추가로 구하고 싶은 값이 있다면<br>
	 * 데이터 분석에 쓰인 Map을 getter method로 가져와서 연산할 수 있다<br><br>
	 * 
	 * 이 클래스는 retainAllModified() 메소드를 제공하기 때문에<br> 
	 * 엑셀의 '필터' 버튼처럼 column별 겹치는 라인이 몇 번인지를 구할 수 있다<br>
	 * 
	 * @param listLogInfo 분류한 로그 데이터
	 */
	public StubExtractRequirementsInfo(List<LogInfoVO> listLogInfo) {
		this(listLogInfo, FIRST, LAST);
	} // ExtractRequirementsInfo
		
	/**
	 * (분류한 로그 데이터를) 파라미터로 받은 인덱스 범위만 분석하여 요구사항이 요구하는 데이터를 생성한다<br><br>
	 * 
	 * 요구사항이 요구하는 값은 인스턴스 변수로 설정되어 있기 때문에 getter method로 바로 가져올 수 있고<br><br>
	 * 
	 * 요구사항이 요구하는 값 외에 추가로 구하고 싶은 값이 있다면<br>
	 * 데이터 분석에 쓰인 Map을 getter method로 가져와서 연산할 수 있다<br><br>
	 * 
	 * 이 클래스는 retainAllModified() 메소드를 제공하기 때문에<br> 
	 * 엑셀의 '필터' 버튼처럼 column별 겹치는 라인이 몇 번인지를 구할 수 있다<br>
	 * 
	 * @param listLogInfo 분류한 로그 데이터
	 * @param indexStart 분석할 시작 라인의 인덱스
	 * @param indexEnd 분석할 마지막 라인의 인덱스
	 */
	public StubExtractRequirementsInfo(List<LogInfoVO> listLogInfo, int indexStart, int indexEnd) {
		this();
		
		if(listLogInfo == null) {
			return;
		} // end if
		
		oftenKeyName = "java";
		oftenKeyNum = 220;
		
		browserRatio = new ArrayList<BrowserRatioVO>();
		browserRatio.add(new BrowserRatioVO("opera", 60, 3.0));
		browserRatio.add(new BrowserRatioVO("firefox", 146, 7.3));
		browserRatio.add(new BrowserRatioVO("Safari", 44, 32.2));
		browserRatio.add(new BrowserRatioVO("Chrome", 65, 3.3));
		browserRatio.add(new BrowserRatioVO("ie", 1672, 84.1));
		
		service200 = 1865;
		service404 = 50;
		
		oftenHour = 10;
		
		service403 = 50;
		service403Ratio = 2.5;
		
		reqBooksErrNum = 16;
		reqBooksErrRatio = 5.2;
		
	} // StubExtractRequirementsInfo

	public Map<Integer, List<Integer>> getStatusCode() {
		return statusCode;
	}

	public Map<String, List<Integer>> getReqPath() {
		return reqPath;
	}

	public Map<String, List<Integer>> getQueryKey() {
		return queryKey;
	}

	public Map<String, List<Integer>> getBrowser() {
		return browser;
	}

	public Map<LocalDateTime, List<Integer>> getReqHour() {
		return reqHour;
	}

	public String getOftenKeyName() {
		return oftenKeyName;
	}

	public int getOftenKeyNum() {
		return oftenKeyNum;
	}

	public List<BrowserRatioVO> getBrowserRatio() {
		return browserRatio;
	}

	public int getService200() {
		return service200;
	}

	public int getService404() {
		return service404;
	}

	public int getService500() {
		return service500;
	}

	public int getServiceEtc() {
		return serviceEtc;
	}

	public int getOftenHour() {
		return oftenHour;
	}

	public int getService403() {
		return service403;
	}

	public double getService403Ratio() {
		return service403Ratio;
	}

	public int getReqBooksErrNum() {
		return reqBooksErrNum;
	}

	public double getReqBooksErrRatio() {
		return reqBooksErrRatio;
	}
	
	
} // class
