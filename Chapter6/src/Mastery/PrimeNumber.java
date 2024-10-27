package Mastery;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {

            // User input
            System.out.print("Please enter your number: ");
            int number = userInput.nextInt();
            
            // Checking if the number is prime using the isPrime() method
            if (isPrime(number)) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("It is not a prime number");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        // Checking divisibility from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

}
