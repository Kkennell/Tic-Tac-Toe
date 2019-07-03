
public class GameBoard {
	
	private char[][] gameBoard;
	
	GameBoard() {
		gameBoard = new char[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				this.gameBoard[i][j] = ' ';
			}
		}
	}
	
	public void displayCurrentGameBoard() {
			
		System.out.println("  0    1    2 ");
		
		for(int i=0;i<3;i++) {
			
			System.out.print(i+" ");
			
			for(int j=0; j<3; j++) {
				
				System.out.print(" "+gameBoard[i][j]);
				
				if(j == 0 || j== 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();
		
			if(i==0 || i==1) {		
				
				System.out.println("  ------------");

			}		
		}
	}
	
	public boolean isValidMove(int row, int column) {
		return this.gameBoard[row][column] == ' ';
	}
	
	public void setMove(int row, int column, char player) {
		
		this.gameBoard[row][column] = player;
		
	}	
	private boolean checkRows(char player) {
		for(int i=0; i<3; i++)
		{
			if(this.gameBoard[i][0] == player && this.gameBoard[i][1] == player && this.gameBoard[i][2] == player) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean checkColumns(char player) {
		for(int i=0; i<3; i++)
		{
			if(this.gameBoard[0][i] == player && this.gameBoard[1][i] == player && this.gameBoard[2][i] == player) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkDiagonals(char player) {
		if(this.gameBoard[0][0] == player && this.gameBoard[1][1] == player && this.gameBoard[2][2] == player) {
			
			return true;
		}
		else if(this.gameBoard[2][0] == player && this.gameBoard[1][1] == player && this.gameBoard[0][2] == player) {
			
			return true;
		}
		
		return false;
	}

	public boolean checkWinConditions(char playerToken) {
		// TODO Auto-generated method stub
		return checkRows(playerToken) || checkColumns(playerToken) || checkDiagonals(playerToken);
	}

	public char getCell(int row, int column) {
		return this.gameBoard[row][column];
	}

	public boolean checkRowWin(int row, int column) {
		
		return false;
	}

	public boolean checkColumnWin(int row, int column) {
		
		return false;
	}
	
public boolean checkDiagonalWin(int row, int column) {
		
		return false;
	}
}
