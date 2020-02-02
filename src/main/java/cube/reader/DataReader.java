package main.java.cube.reader;

import main.java.cube.exception.CustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {
    private static Logger logger = LogManager.getLogger();

    public List<String> readAll(String filePath) throws CustomException {
        List<String> lines;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            lines = bufferedReader.lines().collect(Collectors.toList());
            logger.log(Level.INFO, "File is successfully read");
        } catch (IOException ex) {
            logger.log(Level.ERROR, "Error while opening file", ex);
            throw new CustomException("Error while opening file", ex);
        }
        return lines;
    }
}
