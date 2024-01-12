package day0112;

/**
 *숙제.
-아래의  작업을 instance method로 만들어 사용하는 class를 작성하고, 사용해보세요.
  주민번호의 형식은 xxxxxx-xxxxxxx (예)950111-1234567, 240111-3456789) 입니다.

1. 주민번호를 입력받아 instance 변수에 저장하는 생성자를 생성하세요.

2. 인스턴스 변수에 저장된 주민번호의 글자수가 14자리인 지를 체크하여 boolean으로 반환하는 일 을하는 
    method를 작성하세요.

3. 인스턴스 변수에 저장된  주민번호의 7번째 인덱스에 
   –가 있는지 체크하여 boolean으로 반환하는 일을 하는 method를 작성하세요.

4. 인스턴스 변수에 저장된 주민 번호에서 생년월일을 연산하여 문자열로 반환하는 일을 하는
   method를 작성하세요.
   반환예 )
    입력된 주민번호가 950102-123456이라면 1995년 01월 02일로 반환되어야 합니다.
     판단 기준 ) –뒤의 문자가 1,2,5,6이 라면 1900년 대생, 3,4,7,8 이라면 2000년 대생 , 9,0이라면 1800년 대생

5.입력된 주민번호에서 나이를 구해서 정수로 반환하는 method를 작성하세요.

6.입력된 주민번호에서 성별을 구해 문자열로 반환하는 method를 작성하세요.
   판단기준) – 뒤의 문자가  1,3,5,7,9 – 남자, 2,4,6,8,0 – 여자

7. 입력된 주민번호에서 띠를 구하여 문자열로 반환하는 method를 작성하세요.
 
 */
public class UseIdHomeWork {

	public static void main(String[] args) {
		//주민번호 입력
		String idNum = "950101-1234567";
		//객체생성
		IdHomeWork useId = new IdHomeWork(idNum);
		
		//method 호출
		if (useId.checkIdNum()) {//2. 주민번호 14자리 체크
			if(useId.checkHyphen()) {//3. 7번째 자리가 '-'인지 체크
				System.out.println(useId.idBirth());//4. 생일 출력
				System.out.println(useId.idAge());//5. 나이 출력
				System.out.println(useId.idSex());//6. 성별 출력
				System.out.println(useId.idZodiac());//7. 띠 출력
			}else {
				System.out.println("'-'의 위치가 올바르지 않습니다.");
			}
		}else {
			System.out.println("주민번호의 자릿수가 잘못되었습니다.");
		}
	}//main
}//class
