package Pieces;

import plaingField.Coordinates;

import java.util.List;

public abstract class Piece {
    private final PieceColor pieceColor;

    public Piece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public abstract String whatsIsThePiece();

    // @param coordinatesFrom - Лист возможных ходов для фигуры с любой позиции на пустой доске
    public abstract List<PieceCoordinates> possibleMovesWithoutContext(PieceCoordinates coordinatesFrom);

}
