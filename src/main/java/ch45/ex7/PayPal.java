package ch45.ex7;

public class PayPal implements Payable, Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Paypal Payment");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Paypal Refund");
    }
}
