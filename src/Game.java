import java.util.Scanner;

/**
 * Created by ryandabir on 2017-06-25.
 */
public class Game {

    private Board board;

    public Game() {
        board = new Board();
    }

    public static void main(String[] args) {

        Game game = new Game();

        game.go();

    }
    public void go() {

        System.out.println("Welcome to TicTacToe!\n");
        System.out.println("Would you like to be X or O?");

        Player player1;
        Player player2;

        while (true) {
            Scanner reader = new Scanner(System.in);
            char symbol = reader.findInLine(".").charAt(0);

            if (symbol == 'X' || symbol == 'x') {
                player1 = new Player('X');
                player2 = new Player('O');
                break;
            } else if (symbol == 'O' || symbol == 'o') {
                player1 = new Player('O');
                player2 = new Player('X');
                break;
            } else {
                System.out.println("Invalid symbol, please try again.");
            }
        }

        System.out.println("Starting game...\n");
        System.out.println(board);

        while (true) {
            move(player1);
            if (checkWin(player1.getMySymbol())) {
                break;
            }
            move(player2);
            if (checkWin(player2.getMySymbol())) {
                break;
            }
        }
    }

    public void move(Player player) {
        System.out.println("Select location to place symbol (format xy).");

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();

        board.move(player.getMySymbol(), x, y);

        System.out.println(board);
    }

    public boolean checkWin(char symbol) {
        if (board.getGameBoard()[0][0].getMySymbol() == symbol && board.getGameBoard()[0][1].getMySymbol() == symbol && board.getGameBoard()[0][2].getMySymbol() == symbol) {
            System.out.println("Winner");
            return true;
        }
        return false;
    }
}
