import Pieces.*;

import java.util.*;

public class Board {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String WHITE_PIECE ="\033[0;45m";
    public static final String BLACK_PIECE = "\033[0;30m";
    public static final String YELLOW_PIECE = "\033[0;33m";
    public static final String WHITE_BACKGROUND = "\033[47m";
    public static final String BLACK_BACKGROUND = "\033[100m";


    private Map<PieceCoordinates, Piece> board;

    public Board() {
        this.board = new HashMap<>();
        for (int i = 0; i < PieceCoordinates.values().length; i++) {
            board.put(PieceCoordinates.values()[i], null);
        }
        startSetup();
    }

    private void startSetup() {
        board.put(PieceCoordinates.A8, new Rook(PieceColor.BLACK, PieceCoordinates.A8));
        board.put(PieceCoordinates.H8, new Rook(PieceColor.BLACK, PieceCoordinates.H8));
        board.put(PieceCoordinates.A1, new Rook(PieceColor.WHITE, PieceCoordinates.A1));
        board.put(PieceCoordinates.H1, new Rook(PieceColor.WHITE, PieceCoordinates.H1));

        board.put(PieceCoordinates.B8, new Knight(PieceColor.BLACK, PieceCoordinates.B8));
        board.put(PieceCoordinates.G8, new Knight(PieceColor.BLACK, PieceCoordinates.G8));
        board.put(PieceCoordinates.B1, new Knight(PieceColor.WHITE, PieceCoordinates.B1));
        board.put(PieceCoordinates.G1, new Knight(PieceColor.WHITE, PieceCoordinates.G1));

        board.put(PieceCoordinates.C8, new Bishop(PieceColor.BLACK, PieceCoordinates.C8));
        board.put(PieceCoordinates.F8, new Bishop(PieceColor.BLACK, PieceCoordinates.F8));
        board.put(PieceCoordinates.C1, new Bishop(PieceColor.WHITE, PieceCoordinates.C1));
        board.put(PieceCoordinates.F1, new Bishop(PieceColor.WHITE, PieceCoordinates.F1));

        board.put(PieceCoordinates.D8, new Queen(PieceColor.BLACK, PieceCoordinates.D8));
        board.put(PieceCoordinates.D1, new Queen(PieceColor.WHITE, PieceCoordinates.D1));

        board.put(PieceCoordinates.E8, new King(PieceColor.BLACK, PieceCoordinates.E8));
        board.put(PieceCoordinates.E1, new King(PieceColor.WHITE, PieceCoordinates.E1));

        PieceCoordinates[] coordinatesForPawn = new PieceCoordinates[16];
        System.arraycopy(PieceCoordinates.values(), 8, coordinatesForPawn, 0, 8);
        System.arraycopy(PieceCoordinates.values(), 48, coordinatesForPawn, 8, 8);

        for (int i = 0; i < coordinatesForPawn.length; i++) {
            board.put(coordinatesForPawn[i],
                    new Pawn((i <= 7 ? PieceColor.BLACK : PieceColor.WHITE), coordinatesForPawn[i]));
        }

    }

    public Piece getPiece(PieceCoordinates pieceCoordinates) {
        return board.get(pieceCoordinates);
    }

    public Map<PieceCoordinates, Piece> getBoard() {
        return board;
    }

    // fontColor + backgroundColor + text
    public void rendererLine() {

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
            cell.append(piece.getColor() == PieceColor.BLACK ? BLACK_PIECE : WHITE_PIECE);
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
}
