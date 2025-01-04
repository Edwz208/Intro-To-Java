import java.util.Scanner;
public class classifyingHurricane {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Edwin Zeng\nThis program will take in a user integer for the hurricane category they would like to select and then displays the wind speed for the category entered.\nTaking in input:\nEnter 1 to see windspeeds for category 1 \nEnter 2 to see windspeeds for category 2 \nEnter 3 to see windspeeds for category 3 \nEnter 4 to see windspeeds for category 4 \nEnter 5 to see windspeeds for category 5 ");
        System.out.println("Using a switch statement to output the appropriate category given the user's integer");
        int userInput = sn.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr");
                break;
            case 2:
                System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr");
                break;
            case 3:
                System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr");
                break;
            case 4:
                System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr");
                break;
            case 5:
                System.out.println("Category 5: greater than 155 mph or 135 kt or 249 km/hr.");
                break;
            default:
                System.out.println("Please enter an integer from 1 to 5");
                break;
        }
    }
}
