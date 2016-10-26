package com.kj.array;

/**
 * Created by joshik on 10/7/16.
 */
public class BankApp {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100);

        System.out.println("Balance before transactions = " );
            ba1.display();

            ba1.deposit(50);
            ba1.withdrawal(100);

            System.out.println("Balance after transactions = ");
            ba1.display();

    }
}
