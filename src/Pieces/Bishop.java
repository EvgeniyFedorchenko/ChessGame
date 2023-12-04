package Pieces;

import plaingField.Coordinates;

import java.util.List;

public class Bishop extends Piece {
    public Bishop(PieceColor pieceColor) {
        super(pieceColor);
    }


    public String whatsIsThePiece() {
        return "Bishop";
    }

    @Override
    public List<PieceCoordinates> possibleMovesWithoutContext(PieceCoordinates coordinatesFrom) {
    return null;
    }


}
