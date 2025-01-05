import java.util.Scanner;
class fancierDiceRoll{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int userRollNo;
        System.out.println("Edwin Zeng\nThis program will generate a random number from 1 to 6 the number of times the user specifies and stores each roll in an array.\nIt will then count the number of times each number from 1 - 6 appeared in the randomly generated numbers and print out the count.");
        System.out.println("While loop for error checking user input");
        while (true){
            System.out.println("Please enter the number of dice rolls you would like: ");
            try {
                userRollNo = sn.nextInt();
                if (userRollNo <= 0){
                    System.out.println("Please enter an integer value greater than 0.");
                }
                else{ break;}
            }
            catch (Exception e){
                System.out.println("Please enter an integer.");
            }
        }
        int[] arrayDice = new int[6];
        int[] diceNumbers = new int[userRollNo];
        for (int i = 0; i < userRollNo;i++){
            diceNumbers[i] = (int) ((Math.random()*6)+1);
        }
        int[] numberCount = new int[6];
        for (int i = 0; i < userRollNo; i++){
            arrayDice[diceNumbers[i]-1]++;
        }
        System.out.println("Number of times each number was generated: ");
        for (int i = 0; i < 6; i++){
            System.out.println("Number of times " + (i+1) + " appeared: " + arrayDice[i]);
        }

    }
}