package CrossCircleMVC;

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
	int winner;
	int player;
	int tempPlayer;
	int tempPlayerOne = 1;
	int tempPlayerTwo = 2;

	boolean won = false;

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
		System.out.println("Welcome to Cross and Circle! This is an empty board: \n");
		Printer printer = new Printer();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				game.board[i][j] = new Field(EMPTY);
			}
		}

		printer.printBoard(game);
		setBoard(game.board);
		return game.board;
	}


	public void getField(int x, int y) {
		//get current status of the certaing field defined by integers x and y - test method
		System.out.println(board[x][y].getStatus() + " status of the field " + x + " ," + y);

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
		this.xloc = xloca;
		this.yloc = yloca;
		this.status = statusUsed;

		System.out.println("\n \n");

		setBoard(board);

		return false;
	}

	public boolean isWon() {

		int countX1 = 0;
		int countO1 = 0;
		int countX2 = 0;
		int countO2 = 0;

		int counterX3 = 0;
		int counterX4 = 0;
		int counter03 = 0;
		int counterO4 = 0;


		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (board[i][j].getStatus().equals(PLAYERONEX)) {
					countX1++;

					if (countX1 == SIZE) {
						System.out.println("\nPLayer  X won");
						won = true;
						return true;
					}
				}
				if (board[i][j].getStatus().equals(PLAYERONEX)) {
					countX2++;
					if (countX2 == SIZE) {
						System.out.println("\nPLayer  X won");
						won = true;
						return true;
					}
				}
				if (board[i][j].getStatus().equals(PLAYERTWOO)) {
					countO1++;
					if (countO1 == SIZE) {
						System.out.println("\nPlayer O won");
						won = true;
						return true;
					}
				}
				if (board[i][j].getStatus().equals(PLAYERTWOO)) {
					countO2++;
					if (countO2 == SIZE) {
						System.out.println("\nPlayer O won");
						won = true;
						return true;
					}
				}
			}
		}

		for (int i = 0; i < SIZE; i++) {
			if (board[SIZE-i-1][i].getStatus().equals(PLAYERONEX)){
				counterX3++;
				if (counterX3 == SIZE){
					winner=board[SIZE-i-1][i].getPlayer();
					return true;
				}
			}
		}

		for (int i = 0; i < SIZE; i++) {
			if (board[SIZE-i-1][i].getStatus().equals(PLAYERONEX)){
				counterX4++;
				if (counterX4 == SIZE){
					winner=board[SIZE-i-1][i].getPlayer();
					return true;
				}
			}
		}
		for (int i = 0; i < SIZE ; i++) {

			if(board[i][i].getStatus().equals(PLAYERTWOO)){
				counter03++;
				if (counter03 == SIZE){
					winner=board[i][i].getPlayer();
					return true;
				}

			}
		}
		for (int i = 0; i < SIZE; i++) {
			if (board[SIZE-i-1][i].getStatus().equals(PLAYERTWOO)){
				counterO4++;
				if (counterO4 == SIZE){
					winner=board[SIZE-i-1][i].getPlayer();
					return true;
				}
			}
		}
		return false;

	}


}

