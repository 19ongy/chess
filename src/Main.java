public class Main {
    public static void main(String[] args) {
        //Piece test = new Piece(true, 'K');
        //System.out.println(test.toString());

        System.out.println("chess game yippeeeee");
        System.out.println("Enter moves through the letter of the column, and number of row ,, e.g. a6 or g1");
        System.out.println("");
        //makes a new chess board
        Chess game = new Chess();
        game.display();
        //game.findPiece(game.positionOfStart());

        //gets the location of the piece you want to move
        int[] Startposition = game.getBoardPosition(game.positionOfStart());
        //System.out.println(Startposition[0] + " " + Startposition[1]);
        //finds what piece you want to move
        game.findPiece(Startposition);

        //gets position of where you want it to go
        int[] EndPosition  = game.getBoardPosition(game.positionOfEnd());
        System.out.println("Coords : " + EndPosition[0] + " , " + EndPosition[1]);

        //sees if the piece can move
        boolean moveResult = game.movePiece(Startposition, EndPosition);
        System.out.println(moveResult);
        game.boardMove(Startposition, EndPosition);
    }
}