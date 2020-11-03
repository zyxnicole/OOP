package exercise2;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/02/2020
 **/

public class Square extends Shape{
    public final static String NAME = Square.class.getSimpleName();
    private final double edgeLength;

    Square(double edgeLength) {
        this.edgeLength = edgeLength;
    }
    @Override
    protected double calculateArea() {
        return edgeLength * edgeLength;
    }

    @Override
    protected double calculatePerimeter() {
        return edgeLength * 4;
    }

    @Override
    public String toString() {
        return String.format("%s - [edgeLength: %f]", shape, edgeLength);
    }
    public static void main(String[] args) {
        System.out.println("Name: " + Square.NAME);
        Square square = new Square(3.5);
        System.out.printf("Area: %.2f\n", square.calculateArea());
        System.out.printf("Perimeter: %.2f\n", square.calculatePerimeter());

    }
}
