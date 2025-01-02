/*
Edwin Zeng
This program will check the user inputs for a username and password against the existing username and password and output the result
 */

import java.util.Scanner;
public class existingPasswordChecker {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        // Existing username and password
        String username = "martingrove_ci";
        String password = "martingrovebears2024";

        // User enters a password and username
        System.out.println("Enter a username: ");
        String usernameInput = sn.nextLine();
        System.out.println("Enter the password: ");
        String passwordInput = sn.nextLine();

        // Output if both inputs match the username and password
        if (username.equals(usernameInput) && password.equals(passwordInput)){
            System.out.println("Correct inputs");
        }

        // Output if username is wrong but password is correct
        else if (!username.equals(usernameInput) && password.equals(passwordInput)){
            System.out.println("Username is incorrect");
        }

        // Output if username is correct but password is wrong
        else if (username.equals(usernameInput) && !password.equals(passwordInput)){
            System.out.println("Password is incorrect");
        }

        // Output if both are incorrect
        else {
            System.out.println("Both password and username are incorrect");
        }
    }
}
