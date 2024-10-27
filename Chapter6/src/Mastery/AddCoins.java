package Mastery;
import java.util.Scanner;
public class AddCoins {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompting the user for the number of coins
            System.out.print("Enter the number of pennies: ");
            int pennies = scanner.nextInt();
            
            System.out.print("Enter the number of nickels: ");
            int nickels = scanner.nextInt();
            
            System.out.print("Enter the number of dimes: ");
            int dimes = scanner.nextInt();
            
            System.out.print("Enter the number of quarters: ");
            int quarters = scanner.nextInt();
            
            // Getting the total dollar amount
            String totalAmount = getDollarAmount(pennies, nickels, dimes, quarters);
            
            // Displaying the total dollar amount
            System.out.println("Total dollar amount: " + totalAmount);
        }
    }

    // Method to calculate the total dollar amount and return it as a string with a $ sign
    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
        // Calculating the total value in dollars
        double total = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
        
        // Returning the formatted string with a $ sign
        return String.format("$%.2f", total);
    }
}
