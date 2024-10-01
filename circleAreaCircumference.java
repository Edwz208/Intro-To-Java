/* Edwin Zeng
   This program will take the user input for radius in cm and output the area, diameter, and circumference of the circle
 */
import java.util.Scanner;
public class circleAreaCircumference {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the radius of the circle in cm: ");
        float radius_of = sn.nextFloat();
        double area_of = (Math.PI)*(radius_of*radius_of);
        float diameter_of = radius_of*2;
        double circumference_of = 2*Math.PI*radius_of;
        System.out.println("Given the radius of " + radius_of + "cm, the area of the circle is " + String.format("%.2f", area_of) + "cm^2, " +
                "the diameter of the circle is " + diameter_of + "cm, and the circumference of the circle is " + String.format("%.2f", circumference_of) + "cm.");

    }
}
