import java.util.Scanner;
public class pigDiceJava{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int winningScoreNum = 0, player1Score = 0, player2Score = 0; String player1Name = "Player 1" , player2Name = "Player 2";
		System.out.println("Welcome to Pig Dice");
		System.out.println("Do you want to have your own usernames? type yes or anything else if no");
		String customUsernames = sn.nextLine();
		if (customUsernames.toLowerCase().equals("yes")){
			System.out.println("Enter the username for player 1: "); player1Name = sn.nextLine();  
			System.out.println("Enter the username for player 2: "); player2Name = sn.nextLine();
		}
		while (true){
		System.out.println("Enter the number you would like to be the winning score: "); 
		String winningScore = sn.nextLine();
			try{
				winningScoreNum = Integer.parseInt(winningScore);
				if (winningScoreNum <= 0){
					System.out.println("Please enter a value greater than 0 ");
				}
				else{
					break;
				}
			}
			catch (Exception e){
				System.out.println("Please enter an integer value");
			}
		}
	
		String currentPlayerName = player1Name; int currentTurnPoints = player1Score;  int currentAddedPoints = 0; int counter = 1;
		while (player1Score < winningScoreNum && player2Score < winningScoreNum){  
			String rollOrHold;
			while (true){
				System.out.println(currentPlayerName + ", you currently have "+ (currentTurnPoints+currentAddedPoints)+ " points. Do you want to roll or hold? type roll or hold ");
				rollOrHold = sn.nextLine();
				if (!rollOrHold.toLowerCase().equals("hold") && !rollOrHold.toLowerCase().equals("roll"))
				{
					System.out.println("Please enter a either hold or roll");
				}
				else{ break;} }
			if (rollOrHold.toLowerCase().equals("roll")){
				int diceRoll = (int) ((Math.random()*6)+1); 
				for (int i = 0; i<3; i++){
					System.out.println("Rolling...");
					try {Thread.sleep(1000); } catch (InterruptedException e) {}
					
				}
				System.out.println(diceRoll + " - dice roll");
				System.out.println(currentPlayerName);
	
				if (diceRoll != 1 && diceRoll + currentTurnPoints +currentAddedPoints < winningScoreNum){
					currentAddedPoints += diceRoll;
					System.out.println(currentAddedPoints + "- currentAdded");
					System.out.println("With the "+ diceRoll + " you just rolled, you now have " + currentAddedPoints + " this turn and " + (currentAddedPoints+currentTurnPoints) + " in total.");
					continue;
				}
				else if (diceRoll == 1){
					currentAddedPoints = 0;
				}
				else{
					currentAddedPoints+=diceRoll;
					System.out.println("You reached "+ winningScoreNum + " points! Good job");
				}
				}

			if (counter % 2 == 0){
				currentPlayerName = player1Name;
				player2Score += currentAddedPoints;
				currentTurnPoints = player1Score;
				System.out.println(player2Score + " - score");
				
			}
			if (counter %2 != 0){
				currentPlayerName = player2Name;
				player1Score += currentAddedPoints;
				currentTurnPoints = player2Score;
				System.out.println(player1Score + " - score");

			}
			currentAddedPoints = 0;
			counter ++;
		}
	}
}