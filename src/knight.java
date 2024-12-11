public class knight extends Piece{
    public knight(boolean isBlack){
        super(isBlack, 'n');
    }

    //can it move
    public static boolean canMove(int[] positionS, int[] positionE){
        int rowDiff = positionE[0] - positionS[0];
        int colDiff = positionE[1] - positionS[1];

        return ((rowDiff == 2 || rowDiff == -2) && (colDiff == 1 || colDiff == -1)) || (Math.abs(rowDiff) == 1) && (Math.abs(colDiff) == 2);
        //if it move like a L shape lying down

    }
}