public class pawn extends Piece {
    public pawn(boolean isBlack){
        super(isBlack, 'p');
    }
    //forgot that pawns move 2 steps at first
    //then after that they can only move one

    //the uh thingy is that black pieces move in the opposite direction so

    //can it move
    public static boolean canMove(int[] positionS, int[] positionE, boolean isWhite){
        int rowDiff = positionE[0] - positionS[0];
        int colDiff = Math.abs(positionE[1] - positionS[1]);

        if(isWhite == true) {
            return rowDiff == 1;
        }else{
            return rowDiff == -1;
        }


    }
}
