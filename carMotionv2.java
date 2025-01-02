/*
Edwin Zeng
This program will take the user inputs for two of the following variables: speed, distance, and time. It will then calculate the third variable and output it.
*/

import java.util.Scanner;
public class carMotionv2 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        // Takes in value 1 and the corresponding variable
        System.out.println("Enter a value for the car motion calculator to use: ");
        float value1 = sn.nextFloat();
        System.out.println("Enter the letter s if "+value1+ " is for speed, d if it is for distance, or t if it is for time: ");
        String valueVar1 = sn.next().toLowerCase();

        // Takes in value 2 and the corresponding variable
        System.out.println("Enter a second value for the car motion calculator to use: ");
        float value2 = sn.nextFloat();
        System.out.println("Enter the letter s if "+value2+" is for speed, d if it is for distance, or t if it is for time: ");
        String valueVar2 = sn.next().toLowerCase();

        float speed,distance, time;
        // If first or second is s and d
        if ((valueVar1.equals("s") && valueVar2.equals("d")) || (valueVar2.equals("s") && valueVar1.equals("d"))){
            if (valueVar1.equals("s")){
                speed = value1;
                distance = value2;
            }
            else {
                speed = value2;
                distance = value1;
            }
            time = distance/speed;
            System.out.println(time + " is the time");
        }
        // If first or second is s and t
        else if ((valueVar1.equals("s") && valueVar2.equals("t")) || (valueVar2.equals("s") && valueVar1.equals("t"))){
            if (valueVar1.equals("s")){
                speed = value1;
                time = value2;
            }
            else {
                speed = value2;
                time = value1;
            }
            distance = speed*time;
            System.out.println(distance + " is the distance");
        }

        // If first or second is d and t
        else if ((valueVar1.equals("d") && valueVar2.equals("t")) || (valueVar2.equals("t") && valueVar1.equals("d"))){
            if (valueVar1.equals("d")){
                time = value2;
                distance = value1;
            }
            else {
                time= value1;
                distance = value2;
            }
            speed = distance/time;
            System.out.println(speed + " is the speed");
        }

    }
}
