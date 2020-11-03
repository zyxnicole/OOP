package exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/02/2020
 **/

public class Canvas {

    List<Shape> shapes = new ArrayList<>();

    public void draw(Shape shape) {
        shapes.add(shape);
    }

    public void printAllShapes() {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    public static void main(String[] args) {
        Canvas c = new Canvas();
        c.draw(new Triangle(2, 2, 2));
        c.draw(new Circle(3.1));
        c.draw(new Rectangle(10, 12));
        c.draw(new Square(3));
        c.printAllShapes();
    }
}
