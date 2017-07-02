import java.util.Scanner;

/**
 * Created by ryandabir on 2017-06-25.
 */
public class Game {

    private Board board;
    int count;

    public Game() {
        board = new Board();
    }

    public static void main(String[] args) {

        Game game = new Game();

        game.go();

    }
    public void go() {

        System.out.println("Welcome to TicTacToe!\n");
        System.out.println("Player 1, choose X or O.");

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

        System.out.println("\nStarting game...\n");
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

        if(this.count == 9) {
            System.out.println("Tie!");
            System.exit(0);
        }

        System.out.println("Select location to place symbol (format xy).");

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();

        while (!board.move(player.getMySymbol(), x, y)){
            System.out.println("Invalid spot. Try again.");
            x = reader.nextInt();
            y = reader.nextInt();
        }

        this.count++;
        System.out.println(board);
    }

    public boolean checkWin(char symbol) {
        if (board.getGameBoard()[0][0].getMySymbol() == symbol && board.getGameBoard()[0][1].getMySymbol() == symbol && board.getGameBoard()[0][2].getMySymbol() == symbol) {
            System.out.println(symbol + " Has Won");
            return true;
        }
        if (board.getGameBoard()[1][0].getMySymbol() == symbol && board.getGameBoard()[1][1].getMySymbol() == symbol && board.getGameBoard()[1][2].getMySymbol() == symbol) {
            System.out.println(symbol + " Has Won");
            return true;
        }
        if (board.getGameBoard()[2][0].getMySymbol() == symbol && board.getGameBoard()[2][1].getMySymbol() == symbol && board.getGameBoard()[2][2].getMySymbol() == symbol) {
            System.out.println(symbol + " Has Won");
            return true;
        }
        if (board.getGameBoard()[0][0].getMySymbol() == symbol && board.getGameBoard()[1][0].getMySymbol() == symbol && board.getGameBoard()[2][0].getMySymbol() == symbol) {
            System.out.println(symbol + " Has Won");
            return true;
        }
        if (board.getGameBoard()[0][1].getMySymbol() == symbol && board.getGameBoard()[1][1].getMySymbol() == symbol && board.getGameBoard()[2][1].getMySymbol() == symbol) {
            System.out.println(symbol + " Has Won");
            return true;
        }
        if (board.getGameBoard()[0][2].getMySymbol() == symbol && board.getGameBoard()[1][2].getMySymbol() == symbol && board.getGameBoard()[2][2].getMySymbol() == symbol) {
            System.out.println(symbol + " Has Won");
            return true;
        }
        if (board.getGameBoard()[0][0].getMySymbol() == symbol && board.getGameBoard()[1][1].getMySymbol() == symbol && board.getGameBoard()[2][2].getMySymbol() == symbol) {
            System.out.println(symbol + " Has Won");
            return true;
        }
        if (board.getGameBoard()[2][0].getMySymbol() == symbol && board.getGameBoard()[1][1].getMySymbol() == symbol && board.getGameBoard()[0][2].getMySymbol() == symbol) {
            System.out.println(symbol + " Has Won");
            return true;
        }
        return false;
    }
}
