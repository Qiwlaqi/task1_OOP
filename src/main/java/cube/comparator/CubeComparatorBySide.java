package main.java.cube.comparator;

import main.java.cube.entity.Cube;
import java.util.Comparator;

public class CubeComparatorBySide implements Comparator<Cube> {
    @Override
    public int compare(Cube o1, Cube o2) {
        return (Double.compare(o1.getSide(), o2.getSide()));
    }
}
