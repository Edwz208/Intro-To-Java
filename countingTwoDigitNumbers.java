import java.util.Scanner;
class countTwoDigitNumbers {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in); int numberOfInputs;
        System.out.println("Edwin Zeng\nThis program will take the user's choice of number of integer inputs to take and then store them in an array.\nIt will then count the number of two digit numbers and print out the count\nTaking in input");
        while (true) {
            System.out.println("Enter the number of numbers you would like to enter: ");
            try{
                numberOfInputs = sn.nextInt();
                if (numberOfInputs<0){
                    System.out.println("Please enter a number greater than 0");
                }
                else{ break;}
            }
            catch (Exception e){
                System.out.println("Please enter a valid integer");
            }
        }
        int[] userInts = new int[numberOfInputs];
        for (int i = 0; i < numberOfInputs; i++) {
            try {
                System.out.println("Please enter number " + (i + 1) + ":");
                userInts[i] = sn.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter an integer");
            }
        }
        System.out.println("Looping through every item of the array and checking if its two characters when converted to a string");
        int countTwoDigits = 0;
        for (int i = 0; i < numberOfInputs; i++){
            if (String.valueOf(userInts[i]).length() == 2) {
                countTwoDigits++;
            }
        }
        System.out.println("The number of times the number inputted was a two digit number is " + countTwoDigits);
    }
}