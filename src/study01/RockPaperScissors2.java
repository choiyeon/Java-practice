package study01;

public class RockPaperScissors2 {
	private int count;
	public final String ROCK = "바위";
	public final String Paper = "보";
	public final String Scissors = "가위";

	public String randomChoice() {
		String[] rpsList = { Scissors, ROCK, Paper };
		return rpsList[(int) (Math.random() * 3)];
	}// randomChoice

	public String player() {
		String playerChoice = randomChoice();
		return playerChoice;
	}// player

	public String computer() {
		String computerChoice = randomChoice();
		return computerChoice;
	}// computer

	public void play() {
		String result = "";
		count = 0;
		do {
			String playerChoice = player();
			String computerChoice = computer();

			if (playerChoice.equals(computerChoice)) {
				result = "무승부";
			} else if (playerChoice.equals(Scissors)) {
				switch (computerChoice) {
				case Paper:
					result = "플레이어 승";
					break;

				case ROCK:
					result = "플레이어 패";
					break;
				}
			} else if (playerChoice.equals(ROCK)) {
				switch (computerChoice) {
				case Scissors:
					result = "플레이어 승";
					break;

				case Paper:
					result = "플레이어 패";
					break;
				}
			} else if (playerChoice.equals(Paper)) {
				switch (computerChoice) {
				case ROCK:
					result = "플레이어 승";
					break;

				case Scissors:
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
