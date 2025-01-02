import java.util.Scanner;
public class collatzConjectureSimulator {
    public static void main(String[] args){
        System.out.println("Edwin Zeng\nThis program will take in a positive integer and then output the Collatz sequence until it reaches the number 1.");
        Scanner sn = new Scanner(System.in);
        int initialNum;
        System.out.println("While loop to make sure the user input is a positive integer");
        while (true){
            System.out.println("Enter a positive number: "); initialNum = sn.nextInt();
            if (initialNum <0){
                System.out.println("It must be positive.");
            }
            else {
                break;
            }
        }
        System.out.println("While loop that executes as long as the number isn't 1 by repeatedly applying the following rules:\nIf the current number is even, divide it by 2\nIf the current number is odd, triple it and add 1");
        System.out.print(initialNum);
        while (initialNum != 1){
            if (initialNum % 2 == 0){
                initialNum/=2;
                System.out.print(", "+initialNum);
            }
            else if (initialNum %2 != 0){
                initialNum=initialNum*3 + 1;
                System.out.print(", " + initialNum);
            }
        }
    }
}
