package test.java.reader;

import main.java.cube.exception.CustomException;
import main.java.cube.reader.DataReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DataReaderTest {
    DataReader reader;

    @BeforeClass
    public void setUp() {
        reader = new DataReader();
    }

    @Test
    public void testReadAll() throws CustomException {
        int expected = 10;
        int actual = reader.readAll("src\\initials.txt").size();
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {CustomException.class})
    public void testFalseReadAll() throws CustomException {
        reader.readAll("src\\false.txt").size();
    }

}
