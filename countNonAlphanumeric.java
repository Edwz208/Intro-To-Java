import java.util.Scanner;
public class countNonAlphanumeric {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Edwin Zeng\nThis program will take an user inputted sentence and output the number of non-alphanumeric characters.\nEnter a sentence: ");
        String userSentence = sn.nextLine();
        System.out.println("It will now loop through every character in the sentence and check if it is a letter or digit. If it isn't, 1 is added to the counter.");
        int counter = 0;
        for (int i = 0; i < userSentence.length();i++){
            char character_i = userSentence.charAt(i);
            if (!Character.isLetterOrDigit(character_i)){
                counter++;
            }
        }
        System.out.println("The inputted sentence \""+ userSentence+ "\" has " + counter + " non-alphanumeric characters.");
    }
}
