package main.java.cube.warehouse;

import main.java.cube.entity.Cube;
import main.java.cube.observer.CubeObserver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CubesWarehouse {
    private static CubesWarehouse cubesWarehouse;
    public Map<Long, List<Double>> warehouse = new HashMap<>();

    private CubesWarehouse() {
    }

    public static CubesWarehouse getInstance() {
        if (cubesWarehouse == null) {
            cubesWarehouse = new CubesWarehouse();
        }
        return cubesWarehouse;
    }

    public void putMetaData(Cube cube) {
        new CubeObserver().update(cube);
    }

    public void removeMetaData(long key) {
        warehouse.remove(key);
    }


    @Override
    public String toString() {
        return "warehouse is:\n" + warehouse;
    }


}
