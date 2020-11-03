package exercise2;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/02/2020
 **/

public class Circle extends Shape {
    public final static double PI = 3.14159;

    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return PI * radius *radius;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return String.format("%s - [radius: %f]", shape, radius);
    }

    public static void main(String[] args) {
        System.out.println("PI: " + Circle.PI);
        Circle circle = new Circle(4.5);
        System.out.printf("Area: %.2f \n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", circle.calculatePerimeter());
    }
}
