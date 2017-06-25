package CrossCircleMVC;

/**
 * Created by andrzej on 23.06.17.
 */
public class Printer {

	//temp game just for getting the board
	Game game;
	private int lineCounter;

//	private int[][] board;

	public void printBoard(Game game) {
		Field[][] tempBoard = game.getBoard();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(lineCounter == 1) {
					System.out.print(" " + tempBoard[i][j].getStatus() + " ");
				} else
					System.out.print(" "+ tempBoard[i][j].getStatus() + " ");
				lineCounter++;
			}
			lineCounter =0;
			if (i!=2){
				System.out.println("\n");
			}
			
		}

	}


	public static void main(String[] args) {

	}






}
