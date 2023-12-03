package Pieces;

public class Queen extends Piece {
    public Queen(PieceColor pieceColor, PieceCoordinates pieceCoordinates) {
        super(pieceColor, pieceCoordinates);
    }

    public Queen(PieceColor pieceColor) {
        super(pieceColor);
    }


    public String whatsIsThePiece() {
        return "Queen";
    }
}
