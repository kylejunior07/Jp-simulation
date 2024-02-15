import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.print("Please enter a cash value to convert to airline miles: ");
        
        // Check if the next input is a double
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            return; // Exit if input is not a valid double
        }
        
        double cashValue = scanner.nextDouble(); // Directly read the double input
        RewardValue rewardsValue = new RewardValue(cashValue);
        System.out.printf("$%.2f is worth %d miles%n", cashValue, rewardsValue.getMilesValue());
    }
}
