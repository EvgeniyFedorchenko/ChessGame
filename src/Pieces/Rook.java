package Pieces;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
    public Rook(PieceColor pieceColor) {
        super(pieceColor);
    }

    @Override
    public String whatsIsThePiece() {
        return "Rook";
    }

    @Override
    public List<PieceCoordinates> possibleMovesWithoutContext(PieceCoordinates coordinatesFrom) {

        List<PieceCoordinates> possibleMoves = new ArrayList<>();

        String column = coordinatesFrom.toString().split("")[0];
        int line = Integer.parseInt(coordinatesFrom.toString().split("")[1]);

//        for (int i = 0; i < ; i++) {
            
//        }
        return possibleMoves;
    }
}
