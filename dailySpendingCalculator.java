/* 
Edwin Zeng - #4
This program will take the input for the name of the daily purchase item,
cost of the product, and number of days the item will be bought and output the total spending on it
 */
import java.util.Scanner;
public class dailySpendingCalculator {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("What is the name of the daily purchase item? ");
        String item_name = sn.nextLine();
        System.out.println("What is the cost of the product? ($)");
        float item_cost = sn.nextFloat();
        System.out.println("How many days will you buy this item? ");
        int days_count = sn.nextInt();
        System.out.println("Your total spending on " + item_name + " over the next " + days_count + " days is $" + (days_count*item_cost) + ".");
    }
}
