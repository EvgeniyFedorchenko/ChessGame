import javax.sound.sampled.Line;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Board {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String WHITE_PIECE = "\u001B[97m";
    public static final String BLACK_PIECE = "\u001B[30m";

    public static final String WHITE_BACKGROUND = "\u001B[47m";

    public static final String BLACK_BACKGROUND = "\u001B[0;100m";

    public static final String HIGHLIGHTED_BACKGROUND = "\u001B[45m";


    private Map<Coordinates, Piece> board;

    public Board() {
        this.board = new LinkedHashMap<>();
//        this.startSetup();

//        for (int lines = 8; lines >= 1; lines--) {
//            for (int column = 0; column < Column.values().length; column++) {
//                Coordinates coordinates = new Coordinates(Column.values()[column], lines);
//                board.put(coordinates, null);
//            }
    }

    public Piece getPiece(Coordinates coordinates) {
        return board.get(coordinates);
    }

    public Map<Coordinates, Piece> getBoard() {
        return board;
    }

    public void renderer() {

        List<Coordinates> cells = new ArrayList<>(board.keySet());

        String line = "";
        boolean isBlackCell = true;
        for (int i = 0; i < cells.size(); i++) {
            line += BLACK_PIECE + (isBlackCell ? WHITE_BACKGROUND : BLACK_BACKGROUND) + getStringIcon(this.getPiece(cells.get(i)));
            isBlackCell = !isBlackCell;
            if ((i + 1) % 8 == 0 & i != 1) {
                line += ANSI_RESET;
                System.out.println(line);
                line = "";
                isBlackCell = !isBlackCell;
            }
        }
    }

    private String getStringIcon(Piece piece) {
        if (piece == null) {
            return "    ";
        } else {
            return " " + piece.returnIcon() + " ";

        }
    }

//    public void startSetup() {
//        /*for (Coordinates coordinates : board.keySet()) {
//            if (coordinates.getLines() == 7) {
//                board.put(coordinates, new Pawn(PieceColor.BLACK));
//            }
//            if (coordinates.getLines() == 2) {
//                board.put(coordinates, new Pawn(PieceColor.WHITE));
//            }
//        }*/
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A2 = new Coordinates("A2");
//        board.put(A2, null);
//        Coordinates A3 = new Coordinates("A3");
//        board.put(A3, null);
//        Coordinates A4 = new Coordinates("A4");
//        board.put(A4, null);
//        Coordinates A5 = new Coordinates("A5");
//        board.put(A5, null);
//        Coordinates A6 = new Coordinates("A6");
//        board.put(A6, null);
//        Coordinates A7 = new Coordinates("A7");
//        board.put(A7, null);
//        Coordinates A8 = new Coordinates("A8");
//        board.put(A8, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//        Coordinates A1 = new Coordinates("A1");
//        board.put(A1, null);
//    }
}
