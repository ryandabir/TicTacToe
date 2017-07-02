/**
 * Created by ryandabir on 2017-06-25.
 */
public class Cell {

    private char mySymbol;

    public Cell() {
        mySymbol = '.';
    }

    public void move(char symbol) {
        mySymbol = symbol;
    }

    public char getMySymbol() {
        return mySymbol;
    }

    public String toString() {
        return Character.toString(mySymbol);
    }
}
