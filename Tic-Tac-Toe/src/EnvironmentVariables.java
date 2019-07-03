import java.util.Random;
import java.util.Scanner;

public class EnvironmentVariables {
	
	
	private char playerToken;
	private char computerToken;
	private boolean gameOver;
	private boolean playerMove;
	
	EnvironmentVariables(){
		
		this.playerToken = 'P';
		this.computerToken= 'C';
		this.gameOver = false;
		this.playerMove = false;
		
	}
	public Computer setDifficulty() {
		Scanner input = new Scanner(System.in);
		String difficulty = "unknown";
		
		System.out.println("First things first, you're going to have to choose a difficulty!");
		
		while(!difficulty.equalsIgnoreCase("easy") && !difficulty.equalsIgnoreCase("medium") && !difficulty.equalsIgnoreCase("hard")) {
			System.out.println("Would you like to play on easy, medium, or hard?");
			
			difficulty = input.nextLine().toLowerCase();
		}
		
		switch(difficulty) {
			case "easy":
				return new EasyComputerPlayer();
		case "medium":
				return new MediumComputerPlayer();
			case "hard":
				return new HardComputerPlayer();
		}
		
		return null;
	}
	
	public void setTokens() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ok perfect! now would you like to be X or O?");
		
		do{
			this.playerToken = Character.toUpperCase((input.nextLine()).charAt(0));
		}while(this.playerToken != 'X' && this.playerToken != 'O');
		
		switch (playerToken) {
		
			case 'X':
				this.computerToken = 'O';
				break;
			
			case 'O':
				this.computerToken = 'X';
				break;
		}
	}
	
	public void setFirstPlayer() {
		int randomInt;
		Random randomNumberGenerator = new Random();
		
		System.out.println("In the essence of fairness, we are going to randomly determine who goes first, you or the computer.");
		System.out.println("\nThe system will generate a random number, if the number is even you get to go first. \nIf its odd, well, the odds aren't in your favor and the computer gets to go first.");
		
		randomInt = randomNumberGenerator.nextInt();
		
		if(randomInt %2 == 0) {
			this.setPlayerMove(true);
			
			System.out.println("\nThe system generated the number "+randomInt+" since this is even, you get to go first!");
			
		}else {
			this.setPlayerMove(false);
			
			System.out.println("The system generated the number "+randomInt+" since this is not even, the Computer gets to go first.");
		}
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	public boolean isPlayerMove() {
		return playerMove;
	}

	public void setPlayerMove(boolean playerMove) {
		this.playerMove = playerMove;
	}
	
	public char getComputerToken() {
		return computerToken;
	}
	
	public char getPlayerToken() {
		return this.playerToken;
	}
}
