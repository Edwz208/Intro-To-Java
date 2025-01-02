/*
Edwin Zeng
This program will take in a string input of an email address and then output the username and domain separately.
 */

import java.util.Scanner;
public class emailAddressSplit {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter an email address: ");
        String email = sn.nextLine();
        int position = email.indexOf("@");
        String userName = email.substring(0, position);
        String domainName = email.substring(position+1,email.length());
        System.out.println("Your username is "+userName + " and your domain name is " + domainName);
    }
}
