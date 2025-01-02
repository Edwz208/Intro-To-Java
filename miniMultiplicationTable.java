import java.util.Scanner;
public class miniMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Edwin Zeng\nThis program will take a starting integer value and an ending integer value and then a floating point number\nIt will then multiply the floating point number by every integer starting from the starting integer value to the ending integer value");
        System.out.println("Taking in of inputs: ");
        Scanner sn = new Scanner(System.in);
        System.out.println("Type the starting integer value: ");
        int a = sn.nextInt();
        System.out.println("Type the ending integer value: ");
        int b = sn.nextInt();
        System.out.println("Enter a floating point number (non-integer fractional number): ");
        float floatingPoint = sn.nextFloat();
        System.out.println("Output of the multiplication for every single value in the range");
        if (a > b) {
            System.out.println("For loop for multiplying integers by the floating point number if the first integer is greater than the second");
            for (int i = a; i >=b; i--) {
                System.out.println(floatingPoint + " x " + i + " = " + Math.round(floatingPoint*i*1000)/1000.0f);
            }
        } else {
            System.out.println("For loop for multiplying integers by the floating point number if the second integer is greater than the first");
            for (int i = a; i <= b; i++) {
                System.out.println(floatingPoint + " x " + i + " = " + Math.round(floatingPoint*i*1000)/1000.0f);
            }
        }
        sn.close();
    }
}