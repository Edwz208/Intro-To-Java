/*
Edwin Zeng
This program will generate two random numbers from 1 to 6 and add them together
It will then output the random numbers as well as the total, with each value printed in words
 */
public class rollingDice {
    public static void main(String[] args){
        // Generation of numbers for dice 1
        int num1 = (int) (6*Math.random() + 1);

        // Output depending on number
        if (num1 == 1){
            System.out.println("First die - ONE");
        }
        else if (num1 == 2){
            System.out.println("First die - TWO");
        }
        else if (num1 == 3){
            System.out.println("First die - THREE");
        }
        else if (num1 == 4){
            System.out.println("First die - FOUR");
        }
        else if (num1 == 5){
            System.out.println("First die - FIVE");
        }
        else if (num1 == 6){
            System.out.println("First die - SIX");
        }

        // Generation of number 2
        int num2 = (int) (6*Math.random() + 1);

        // Output depending on the number
        if (num2 == 1){
            System.out.println("Second die - ONE");
        }
        else if (num2 == 2){
            System.out.println("Second die - TWO");
        }
        else if (num2 == 3){
            System.out.println("Second die - THREE");
        }
        else if (num2 == 4){
            System.out.println("Second die - FOUR");
        }
        else if (num2 == 5){
            System.out.println("Second die - FIVE");
        }
        else if (num2 == 6){
            System.out.println("Second die - SIX");
        }
        int sum = num1 + num2;
        if (sum == 2){
            System.out.println("Total - TWO");
        }
        else if (sum == 3){
            System.out.println("Total - THREE");
        }
        else if (sum == 4){
            System.out.println("Total - FOUR");
        }
        else if (sum == 5){
            System.out.println("Total - FIVE");
        }
        else if (sum ==6){
            System.out.println("Total - SIX");
        }
        else if (sum == 7){
            System.out.println("Total - SEVEN");
        }
        else if (sum == 8){
            System.out.println("Total - EIGHT");
        }
        else if (sum == 9){
            System.out.println("Total - NINE");
        }
        else if (sum == 10){
            System.out.println("Total - TEN");
        }
        else if (sum == 11){
            System.out.println("Total - ELEVEN");
        }
        else if (sum == 12){
            System.out.println("Total - TWELVE");
        }
    }
}
