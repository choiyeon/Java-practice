package day0103;
//숙제

/*
 * 제시된 요금표를 사용하여 아래 출력 코드를 작성 대중 교통수단과 이동거리를 입력받아 처리하는 프로그램을 제작. 입력한 대중교통 수단이
 * "마을버스", "버스", "지하철"인 경우에만 아래의 출력형식으로 출력, 그렇지 않다면 "대중교통 수단이 아닙니다." 출력.
 * 
 * 출력 형식) 입력하신 교통수단은 [xx]이고, 이돌거리는 [xx km]입니다. 교통수단의 기본요금 : []원 편도요금 : []원 
 * 왕복요금 : []원 한달 20일 기준 총 교통 요금은 []원 입니다.
 * 
 * 요금표 // 이동거리가 10km까지는 기본요금으로 처리되지만, 10km를 초과하면 매 5km마다 100원이 가산된다. 마음버스 1200원
 * 스토어 버스 1500원 지하철 1400원
 * 
 * 코딩이 완료되면 flowchart 그려보기
 */

public class HomeWork {
	public static final int VILLAGE_BUS_FEE = 1200;
	public static final int BUS_FEE = 1500;
	public static final int SUBWAY_FEE = 1400;

	public static void main(String[] args) {

		String traffic = args[0];
		int distance = Integer.parseInt(args[1]);// 문자열 20을 받아서 숫자20으로 바꿈

		System.out.println("입력하신 교통수단은 " + traffic + "이고, 이동거리는 " + distance + "km입니다.");

		// 20km if 이동거리<=10 기본요금, if 이동거리>10 기본요금+(이동거리-10)/5*100
		int trafficFee = 0;
		
		if (traffic.equals("마을버스")) {
			trafficFee = VILLAGE_BUS_FEE;
		} else if (traffic.equals("버스")) {
			trafficFee = BUS_FEE;
		} else if (traffic.equals("지하철")) {
			trafficFee = SUBWAY_FEE;
		}

		int addFee = 0;
		
		if (distance > 10 && distance % 5 == 0) {
			addFee = (distance - 10) / 5 * 100;
		} else if (distance > 10 && distance % 5 != 0) {
			addFee = ((distance - 10) / 5 + 1) * 100;
		} // 이동거리가 10km이상일 때 추가요금

		System.out.println(traffic + "의 기본요금은 " + trafficFee + "원입니다.");
		System.out.println(traffic + "의 편도요금은 " + (trafficFee + addFee) + "원입니다.");
		System.out.println(traffic + "의 왕복요금은 " + ((trafficFee + addFee) * 2) + "원입니다.");
		System.out.println(traffic + "의 한달(20일 기준) 교통 요금은 " + ((trafficFee + addFee) * 2 * 20) + "원입니다.");

	}// main

}// class
