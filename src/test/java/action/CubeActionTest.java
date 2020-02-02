package test.java.action;

import main.java.cube.action.CubeAction;
import main.java.cube.entity.Cube;
import main.java.cube.entity.Point;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CubeActionTest {
    Cube cube;
    CubeAction action;


    @BeforeMethod
    public void setUp() {
        cube = new Cube(new Point(4, 5, 2), 3);
        action = new CubeAction();
    }

    @DataProvider
    public Object[][] readData() {
        return new Object[][]{
                {new Cube(new Point(4, 7, 2), 6), 216},
                {new Cube(new Point(2, -3, -7), 2), 8},
                {new Cube(new Point(4, 1, -9), 1), 1},
        };
    }

    @Test(dataProvider = "readData")
    public void testCalculateVolume(Cube cube, double expected) {
        double actual = action.calculateVolume(cube);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateSquare() {
        double expected = 54;
        double actual = action.calculateSquare(cube);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculatePerimeter() {
        double expected = 36;
        double actual = action.calculatePerimeter(cube);
        Assert.assertEquals(expected, actual);
    }
}