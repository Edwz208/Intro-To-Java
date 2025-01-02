/*
Edwin Zeng 
This program will have the user type 3 different sentences and record the time taken for each. If the user types them correctly, it will output the time it took in seconds. 
At the end if the user types all of the sentences correctly it will output the total time they took as well as the average time per sentence in seconds.
*/

import java.util.Scanner;
public class averageTimeToInput {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
       
        // Record the start time for user to type sentence 1
        long startTime = System.currentTimeMillis();
        String sentence1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Type the following:\n" + sentence1);
        // Wait for the user to press Enter, and read in their input
        String user1 = sn.nextLine();
        // Record the end time 
        long endTime = System.currentTimeMillis();
        // Find the total time it took
        long inputTimeMilliseconds = endTime- startTime;

        // Output depending on if the sentence was entered correctly
        if (!sentence1.equals(user1)){
            System.out.println("Invalid! You didn't type exactly what I told you to.");
        }
        else{
            System.out.println("Nice! You took " + (double)inputTimeMilliseconds/1000 + " seconds.");
        }
       
        // Record the start time for user to type sentence 2
        startTime = System.currentTimeMillis();
        String sentence2 = "Lorem ipsum odor amet, consectetuer adipiscing elit.";
        System.out.println("Type the following:\n"+sentence2);
        // Wait for the user to press Enter, and read in their input
        String user2 = sn.nextLine();
        // Record the end time 
        endTime = System.currentTimeMillis();
        // Find the total time it took in seconds
        double seconds2 = (double)(endTime-startTime)/1000;
        // Add the time in milliseconds to the previous time of sentence 1
        inputTimeMilliseconds += endTime- startTime;
       
        // Output depending on if the sentence was entered correctly
        if (!sentence2.equals(user2)){
            System.out.println("Invalid! You didn't type exactly what I told you to.");
        }
        else{
            System.out.println("Nice! You took " + seconds2 + " seconds.");
        }
       
       
        // Record the start time for user to type sentence 3
        startTime = System.currentTimeMillis();
        String sentence3 = "This is not a Java program.";
        System.out.println("Type the following:\n"+sentence3);
        // Wait for the user to press Enter, and read in their input
        String user3 = sn.nextLine();
        // Record the end time 
        endTime = System.currentTimeMillis();
        // Add the time in milliseconds to the previous time of sentence 2
        inputTimeMilliseconds += endTime- startTime;
        // Find the total time it took in seconds
        double seconds3 = (double)(endTime - startTime)/1000;

        // Output depending on if the sentence was entered correctly
        if (!sentence3.equals(user3)){
            System.out.println("Invalid! You didn't type exactly what I told you to.");
        }
        else{
            System.out.println("Nice! You took " + seconds3 + " seconds.");
        }
       
        // Output if all 3 sentences were correct
        if (sentence1.equals(user1) && sentence2.equals(user2) && sentence3.equals(user3)){
            // Divide the total time in milliseconds by 3 to find the average time per sentence in milliseconds
            double avgMilliSeconds = (double)inputTimeMilliseconds/3;
            // Dividing the total time in milliseconds by 1000 to find the total seconds
            double totalSeconds = (double)inputTimeMilliseconds/1000;
            // Dividing the average time per sentence in milliseconds by 1000 to find average time in seconds as well as rounding to 3 decimal places
            float avgSeconds = Math.round(avgMilliSeconds) / 1000.0f;
            System.out.println("The total time was "+totalSeconds+" seconds and the average time per sentence was " + avgSeconds + " seconds.");
        }

       // Output if any of the sentences were incorrect
       else{
           System.out.println("You didn't enter all 3 sentences correctly. Will not reporting the average time.");
       }
        sn.close();
    }
}