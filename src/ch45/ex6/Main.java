package ch45.ex6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        for (Shape shape : shapes) {
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
        }
    }
}
