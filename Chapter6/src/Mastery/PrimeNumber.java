package Mastery;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {

            // the user input
            System.out.print("Please enter your number: ");
            int number = userInput.nextInt();
            
<<<<<<< HEAD
            // the output for whether its prime or not
=======
            //the output for whether it's prime or not
>>>>>>> branch 'master' of https://github.com/Snowyy14/CS20P2F2024.git
            if (isPrime(number)) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("It is not a prime number");
            }
        }
    }

<<<<<<< HEAD
    // this is the method to check if its prime
=======
    //this is the method to check if it's prime
>>>>>>> branch 'master' of https://github.com/Snowyy14/CS20P2F2024.git
    public static boolean isPrime(int number) {
<<<<<<< HEAD
        // checks if the number is 1 or below; if so it's instantly false
=======
        // Checks if the number is 1 or below; if so, it's instantly false
>>>>>>> branch 'master' of https://github.com/Snowyy14/CS20P2F2024.git
        if (number <= 1) {
            return false;
        }
        
<<<<<<< HEAD
        // start by checking if it's divisible by 2 all the way to the square root of the number
=======
        //start by checking if it's divisible by 2 all the way to the square root of the number
>>>>>>> branch 'master' of https://github.com/Snowyy14/CS20P2F2024.git
        for (int i = 2; i <= Math.sqrt(number); i++) {
<<<<<<< HEAD
            // checking for divisibility
=======
            // Checking for divisibility
>>>>>>> branch 'master' of https://github.com/Snowyy14/CS20P2F2024.git
            if (number % i == 0) {
                return false;
            }
        }
<<<<<<< HEAD
        // if nothing is found it returns true
=======
        //if nothing is found, return true
>>>>>>> branch 'master' of https://github.com/Snowyy14/CS20P2F2024.git
        return true;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> branch 'master' of https://github.com/Snowyy14/CS20P2F2024.git
