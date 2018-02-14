//Name: Zheshuang Zhang   id: 011823101
package Q3;

import java.util.Scanner;

public class main {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        //update:: Segment need to work because the system should be create the accounts when it init
        //update:: so here should be add another safe vault for the auth on the account id matches
        //update:: right now its only use the input to update the account id without any auth
        for (int i = 1; i < 11; i++) {
            accounts[i - 1] = new Account(i, 100.0);
        }

        System.out.println("Enter an id: ");
        int id = input.nextInt();


        if (id < 1 || id > 10) {
            while (id < 1 || id > 10) {
                System.out.println("Please enter id between 1 to 10: ");
                id = input.nextInt();
            }

        }
        while (true) {
            menu();
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

            if (choice == 4) {
                System.out.println("\n" + "Enter an id (1 - 10): ");
                id = input.nextInt();
                }

            uIbox(id, choice, accounts);
        }
    }


    public static void uIbox(int id, int choice, Account[] accounts) {
        switch (choice) {
            case 1:
                System.out.println("The balance is $"+accounts[id - 1].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                accounts[id - 1].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                accounts[id - 1].deposit(input.nextDouble());
                break;
            case 4:
                System.out.print("");
            default:
                System.out.print("\n"+"Input must between 1 to 4");
                break;
        }
    }

        public static void menu(){
            System.out.println('\n');
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
        }
    }
