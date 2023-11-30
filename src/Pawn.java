import java.awt.*;

public class Pawn extends Piece {
    public Pawn(PieceColor pieceColor, Coordinates coordinates) {
        super(pieceColor, coordinates);
    }

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
    }

    @Override
    public String returnIcon() {
        return "♟︎";
    }

    public void takeMove(Board board, Coordinates newCoordinate) {
        board.getBoard().remove(this.getCoordinates());
        // Валидация хода
        board.getBoard().put(newCoordinate, this);

        String ghj = " ♟  ♟  ♟  ♟  ♟  ♟  ♟  ♟ \n" +
                     "                                " +
                     "ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ";
    }
}
