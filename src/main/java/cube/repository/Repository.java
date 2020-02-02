package main.java.cube.repository;

import main.java.cube.entity.Cube;
import main.java.cube.specifcation.Specification;

import java.util.List;

public interface Repository {
    void add(Cube cube);

    void remove(Cube cube);

    List<Cube> query(Specification specification);
}