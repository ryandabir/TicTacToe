/**
 * Created by ryandabir on 2017-06-25.
 */
public class Board {

    private Cell[][] gameBoard = new Cell[3][3];

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = new Cell();
            }
        }
    }

    public Cell[][] getGameBoard() {
        return gameBoard;
    }

    public boolean move(char player, int row, int col) {
        if (gameBoard[row][col].getMySymbol() != '.') {
            return false;
        }

        gameBoard[row][col].move(player);
        return true;
    }

    public String toString() {

        StringBuilder board = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.append(gameBoard[i][j].toString());
            }
            board.append("\n");
        }
        return board.toString();
    }
}
