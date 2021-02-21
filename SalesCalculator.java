package chapter3;

 /*
    - IF Statement

    Salesman get a payment of $1000 a week
    Salesman who makes sales higher than 10, makes an additional $250

 */

import java.util.Scanner;

public class SalesCalculator {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        // initialize known values
            double salary = 1000;
            double bonus = 250;
            int quota = 10;

        // Get values for the unknown
            System.out.print("Enter Weekly sales made: ");
            int sales = input.nextInt();

            input.close();

        // Core Logic of the Program
            if(sales > quota){

                salary = salary + bonus;
                // salary += bonus;

            }

        // Output
            System.out.printf("Your Weekly Salary is $%.2f\n", salary);

    }

}
