//Name: Zheshuang Zhang   id: 011823101

package Q4;

import java.util.*;

public class main {
    public static void main(String[] args) {

        //Account account = new Account(1111, 200);
        SavingAccount savings = new SavingAccount(1112, 200);
        CheckingAccount checking = new CheckingAccount(1113, 200, -200);

        //account.setAnnualInterestRate(4.5);
        savings.setAnnualInterestRate(4.5);
        checking.setAnnualInterestRate(4.5);


        //account.withdraw(250);
        //account.deposit(30);
        //System.out.println(account.toString());

        savings.withdraw(250);
        savings.deposit(30);
        System.out.println(savings.toString());


        checking.withdraw(250);
        checking.deposit(30);
        System.out.println(checking.toString());







    }
}