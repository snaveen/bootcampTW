package org.tw.payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PaymentGateway {
    Map<String,PaymentMode> paymentModes;

    PaymentGateway(){
        paymentModes=new HashMap<>();
        addPayment("credit card",new CreditCard());
        addPayment("Debit",new DebitCard());
        addPayment("netbanking",new NetBanking());
    }

    public void addPayment(String name,PaymentMode paymentMode){
        paymentModes.put(name,paymentMode);
    }

    public PaymentMode choosePayment(String name){
        if(paymentModes.containsKey(name))
            return paymentModes.get(name);
        throw new RuntimeException("No payment method is available with name");
    }


}
