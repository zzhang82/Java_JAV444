//Name: Zheshuang Zhang   id: 011823101

package Q4;

import java.util.*;

public class SavingAccount extends Account {

    public SavingAccount() {
        super();
    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        System.out.println("Saving Account: " + this.getId()+ "\n"+ "$ "+amount+" Withdraw Processing.........");

        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        } else
            System.out.println(
                    "Error! Savings account can not be overdrawn");
    }
}