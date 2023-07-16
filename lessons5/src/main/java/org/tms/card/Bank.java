package org.tms.card;

public class Bank {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(12345, 500);
        CreditCard card2 = new CreditCard(5675, 365);
        CreditCard card3 = new CreditCard(34345, 978);

        card1.add_cash(867);
        card2.add_cash(547);
        card3.withdraw(545);

        card1.info();
        card2.info();
        card3.info();
    }
}
