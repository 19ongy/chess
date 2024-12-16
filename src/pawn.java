public class pawn extends Piece {
    public pawn(boolean isBlack){
        super(isBlack, 'p');
    }

    //can it move
    public static boolean canMove(int[] positionS, int[] positionE, boolean isBLack){
        int rowDiff = positionE[0] - positionS[0];
        int colDiff = Math.abs(positionE[1] - positionS[1]);

        return rowDiff == 1;

    }
}
