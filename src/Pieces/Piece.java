package Pieces;

public abstract class Piece {
    private final PieceColor pieceColor;
    private PieceCoordinates pieceCoordinates;

    public Piece(PieceColor pieceColor, PieceCoordinates pieceCoordinates) {
        this.pieceColor = pieceColor;
        this.pieceCoordinates = pieceCoordinates;
    }

    public Piece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public PieceColor getColor() {
        return pieceColor;
    }

    public PieceCoordinates getCoordinates() {
        return pieceCoordinates;
    }

    // White: ♔ ♕ ♖ ♗ ♘ ♙
    // Black: ♚ ♛ ♜ ♝ ♞ ♟
    public abstract String whatsIsThePiece();
}
