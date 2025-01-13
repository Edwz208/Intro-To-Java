import java.util.ArrayList;
import java.util.Scanner;
public class cdCollection {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Edwin Zeng\nThis program continuously prompts the user for names in the CD collection until they type quit\nIt will store each inputted name in an ArrayList and afterwards output every name, one per line.");
        String anotherCDName = ""; ArrayList<String> namesOfCD = new ArrayList<String>();
        while (!anotherCDName.toLowerCase().equals("quit")){
            System.out.println("Enter the name of an item in your CD collection: ");
            anotherCDName = sn.nextLine();
            if (!anotherCDName.toLowerCase().equals("quit")){
                namesOfCD.add(anotherCDName);
            }
        }
        for (String i : namesOfCD){
            System.out.println(i);
        }
    }
}
