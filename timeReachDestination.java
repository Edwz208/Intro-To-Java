
/* Edwin Zeng
   This program will take the user input for the distance the car must travel
   and the speed it will be traveling at and output the amount of time in hours that it will take to get to the destination
*/
import java.util.Scanner;

public class timeReachDestination {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("How much distance must the car travel? (km) ");
        float distance_travel = sn.nextFloat();
        System.out.println("What is the speed of the car? (km/h) ");
        float speed = sn.nextFloat();

        // Output
        System.out.println("At the current speed of " + speed + "km/h, it will take " + distance_travel / speed
                + " hours to travel " + distance_travel + "km.");
    }
}
