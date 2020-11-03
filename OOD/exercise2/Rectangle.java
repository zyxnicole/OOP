package exercise2;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/02/2020
 **/

public class Rectangle extends Shape{
    public static final String Color = "Blue";

    private final int width;
    private final int length;

    Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    protected double calculateArea() {
        return width * length;
    }

    @Override
    protected double calculatePerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return String.format("%s - [width, length: %d, %d]", shape, width, length);
    }

    public static void main(String[] args) {
        System.out.println("Color of the rectangle: " + Rectangle.Color);
        Rectangle rectangle = new Rectangle(2,5);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
