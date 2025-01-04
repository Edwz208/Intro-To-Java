import java.util.Scanner;
public class averageCalculatorErrorHandling {
    public static void main(String[] args){
        System.out.println("Edwin Zeng\nThis program will take in four float inputs for the courses and then output the average.\nIt will use a for loop to go through every single course and a nested while loop to make sure the inputs are greater than or equal to 0 and less than or equal to 100");
        Scanner sn = new Scanner(System.in);
        float totalGrade = 0;
        for (int i = 1; i<= 4; i++) {
            while (true) {
                System.out.println("Enter your grade for course " + i + ": ");
                String stringFloat = sn.nextLine();
                try {
                    float convertedToFloat = Float.parseFloat(stringFloat);
                    if (convertedToFloat >= 0 && convertedToFloat <= 100) {
                        totalGrade += Float.parseFloat(stringFloat);
                        break;
                    } else {
                        System.out.println("Please enter a value from 0 to 100");

                    }
                }
                catch (NumberFormatException e){
                    System.out.println("Please enter a valid number");
                }
            }
        }
        System.out.println("Your average across the four courses is " + Math.round(totalGrade/4*1000)/1000.0);
    }

}
