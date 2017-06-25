package CrossCirclever2;

/**
 * Created by andrzej on 25.06.17.
 */
public class Game {


	final int SIZE = 3;
	final String EMPTY = "E";
	final String XPLAYER = "X";
	final String OPLAYER = "O";

	String[][] boardGame = new String[SIZE][SIZE];

	public String[][] getBoardGame() {
		return boardGame;
	}

	public void setBoardGame(String[][] boardGame) {
		this.boardGame = boardGame;
	}

	public String[][] printBoard() {

		for(String[] x : boardGame) {
			for(String y : x) {

				System.out.print(y + " ");
			}
			System.out.print("\n");
		}
		setBoardGame(boardGame);
		return boardGame;
	}

	public String[][] setEmptyBoard() {

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				boardGame[i][j] = new String(EMPTY);
			}
		}
		setBoardGame(boardGame);
		return boardGame;
	}


	public void player1MakeMove(int x, int y) {
		boardGame[x][y] = XPLAYER;
		System.out.println("You are putting " + XPLAYER + " to location " + x + ", " + y);
		setBoardGame(boardGame);
		printBoard();

	}

	public void player2MakeMove(int x, int y) {

		boardGame[x][y] = OPLAYER;
		System.out.println("You are putting " + OPLAYER + " to location " + x + ", " + y);
		setBoardGame(boardGame);
		printBoard();
	}




	public boolean checkForWin() {
		return (checkRowsForWin() || checkColsForWin() || checkDiagonalsForWin());
	}

	public boolean checkRowsForWin() {
		for (int i = 0; i < SIZE; i++) {
			if(checkBoardFields(boardGame[i][0], boardGame[i][1], boardGame[i][2]) == true)
			return true;
		}
		return false;
	}

	public boolean checkColsForWin() {
		for (int i = 0; i < SIZE; i++) {
			if(checkBoardFields(boardGame[0][i], boardGame[1][i], boardGame[2][i]) == true)
			return true;
		}
		return false;
	}

	public boolean checkDiagonalsForWin() {
		return ((checkBoardFields(boardGame[0][0], boardGame[1][1], boardGame[2][2]) == true) ||
		checkBoardFields(boardGame[2][0], boardGame[1][1], boardGame[0][2]) == true) ;
	}

	public boolean checkBoardFields(String s1, String s2, String s3) {
		return ((s1 != EMPTY) && (s1 == s2) && (s2 == s3));
	}
}
