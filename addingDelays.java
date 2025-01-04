import java.util.Scanner;
public class addingDelays {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int seconds_counter = 0;
        System.out.println("Edwin Zeng\nThis program will take in an integer input for the number of seconds for the timer to be, and then start the timer and output the time left\nIt will prompt the user to dismiss timer until they type ok");
        while (true) {
            System.out.println("Enter the number of seconds you want the timer to be: ");
            String userSeconds = sn.nextLine();
            try {
                System.out.println("Trying to convert string to integer");
                int actualSeconds = Integer.parseInt(userSeconds);
                System.out.println("Error checking for if less than 0 seconds");
                if (actualSeconds >= 0) {
                    System.out.println(actualSeconds);
                    while (seconds_counter < actualSeconds) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                        seconds_counter = seconds_counter + 1;
                        System.out.println(actualSeconds - seconds_counter);
                    }
                    while (true) {
                        System.out.println("!!! TIME UP !!!\nDismiss timer? type ok to dismiss");
                        String dismissTimer = sn.nextLine();
                        if (dismissTimer.toLowerCase().equals("ok")) {
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("Please enter a value from 0 to 100");
                }
            }
            catch (Exception e){
                System.out.println("Please enter an integer value");
            }
        }
    }
}
