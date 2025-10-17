package ch45.ex3;

public class Run {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("Params passed to method 1 and 2, result: " + calculator.add(1,2));
        System.out.println("Params passsed to method -3 and 2, result: " + calculator.add(-3.1,2));
        System.out.println("Params passed to method 1 and -2, result:  " + calculator.add(1,-2));
        System.out.println("Params passed to method 4125153 and -321412.2555342, result: " + calculator.add(4125153,-321412.2555342));
    }
}
