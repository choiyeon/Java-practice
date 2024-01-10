package day0110;

/**
 *MakerPen클래스를 제공하는 기능(일) 사용하기 위한 클래스
 * 
 */
public class UseMarkerPen {
	

	public static void main(String[] args) {

		//객체화
		MarkerPen black = new MarkerPen();
		System.out.println("주소 : " + black);
		
		//변수에 값을 할당 => 입력값을 체크하는 코드를 중복해서 작성해야한다.(비효율적)
		System.out.printf("뚜껑의 개수 %d개, 몸체의 수 %d개, 색 %s색 \n", black.getCap(), black.getBody(), black.getColor());
			
		
		//클래스가 제공하는 기능 사용.
		String snow = black.write("눈 내리면 집갈 때 길 막히는 데");
		System.out.println(snow);
		
		System.out.println("");
		//파란색 마커팬을 생성하고 오늘은 맑은 수요일을 칠판에 써보는 코드 작성
		MarkerPen blue = new MarkerPen(1, 1, "파란");//검은색

		snow = blue.write("오늘은 수요일");
		System.out.println(snow);
		
	}

}
