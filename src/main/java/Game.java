/**
 * Created by andrzej on 23.06.17.
 */
public class Game {
	//logika biznesowa

	private final int SIZE = 3;
	private final String EMPTY = "E";
	private final String PLAYERONEX = "X";
	private final String PLAYERTWOO = "O";

	Field[][] board = new Field[SIZE][SIZE];

	private String status;
	private String tempStatus;
	int xloc;
	int yloc;
	int player;
	int tempPlayer;
	 int tempPlayerOne = 1;
	 int tempPlayerTwo = 2;


	Field[][] tempBoard;


	public Field[][] getBoard() {
		return board;
	}

	public void setBoard(Field[][] board) {
		this.board = board;
	}

	//metoda set basic status for field -  empty with string E
	public Field[][] setStarterBoardAndPrint() {
		Game game = new Game();
		Printer printer = new Printer();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				game.board[i][j] = new Field(EMPTY);
			}
		}

		printer.printBoard(game);
//		System.out.println(game.board[2][2].getStatus());
		setBoard(game.board);
		return game.board;
	}


	public void getField(int x, int y) {
		//get current status of the certaing field defined by integers x and y - test method
		System.out.println(board[x][y].getStatus() + " status of the field " + x +" ," +  y);

	}



	public boolean makeMove(int xloca, int yloca, int tempplayer, String statusUsed) {

		if (board[xloca][yloca].equals(null)) {
			return false;
		}
		if (tempplayer == tempPlayerTwo) {
			return false;
		}
		if (statusUsed.equals(tempStatus)) {
			return false;
		}
		if ((xloca == 4) && (yloca == 4)) {
			return false;
		}


		board[xloca][yloca].setStatus(statusUsed);
		board[xloca][yloca].setPlayer(tempplayer);


		this.tempPlayerTwo = tempplayer;
		this.xloc=xloca;
		this.yloc=yloca;
		this.status=statusUsed;

		System.out.println("Thank you for your move");

		setBoard(board);

		return false;
	}

	public boolean isWon() {

		return false;
	}

}
