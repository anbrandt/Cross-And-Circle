package CrossCircleMVC;

import java.util.Scanner;

/**
 * Created by andrzej on 23.06.17.
 */
public class App {
	//cross and circle game using MVC controller


	public static void main(String[] args) {

		Printer printer = new Printer();

		Game game = new Game();
		boolean won = false;
		int roundCounter = 0;
		game.setStarterBoardAndPrint();

		while(won == false) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("\nWhich player are you? 1 or 2");
			int choosedPlayer = scanner.nextInt();
			System.out.println("Choose your marks - X or O");
			String choosedMark = scanner.next();
			System.out.println("Player one: choose your x and y location. Press ");
			int xlocation = scanner.nextInt();
			int ylocation = scanner.nextInt();

			game.makeMove(xlocation, ylocation, choosedPlayer, choosedMark);
			game.isWon();
			printer.printBoard(game);

		}
//
//			roundCounter++;
//			System.out.println("After round " + roundCounter + " the board looks like this \n");
//			game.isWon();

		}


	}

//}
