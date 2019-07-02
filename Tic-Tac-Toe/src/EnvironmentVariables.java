import java.util.Random;
import java.util.Scanner;

public class EnvironmentVariables {
	
	private String difficulty;
	private char playerToken;
	private char computerToken;
	private boolean gameOver;
	private boolean playerMove;
	
	public void setDifficulty() {
		Scanner input = new Scanner(System.in);
		this.difficulty = "Choose";
		
		System.out.println("First things first, you're going to have to choose a difficulty!");
		
		while(!difficulty.equalsIgnoreCase("easy") && !difficulty.equalsIgnoreCase("medium") && !difficulty.equalsIgnoreCase("hard")) {
			System.out.println("Would you like to play on easy, medium, or hard?");
			
			this.difficulty = input.nextLine();
		}
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
		
		System.out.println("In the essence of fairness*, we are going to randomly determine who goes first, you or the computer.");
		System.out.println("\n The system will generate a random number, if the number is even you get to go first. \n If its odd, well, the odds aren't in your favor and the computer gets to go first.");
		
		randomInt = randomNumberGenerator.nextInt();
		
		if(randomInt %2 == 0) {
			this.setPlayerMove(true);
			
			System.out.println("The system generated the number "+randomInt+" since this is even, you get to go first!");
			
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
}
