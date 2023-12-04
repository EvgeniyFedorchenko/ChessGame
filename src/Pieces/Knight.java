package Pieces;

import plaingField.Coordinates;

import java.util.List;

public class Knight extends Piece {

    public Knight(PieceColor pieceColor) {
        super(pieceColor);
    }

    public String whatsIsThePiece() {
        return "Knight";
    }

    @Override
    public List<PieceCoordinates> possibleMovesWithoutContext(PieceCoordinates coordinatesFrom) {
        return null;
    }
}
