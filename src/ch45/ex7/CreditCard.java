package ch45.ex7;

public class CreditCard implements Payable, Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Pay");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Credit Card Refund");
    }
}
