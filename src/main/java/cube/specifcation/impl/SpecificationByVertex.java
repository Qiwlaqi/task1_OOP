package main.java.cube.specifcation.impl;

import main.java.cube.entity.Cube;
import main.java.cube.entity.Point;
import main.java.cube.specifcation.Specification;

public class SpecificationByVertex implements Specification {
    private Point vertex;

    public SpecificationByVertex(Point vertex) {
        this.vertex = vertex;
    }

    @Override
    public boolean specified(Cube cube) {
        return (cube.getVertex().equalsPoint(vertex));
    }
}
