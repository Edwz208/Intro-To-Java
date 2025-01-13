import java.util.Scanner;
import java.util.ArrayList;
public class studentGrades {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Edwin Zeng\nThis program will continuously prompt the user to enter a student grade until they type quit\nIt will store each grade in an ArrayList\nIt will output the average, maximum and minimum grade, number of grades larger than or equal to 90, and the number of grades less than 50.\nTaking in input");
        String userInput= ""; ArrayList <Float> inputtedGradeArray = new ArrayList<Float>(); float average = 0;
        while (!userInput.toLowerCase().equals("quit")){
            System.out.println("Enter a student grade: ");
            userInput = sn.nextLine();
            if (!userInput.toLowerCase().equals("quit")){
             try{
                 inputtedGradeArray.add(Float.parseFloat(userInput));
             }
             catch (Exception e){
                 System.out.println("Please enter a number value or type quit.");
             }
            }
        }
        float highest = inputtedGradeArray.get(0); float lowest = inputtedGradeArray.get(0); int counterLessThan50 = 0; int counterGreaterThan90 = 0;
        for (float i : inputtedGradeArray){
            average += i;
            if (i > highest){
                highest = i;
            }
            else if (i < lowest){
                lowest = i;
            }
            if (i < 50){
                counterLessThan50++;
            }
            else if (i >= 90){
                counterGreaterThan90++;
            }
        }
        System.out.println("The average grade is " + average/inputtedGradeArray.size() + "\nThe minimum grade is " + lowest + "\nThe highest grade is " + highest + "\nThe number of grades that are larger than or equal to 90 is " + counterGreaterThan90+ "\nThe number of grades that are less than 50 is " + counterLessThan50);
    }
}
