package mixedprograms;

import java.util.Scanner;

class Guesser {
	int guessNum;

	int guessingNumber() {

		Scanner scan = new Scanner(System.in);
		System.out.println("gusser! kindly guess the number");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Player {
	int guessNum;

	int playerGuessingNumber() {

		Scanner scan = new Scanner(System.in);
		System.out.println("plyer! kindly guess the number");
		guessNum = scan.nextInt();
		return guessNum;
	}

}

class Umpire {

	int numFromGuesser;

	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void collectNumFromGuesser() {

		Guesser guess = new Guesser();
		numFromGuesser = guess.guessingNumber();
	}

	void collectNumFromPlayer() {

		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.playerGuessingNumber();
		numFromPlayer2 = p2.playerGuessingNumber();
		numFromPlayer3 = p3.playerGuessingNumber();

	}

	void compare() {

		if (numFromGuesser == numFromPlayer1) {

			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All players 1,2,3 winners");
				collectNumFromGuesser();
				collectNumFromPlayer();
				compare();
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("player 1 and 2 are won the game");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("player 1 and 3 are won the game");
			} else {
				System.out.println("player 1 won the game");
			}

		}

		else if (numFromGuesser == numFromPlayer2) {
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("player 2 and 3 are winner");
				collectNumFromGuesser();
				collectNumFromPlayer();
				compare();
			}else {
				System.out.println("player 2 won the game");
			}
			
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("player 3 won the game");
		} else {
			System.out.println("player no one won the game");
		}

	}

}

public class Game {

	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}
