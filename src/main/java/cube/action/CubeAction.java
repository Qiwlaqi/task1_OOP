package main.java.cube.action;

import main.java.cube.entity.Cube;

public class CubeAction {

    public double calculateSquare(Cube cube) {
        return (6 * cube.getSide() * cube.getSide());
    }

    public double calculateVolume(Cube cube) {
        return (Math.pow(cube.getSide(), 3));
    }

    public double calculatePerimeter(Cube cube) {
        return (12 * cube.getSide());
    }

    public boolean liesInThePlane(Cube cube) {
        return ((cube.getVertex().getX() == 0) || (cube.getVertex().getY() == 0) || (cube.getVertex().getZ() == 0));
    }

    public String volumesRatioByXY(Cube cube) {
        double z = cube.getVertex().getZ();
        double side = cube.getSide();
        if (z < 0 && -z < side) {
            double z1 = side + z;
            return (side * side * -z + " : " + side * side * z1);
        }
        return null;
    }

    public String volumesRatioByYZ(Cube cube) {
        double x = cube.getVertex().getX();
        double side = cube.getSide();
        if (x < 0 && -x < side) {
            double x1 = side + x;
            return (side * side * -x + " : " + side * side * x1);
        }
        return null;
    }

    public String volumesRatioByXZ(Cube cube) {
        double y = cube.getVertex().getY();
        double side = cube.getSide();
        if (y < 0 && -y < side) {
            double y1 = side + y;
            return (side * side * -y + " : " + side * side * y1);
        }
        return null;
    }
}
