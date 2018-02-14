//Name: Zheshuang Zhang   id: 011823101

package Q1;

import java.util.*;
public class Location {

    public int row;
    public int column;
    public double biggestNumber;

    public Location(int row, int column, double biggestNumber) {

        //Setters
        this.row = row;
        this.column = column;
        this.biggestNumber = biggestNumber;
    }

    public static Location Largest(double[][] a) {
        int row = 0;
        int column = 0;
        double biggestNumber = a[row][column];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]>biggestNumber) {
                    biggestNumber = a[i][j];
                    //debug print
                    //System.out.print(biggestNumber);
                    row = i;
                    column = j;
                }
            }
        }
        Location result = new Location(row, column, biggestNumber);

        return  result;
    }

    public static void main(String[] args) {

        int row = 0;
        int column = 0;
        Scanner scan = new Scanner(System.in);

        //senariao keep testing
        do {

            System.out.print("Enter the number of Rows and Columns in the array: ");
            row = scan.nextInt();
            column = scan.nextInt();

            if(row <=0||column <=0) System.out.print("Wrong input value for the Rows and Columns, restart programs" + "\n");

        }while(row <=0||column <=0);

        //senariao keep testing
        // while(row > 0 && column > 0){

            double[][] temp = new double[row][column];

            System.out.println("Enter the array:");
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp[i].length; j++) {
                    temp[i][j] = scan.nextDouble();
                }
            }
            Location location = Location.Largest(temp);

            System.out.println("The Location of the largest element is "+ location.biggestNumber+" at "+"("+ location.row+", "+location.column+")");
        //}


    }

}