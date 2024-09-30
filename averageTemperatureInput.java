/*
Edwin Zeng
This program will take the user input for the temperature of the day for 7 days and output the average temperature
*/
import java.util.Scanner;
public class averageTemperatureInput{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        float total = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Enter the temperature for day " + i + ": ");
            float user_in = sn.nextFloat();
            total += user_in;
        }
        float avg_temp = total/7;
        System.out.println("The average temperature for the 7 days is " + avg_temp + " °C.");
    }
}