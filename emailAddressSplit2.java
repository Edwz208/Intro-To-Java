

import java.util.Scanner;
public class emailAddressSplit2 {
    public static void main(String[] args) {
        System.out.println("Edwin Zeng\nThis program will take in a string input of an email address and then output the username and domain separately.\nTaking in input with a while loop with error checking:");
        Scanner sn = new Scanner(System.in); int position = -1; String email;
        while (true){
        System.out.println("Enter an email address: ");
        email = sn.nextLine();
        position = email.indexOf("@");
        if (email.isEmpty()){
            System.out.println("Please enter an input for the email address ");
            continue;
        }
        if (position == -1){
            System.out.println("Please enter a valid email address with the symbol @ in it");
            continue;
            }
        else{
            System.out.println("Passes the error checking, outputting domain and username separately: ");
            break;
        }
        }
        String userName = email.substring(0, position);
        String domainName = email.substring(position+1,email.length());
        System.out.println("Your username is "+userName + " and your domain name is " + domainName);
    }
}
