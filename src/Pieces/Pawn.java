package Pieces;

import plaingField.Coordinates;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
    }

    @Override
    public String whatsIsThePiece() {
        return "Pawn";
    }

    @Override
    public List<PieceCoordinates> possibleMovesWithoutContext(PieceCoordinates coordinatesFrom) {

        List<PieceCoordinates> possibleMoves = new ArrayList<>();

        String column = String.valueOf(coordinatesFrom).split("")[0];
        int line = Integer.parseInt(String.valueOf(coordinatesFrom).split("")[1]);

        if (this.getPieceColor() == PieceColor.WHITE) {
            // Возможно не стоит учитывать этот случай, ведь на этой линии это уже не пешка
            if (line != 8) { possibleMoves.add(PieceCoordinates.valueOf(column + (line + 1))); }
            if (line == 2) { possibleMoves.add(PieceCoordinates.valueOf(column + (line + 2))); }
            // Если слева-сверху/справа-сверху чужая фигура - туда можно сходить (рубка)
            // Взятие на проходе?
        } else {
            // Возможно не стоит учитывать этот случай, ведь на этой линии это уже не пешка
            if (line != 1) { possibleMoves.add(PieceCoordinates.valueOf(column + (line - 1))); }
            if (line == 7) { possibleMoves.add(PieceCoordinates.valueOf(column + (line - 2))); }
            // Если слева-снизу/справа-снизу чужая фигура - туда можно сходить (рубка)
            // Взятие на проходе?jklk
        }
        Coordinates coordinate = Coordinates.A1;
        return possibleMoves;
    }
}
