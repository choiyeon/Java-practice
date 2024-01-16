package day0116;

public class UseStudent {

	public static void main(String[] args) {
		StudentInfoVo siVo = 
				new StudentInfoVo(1, "루피", 182.4, 65.5, "test@test.com");
		StudentInfoVo siVo2 = 
				new StudentInfoVo(2, "상디", 192.4, 80.5, "test2@test.com");
		
		System.out.println(siVo.getNum() + " " + siVo.getName() + " " + siVo.getHeight() + " " + siVo.getWeight() + " " + siVo.getEmail());
		System.out.println(siVo2.getNum() + " " + siVo.getName() + " " + siVo.getHeight() + " " + siVo.getWeight() + " " + siVo.getEmail());
	}

}
