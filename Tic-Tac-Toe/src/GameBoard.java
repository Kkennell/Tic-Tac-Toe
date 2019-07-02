
public class GameBoard {
	
	private char[][] gameBoard;
	
	public void setupGameBoard() {
		gameBoard = new char[3][3];
		initializeGameBoard();
	}
	
	private void initializeGameBoard() {
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				this.gameBoard[i][j] = ' ';
			}
		}
	}
	
	public void displayCurrentGameBoard() {
		
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

	public boolean checkWinConditions() {		
		return checkRows() || checkColumns() || checkDiagonals();
	}
	
	private boolean checkRows() {
		for(int i=0; i<3; i++)
		{
			if(this.gameBoard[i][0] == this.gameBoard[i][1] && this.gameBoard[i][1] == this.gameBoard[i][2] && this.gameBoard[i][0] == this.gameBoard[i][2]) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean checkColumns() {
		for(int i=0; i<3; i++)
		{
			if(this.gameBoard[0][i] == this.gameBoard[1][i] && this.gameBoard[1][i] == this.gameBoard[2][i] && this.gameBoard[0][i] == this.gameBoard[2][i]) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkDiagonals() {
		if(this.gameBoard[0][0] == this.gameBoard[1][1] && this.gameBoard[1][1] == this.gameBoard[2][2] && this.gameBoard[0][0] == this.gameBoard[2][2]) {
			
			return true;
		}
		else if(this.gameBoard[2][0] == this.gameBoard[1][1] && this.gameBoard[1][1] == this.gameBoard[0][2] && this.gameBoard[2][0] == this.gameBoard[0][0]) {
			
			return true;
		}
		
		return false;
	}

}
