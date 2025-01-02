/*
Edwin Zeng
This program will take an integer from 0 to 100 and output the number of quarters, dimes, nickels, and pennies it would take to make up the integer in cents, using as few coins as possible
 */

import java.util.Scanner;
public class coinCalculator {
    public static void main(String[] args){

        // Takes in input from 0 to 100 integer
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100: ");
        int userin = sn.nextInt();

        // Finds the number of quarters possible
        int quarters = userin/25;

        // Takes the remaining coins and divides it by 10 to find the number of dimes
        int dime = (userin-quarters*25)/10;

        // Takes the remaining coins and divides it by 5 to find the number of nickels
        int nickels = (userin-quarters*25 -dime*10)/5;

        // Takes the remaining coins to find the number of pennies
        int pennies = userin-quarters*25-dime*10-nickels*5;

        // Output of the number of quarters, dimes, nickels, and pennies
        System.out.println("Quarters: " + quarters + " Dimes: " + dime + " Nickels: " + nickels + " Pennies: " + pennies) ;

    }
}
