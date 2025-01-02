
import java.util.Scanner;
public class certificateDeposit {
    public static void main(String[] args){
        System.out.println("Edwin Zeng\nThis program will take inputs for the initial investment amount, annual interest rate, and desired ending value\nIt will then display the number of years required for a CD to be worth the specified ending value when the interest is compounded annually\nThe CD value at the end of each year will be calculated by the formula:\nCD Value = CD Value + (CD Value * Interest Rate)");

        System.out.println("Taking in of inputs");
        Scanner sn = new Scanner(System.in);
        System.out.println("What is the initial investment amount? "); float initialAmount = sn.nextFloat(); float cdValue = initialAmount;
        System.out.println("What is the annual interest rate (%)? "); float air = sn.nextFloat();
        System.out.println("What is the desired end value? "); float endAmount = sn.nextFloat();
        int i = 0;

        System.out.println("While loop is utilized to repeatedly execute the formula until the CD value is greater than or equal to the desired ending value.\nA counter is set up to keep track the number of iterations that represents the number of years.");
        while (cdValue< endAmount){
            cdValue = cdValue + cdValue*air/100;
            i++;
        }
        System.out.println("Final output statement including all the inputs and the calculated number of years:");
        System.out.println("The number of years it will take to reach $" +
                endAmount+ " with an initial investment of $" + initialAmount + " and an annual interest rate of "+ air + "% is " + i + " years.");
    }
}
