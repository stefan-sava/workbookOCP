package ch45.ex7;

public class Crypto implements Payable, Refundable{
    @Override
    public void refund(double amount) {
        System.out.println("Crypto Refund");
    }
    public void pay(double amount) {
        System.out.println("Crypto Pay");
    }
}
