package Pieces;

public class Knight extends Piece {

    public Knight(PieceColor pieceColor, PieceCoordinates pieceCoordinates) {
        super(pieceColor, pieceCoordinates);
    }

    public Knight(PieceColor pieceColor) {
        super(pieceColor);
    }


    public String whatsIsThePiece() {
        return "Knight";
    }
}
