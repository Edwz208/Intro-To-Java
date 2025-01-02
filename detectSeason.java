/*
Edwin Zeng
This program will take in 7 inputs for the temperature of the week and then depending on the average temperature it will output a different season
 */

import java.util.Scanner;
public class detectSeason {
    public static void main(String[] args){
        float totalTemp = 0;
        Scanner sn = new Scanner(System.in);
        // Takes in input for monday
        System.out.println("What is the temperature on Monday in degrees Celsius? ");
        totalTemp += sn.nextFloat();

        // Takes in input for tuesday
        System.out.println("What is the temperature on Tuesday in degrees Celsius? ");
        totalTemp += sn.nextFloat();

        // Takes in input for wednesday
        System.out.println("What is the temperature on Wednesday in degrees Celsius? ");
        totalTemp += sn.nextFloat();

        // Takes in input for thursday
        System.out.println("What is the temperature on Thursday in degrees Celsius? ");
        totalTemp += sn.nextFloat();

        // Takes in input for friday
        System.out.println("What is the temperature on Friday in degrees Celsius? ");
        totalTemp += sn.nextFloat();

        // Takes in input for saturday
        System.out.println("What is the temperature on Saturday in degrees Celsius? ");
        totalTemp += sn.nextFloat();

        // Takes in input for sunday
        System.out.println("What is the temperature on Sunday in degrees Celsius? ");
        totalTemp += sn.nextFloat();

        // Calculates average temperature
        float averageTemp = (totalTemp)/7;

        // Outputs Winter if average temp is less than 0
        if (averageTemp < 0){
            System.out.println("With an average temperature of " + averageTemp + "°C,the season is Winter");

        }

        // Outputs Spring/Fall if average temp is less than or equal to 20
        else if (0 <= averageTemp && averageTemp <= 20){
            System.out.println("With an average temperature of "+ averageTemp + "°C,the season is Spring/Fall");

        }

        // Outputs Summer if average temp is greater than 20
        else if (20< averageTemp){
            System.out.println("With an average temperature of "+ averageTemp + "°C,the season is Summer");
        }

    }
}
