package CrossCirclever2;

import java.util.Scanner;

/**
 * Created by andrzej on 25.06.17.
 */
public class App2 {


	public static void main(String[] args) {

		Game game = new Game();

		boolean win = false;
		game.setEmptyBoard();
		System.out.println("Welcome to Tic Tac Toe Game aka Cross and Circle. This is an empty board \n");
		game.setEmptyBoard();
		game.printBoard();

		while (win != true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Player one uses X, Player two uses O. \n " +
					"PLayer one, enter your X location");
			int x = scanner.nextInt();
			System.out.println(" And enter your Y location");
			int y = scanner.nextInt();

			game.player1MakeMove(x, y);
			game.checkForWin();

			System.out.println("PLayer two press X location");
			int x2 = scanner.nextInt();
			System.out.println("And enter your Y location");
			int y2 = scanner.nextInt();

			game.player2MakeMove(x2, y2);
			game.checkForWin();

			if (game.checkForWin() != false) {
				System.out.println("We have a winner! ");
				win = true;
			}

		}

	}


}



