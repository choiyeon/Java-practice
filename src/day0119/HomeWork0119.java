package day0119;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 *1. 파일명을 받을 수 있는 매개변수를 가진 method를 작성하여 입력된 파일의 백업파일명을 반환하는 method작성, 호출
 *"text.txt"가 입력되면, -> "text_bak.txt"가 되어 반환 될 것.
 *text가 입력되면 text_bak가 반환.
 *
 *2. 아래의 csv데이터를 매개변수로 입력받아 배열로 반환하는 method 작성, 호출
 *String csvData = "고한별,김도원,김동섭.김무영~김현종 박시현,손지민,김병년.김일신";
 **김씨는 성을 제외하고 이름만 넣어 반환. 
 *
 *3. 0,1,2,3을 입력받는 method를 작성하고 문자열로 날짜 반환
 *"년-월-일 시:분:초 요일"
 *입력되는 0, 1, 2, 3은 아래의 국가 날짜로 설정되어야 한다.
 *0한국 1미국, 2일본 3캐나다
 *
 *입력되는 값이 0, 1, 2, 3이 아니면 0으로 설정하여 반환
 */
public class HomeWork0119 {
	
	public String printFileName(String file) {
		StringBuilder sb = new StringBuilder(file);
		sb.insert(file.lastIndexOf("."), "_bak");
		return sb.toString();
	}//printFileName
	
	public TokenDataVO csvData(String csvData) {
		StringTokenizer stk = new StringTokenizer(csvData, ",~. ");
		
		int tokenCnt = stk.countTokens();
		String[] temp = new String[tokenCnt];
		
		int i = 0;
		while(stk.hasMoreTokens()) {
			temp[i++] = stk.nextToken();
//			i++;
		}//end while
		
		//김씨 제거
		for (int j = 0; j < temp.length; j++) {
			if(temp[j].startsWith("김")) {
				temp[j] = temp[j].substring(1);
			}
		}
		
		return new TokenDataVO(temp, tokenCnt);
	}//csvData
	
	public void useCsvData() {
		String csvData = "고한별,김도원,김동섭.김무영~김현종 박시현,손지민,김병년.김일신";
		TokenDataVO tdVo = csvData(csvData);
		for(String value : tdVo.getData()) {
			System.out.print(value + " ");
		}
		System.out.println("");
	}//useCsvData
	
	public void TimeByCountry(int countryCode) {
		final int Korea = 0;
		final int US = 1;
		final int Japan = 2;
		final int Canada = 3;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss EEEE");
		
		//Locale 객체 생성
		Locale locale = null;
		if(countryCode > -1 && countryCode < 4) {
			switch (countryCode) {
			case Korea:
				locale = Locale.KOREA;
				break;
			case US:
				locale = Locale.US;
				break;
			case Japan:
				locale = Locale.JAPAN;
				break;
			case Canada:
				locale = Locale.CANADA;
				break;
			}//switch
		}else {
			locale = Locale.KOREA;
		}
		sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss EEEE", locale);
		System.out.println(sdf.format(new Date()));
	}//TimeByCountry

	public static void main(String[] args) {
		HomeWork0119 hw = new HomeWork0119();
		System.out.println(hw.printFileName("te.xt.txt"));//백업파일명 반환
		hw.useCsvData();//csv데이터 반환
		hw.TimeByCountry(2);//각 나라 시간 반환

	}

}
