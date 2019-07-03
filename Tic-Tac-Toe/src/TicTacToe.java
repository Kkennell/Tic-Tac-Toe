import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		GameBoard gameBoard = new GameBoard();
		Player player = new Player();
		Computer computer;
		EnvironmentVariables settings = new EnvironmentVariables();
		
		System.out.println("Thank you for playing my Tic-Tac-Toe game!");
		System.out.println("The purpose of this game is to get three in a row, either horizontally, vertically, or diagonally.");
		
		computer = settings.setDifficulty();
		settings.setTokens();
		settings.setFirstPlayer();

		while(!settings.isGameOver()) {
			
			System.out.println("The current game board is:");
			gameBoard.displayCurrentGameBoard();
			
			if(settings.isPlayerMove()) {
				String move = player.getPlayerMove(gameBoard);
				int row = Character.getNumericValue(move.charAt(0));
				int column = Character.getNumericValue(move.charAt(1));
				gameBoard.setMove(row, column, settings.getPlayerToken());
				settings.setPlayerMove(false);
			}
				
			else {
				int[] move = computer.getMove(gameBoard);
				gameBoard.setMove(move[0], move[1], settings.getComputerToken());
				settings.setPlayerMove(true);
			}
			
			if(gameBoard.checkWinConditions(settings.getPlayerToken())) {
				
				System.out.println("It looks like you won! Congratulations!");
				gameBoard.displayCurrentGameBoard();
				settings.setGameOver(true);
				
			}else if(gameBoard.checkWinConditions(settings.getComputerToken())) {
				
				System.out.println("Oh, sorry, it looks like the Computer beat you this time.");
				gameBoard.displayCurrentGameBoard();
				settings.setGameOver(true);
				
			}
			
		}
	
	}
}
