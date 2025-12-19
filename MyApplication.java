import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {

        
        File file = new File("src/source");
        Scanner sc = new Scanner(file);

        
        sc.useLocale(Locale.US);
        sc.useDelimiter("[,\\s]+");

        Shape shape = new Shape();

        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            shape.addPoint(new Point(x, y));
        }

        
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getAverageSide());
        System.out.println(shape.getLongest());
    }
}




