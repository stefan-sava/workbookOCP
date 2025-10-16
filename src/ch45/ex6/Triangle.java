package ch45.ex6;

public class Triangle extends Shape {
    double a = 3, b = 4, c = 5;
    double base = 4, height = 4;
    @Override
    double area() {
        return 0.5 * base * height;
    }
    @Override
    double perimeter() {
        return a + b + c;
    }
}
