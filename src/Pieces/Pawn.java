package Pieces;

public class Pawn extends Piece {
    public Pawn(PieceColor pieceColor, PieceCoordinates pieceCoordinates) {
        super(pieceColor, pieceCoordinates);
    }

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
    }
    public String whatsIsThePiece() {
        return "Pawn";
    }
}
