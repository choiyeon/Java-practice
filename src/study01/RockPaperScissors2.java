package study01;

import java.util.Scanner;

public class RockPaperScissors2 {
	private int count;
	public final String ROCK = "바위";
	public final String PAPER = "보";
	public final String SCISSORS = "가위";

	public String randomChoice() {
		String[] rpsList = { SCISSORS, ROCK, PAPER };
		return rpsList[(int) (Math.random() * 3)];
	}// randomChoice

	public String player() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\"가위\" \"바위\" \"보\"  중 선택");
		String playerChoice = scanner.nextLine();
		return playerChoice;
	}// player

	public String computer() {
		String computerChoice = randomChoice();
		return computerChoice;
	}// computer
	
	public boolean playerCheck() {
//		while (player().hasNext()) {
//			}
		return false;
	}//playerCheck

	public void play() {
		String result = "";
		count = 0;
		do {
			String playerChoice = player();
			String computerChoice = computer();
			System.out.println("플레이어 : " + playerChoice + " 컴퓨터 : " + computerChoice);

			if (playerChoice.equals(computerChoice)) {
				result = "무승부";
			} else if (playerChoice.equals(SCISSORS)) {
				switch (computerChoice) {
				case PAPER:
					result = "플레이어 승";
					break;

				case ROCK:
					result = "플레이어 패";
					break;
				}
			} else if (playerChoice.equals(ROCK)) {
				switch (computerChoice) {
				case SCISSORS:
					result = "플레이어 승";
					break;

				case PAPER:
					result = "플레이어 패";
					break;
				}
			} else if (playerChoice.equals(PAPER)) {
				switch (computerChoice) {
				case ROCK:
					result = "플레이어 승";
					break;

				case SCISSORS:
					result = "플레이어 패";
					break;
				}
			} else {
				result = "error";
			}
			count++;

			System.out.println(count + " 번째 게임 " + result);
		} while (count < 3);
		System.out.println("\n가위바위보 끝");
	}// play

	public static void main(String[] args) {
		RockPaperScissors2 rps = new RockPaperScissors2();
		System.out.println("가위바위보를 시작합니다.\n");
		rps.play();

	}// main

}// class
