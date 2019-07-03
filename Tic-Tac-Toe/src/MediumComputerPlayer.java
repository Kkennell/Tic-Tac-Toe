
public class MediumComputerPlayer extends Computer {
	
	public int[] getMove(GameBoard gameBoard) {
		
		/*
		 * Move priorities to Code:
		 * 1) If there is a winning move, take it
		 * 2) If there is a way to block Player from winning, take it
		 * 3) If there is a move that creates two winning scenarios, take it
		 * 4) If there is a move that blocks Player from having two winning scenarios, take it
		 */
		
		return null;
	}
	
	private int[] getWinningMove(GameBoard gameBoard) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(gameBoard.getCell(i, j) == ' ' && (gameBoard.checkRowWin(i,j) || gameBoard.checkColumnWin(i,j) || gameBoard.checkDiagonalWin(i,j))) {
					int[] move = {i,j};
						
					return move;
				}
			}
		}
		
		return null;
	}

}
