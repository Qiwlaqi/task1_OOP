package main.java.cube.specifcation.impl;

import main.java.cube.entity.Cube;
import main.java.cube.specifcation.Specification;

public class SpecificationById implements Specification {
    private long id;

    public SpecificationById(long id) {
        this.id = id;
    }

    @Override
    public boolean specified(Cube cube) {
        return (cube.getCubeId() == id);
    }
}
