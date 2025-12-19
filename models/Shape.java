package models;

import java.util.ArrayList;

public class Shape {

    private ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point p) {
        points.add(p);
    }

    public double calculatePerimeter() {
        int n = points.size();
        if (n < 2) return 0.0;

        double perimeter = 0.0;

        for (int i = 0; i < n - 1; i++) {
            perimeter += points.get(i).distance(points.get(i + 1));
        }

        perimeter += points.get(n - 1).distance(points.get(0));

        return perimeter;
    }

    public double getAverageSide() {
        int n = points.size();
        if (n < 2) return 0.0;
        return calculatePerimeter() / n;
    }

    public double getLongest() {
        int n = points.size();
        if (n < 2) return 0.0;

        double longest = 0.0;

        for (int i = 0; i < n - 1; i++) {
            double side = points.get(i).distance(points.get(i + 1));
            if (side > longest) {
                longest = side;
            }
        }

        double closing = points.get(n - 1).distance(points.get(0));
        if (closing > longest) {
            longest = closing;
        }

        return longest;
    }
}




