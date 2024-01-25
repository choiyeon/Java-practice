package day0123;

import java.time.LocalDate;
import java.util.Calendar;

public class HomeWork2 {
	
	public static final int START_DAY = 1;
    public HomeWork2() {

    }

    /*
     * <문제 1>
     * Calendar 클래스를 사용하여 1월의 달력 출력하기
     * String[] dates = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"
     */
    public void question1() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 4);//원하는 달보다 1하나 적게 설정
        System.out.println("=======================1월=======================");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        
        int day = 0;
        int dayOfWeek = 0;//요일 저장
        
        StringBuilder sb = new StringBuilder();
        for (int tempDay = 1; ; tempDay++) {//끝나는 날 모른다 가정
        	//일이 증가하는 것을 달력 객체에 설정
        	cal.set(Calendar.DAY_OF_MONTH, tempDay);
        	day = cal.get(Calendar.DAY_OF_MONTH);//설정된 일자 day에 넣기
        	if(day != tempDay) {//설정된 일자와 임시일자가 같지 않으면
        		//월이 끝났기 때문에 반복문 탈출 
        		//tempDay는 계속증가하지만, day는 마지막일이 지나면 다음달 1일 시작함.
        		//서로 값이 다르다는 것은 그 달의 마지막날이 지났다는 것.
        		break;
        	}//빠져나가는 조건
        	
        	dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);//설정된 일자의 요일 얻기
        	switch(day) {
        	case START_DAY :
        		//1일을 출력하기 전에 공백 출력
        		for(int i = 1; i < dayOfWeek; i++) {
        			sb.append("\t");
        		}//for
        	}//switch
        	
        	sb.append(day).append("\t");//일자 출력
        	
        	switch (dayOfWeek) {//설정된 일자가
        	case Calendar.SATURDAY://토요일이면 줄바꿈
        		sb.append("\n");
        	}//switch
        }
        System.out.println(sb);
    }//question1

    /*
     * <문제 2>
     * 매개변수로 년, 월을 입력받아 해당 년, 월에 대한 마지막 일까지를 일차원 배열에 할당하여
     * 반환하는 작업을 하는 method 작성
     * - lengthOfMonth 사용
     */
    public int[] question2(int year, int month) {
        LocalDate lDate1 = LocalDate.of(year, month, 1);
        int endOfMonth = lDate1.lengthOfMonth();
        int[] dayPerMonth = new int[endOfMonth];

        for (int i = 0; i < endOfMonth; i++) {
            dayPerMonth[i] = i + 1;
        }

        return dayPerMonth;
    }

    public static void main(String[] args) {
    	HomeWork2 myHW = new HomeWork2();
        myHW.question1();
        System.out.println("\n============================================================");
        int[] january = myHW.question2(2024, 2);
        for (int i : january) {
            System.out.print(i + " ");
        }
    }
}
