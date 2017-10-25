package org.tw.solid;

public class Wallet {

    private double balance;

    Wallet(){
        balance=0;
    }

    Wallet(double amount){
        balance=amount;
    }

    public static void main(String... args){
        Wallet wallet=new Wallet();

        wallet.credit(100);
        wallet.debit(50);

        System.out.println("Balance - Expected:50, Actual:"+wallet.getBalance());

        wallet=new Wallet(50);
        System.out.println("Balance - Expected:50, Actual:"+wallet.getBalance());
    }

    public double credit(double amount){
        balance+=amount;
        return balance;
    }

    public double debit(double amount){
        if(balance <amount)
         throw new RuntimeException("Not enough money :-( ");

        balance-=amount;
        return balance;

    }


    public double getBalance(){
        return balance;
    }




}
