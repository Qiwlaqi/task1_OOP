package test.java.parser;

import main.java.cube.exception.CustomException;
import main.java.cube.parser.DataParser;
import main.java.cube.reader.DataReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataParserTest {

    @Test
    public void testParseToCubeArray() throws CustomException {
        int expected = 4;
        int actual = new DataParser().parseToCubeArray
                (new DataReader().readAll("src\\initials.txt")).size();
        Assert.assertEquals(actual, expected);
    }
}