import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		GameBoard gameBoard = new GameBoard();
		Player player = new Player();
		Computer computer = new Computer();
		EnvironmentVariables settings = new EnvironmentVariables();
		
		System.out.println("Thank you for playing my Tic-Tac-Toe game!");
		System.out.println("The purpose of this game is to get three in a row, either horizontally, vertically, or diagonally.");
		
		gameBoard.setupGameBoard();
		
		settings.setDifficulty();
		settings.setTokens();
		settings.setFirstPlayer();

		while(!settings.isGameOver()) {
			
			gameBoard.displayCurrentGameBoard();
			
			if(settings.isPlayerMove()) {
				player.makePlayerMove(gameBoard);
				settings.setPlayerMove(false);
			}
				
			else {
				computer.makeComputerMove(gameBoard);
				settings.setPlayerMove(true);
			}
			
			settings.setGameOver(gameBoard.checkWinConditions());
			
		}
	
	}
}
