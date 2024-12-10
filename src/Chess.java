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

    //inputted answer
    public String getPosition(){
        Scanner input = new Scanner(System.in);
        String coords = input.nextLine();
        return coords;
    }

    /*
    public boolean move(){
        //asks the player for their move
        System.out.println("Location of piece you want to move: ");
        String start = getPosition();
        System.out.println("Location of where you want to move it to: ");
        String end = getPosition();
    }


    private int coordToRow(String coord){
        char rowChar = choord.charAT
    }

     */

    public void setCoords(int a, int b){
        for(int i = 0; i<7; i++){
            if(a == letters[i]){
                System.out.println(i);
            }
        }

    }
    //gets the string version of the inputted answer
    public void positionOf(){
        System.out.println("Location of the piece you want to move: ");
        String start = getPosition();
        System.out.println("location of where you want to move it to: ");
        String end = getPosition();

        System.out.println(start.charAt(0));
        System.out.println(start.charAt(1));
        for(int i = 0; i<7; i++){
            if(start.charAt(0) == letters[i]){
                System.out.println(i);
                startCoord = Chess[i][start.charAt(1)];
            }
        }


    }

    public void positionOfToCoords(){
        for(int i = 0; i<7; i++){
            if(start.charAt(0) == letters[i]){
                System.out.println(i);
            }
        }
    }

}
//all pieces displayed in their starting positions and stuff
