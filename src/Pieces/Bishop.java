package Pieces;

public class Bishop extends Piece {
    public Bishop(PieceColor pieceColor, PieceCoordinates pieceCoordinates) {
        super(pieceColor, pieceCoordinates);
    }

    public Bishop(PieceColor pieceColor) {
        super(pieceColor);
    }


    public String whatsIsThePiece() {
        return "Bishop";
    }
}
