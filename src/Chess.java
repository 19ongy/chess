public class Chess {
    private Piece[][] board; //the chessboard

    //constructor
    public Chess(){
        board = new Piece[8][8]; //instantiate th string
        //board[0][0] = new Piece(false, 'r');

        //puts all the pawn for black and white on the board
        for(int col=0; col<8; col++){
            board[1][col] = new pawn(false);
            board[6][col] = new pawn(true);
        }

        //place rooks
        board[0][0] = board[0][7] = new rook(false);
        board[7][0] = board[7][7] = new rook(true);

        //place knights
        board[0][1] = board[0][6] = new knight(false);
        board[7][1] = board[7][6] = new knight(true);

        //place bishops
        board[0][2] = board[0][5] = new bishop(false);
        board[7][2] = board[7][5] = new bishop(true);

        //place queens
        board[0][3] = new Queen(false);
        board[7][4] = new Queen(true);

        //place kings
        board[0][4] = new king(false);
        board[7][3] = new king(true);

    }

    //shows the current board
    public void display(){
        for(int row = 7; row>=0; row-- ){
            System.out.print(String.valueOf(row) + "   "); //prints out the numbers on the side
            for(int col = 0; col<8; col++){
                if(board[row][col] != null) {
                    System.out.print(board[row][col] + " ");
                }else{
                    System.out.print(". ");
                }
            }
        System.out.println();
        }
        //prints out the letters for chess board squares at the bottom
        System.out.println();
        System.out.println("    A B C D E F G H");
    }





}
//all pieces displayed in their starting positions and stuff
