package org.tw.payment;

public class NetBanking implements PaymentMode {

    @Override
    public boolean pay(User user, double amount) {
        return false;
    }
}
