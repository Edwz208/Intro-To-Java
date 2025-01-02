/*
Edwin Zeng
This program will take in as input two float values. It will then divide the first number by the second and output the result rounded to the nearest hundredth.
 */

import java.util.Scanner;
public class divisionWithRounding {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of the first number (can include decimals): ");
        float num_1 = sn.nextFloat();
        System.out.println("Enter the value of the second number (can include decimals): ");
        float num_2 = sn.nextFloat();
        double result = (num_1/num_2)*100;
        result = Math.round(result);
        result /= 100;
        System.out.println("When dividing " + num_1 + " by " + num_2 + ", the quotient rounded to the nearest hundredth is " + result + ".");
    }
}
