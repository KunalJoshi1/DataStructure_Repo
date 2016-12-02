package algorithms.array;

/**
 * Created by joshik on 10/7/16.
 */
public class BankAccount {



    private double balance;

    public BankAccount(double openingBalance){
        balance = openingBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdrawal(double amount){
        balance = balance - amount;
    }

    public void display(){
        System.out.println("Balance is " + balance);
    }

}


