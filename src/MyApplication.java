import models.Circle;
import models.Rectangle;
import models.Shape;
import models.Triangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File trianglesFile = new File("src/data/triangles.txt");
        File rectanglesFile = new File("src/data/rectangles.txt");
        File circlesFile = new File("src/data/circles.txt");

        Scanner trianglesSc = new Scanner(trianglesFile);
        Scanner rectanglesSc = new Scanner(rectanglesFile);
        Scanner circlesSc = new Scanner(circlesFile);

        ArrayList<Shape> shapes = new ArrayList<>();

        while (trianglesSc.hasNext()) {
            Triangle t = new Triangle(trianglesSc.nextInt(), trianglesSc.nextInt(), trianglesSc.nextInt());

            shapes.add(t);
        }

        while (rectanglesSc.hasNext()) {
            Rectangle r = new Rectangle(rectanglesSc.nextInt(), rectanglesSc.nextInt());

            shapes.add(r);
        }

        while (circlesSc.hasNext()) {
            Circle c = new Circle(circlesSc.nextInt());

            shapes.add(c);
        }


        for (Shape shape : shapes) {
            System.out.println("A shape of type: " + shape.getClass());
            System.out.println("perimeter: " + shape.perimeter());
            System.out.println("area: " + shape.area());
        }
    }
}
