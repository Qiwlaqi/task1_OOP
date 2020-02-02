package main.java.cube.repository;

import main.java.cube.comparator.CubeComparatorBySide;
import main.java.cube.entity.Cube;
import main.java.cube.specifcation.Specification;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CubesRepository extends CubeComparatorBySide implements Repository {
    private static CubesRepository cubesRepository;
    private List<Cube> repository = new ArrayList<>();
    private static Logger logger = LogManager.getLogger();

    private CubesRepository() {
    }

    public static CubesRepository getInstance() {
        if (cubesRepository == null) {
            cubesRepository = new CubesRepository();
        }
        logger.log(Level.INFO, "Repository is created");
        return cubesRepository;
    }

    @Override
    public void add(Cube cube) {
        repository.add(cube);
    }

    @Override
    public void remove(Cube cube) {
        repository.remove(cube);
    }

    @Override
    public List<Cube> query(Specification specification) {
        List<Cube> resultListCube = new ArrayList<>();
        for (Cube cube : repository) {
            if (specification.specified(cube)) {
                resultListCube.add(cube);
            }
        }
        return resultListCube;
    }

    @Override
    public String toString() {
        return "repository is:\n" + repository;
    }
}
