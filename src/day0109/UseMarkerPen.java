package day0109;

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
		black.setCap(10);
		black.setBody(1);
		black.setColor("그레이");
		System.out.printf("뚜껑의 개수 %d개, 몸체의 수 %d개, 색 %s색 \n", black.getCap(), black.getBody(), black.getColor());
			
		
		//클래스가 제공하는 기능 사용.
		String snow = black.write("눈 내리면 집갈 때 길 막히는 데");
		System.out.println(snow);
		
	}

}
