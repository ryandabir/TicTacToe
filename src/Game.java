import java.util.Scanner;

/**
 * Created by ryandabir on 2017-06-25.
 */
public class Game {

    public static void main(String[] args) {

        Board board = new Board();

        System.out.println("Welcome to TicTacToe!\n");
        System.out.println("Would you like to be X or O?");

        while (true) {
            Scanner reader = new Scanner(System.in);
            char symbol = reader.findInLine(".").charAt(0);

            if (symbol == 'X' || symbol == 'x') {
                Player player = new Player("X");
                break;
            } else if (symbol == 'O' || symbol == 'o') {
                Player player = new Player("O");
                break;
            } else {
                System.out.println("Invalid symbol, please try again.");
            }
        }

        System.out.println("Starting game...\n");
        System.out.println(board.toString());

        move();

    }
    public static void move() {
        System.out.println("Select location to place symbol (format xy).");

        Scanner reader = new Scanner(System.in);
        char x = reader.next(".").charAt(0);
        char y = reader.next(".").charAt(0);

    }
}
