package exercise2;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/02/2020
 **/

public class Triangle extends Shape {
    public static final String NAME = Triangle.class.getSimpleName();

    private final double edgeA;
    private final double edgeB;
    private final double edgeC;

    Triangle(double edgeA, double edgeB, double edgeC) {
        if (edgeA <= 0
            || edgeB <= 0
            || edgeC <= 0
            || edgeA + edgeB <= edgeC
            || edgeA + edgeC <= edgeB
            || edgeB + edgeC <= edgeA) {
            throw new IllegalArgumentException(
                    String.format("[edgeA, edgeB, edgeC: %f, %f, %f] is not a valid triangle", edgeA, edgeB, edgeC));
        }
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    @Override
    protected double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));
    }

    @Override
    protected double calculatePerimeter() {
        return edgeA + edgeB + edgeC;
    }

    @Override
    public String toString() {
        return String.format("%s - [edgeA, edgeB, edgeC: %f, %f, %f]", shape, edgeA, edgeB, edgeC);
    }

    public static void main(String[] args) {
        System.out.println("Name: " + Triangle.NAME);
        Shape triangle2 = new Triangle(2, 2,3);
        System.out.println("Name: " + triangle2.shape);
        System.out.println("Perimeter = " + triangle2.calculatePerimeter());
        System.out.printf("Area = %.2f \n", triangle2.calculateArea());
        Triangle triangle = new Triangle(100, 100, 100);
        System.out.println("Perimeter = " + triangle2.calculatePerimeter());
        System.out.println("Perimeter = " + triangle.calculatePerimeter());
    }
}
