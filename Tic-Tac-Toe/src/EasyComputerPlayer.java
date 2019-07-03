
public class EasyComputerPlayer extends Computer{
	
	private final int[][] PREFERREDMOVE = {{1,1},{0,0},{0,2},{2,0},{2,2},{0,1},{1,0},{1,1},{1,2},{2,1}};
	
	public int[] getMove(GameBoard gameBoard) {
		
		for(int[] move: PREFERREDMOVE) {
			if(gameBoard.isValidMove(move[0], move[1])) {
				return move;
			}
		}
		
		return null;
	}

}
