/*
Edwin Zeng
This program will take in a string input and an integer input.
It will then output a new string with the integer input being the number of characters erased from the back of the string input.
 */

import java.util.Scanner;
public class stringShrinker {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String stringInput = sn.nextLine();
        System.out.println("Enter a number for the number of characters erased from the back of the string: ");
        int charCut = sn.nextInt();
        String newString = stringInput.substring(0, stringInput.length()-charCut);
        System.out.println("The string " + stringInput + " with the last " + charCut + " characters removed is " + newString + ".");
    }
}
