import java.util.Scanner;

public class Chess {
    private Piece[][] board; //the chessboard
    public char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    public Chess[][] startCoord;
    public Chess[][] endCoord;

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
        board[7][3] = new Queen(true);

        //place kings
        board[0][4] = new king(false);
        board[7][4] = new king(true);

    }

    //shows the current board
    public void display(){
        for(int row = 7; row>=0; row-- ){
            System.out.print(String.valueOf(row+1) + "   "); //prints out the numbers on the side
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

    //gets user input for coords of piece
    public String getPosition(){
        Scanner input = new Scanner(System.in);
        String coords = input.nextLine();
        return coords;
    }

    //needs to take in an input from the user about the start and end location of piece
    //needs to convert it into rows and columns

    //taking in the input?
    public String positionOfStart() {
        System.out.println("Location of the piece you want to move: ");
        String start = getPosition();
        return start;
    }

    public String positionOfEnd() {
        System.out.println("location of where you want to move it to: ");
        String end = getPosition();
        return end;
    }

    //meant to find the piece on the board and stuff
    public String findPiece(int[] position){
        System.out.println("Coords : " + position[0] + " , " + position[1]);
        System.out.println("The piece is: " + board[position[0]][position[1]]);
        return String.valueOf(board[position[0]][position[1]]);
    }

    //user input into the chess pieces and location
    //converts the a7 to the [][] values on the 2d array thingy
    public int[] getBoardPosition(String location){
        int row = 0;
        int col = 0;

        for( int i = 0; i<letters.length; i++){
            if(location.charAt(0) ==(letters[i])){
                col = i;
                break;
            }
        }

        //System.out.println(location.charAt(1));
        row = location.charAt(1) - '1';
        return new int[]{row, col};
    }

    //function that checks it there is a piece there first
    public boolean checkPiece(int[] endPos){
        if(board[endPos[0]][endPos[1]] != null){
            return false;
        }else{
            return true;
        }
    }

    //functions that moves the board pieces
    public void boardMove(int[] startPos, int[] endPos){
        //System.out.println(board[startPos[0]][startPos[1]]);
        board[endPos[0]][endPos[1]] = board[startPos[0]][startPos[1]];
        //System.out.println(board[endPos[0]][endPos[1]]);
        board[startPos[0]][startPos[1]] = null;
        display();
    }
    public boolean movePiece(int[] startPos, int[] endPos){
        String piece = findPiece(startPos);


        if(checkPiece(endPos) == false) {
            System.out.println("There is already a piece there, you cannot move.");
            return false;
        }


        boolean isWhite = Character.isLowerCase(piece.charAt(0));
        String normalizedPiece = piece.toLowerCase();

        if (normalizedPiece.equals("k")) {
            king moveKing = new king(isWhite);
            return moveKing.canMove(startPos, endPos);

        } else if (normalizedPiece.equals("n")) {
            knight moveKnight = new knight(isWhite);
            return moveKnight.canMove(startPos, endPos);
        } else if (normalizedPiece.equals("r")) {
            rook moveRook = new rook(isWhite);
            return moveRook.canMove(startPos, endPos);
        } else if (normalizedPiece.equals("b")) {
            bishop moveBishop = new bishop(isWhite);
            return moveBishop.canMove(startPos, endPos);
        } else if (normalizedPiece.equals("q")) {
            Queen moveQueen = new Queen(isWhite);
            return moveQueen.canMove(startPos, endPos);
        } else if (normalizedPiece.equals("p")) {
            pawn movePawn = new pawn(isWhite);
            return movePawn.canMove(startPos, endPos, isWhite);
        }
        return false;
    }
}
//all pieces displayed in their starting positions and stuff
//implement move rule for the King and one other piece

