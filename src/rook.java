public class rook extends Piece {
    public rook(boolean isBlack){
        super(isBlack, 'r');
    }

    //can it move
    public static boolean canMove(int[] positionS, int[] positionE){
        int rowDiff = positionE[0] - positionS[0];
        int colDiff = positionE[1] - positionS[1];


        if((positionS[0] == positionE[0] ) && (colDiff <= 8)) return true;
        else{
            return (positionS[1] == positionE[1]) && rowDiff <= 8;
        }



    }

}
