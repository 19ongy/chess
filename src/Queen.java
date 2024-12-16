public class Queen extends Piece{
    public Queen(boolean isBlack){
        super(isBlack, 'q');
    }

    // can it move#
    public static boolean canMove(int[] positionS, int[] positionE){
        int rowDiff = Math.abs(positionE[0] - positionS[0]);
        int colDiff = Math.abs(positionE[1] - positionS[1]);


        if((rowDiff == 0) && (colDiff <= 8)){
            return true;
        }else if((colDiff == 0) && (rowDiff <= 8)){
            return true;
        }else{
            return (rowDiff == colDiff) || (rowDiff == -colDiff) || (-rowDiff == colDiff);

        }

    }
}