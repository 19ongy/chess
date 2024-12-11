public class bishop extends Piece{
    public bishop(boolean isBlack){
        super(isBlack, 'b');
    }

    //checks if it can move
    public static boolean canMove(int[] positionS, int[] positionE){
        int rowDiff = positionE[0] - positionS[0];
        int colDiff = positionE[1] - positionS[1];

        return (rowDiff == colDiff) || (rowDiff == -colDiff) || (-rowDiff == colDiff);
    }
}
