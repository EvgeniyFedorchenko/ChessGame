package plaingField;

import Pieces.*;
import exceptions.NotAllowableMoveException;

import java.util.*;

public class Board {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String WHITE_PIECE ="\033[0;45m";
    public static final String BLACK_PIECE = "\033[0;30m";
    public static final String WHITE_BACKGROUND = "\033[47m";
    public static final String BLACK_BACKGROUND = "\033[100m";


    private Map<PieceCoordinates, Piece> board;

    public Board() {
        this.board = new HashMap<>();
        for (PieceCoordinates coordinates : PieceCoordinates.values()) {
            board.put(coordinates, null);
        }
        startSetup();
    }

    private void startSetup() {
           // Rook
        board.put(PieceCoordinates.A8, new Rook(PieceColor.BLACK));
        board.put(PieceCoordinates.H8, new Rook(PieceColor.BLACK));
        board.put(PieceCoordinates.A1, new Rook(PieceColor.WHITE));
        board.put(PieceCoordinates.H1, new Rook(PieceColor.WHITE));
           // Knight
        board.put(PieceCoordinates.B8, new Knight(PieceColor.BLACK));
        board.put(PieceCoordinates.G8, new Knight(PieceColor.BLACK));
        board.put(PieceCoordinates.B1, new Knight(PieceColor.WHITE));
        board.put(PieceCoordinates.G1, new Knight(PieceColor.WHITE));
           // Bishop
        board.put(PieceCoordinates.C8, new Bishop(PieceColor.BLACK));
        board.put(PieceCoordinates.F8, new Bishop(PieceColor.BLACK));
        board.put(PieceCoordinates.C1, new Bishop(PieceColor.WHITE));
        board.put(PieceCoordinates.F1, new Bishop(PieceColor.WHITE));
           // Queen
        board.put(PieceCoordinates.D8, new Queen(PieceColor.BLACK));
        board.put(PieceCoordinates.D1, new Queen(PieceColor.WHITE));
           // King
        board.put(PieceCoordinates.E8, new King(PieceColor.BLACK));
        board.put(PieceCoordinates.E1, new King(PieceColor.WHITE));
           // Pawn
        PieceCoordinates[] coordinatesForPawn = new PieceCoordinates[16];
        System.arraycopy(PieceCoordinates.values(), 8, coordinatesForPawn, 0, 8);
        System.arraycopy(PieceCoordinates.values(), 48, coordinatesForPawn, 8, 8);

        for (int i = 0; i < coordinatesForPawn.length; i++) {
            board.put(coordinatesForPawn[i], new Pawn((i <= 7 ? PieceColor.BLACK : PieceColor.WHITE)));
        }
    }

    public void rendererLine() {
        // fontColor + backgroundColor + text

        StringBuilder line = new StringBuilder();
        boolean isBlackCell = true;

        for (int i = 0; i < PieceCoordinates.values().length; i++) {
            Piece piece = board.get(PieceCoordinates.values()[i]);
            line.append(rendererCell(piece, isBlackCell));
            isBlackCell = !isBlackCell;

            if ((i + 1) % 8 == 0 & i != 1) {
                line.append(ANSI_RESET);
                System.out.println(line);
                line = new StringBuilder();
                isBlackCell = !isBlackCell;
            }
        }
    }

    private String rendererCell(Piece piece, boolean isBlackCell) {

        StringBuilder cell = new StringBuilder();

        if (piece != null) {
            cell.append(piece.getPieceColor() == PieceColor.BLACK ? BLACK_PIECE : WHITE_PIECE);
            cell.append(isBlackCell ? BLACK_BACKGROUND : WHITE_BACKGROUND);
            cell.append(switch (piece.whatsIsThePiece()) {
                case ("Pawn") -> " ♟ ";
                case ("Rook") -> " ♜ ";
                case ("Knight") -> " ♞ ";
                case ("Bishop") -> " ♝ ";
                case ("Queen") -> " ♛ ";
                case ("King") -> " ♚ ";
                default -> "";
            });
        } else {
            cell.append(BLACK_PIECE)
                .append((isBlackCell) ? BLACK_BACKGROUND : WHITE_BACKGROUND)
                .append("    ");
        }
        return cell.toString();
    }

    /* Метод Board.isAllowableMove() проверяет не мешает ли такому ходу ситуация на доске:
          - Не выходит ли она за пределы доски               - Не перекрывает ли ей дорогу другая фигура
          - Не перекрывает ли ей дорогу другая фигура        - Не открывается ли шах таким ходом
      Метод Piece.possibleMovesWithoutContext() проверяет ходит ли так данная фигура вообще (не беря во внимание ситуацию на доске) */
    public void makeMove(PieceCoordinates coordinatesFrom, PieceCoordinates coordinatesTo) throws NotAllowableMoveException {
        if (isAllowableMove(coordinatesFrom, coordinatesTo)) {
            board.put(coordinatesTo, board.get(coordinatesFrom));
            board.put(coordinatesFrom, null);
        } else {
            throw new NotAllowableMoveException();
        }
    }

    private boolean isAllowableMove(PieceCoordinates coordinatesFrom, PieceCoordinates coordinatesTo) throws NotAllowableMoveException {
        Piece piece = board.get(coordinatesFrom);
        if (piece.possibleMovesWithoutContext(coordinatesFrom).contains(coordinatesTo)) {
            return true;
        } else {
            throw new NotAllowableMoveException();
        }
    }
}
