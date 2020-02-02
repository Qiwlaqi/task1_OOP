package main.java.cube.entity;

import main.java.cube.generator.IdGenerator;

public class Point {
    private long pointId;
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.pointId = IdGenerator.generateId();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long getId() {
        return pointId;
    }

    public void setId(long pointId) {
        this.pointId = pointId;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;

    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return (pointId == point.pointId && Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0 && Double.compare(z, point.z) == 0);
    }

    public boolean equalsPoint(Point point) {
        if (point == this) {
            return true;
        }
        if (point == null) {
            return false;
        }
        return (Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0 && Double.compare(z, point.z) == 0);
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + (int) x;
        result = PRIME * result + (int) y;
        result = PRIME * result + (int) z;
        result = PRIME * result + (int) pointId;
        return result;
    }

    @Override
    public String toString() {
        return "Point: " + "x = " + x + " y = " + y + " z = " + z + " ID = " + pointId + " ";
    }
}
