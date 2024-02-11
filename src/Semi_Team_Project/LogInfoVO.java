package Semi_Team_Project;

import java.time.LocalDateTime;

/**
 * HTTP 응답 로그에 대한 정보를 저장하는 Value Object
 */
public class LogInfoVO {
	/**
	 * HTTP 요청에 대한 응답의 상태 코드
	 * (예시: 200, 403, 404, 500, ...)
	 */
	private int statusCode;
	
	/**
	 * 요청 경로
	 * (예시: books)
	 */
	private String reqPath; 
	
	/**
	 * 쿼리의 key에 대한 값
	 */
	private String queryKey;
	
	/**
	 * 사용자가 접속한 브라우저
	 */
	private String browser;
	
	/**
	 * 요청에 대한 응답을 수행한 날짜와 시
	 */
	private LocalDateTime dateTime;
	
	/**
	 * HTTP 응답 로그에 대한 정보를 저장하는 Value Object
	 */
	public LogInfoVO() {
		
	} // LogInfoVO

	/**
	 * HTTP 응답 로그에 대한 정보를 저장하는 Value Object
	 * @param statusCode HTTP 요청에 대한 응답의 상태 코드
	 * @param reqPath 요청 경로
	 * @param queryKey 쿼리의 key에 대한 값
	 * @param browser 사용자가 접속한 브라우저
	 * @param dateTime 요청에 대한 응답을 수행한 날짜와 시간
	 */
	public LogInfoVO(int statusCode, String reqPath, String queryKey, String browser, LocalDateTime dateTime) {
		this.statusCode = statusCode;
		this.reqPath = reqPath;
		this.queryKey = queryKey;
		this.browser = browser;
		this.dateTime = dateTime;
	} // LogInfoVO

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getReqPath() {
		return reqPath;
	}

	public void setReqPath(String reqPath) {
		this.reqPath = reqPath;
	}

	public String getQueryKey() {
		return queryKey;
	}

	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
} // class
