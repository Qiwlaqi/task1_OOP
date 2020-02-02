package main.java.cube.observer;

import main.java.cube.entity.Cube;

public interface Observable {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObserver(Cube cube);
}
