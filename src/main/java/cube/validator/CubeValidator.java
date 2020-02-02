package main.java.cube.validator;

import java.util.List;

public class CubeValidator {
    private static final int CUBE_ARGS = 4;

    public boolean isValidCubArguments(List<Double> arguments) {
        return (arguments.size() == CUBE_ARGS);
    }
}
