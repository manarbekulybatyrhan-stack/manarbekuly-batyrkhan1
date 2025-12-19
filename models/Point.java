package models;

public class Point {

    private double x;
    private double y;

    // constructor just saves x and y
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // calculate distance from this point to other point
    public double distance(Point other) {
        double dx = other.x - x;
        double dy = other.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // used when printing point
    @Override
    public String toString() {
        return x + ", " + y;
    }
}


