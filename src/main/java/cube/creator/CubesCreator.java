package main.java.cube.creator;

import main.java.cube.entity.Cube;
import main.java.cube.entity.Point;

import java.util.List;

public class CubesCreator {
    public void createCubes(List<Double> arguments, List<Cube> cubes) {
        if (arguments != null) {
            if (arguments.get(3) > 0) {
                cubes.add(new Cube(new Point(arguments.get(0), arguments.get(1), arguments.get(2)), arguments.get(3)));
            }
        }
    }
}
