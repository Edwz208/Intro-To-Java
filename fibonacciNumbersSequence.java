import java.util.Scanner;
public class fibonacciNumbersSequence {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("The user will enter a positive integer for the number of Fibonacci numbers they want generated and outputted, one per line and starting from the numbers 0 and 1.");
        System.out.println("Enter the positive integer for the number of Fibonacci numbers you want generated: ");
        int userNum = sn.nextInt();
        System.out.println("Program will now start calculating and outputting "+ userNum + " Fibonacci numbers");
        System.out.println("0");
        for (int i = 2, previous1 = 0, previous2 = 1, tempTransfer; i<= userNum; i++){
            System.out.println(previous1+previous2);
            tempTransfer = previous1;
            previous1 = previous1+previous2;
            previous2= tempTransfer;
        }

    }
}
