package main.java.cube.parser;

import main.java.cube.creator.CubesCreator;
import main.java.cube.entity.Cube;
import main.java.cube.validator.CubeValidator;
import main.java.cube.validator.ValueValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser{
    private static Logger logger = LogManager.getLogger();
    private static final String REGEX_SPACE = "\\s+";

    private static List<Double> parseToDoubleArray(String line) {
        line = line.strip();
        if ((new ValueValidator().isDouble(line))) {
            List<String> strings = Arrays.asList(line.split(REGEX_SPACE));
            List<Double> arguments = new ArrayList<>();
            for (String string : strings) {
                arguments.add(Double.parseDouble(string));
            }
            if (new CubeValidator().isValidCubArguments(arguments)) {
                return arguments;
            }
        }
        return null;
    }

    public List<Cube> parseToCubeArray(List<String> lines) {
        CubesCreator creator = new CubesCreator();
        List<Cube> cubes = new ArrayList<>();
        for (String line : lines) {
            List<Double> arguments = parseToDoubleArray(line);
            creator.createCubes(arguments, cubes);
        }
        logger.log(Level.INFO, "Cube list is created");
        return cubes;
    }
}
