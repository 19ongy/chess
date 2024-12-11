public class king extends Piece{
    public king(boolean isBlack){
        super(isBlack, 'k');
    }

    //can it move
    public static boolean canMove(int[] positionS, int[] positionE){
        int rowDiff = positionE[0] - positionS[0];
        int colDiff = positionE[1] - positionS[1];

        if(rowDiff > 1 || rowDiff < -1 || colDiff > 1 || colDiff < -1){
            return false;
        }else{
            return true;
        }

    }
}