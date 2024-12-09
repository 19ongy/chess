public class Chess {
    private Piece[][] board; //the chessboard

    //constructor
    public Chess(){
        board = new Piece[8][8]; //instantiate th string
        //board[0][0] = new Piece(false, 'r');

        for(int col=0; col<8; col++){
            board[1][col] = new pawn(false);
            board[6][col] = new pawn(true);
        }

        for(int col=0; col<8; col++){
            board[0][col] = new rook(false);
            board[7][col] = new rook(true);
        }


    }

    //shows the current board
    public void display(){
        for(int row = 7; row>=0; row-- ){
            for(int col = 0; col<8; col++){
                if(board[row][col] != null) {
                    System.out.print(board[row][col] + " ");
                }else{
                    System.out.print(". ");
                }
            }
        System.out.println();
        }
    }





}
