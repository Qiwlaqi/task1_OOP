package main.java.cube.specifcation.impl;

import main.java.cube.entity.Cube;
import main.java.cube.specifcation.Specification;

public class SpecificationBySide implements Specification {
    private double side;

    public SpecificationBySide(double side) {
        this.side = side;
    }

    @Override
    public boolean specified(Cube cube) {
        return (cube.getSide() >= side);
    }
}
