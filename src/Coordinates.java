import java.util.Objects;

public class Coordinates {
    private Column column;
    private Integer lines;

    /**
     * @param coordinates - String of two chars: first char is Line, second char is column
     */
    public Coordinates(String coordinates) {
        this.column = Column.valueOf(coordinates.split("")[0]);
        this.lines = Integer.valueOf(coordinates.split("")[1]);
    }

    public Coordinates(Column column, Integer lines) {
        this.column = column;
        this.lines = lines;
    }

    public int getLines() {
        return this.lines;
    }
}
