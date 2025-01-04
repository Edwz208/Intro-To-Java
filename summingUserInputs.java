import javax.swing.JOptionPane;
public class summingUserInputs {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Edwin Zeng\nThis program will have the user input numbers in a loop until they type quit and then output the sum of all the numbers");
        String userInput = "";
        float sum = 0;
        while (!userInput.toLowerCase().equals("quit")) {

            userInput = JOptionPane.showInputDialog("Please enter a number or type quit");
            if (!userInput.toLowerCase().equals("quit")){
                try {
                    sum += Float.parseFloat(userInput);
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Please enter a number");
                }
            }
        }
        JOptionPane.showMessageDialog(null,"The sum of the numbers entered is "+ sum);
    }
}
