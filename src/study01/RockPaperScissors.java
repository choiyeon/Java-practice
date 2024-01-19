package study01;

import java.util.*;

/**
 * 가위바위보<br>
 * 출력 형식<br>
 * N번째 게임 플레이어 승 패 무승부
 */
public class RockPaperScissors {

	/**
	 * 플레이어한테 가위, 바위, 보 중 하나 받기
	 * 
	 * @return 플레이어의 가위바위보
	 */
	public String player() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("\"가위\" \"바위\" \"보\"  중 선택");
//		String playChoice = scanner.nextLine();
//		return playChoice;
		return "가위";
	}// player

	/**
	 * 컴퓨터가 가위, 바위, 보 중 하나 랜덤 선택
	 * 
	 * @return 컴퓨터의 가위바위보
	 */
	public String computer() {
		String[] rpsList = { "가위", "바위", "보" };// 배열에 가위 바위 보 넣기
		Random ran = new Random();

		int i = ran.nextInt(3); // 랜덤하게 0~3에서 선택
		String comChoice = rpsList[i]; // String(가위, 바위, 보) 반환
		return comChoice;
	}// computer

	public String fight() {
		int count = 0;
		String result = "";

		// 플레이어의 가위바위보 입력받기
		System.out.println("플레이어 : " + player());// 나중에 형식 바꾸기
		// 컴퓨터의 가위바위보 선택
		System.out.println("컴퓨터 : " + computer());// 나중에 형식 바꾸기

		// 플레이어의 입력이 옳은지 검사. 입력이 옳으면 가위바위보 시작
		if (player().equals("가위") || player().equals("바위") || player().equals("보")) {
			if(player().equals("가위") && computer().equals("가위")) {
					result = "무승부";
				}else if(player().equals("가위") && computer().equals("바위")) {
					result = "플레이어 패";
				}else if(player().equals("가위") && computer().equals("보")) {
					result = "플레이어 승";
		
		
			}else {
				result = "??";
			}

//			if (player().equals(computer())) {
//				System.out.println("무승부");
//
//			} else if (player().equals("가위")) {
//				switch (computer()) {
//				case "바위":
//					result = "플레이어 패";
//					break;
//				case "보":
//					result = "플레이어 승";
//					break;
//				}// switch
//
//			} else if (player().equals("바위")) {
//				switch (computer()) {
//				case "보":
//					result = "플레이어 패";
//					break;
//				case "가위":
//					result = "플레이어 승";
//					break;
//				}// switch
//
//			} else if (player().equals("보")) {
//				switch (computer()) {
//				case "가위":
//					result = "플레이어 패";
//					break;
//				case "바위":
//					result = "플레이어 승";
//				}// switch
//			} // if

	count++;
	// 무한루프, 3번 후 종료여부

	} // if

	return count+"번째 게임 "+result;

	}// fight
//				throw new IllegalArgumentException("\"가위\" \"바위\" \"보\" 중에서 선택해주세요");

	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		System.out.println(rps.fight());

//		4. 플레이어와 컴퓨터 가위바위보
//		-플레이어의 입력이 옳은지 확인
//		선택 오류시 illegalargumentexception

//		6. 3번 후 종료 여부 묻기
//		3번 후 종료 여부 묻기
//		int count = 0;
//		count++ 3의 배수시 종료여부 

	}// main

}// class
