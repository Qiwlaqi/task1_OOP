package main.java.cube.entity;

import main.java.cube.generator.IdGenerator;
import main.java.cube.observer.Observable;
import main.java.cube.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Cube implements Observable {
    private long cubeId;
    private Point vertex;
    private double side;
    private List<Observer> observers = new ArrayList<>();

    public Cube(Point vertex, double side) {
        this.cubeId = IdGenerator.generateId();
        this.vertex = vertex;
        this.side = side;
    }

    public long getCubeId() {
        return cubeId;
    }

    public void setCubeId(long cubeId) {
        this.cubeId = cubeId;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side, Cube cube) {
        cube.side = side;
        notifyObserver(cube);
    }

    public void setVertex(Point vertex, Cube cube) {
        cube.vertex = vertex;
        notifyObserver(cube);
    }

    public Point getVertex() {
        return vertex;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Cube cube = (Cube) obj;
        return (cubeId == cube.cubeId && Double.compare(side, cube.side) == 0 && cube.vertex.equals(vertex));
    }

    public boolean equalsCube(Cube cube) {
        if (cube == this) {
            return true;
        }
        if (cube == null) {
            return false;
        }
        return (Double.compare(side, cube.side) == 0 && cube.vertex.equals(vertex));
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + (int) side;
        result = PRIME * result + (int) cubeId;
        result = PRIME * result + vertex.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\nCube: " + "side = " + side + " ID = " + cubeId + " vertex = " + vertex.toString();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Cube cube) {
        for (Observer observer : observers) {
            observer.update(cube);
        }
    }
}
