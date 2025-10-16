package ch45.ex6;

public class Circle extends Shape {
    double radius = 5;
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
