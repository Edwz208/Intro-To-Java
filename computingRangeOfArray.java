import java.util.Scanner;
public class computingRangeOfArray {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Edwin Zeng\nThis program will take 10 numeric values from the user and store them in an array.\nIt will then output the range of the numbers to the console\nTaking in inputs");
        float[] userFloats = new float[10];
        float lowestNumber; float highestNumber;
        for (int i = 0; i < 10; i++){
            System.out.println("Please enter a numeric value: ");
            userFloats[i] = sn.nextFloat();

        }
        System.out.println("The program will now loop through every single item in the array and check if it's the highest item and lowest item so far");
        lowestNumber = userFloats[0]; highestNumber = userFloats[0];
        for (int i = 1; i <10; i++){
            if (userFloats[i]< lowestNumber){
                lowestNumber = userFloats[i];
            }
            else if (userFloats[i] > highestNumber){
                highestNumber = userFloats[i];
            }
        }
        System.out.println("The range of the array for the given numeric values is " + Math.abs(highestNumber-lowestNumber));
    }
}
