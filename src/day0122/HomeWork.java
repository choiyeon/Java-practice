package day0122;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 * 숙제 1. 파일명을 받을 수 있는 매개변수를 가진 method를 작성하여 입력된 파일명의 백업파일명을 반환하는 일을 하는 method를
 * 작성하고 호출하세요. 만약.이 없다면 파일명의 가장 뒤에 _bak를 붙여서 반환할 것.
 * 
 * 예) "test.txt"가 입력되면 -> "test_bak.txt"가 되어 반환 될 것. "test"가 입력되면 "test_bak"가
 * 반환될 것
 * 
 * 
 * 2. 아래의 CSV데이터를 매개변수로 입력받아 배열로 반환하는 일을 하는 method를 작성하고 호출하세요. String
 * csvData="고한별,김도원,김동섭,김무영~김현종 박시현,손지민,김병년.김일신"; *김씨는 성을 제외하고 이름만 넣어 반환할 것
 * 
 * 3. 0,1,2,3을 입력받는 method를 작성하고 문자열로 날짜를 반환해보세요. 반환되는 날짜형식을 "년-월-일 시:분:초 요일"
 * 입력되는 0,1,2,3은 아래의 국가 날짜로 설정되어 반환되어야한다. 0 - 한국 , 1 - 미국, 2 - 일본, 3 - 캐나다 유효성
 * 검사 ) 입력되는 값이 0,1,2,3이 아니면 0으로 설정하여 업무처리 할 것.
 * 
 * 
 */
public class HomeWork {

	public String fileName(String fileName) {

		String result = null;
		String tempFront = null;
		String tempBack = null;

		if (fileName.lastIndexOf('.') == -1) {

			result = fileName + "_bak";

		} else {
//			result.insert(result.lastIndexOf("."),"_bak");
		}

		return result;
	}// fileName
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String[] csvData() {

		String data = "고한별,김도원,김동섭,김무영~김현종 박시현,손지민,김병년.김일신";

		StringTokenizer st = new StringTokenizer(data, ",~ .");

		int tokenCnt = st.countTokens();

		String[] arr = new String[tokenCnt];

		int i = 0;

		while (st.hasMoreTokens()) {

			arr[i] = st.nextToken();

			i++;
		} // end while

		for (int j = 0; j < arr.length; j++) {

			if (arr[j].startsWith("김")) {
				arr[j] = arr[j].substring(1);
			}

		}
		return arr;

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String date(int num) {
		if (!(num == 0 || num == 1 || num == 2 || num == 3)) {
			num = 0;
		}
		
		Locale[] loc = {Locale.KOREA, Locale.US, Locale.JAPAN, Locale.CANADA};
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s EEEE", loc[num]);
		return sdf.format(new Date());
	}

	public static void main(String[] args) {
		HomeWork hw = new HomeWork();
		System.out.println("-------------------------------------------------");
		System.out.println(hw.fileName("test.text.txt"));
		System.out.println("-------------------------------------------------");
		for (String arr : hw.csvData()) {
			System.out.println(arr);
		}
		System.out.println("-------------------------------------------------");
		System.out.println(hw.date(0));// korea
		System.out.println(hw.date(1));// america
		System.out.println(hw.date(2));// japan
		System.out.println(hw.date(3));// canada
		System.out.println(hw.date(4));// 유효성 검사
	}// main

}// class
