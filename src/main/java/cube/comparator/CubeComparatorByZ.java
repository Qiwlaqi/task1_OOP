package main.java.cube.comparator;

import main.java.cube.entity.Cube;

import java.util.Comparator;

public class CubeComparatorByZ implements Comparator<Cube> {
    @Override
    public int compare(Cube o1, Cube o2) {
        return (Double.compare(o1.getVertex().getZ(), o2.getVertex().getZ()));
    }
}