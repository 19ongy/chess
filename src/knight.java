public class knight extends Piece{
    public knight(boolean isBlack){
        super(isBlack, 'n');
    }

    //can it move
    public static boolean canMove(int[] positionS, int[] positionE){
        int rowDiff = positionE[0] - positionS[0];
        int colDiff = positionE[1] - positionS[1];

        if((rowDiff == 2 || rowDiff == -2) && (colDiff == 1 || colDiff == -1)){
            return true;
        }else{
            return false;
        }

    }
}