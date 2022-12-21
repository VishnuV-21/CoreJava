package com.guessergame;

import java.util.Scanner;



class Guesser{
	int guesserGuess1;
	
	public  int guesserguessed() {
		Scanner sc=new Scanner(System.in);
		guesserGuess1=sc.nextInt();
		return guesserGuess1;
	}
}

class Player{
	int numberGuessedByPlayer;
	
	public int playerPleaseGuess() {
		Scanner sc1=new Scanner(System.in);
		numberGuessedByPlayer=sc1.nextInt();
		return numberGuessedByPlayer;
	}
}

class Umpire {
	
	int numFromGuesser1;
	int numFromPlayers1;
	int numFromPlayers2;
	int numFromPlayers3;
	
	
	
	public void startGame() {
		System.out.println("Is everyOne ready to Play");
		GameAnnouncements ga1=new GameAnnouncements();
		ga1.startingAnnouncement();
	}
	public void getNumFromGuesser() {
		System.out.println("Guesser Please guess a Number");
		Guesser guesser =new Guesser();
		numFromGuesser1 = guesser.guesserguessed();
	}
	public void playerStartToGuessTheNumber() {

		Player player1=new Player();
		Player player2=new Player();
		Player player3=new Player();
	System.out.println("Player 1 please guess the number which the guesser guessed");
	numFromPlayers1=	player1.playerPleaseGuess();
	System.out.println("Player 2 please guess the number which the guesser guessed");
	numFromPlayers2=	player2.playerPleaseGuess();
	System.out.println("Player 3 please guess the number which the guesser guessed");
	numFromPlayers3=	player3.playerPleaseGuess();
	}

	public void whoIsWinner() {
		// TODO Auto-generated method stub
		if (numFromGuesser1== numFromPlayers1) {
			if (numFromGuesser1 == numFromPlayers2 && numFromGuesser1 == numFromPlayers3) {
				System.out.println("Game tied, Everyone wins");
			} else if (numFromGuesser1 == numFromPlayers2) {
				System.out.println("Player 1 and 2 are the winners");
			} else if (numFromGuesser1 == numFromPlayers3) {
				System.out.println("Player 1 and 3 are the winners");
			} else {
				System.out.println("Player 1 is the winner");
			}
		} else if (numFromGuesser1==numFromPlayers2) {
			if (numFromGuesser1==numFromPlayers3) {
				System.out.println("Player 2 and 3 are the winners");
			} else {
				System.out.println("Player 2 is the winner");
			}
		} else {
			System.out.println("Player 3 is the winner");
		}
	}
}
class GameAnnouncements{
	int str1;
	String choice;
	public void startingAnnouncement() {
		System.out.println("Type 'Yes' is you are ready and 'No' if you are not");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextLine();
		if(choice.equalsIgnoreCase("yes")) {
			Umpire umpire=new Umpire();
			umpire.getNumFromGuesser();
			umpire.playerStartToGuessTheNumber();
			umpire.whoIsWinner();
		}
		else {
			System.out.println("The crowd doesnt want to start the game. Bye Bye ");
			System.exit(0);
		}
			
	}
}
public class Main {

	public static void main(String[] args) {
		Umpire mainUmpire=new Umpire();
		mainUmpire.startGame();
		
	}

}
