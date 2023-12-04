package plaingField;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    private Column column;
    private Integer line;

    // Константы координат на доске
    public static final Coordinates A8 = new Coordinates(Column.A, 8);
    public static final Coordinates B8 = new Coordinates(Column.B, 8);
    public static final Coordinates C8 = new Coordinates(Column.C, 8);
    public static final Coordinates D8 = new Coordinates(Column.D, 8);
    public static final Coordinates E8 = new Coordinates(Column.E, 8);
    public static final Coordinates F8 = new Coordinates(Column.F, 8);
    public static final Coordinates G8 = new Coordinates(Column.G, 8);
    public static final Coordinates H8 = new Coordinates(Column.H, 8);
    public static final Coordinates A7 = new Coordinates(Column.A, 7);
    public static final Coordinates B7 = new Coordinates(Column.B, 7);
    public static final Coordinates C7 = new Coordinates(Column.C, 7);
    public static final Coordinates D7 = new Coordinates(Column.D, 7);
    public static final Coordinates E7 = new Coordinates(Column.E, 7);
    public static final Coordinates F7 = new Coordinates(Column.F, 7);
    public static final Coordinates G7 = new Coordinates(Column.G, 7);
    public static final Coordinates H7 = new Coordinates(Column.H, 7);
    public static final Coordinates A6 = new Coordinates(Column.A, 6);
    public static final Coordinates B6 = new Coordinates(Column.B, 6);
    public static final Coordinates C6 = new Coordinates(Column.C, 6);
    public static final Coordinates D6 = new Coordinates(Column.D, 6);
    public static final Coordinates E6 = new Coordinates(Column.E, 6);
    public static final Coordinates F6 = new Coordinates(Column.F, 6);
    public static final Coordinates G6 = new Coordinates(Column.G, 6);
    public static final Coordinates H6 = new Coordinates(Column.H, 6);
    public static final Coordinates A5 = new Coordinates(Column.A, 5);
    public static final Coordinates B5 = new Coordinates(Column.B, 5);
    public static final Coordinates C5 = new Coordinates(Column.C, 5);
    public static final Coordinates D5 = new Coordinates(Column.D, 5);
    public static final Coordinates E5 = new Coordinates(Column.E, 5);
    public static final Coordinates F5 = new Coordinates(Column.F, 5);
    public static final Coordinates G5 = new Coordinates(Column.G, 5);
    public static final Coordinates H5 = new Coordinates(Column.H, 5);
    public static final Coordinates A4 = new Coordinates(Column.A, 4);
    public static final Coordinates B4 = new Coordinates(Column.B, 4);
    public static final Coordinates C4 = new Coordinates(Column.C, 4);
    public static final Coordinates D4 = new Coordinates(Column.D, 4);
    public static final Coordinates E4 = new Coordinates(Column.E, 4);
    public static final Coordinates F4 = new Coordinates(Column.F, 4);
    public static final Coordinates G4 = new Coordinates(Column.G, 4);
    public static final Coordinates H4 = new Coordinates(Column.H, 4);
    public static final Coordinates A3 = new Coordinates(Column.A, 3);
    public static final Coordinates B3 = new Coordinates(Column.B, 3);
    public static final Coordinates C3 = new Coordinates(Column.C, 3);
    public static final Coordinates D3 = new Coordinates(Column.D, 3);
    public static final Coordinates E3 = new Coordinates(Column.E, 3);
    public static final Coordinates F3 = new Coordinates(Column.F, 3);
    public static final Coordinates G3 = new Coordinates(Column.G, 3);
    public static final Coordinates H3 = new Coordinates(Column.H, 3);
    public static final Coordinates A2 = new Coordinates(Column.A, 2);
    public static final Coordinates B2 = new Coordinates(Column.B, 2);
    public static final Coordinates C2 = new Coordinates(Column.C, 2);
    public static final Coordinates D2 = new Coordinates(Column.D, 2);
    public static final Coordinates E2 = new Coordinates(Column.E, 2);
    public static final Coordinates F2 = new Coordinates(Column.F, 2);
    public static final Coordinates G2 = new Coordinates(Column.G, 2);
    public static final Coordinates H2 = new Coordinates(Column.H, 2);
    public static final Coordinates A1 = new Coordinates(Column.A, 1);
    public static final Coordinates B1 = new Coordinates(Column.B, 1);
    public static final Coordinates C1 = new Coordinates(Column.C, 1);
    public static final Coordinates D1 = new Coordinates(Column.D, 1);
    public static final Coordinates E1 = new Coordinates(Column.E, 1);
    public static final Coordinates F1 = new Coordinates(Column.F, 1);
    public static final Coordinates G1 = new Coordinates(Column.G, 1);
    public static final Coordinates H1 = new Coordinates(Column.H, 1);

    public Coordinates(String coordinates) {
        // TODO: 04.12.2023 сделать конструкторы приватными?
        this.column = Column.valueOf(coordinates.split("")[0]);
        this.line = Integer.valueOf(coordinates.split("")[1]);
    }

    public Coordinates(Column column, Integer line) {
        this.column = column;
        this.line = line;
    }

    public Column getColumn() {
        return column;
    }

    public Integer getLine() {
        return line;
    }

    public static List<Coordinates> coordinatesCreate() {

        List<Coordinates> coordinatesList = new ArrayList<>(64);

        coordinatesList.add(A8);     coordinatesList.add(B8);     coordinatesList.add(C8);     coordinatesList.add(E8);
        coordinatesList.add(D8);     coordinatesList.add(F8);     coordinatesList.add(G8);     coordinatesList.add(H8);
        coordinatesList.add(A7);     coordinatesList.add(B7);     coordinatesList.add(C7);     coordinatesList.add(D7);
        coordinatesList.add(E7);     coordinatesList.add(F7);     coordinatesList.add(G7);     coordinatesList.add(H7);
        coordinatesList.add(A6);     coordinatesList.add(B6);     coordinatesList.add(C6);     coordinatesList.add(D6);
        coordinatesList.add(E6);     coordinatesList.add(F6);     coordinatesList.add(G6);     coordinatesList.add(H6);
        coordinatesList.add(A5);     coordinatesList.add(B5);     coordinatesList.add(C5);     coordinatesList.add(D5);
        coordinatesList.add(E5);     coordinatesList.add(F5);     coordinatesList.add(G5);     coordinatesList.add(H5);
        coordinatesList.add(A4);     coordinatesList.add(B4);     coordinatesList.add(C4);     coordinatesList.add(D4);
        coordinatesList.add(E4);     coordinatesList.add(F4);     coordinatesList.add(G4);     coordinatesList.add(H4);
        coordinatesList.add(A3);     coordinatesList.add(B3);     coordinatesList.add(C3);     coordinatesList.add(D3);
        coordinatesList.add(E3);     coordinatesList.add(F3);     coordinatesList.add(G3);     coordinatesList.add(H3);
        coordinatesList.add(A2);     coordinatesList.add(B2);     coordinatesList.add(C2);     coordinatesList.add(D2);
        coordinatesList.add(E2);     coordinatesList.add(F2);     coordinatesList.add(G2);     coordinatesList.add(H2);
        coordinatesList.add(A1);     coordinatesList.add(B1);     coordinatesList.add(C1);     coordinatesList.add(D1);
        coordinatesList.add(E1);     coordinatesList.add(F1);     coordinatesList.add(G1);     coordinatesList.add(H1);

        return coordinatesList;
    }
}
