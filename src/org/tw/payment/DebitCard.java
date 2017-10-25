package org.tw.payment;

public class DebitCard implements PaymentMode {
    @Override
    public boolean pay(User user, double amount) {
        return false;
    }
}
