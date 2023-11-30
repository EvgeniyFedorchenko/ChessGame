public class Pawn extends Piece {
    public Pawn(PieceColor pieceColor, Coordinates coordinates) {
        super(pieceColor, coordinates);
    }

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
    }

    public void takeMove(Board board, Coordinates newCoordinate) {
        board.getBoard().remove(this.getCoordinates());
        // Валидация хода
        board.getBoard().put(newCoordinate, this);
    }
}
