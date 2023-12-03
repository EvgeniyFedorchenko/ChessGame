package Pieces;

public class King extends Piece {
    public King(PieceColor pieceColor, PieceCoordinates pieceCoordinates) {
        super(pieceColor, pieceCoordinates);
    }

    public King(PieceColor pieceColor) {
        super(pieceColor);
    }


    public String whatsIsThePiece() {
        return "King";
    }
}
