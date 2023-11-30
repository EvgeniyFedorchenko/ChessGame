import javax.sound.sampled.Line;
import java.util.*;

public class Board {


    final String BLACK_BACKGROUND = "\033[100m";  // BLACK
    final String WHITE_BACKGROUND = "\033[47m";  // WHITE
    final String BLACK = "\033[0;30m";   // BLACK
    final String WHITE = "\033[0;37m";   // WHITE
    final String RESET = "\033[0m";  // Text Reset


    private Map<Coordinates, Piece> board;

    public Board() {
        this.board = new LinkedHashMap<>();

        for (int lines = 8; lines >= 1; lines--) {
            for (int column = 0; column < Column.values().length; column++) {
                board.put(new Coordinates(Column.values()[column], lines), null);
            }
        }
    }

    public void startSetup() {

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
            line += BLACK + (isBlackCell ? WHITE_BACKGROUND : BLACK_BACKGROUND) + "   ";
            isBlackCell = !isBlackCell;
            if ((i + 1) % 8 == 0 & i != 1) {
                line += RESET;
                System.out.println(line);
                line = "";
                isBlackCell = !isBlackCell;
            }
        }
    }
}
