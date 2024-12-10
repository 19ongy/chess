import java.util.Scanner;

public class Piece {
    //class fields
    private char symbol;
    //K for king , N for knight etc etc
    private boolean isBlack;

    //constructor
    public Piece(boolean isBlack, char symbol){
        this.isBlack = isBlack;
        this.symbol = symbol;
    }

    //if the piece is black, then it will be upper case
    public String toString(){
        if(isBlack){
            return Character.toString(symbol).toUpperCase();
        }else {
            return Character.toString(symbol);
        }
    }

    //function for moving the piece

}
