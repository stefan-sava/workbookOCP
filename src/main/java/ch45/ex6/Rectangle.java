package ch45.ex6;

public class Rectangle extends Shape {
    double length = 10, width = 6;
    @Override
    double perimeter() {
        return length * width;
    }
    @Override
    double area() {
        return 2 * (length * width);
    }
}
