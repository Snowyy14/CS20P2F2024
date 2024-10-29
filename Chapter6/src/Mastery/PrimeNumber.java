package Mastery;
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {

            //the user inpuut
            System.out.print("Please enter your number: ");
            int number = userInput.nextInt();
            
            //the output for if its prime or not
            if (isPrime(number)) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("It is not a prime number");
            }
        }
    }

    //this is the method to check if its prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

