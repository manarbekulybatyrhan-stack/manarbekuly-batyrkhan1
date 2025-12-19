import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {

        // file where coordinates are stored
        File file = new File("src/source");
        Scanner sc = new Scanner(file);

        // needed for numbers with dot
        sc.useLocale(Locale.US);
        // split input by comma or space
        sc.useDelimiter("[,\\s]+");

        Shape shape = new Shape();

        // read x and y from file
        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            shape.addPoint(new Point(x, y));
        }

        // print results
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getAverageSide());
        System.out.println(shape.getLongest());
    }
}




