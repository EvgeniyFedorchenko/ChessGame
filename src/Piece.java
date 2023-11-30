import java.awt.*;

public abstract class Piece {
    private final PieceColor pieceColor;
    private Coordinates coordinates;

    public Piece(PieceColor pieceColor, Coordinates coordinates) {
        this.pieceColor = pieceColor;
        this.coordinates = coordinates;
    }

    public Piece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public PieceColor getColor() {
        return pieceColor;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    // White: ♔ ♕ ♖ ♗ ♘ ♙
    // Black: ♚ ♛ ♜ ♝ ♞ ♟
    public abstract String returnIcon();
}
