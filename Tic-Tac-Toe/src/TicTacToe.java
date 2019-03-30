import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		char player=' ', computer=' ';
		char[][] gameBoard = new char[3][3];
		Scanner input = new Scanner(System.in);
		Random randomNumberGenerator = new Random();
		String difficulty;
		Boolean gameOver = false, playerMove = false;
		int randomInt = 0;
		
		System.out.println("Thank you for playing my Tic-Tac-Toe game!");
		System.out.println("the purpose of this game is to get three in a row, either horizontally, vertically, or diagonally.");
		System.out.println("First things first, would you like to play on easy, medium, or hard?");
	
		difficulty = input.nextLine();
		
		System.out.println("Ok perfect! now would you like to be X or O?");
		
		player = Character.toUpperCase((input.nextLine()).charAt(0));
		
		switch (player) {
		
		case 'X':
			computer = 'O';
			break;
		
		case 'O':
			computer = 'X';
			break;
		
		default:
			System.out.println("You can only be X or O, lets not get crazy here!");
		}
		
		System.out.println("In the essence of fairness*, we are going to randomly determine who goes first, you or the computer.");
		System.out.println("*The probability of the first player winning a game of tic tac toe \r\n" +
				"was posed by F. E. Clark of Rutgers University as Problem \r\n" + 
				"E1324 in the American Mathematical Monthly, June-July 1958, Vol. 65, \r\n" + 
				"No. 6, p. 447. A solution by T. M. Little of the University of \r\n" + 
				"California was published on pp. 144-145 of the February 1959 issue. \r\n" + 
				"According to Little's calculation the first player wins with \r\n" + 
				"probability 737/1260, the second player wins with probability 363/1260, \r\n" + 
				"the probability of a draw is 160/1260; the probability of the game \r\n" + 
				"ending on the 5th, 6th 7th, 8th, 9th turn is 120/1260, 111/1260, \r\n" + 
				"333/1260, 252/1260, 284/1260.");
		
		System.out.println("\n The system will generate a random number, if the number is even you get to go first. \n If its odd, well, the odds aren't in your favor and the computer gets to go first.");
		
		randomInt = randomNumberGenerator.nextInt();
		
		if(randomInt %2 == 0) {
			playerMove = true;
			
			System.out.println("The system generated the number "+randomInt+" since this is even, you get to go first!");
			
		}else {
			playerMove = false;
			
			System.out.println("The system generated the number "+randomInt+" since this is not even, the Computer gets to go first.");
		}
		
		
		gameBoard = initGameBoard(gameBoard);
		
		while(!gameOver) {
			
			displayBoard(gameBoard);
			
			if(playerMove) {
				gameBoard = makePlayerMove(gameBoard, player);
				playerMove = false;
			}
				
			else {
				gameBoard = makeComputerMove(gameBoard, difficulty, computer);
				playerMove = true;
			}
			
			gameOver = checkWinCondition(gameBoard);
			
		}
	
	}
		
	private static Boolean checkWinCondition(char[][] gameBoard) {
		
		//check rows
		for(int i=0; i<3; i++)
		{
			if(gameBoard[i][0] == gameBoard [i][1] && gameBoard[i][1] == gameBoard [i][2] && gameBoard[i][0] == gameBoard[i][2]) {
				return true;
			}
		}
		
		//check columns
		
		for(int i=0; i<3; i++)
		{
			if(gameBoard[0][i] == gameBoard [1][i] && gameBoard[1][i] == gameBoard [2][i] && gameBoard[0][i] == gameBoard[2][i]) {
				return true;
			}
		}
		
		//check diagonals
		if(gameBoard[0][0] == gameBoard [1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] == gameBoard[2][2]) {
			
			return true;
		}
		else if(gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2] && gameBoard[2][0] == gameBoard[0][0]) {
			
			return true;
		}
		
		return false;
	}

	private static char[][] makeComputerMove(char[][] gameBoard, String difficulty, char computer) {
		
		switch (difficulty.toLowerCase()) {
		case "easy":
			
			break;
		case "medium":
			
			break;
		case "hard":
			
			break;
		}
		
		
		return gameBoard;
	}

	private static char[][] makePlayerMove(char[][] gameBoard, char player) {
		// TODO Auto-generated method stub
		return gameBoard;
	}

	
	public static char[][] initGameBoard(char[][] gameBoard){
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<3; j++) {
			
				gameBoard[i][j] = ' ';

			}
		}
		
		return gameBoard;
	}
	
	public static void displayBoard(char[][] gameBoard) {
		
		System.out.println("The current game board is:");
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<3; j++) {
				
				System.out.print(" "+gameBoard[i][j]);
				
				if(j == 0 || j== 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();
		
			if(i==0 || i==1) {		
				
				System.out.println("------------");

			}		
		}
	}
}
