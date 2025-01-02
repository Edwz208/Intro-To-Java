/*
Edwin Zeng
This program will take as inputs the lengths of the two shorter lengths of a right angle triangle and output the length of the hypotenuse.
 */

import java.util.Scanner;
public class pythagoreanTheorem {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the value of leg 1 of the right angle triangle in cm: ");
        float leg_1 = sn.nextFloat();
        System.out.println("Enter the value of leg 2 of the right angle triangle in cm: ");
        float leg_2 = sn.nextFloat();
        double hypotenuse = Math.sqrt(Math.pow(leg_1, 2) + Math.pow(leg_2, 2));
        hypotenuse *= 100;
        hypotenuse = Math.round(hypotenuse);
        hypotenuse /=100;
        System.out.println("The value of the hypotenuse is " + hypotenuse + "cm.");
    }
}