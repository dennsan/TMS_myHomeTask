package org.tms.card;

public class CreditCard {
    private int account;
    private int sum_acc = 0;

    public CreditCard(int account, int sum_acc){
        this.account = account;
        this.sum_acc = sum_acc;
    }

    void add_cash(int sum){
        sum_acc = sum_acc + sum;
    }

    void withdraw(int cash){
        sum_acc = sum_acc - cash;
    }

    void info (){
        System.out.println(sum_acc);
    }
}
