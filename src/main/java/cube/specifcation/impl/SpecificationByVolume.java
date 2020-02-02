package main.java.cube.specifcation.impl;

import main.java.cube.action.CubeAction;
import main.java.cube.entity.Cube;
import main.java.cube.specifcation.Specification;

public class SpecificationByVolume implements Specification {
    private double volume;

    public SpecificationByVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean specified(Cube cube) {
        return (new CubeAction().calculateVolume(cube) >= volume);
    }
}
