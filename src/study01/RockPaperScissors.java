package study01;

import java.util.*;

/**
 *가위바위보<br>
 *출력 형식<br>
 *N번째 게임 승패무승부
 */
public class RockPaperScissors {
	
	/**
	 * 플레이어한테 가위, 바위, 보 중 하나 받기
	 * @return 플레이어의 가위바위보
	 */
	public String player() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\"가위\" \"바위\" \"보\"  중 선택");
		String playChoice = scanner.nextLine();
		return playChoice;
	}//player
	
	/**
	 * 컴퓨터가 가위, 바위, 보 중 하나 랜덤 선택
	 * @return 컴퓨터의 가위바위보
	 */
	public String computer() {
		String[] rpsList = {"가위","바위","보"};//배열에 가위 바위 보 넣기
		Random ran = new Random(); 
		
		int i = ran.nextInt(3); //랜덤하게 0~3에서 선택
		String comChoice = rpsList[i]; //String(가위, 바위, 보) 반환
		return comChoice;
	}//computer

	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		
		
//		4. 플레이어와 컴퓨터 가위바위보
//		-플레이어의 입력이 옳은지 확인
//		선택 오류시 illegalargumentexception
		int count = 0;
		while (true) {
			//플레이어의 가위바위보 입력받기
			System.out.println(rps.player());
			//컴퓨터의 가위바위보 선택
			System.out.println(rps.computer());
			//플레이어의 입력이 옳은지 검사
			// 입력이 옳으면 가위바위보 시작
			if (rps.player().equals("가위") || rps.player().equals("바위") || rps.player().equals("보")) {
				count++;
				String result = "";
				if (rps.player() == rps.computer()) {
					System.out.println("비겼습니다.");
				}else if(rps.player().equals("가위")) {
					switch (rps.computer()) {
					case "바위": result = "졌습니다.";
						break;
					case "보": result = "이겼습니다.";
						break;
					}//switch
				}else if(rps.player().equals("바위")) {
					switch (rps.computer()) {
					case "보": result = "졌습니다.";
						break;
					case "가위": result = "이겼습니다.";
						break;
					}//switch
				}else if(rps.player().equals("보")) {
					switch (rps.computer()) {
					case "가위": result = "졌습니다.";
						break;
					case "바위": result = "이겼습니다.";
						break;
					}//switch
				}
				
				// 무한루프, 3번 후 종료여부

			} else {
				throw new IllegalArgumentException("\"가위\" \"바위\" \"보\" 중에서 선택해주세요");
			} // else
		} // while
//		6. 3번 후 종료 여부 묻기
//		3번 후 종료 여부 묻기
//		int count = 0;
//		count++ 3의 배수시 종료여부 
		// 반복할 내용
		/*플레이어한테 입력받기
		 * 컴퓨터 랜덤 뽑고
		 * 입력 검사하고
		 * 가위방위보 결과 띄우고
		 * 3번이면 여부 묻기*/

		

		
	}//main

}//class
