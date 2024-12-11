public class Queen extends Piece{
    public Queen(boolean isBlack){
        super(isBlack, 'q');
    }

    // can it move#
    public static boolean canMove(int[] positionS, int[] positionE){
        int rowDiff = Math.abs(positionE[0] - positionS[0]);
        int colDiff = Math.abs(positionE[1] - positionS[1]);


        if((positionS[0] == positionE[0] ) && (colDiff <= 8)) {
            return true;
        }else if((positionS[1] == positionE[1]) && rowDiff <= 8){
            return true;
        }else if((rowDiff == colDiff) || (rowDiff == -colDiff) || (-rowDiff == colDiff)){
            return true;
        }
        return false;
    }
}