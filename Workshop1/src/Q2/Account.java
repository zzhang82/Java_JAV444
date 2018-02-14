//Name: Zheshuang Zhang   id: 011823101

package Q2;

import java.util.Date;

public class Account {

    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private Date dateCreated;
    protected String records[];
    protected int transactionid =-1;

    public Account(){};

    public Account(int id, double balance) {
        //setter
        this.id = id;
        this.balance = balance;
        this.dateCreated = new java.util.Date();
        this.transactionid = -1;
        this.records = new String[2];
    }

    public int getId() { return this.id; }

    public double getBalance() { return this.balance; }

    public double getAnnualInterestRate() { return annualInterestRate; }


    public String getDateCreated(){
        return this.dateCreated.toString();
    }

    public void setBalance(double balance) { this.balance = balance; }

    public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate; }

    public double getMonthlyInterestRate() {
        return (this.annualInterestRate / 100) / 12 ;
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

    public int logs(){
        return  this.transactionid = this.transactionid+1;
    }

    public void getlogs(){
        for(int i =0; i <this.records.length;i++){
            System.out.println(" $ "+this.records[i]);
        }
    }



    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("Account ID: " +account.getId());
        System.out.println("Account Balance: $" + account.getBalance());
        System.out.println("Account History:");
        account.getlogs();
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());

    }
}