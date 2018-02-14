//Name: Zheshuang Zhang   id: 011823101

package Q4;

import java.util.*;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        overdraftLimit = -200;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        //setter
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        //getter
        return overdraftLimit;
    }

    public void withdraw(double amount) {
        //update:: this one works as debug and also show as the bank normal transactions
        System.out.println("Checking Account: " + this.getId()+"\n"+ "$ "+amount+" Withdraw Processing.........");
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Amount exceeds Checking Account overdraft limit.");
    }

    public String toString() {
        //updates:: format the string to work with the input requirement
        return super.toString() + "This Checking Account Overdraft limit: $" + overdraftLimit+ "\n";
    }
}