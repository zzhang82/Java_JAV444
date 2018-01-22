// Frank Zhang
//Practices

///////////////////
//Question 1
/*
public class Main {

    public static void main(String[] args) {
        String name = "CensusBureauProjects";
        int birth = 7;
        int death = 13;
        int immigrant = 45;
        double rate = 0;
        int start = 312032486;

        int projectTime = 365*24*60*60;
        int end = start+projectTime/birth-projectTime/death+projectTime/immigrant;   //this part can be separate into small function as decimal may consider into number result

        System.out.println("Hello World!" + end);
    }
}

*/
///////////////////


///////////////////
//Question 2
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ge, shi, bai, ans;

        if (num == 1000)
        {
            ans =1;
        }
        else{
            bai = num/100;
            shi = (num -bai*100)/10;
            ge = num % 10;
            ans = ge + shi + bai;
        }

        System.out.println("Hello World!" + ans);
    }
}
*/
///////////////////

///////////////////
//Question 3
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monthly = input.nextDouble();
        double start =0;
        double rate = 0.00417;
        for (int num = 0; num < 6; num ++) {
            start = (start+monthly)*(1+rate);
        }
        System.out.println("Hello World!" + start);
    }
}

*/
///////////////////

///////////////////
//Question 4
/*
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int num = (int)Math.floor(Math.random() * Math.floor(12));
        String[] months = new String[] { "January", "February", "March", "April", "May", "June","July", "Aug", "Sep", "Oct", "Nov", "Dec" };
        System.out.println("Hello World!" + months[num]);
    }
}

*/
///////////////////

///////////////////
//Question 5
/*
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        // Generate a random integer 1 - 13
        int num_r = (int)Math.floor(Math.random() * Math.floor(13));

        // Generate a random integer 1 - 4
        int num_s = (int)Math.floor(Math.random() * Math.floor(4));

        //set up possibilities in String
        String[] rank = new String[] {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suit = new String[] {"Clubs","Diamonds", "Hearts", "Spades"};

        System.out.println("The card you picked is " + rank[num_r] + " of " + suit[num_s]);
    }
}
*/

///////////////////

///////////////////
//Question 6
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double rate = 0.05;
        double baseRate = 10000;
        //double ty_L = 0;
        double fy_F = 0;
        for (int num = 0; num < 10; num++) {
            baseRate = baseRate * (1 + rate);
            if (num < 4){
                fy_F+=baseRate;
            }
        }
        System.out.println("Ten years later will be " + baseRate);
        System.out.println("Four year fee " + fy_F);
    }
}
*/
///////////////////

///////////////////
//Question 7
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String spacer = "                         ";
        for (int i = 1; i <= 128; i = i * 2) {

            // x is the number printed
            // it gets the value from i,
            System.out.print(spacer);
            for (int x2 = 1; x2 <= i - 1; x2 = x2 * 2) {
                System.out.print(" ");
                System.out.print(x2);
            }
            for (int x = i; x >= 1; x = x / 2) {
                System.out.print(" ");
                System.out.print(x);
            }
            if ((i * 2) < 10)
                spacer = spacer.substring(0, spacer.length() - 2);
            else if ((i * 2) < 100)
                spacer = spacer.substring(0, spacer.length() - 3);
            else
                spacer = spacer.substring(0, spacer.length() - 4);
            System.out.println();
        }
    }
}

*/
///////////////////