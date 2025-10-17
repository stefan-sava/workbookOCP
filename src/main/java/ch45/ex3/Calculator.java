package ch45.ex3;

public class Calculator {
    public int add(int a, int b){
        System.out.println("Using add with int a and int b");
        return a + b;
    }
    public double add(double a, double b){
        System.out.println("Using add with double a and double b");
        return a + b;
    }
    public double add(int a, double b){
        System.out.println("Using add with int a and double b");
        return a + b;
    }
}
