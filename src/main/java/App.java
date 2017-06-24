import java.util.Scanner;

/**
 * Created by andrzej on 23.06.17.
 */
public class App {
	//cross and circle game using MVC controller


	public static void main(String[] args) {

		Printer printer = new Printer();

		Game game = new Game();
		boolean win = false;
		int roundCounter = 0;
		System.out.println("Welcome to the Cross and Circle (or Tic Tac Toe) Game. This is an empty board \n");
		game.setStarterBoardAndPrint();
		while(win == false) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("\nWhich player are you? 1 or 2");
			int choosedPlayer = scanner.nextInt();
			System.out.println("Choose your marks - X or O");
			String choosedMark = scanner.next();
			System.out.println("Player one: choose your x and y location");
			int xlocation = scanner.nextInt();
			int ylocation = scanner.nextInt();

			game.makeMove(xlocation, ylocation, choosedPlayer, choosedMark);
			roundCounter++;
			System.out.println("After round " + roundCounter + " the board looks like this \n");
			printer.printBoard(game);

		}
//
//		System.out.println("This is an empty start board \n");
//		game.setStarterBoardAndPrint();
//
//		System.out.println("\n \n What is your first move?");
//
//
//
//		game.makeMove(0,2,1,"X");
//
//		printer.printBoard(game);
//
//		System.out.println("\nround two");
//		System.out.println();
//
//		game.makeMove(0,1,2,"O");
//		printer.printBoard(game);
//
//		System.out.println("\nround three");
//		System.out.println();
//		game.makeMove(1,2,1,"X");
//		printer.printBoard(game);
//		System.out.println();
//
//		System.out.println();
//		System.out.println("-----------------");
////		game.setStarterBoardAndPrint();
//
//


	}

}
