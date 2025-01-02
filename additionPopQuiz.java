/*
Edwin Zeng
This program will generate two random numbers from 1 to 20 and add them together. It will then ask the user for the answer to the addition of the two numbers and output depending on if they are correct.
This process will occur 3 times.
 */
import java.util.Scanner;
public class additionPopQuiz {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Generation of two random numbers from 1 to 20
        int randomNum1 = (int) ((20 - 1 + 1) * Math.random() + 1);
        int randomNum2 = (int) ((20 - 1 + 1) * Math.random() + 1);
        int sum = randomNum1 + randomNum2;

        // Asking question 1
        System.out.println("What is " + randomNum1 + " + " + randomNum2 + "?");
        float userIn = sn.nextFloat();

        // Check if question 1 user answer was correct
        if (userIn == sum){
            System.out.println("Correct!");
        }
        else{
            System.out.println("The answer was " + sum + "!");
        }

        // Generation of two random numbers from 1 to 20
        randomNum1 = (int) ((20 - 1 + 1) * Math.random() + 1);
        randomNum2 = (int) ((20 - 1 + 1) * Math.random() + 1);
        sum = randomNum1 + randomNum2;

        // Asking question 2
        System.out.println("What is " + randomNum1 + " + " + randomNum2 + "?");
        userIn = sn.nextFloat();

        // Check if question 2 user answer was correct
        if (userIn == sum){
            System.out.println("Correct!");
        }
        else{
            System.out.println("The answer was " + sum + "!");
        }

        // Generation of two random numbers from 1 to 20
        randomNum1 = (int) ((20 - 1 + 1) * Math.random() + 1);
        randomNum2 = (int) ((20 - 1 + 1) * Math.random() + 1);
        sum = randomNum1 + randomNum2;

        // Asking question 310

        System.out.println("What is " + randomNum1 + " + " + randomNum2 + "?");
        userIn = sn.nextFloat();

        // Check if question 3 user answer was correct
        if (userIn == sum){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect! The answer was " + sum + "!");
        }

    }
}
