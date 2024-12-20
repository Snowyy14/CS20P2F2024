package Mastery;
import java.util.Scanner;

public class AddCoins {

    //method with user input
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            //asking for the number of coins they have
            System.out.print("Enter the number of pennies: ");
            int pennies = scanner.nextInt();

            System.out.print("Enter the number of nickels: ");
            int nickels = scanner.nextInt();

            System.out.print("Enter the number of dimes: ");
            int dimes = scanner.nextInt();

            System.out.print("Enter the number of quarters: ");
            int quarters = scanner.nextInt();

            String totalAmount = getdollaramount(pennies, nickels, dimes, quarters);

            //telling them how much money they have
            System.out.println("You have: " + totalAmount + " dollars");
        }
    }

    //calling the method for the total from user input
    public static String getdollaramount(int pennies, int nickels, int dimes, int quarters) {
        double total = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
           	return String.format("$" + total);  // ensures it displays to two decimal places
    }
}