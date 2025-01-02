import java.util.Scanner;
public class countDigits {
    public static void main(String[] args){
        System.out.println("Edwin Zeng\nThis program will count the number of digits inputted in the user's sentence");
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userSentence = sn.nextLine();
        System.out.println("It will now loop through every character in the sentence and check if it is a digit. If it is, 1 is added to the counter.");
        int counter = 0;
        for (int i = 0; i < userSentence.length();i++){
            char character_i = userSentence.charAt(i);
            if (Character.isDigit(character_i)){
                counter++;
            }
        }
        System.out.println("The number of digits in the inputted sentence \""+ userSentence+"\" is " + counter + " digits.");
    }
}
