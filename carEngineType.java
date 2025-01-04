import java.util.Scanner;
public class carEngineType {
    public static void main(String[] args) {
        System.out.println("Edwin Zeng\nThis program will ask the user car engine type by category number and output information about the engine's fuel type and a brief description of it's performance");
        Scanner sn = new Scanner(System.in);
        System.out.println("Input a number from 1 to 5 to see a engine category's fuel type and performance: ");
        int userInt = sn.nextInt();
        System.out.println("Using a switch statement to output the appropriate category given the user's integer");
        switch (userInt){
            case 1:
                System.out.println("Category 1:\nFuel type: Gasoline\nDescription: Standard engine with moderate fuel efficiency.");
                break;
            case 2:
                System.out.println("Category 2:\nFuel type: Diesesl\nDescription: Diesel engine with higher torque, often used for trucks and heavy-duty vehicles.");
                break;
            case 3:
                System.out.println("Category 3:\nFuel type: Electric\nDescription: Fully electric engine, no emissions, high efficiency.");
                break;
            case 4:
                System.out.println("Category 4:\nFuel type: Hybrid\nDescription: Combination of gasoline and electric, improved fuel efficiency.");
                break;
            case 5:
                System.out.println("Category 5:\nFuel type: Hydrogen\nDescription: Hydrogen fuel cell engine, zero emissions, still experimental.");
                break;
            default:
                System.out.println("Please enter an integer from 1 to 5");
                break;
        }
    }
}
