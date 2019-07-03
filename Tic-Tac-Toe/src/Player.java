import java.util.Scanner;

public class Player extends EnvironmentVariables{
	private char token = ' ';
	
	public void setToken(char token) {
		this.token = (token);
	}

	public String getPlayerMove(GameBoard gameBoard) {
		Scanner input = new Scanner(System.in);
		String move = "";
		
		System.out.println("Where do you want to move? Please input your move as follows ROW#COLUMN#.");
		System.out.println("So, if you wanted to play in the middle, you'd input 11");
		
		move = input.nextLine();
		
		while(move.length() != 2 || Character.getNumericValue(move.charAt(0)) > 2 || Character.getNumericValue(move.charAt(1)) > 2 || 
				!gameBoard.isValidMove(Character.getNumericValue(move.charAt(0)), Character.getNumericValue(move.charAt(1)))){
			
			System.out.println("Please input a valid  move:");
			
			move = input.nextLine();
		}
		
		return move;
		
	}
	
}
