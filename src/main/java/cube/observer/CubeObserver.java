package main.java.cube.observer;

import main.java.cube.action.CubeAction;
import main.java.cube.entity.Cube;
import main.java.cube.warehouse.CubesWarehouse;

import java.util.ArrayList;
import java.util.Arrays;

public class CubeObserver implements Observer {

    @Override
    public void update(Cube cube) {
        CubeAction action = new CubeAction();
        CubesWarehouse warehouse = CubesWarehouse.getInstance();
        double square = action.calculateSquare(cube);
        double volume = action.calculateVolume(cube);
        double perimeter = action.calculatePerimeter(cube);

        warehouse.warehouse.put(cube.getCubeId(),
                new ArrayList<>(Arrays.asList(square, volume, perimeter)));
    }
}
