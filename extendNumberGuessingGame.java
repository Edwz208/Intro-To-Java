import java.util.Scanner;
public class extendNumberGuessingGame {
    public static void main(String[] args){
        System.out.println("Edwin Zeng\nThis program will generate a random integer from 1 - 30 and then have the user guess it.\nIt will provide hints about guesses being too high or too low and when the user guesses correctly it will output the number of tries it took.");
        System.out.println("Picking a random number between 1 and 30...");
        int randomNumber = 1 + (int)(Math.random() * (30 - 1));
        boolean guessedCorrectly = false;
        int counter = 0;
        System.out.println("Loop that runs until the user guesses correctly");
            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                counter++;
                Scanner scanner = new Scanner(System.in);
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("You guessed right! It took you " + counter + " tries.");
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess was too low. Try again.");

                } else if (userGuess> randomNumber){
                    System.out.println("Your guess was too high. Try again.");
                }
            }
        }
    }

