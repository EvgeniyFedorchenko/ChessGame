package Pieces;

import plaingField.Coordinates;

import java.util.List;

public class King extends Piece {
    public King(PieceColor pieceColor) {
        super(pieceColor);
    }


    public String whatsIsThePiece() {
        return "King";
    }

    @Override
    public List<PieceCoordinates> possibleMovesWithoutContext(PieceCoordinates coordinatesFrom) {
        return null;
    }

}
