//Name: Zheshuang Zhang   id: 011823101

package Q3;

import java.util.Date;

public class Account {

    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private Date dateCreated;
    protected String records[];
    protected int transactionid = -1;

    public Account() {
    }

    ;

    public Account(int id, double balance) {
        //setter
        this.id = id;
        this.balance = balance;
        this.dateCreated = new java.util.Date();
        this.transactionid = -1;
        this.records = new String[2];
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }


    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (this.annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        int i = logs();
        this.records[i] = "-" + String.valueOf(amount);

    }

    public void deposit(double amount) {
        this.balance += amount;
        int i = logs();
        this.records[i] = "+" + String.valueOf(amount);
    }

    public int logs() {
        return this.transactionid = this.transactionid + 1;
    }

    public void getlogs() {
        for (int i = 0; i < this.records.length; i++) {
            System.out.println(" $ " + this.records[i]);
        }
    }
}
