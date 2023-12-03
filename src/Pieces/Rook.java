package Pieces;

public class Rook extends Piece {
    public Rook(PieceColor pieceColor, PieceCoordinates pieceCoordinates) {
        super(pieceColor, pieceCoordinates);
    }

    public Rook(PieceColor pieceColor) {
        super(pieceColor);
    }

    public String whatsIsThePiece() {
        return "Rook";
    }
}
