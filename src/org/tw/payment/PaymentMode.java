package org.tw.payment;

public interface PaymentMode {


    boolean pay(User user, double amount);
}
