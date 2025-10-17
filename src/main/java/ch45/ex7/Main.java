package ch45.ex7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payable> payables = new ArrayList<Payable>();
        payables.add(new PayPal());
        payables.add(new Crypto());
        payables.add(new CreditCard());
        for(Payable payable : payables){
            ProcessPayment.processPayment(payable);
        }
    }
}
