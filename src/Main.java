public class Main {
    public static void main(String[] args) {
        //Piece test = new Piece(true, 'K');
        //System.out.println(test.toString());

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

        //sees if the King can move
        boolean kingResult = game.movePiece(Startposition, EndPosition);
        System.out.println(kingResult);

        //sees if the knight can move
        boolean knightResult = game.movePiece(Startposition, EndPosition);
        System.out.println(knightResult);

        //sees if the rook can move
        boolean rookResult = game.movePiece(Startposition, EndPosition);
        System.out.println(rookResult);

        //sees if the bishop can move
        boolean bishopResult = game.movePiece(Startposition, EndPosition);
        System.out.println(bishopResult);


    }
}