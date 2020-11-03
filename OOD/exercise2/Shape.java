package exercise2;

/**
 * Program: INFO5100
 * Description: exercise2
 * CreatedBy: Nicole_Z
 * CreatDate: 11/02/2020
 **/

public abstract class Shape {
    final String shape = this.getClass().getSimpleName();
    protected abstract double calculateArea();
    protected abstract double calculatePerimeter();
}
