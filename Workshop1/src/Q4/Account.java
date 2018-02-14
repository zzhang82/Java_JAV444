//Name: Zheshuang Zhang   id: 011823101

package Q4;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    //update:: this part is the use as the sicnario to use as the atm system to keep track on the account movements
    //canADD:: this one can work better with the time stamp, right here i only used the transaction id as the position lock
    protected String records[];
    protected int transactionid =-1;

    public Account() { };

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
        if(this.balance <=0){
            return 0;
        }else return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        int i = logs();
        this.records[i] = "-" + String.valueOf(amount);

    }

    public void deposit(double amount) {
        System.out.println("$ " +amount + " Deposite Processing.........");
        this.balance += amount;
        int i = logs();
        this.records[i] = "+" + String.valueOf(amount);
    }

    public int logs() {
        return this.transactionid = this.transactionid + 1;
    }

    public String[] getlogs() {
        for (int i = 0; i < this.records.length; i++) {
            System.out.println(" $ " + this.records[i]);
        }
        return records;
    }

    public String toString() {

        return "\n"+"Summary :" + "\n" + "id: "+this.getId()+"\n"+"Balance: "+this.getBalance()+"\n"/*"Account History:"+String.valueOf(this.getlogs())+"\n"*/+
                "Monthly Interest: "+this.getMonthlyInterest()+"\n"+"Date Created: "+this.getDateCreated()+"\n";
    }
}