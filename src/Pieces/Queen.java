package Pieces;

import plaingField.Coordinates;

import java.util.List;

public class Queen extends Piece {
    public Queen(PieceColor pieceColor) {
        super(pieceColor);
    }


    public String whatsIsThePiece() {
        return "Queen";
    }


    @Override
    public List<PieceCoordinates> possibleMovesWithoutContext(PieceCoordinates coordinatesFrom) {
        return null;
    }
}
