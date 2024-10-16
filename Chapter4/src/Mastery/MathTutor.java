package Mastery;
import java.util.Random;
import java.util.Scanner;
public class MathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Random rand = new Random();

        //choosing 2 random numbers between 1 and 10
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);

        //choosing random operator
        int operator = rand.nextInt(4);

        double result = 0;
        String opSymbol = "";

        //the cases for the operators
        switch (operator) {
            case 0:
                result = num1 + num2;
                opSymbol = "+";
                break;
            case 1:
                result = num1 - num2;
                opSymbol = "-";
                break;
            case 2:
                result = num1 * num2;
                opSymbol = "*";
                break;
            case 3:
              
            if (num2 != 0) {
                result = (double) num1 / num2;
               } else {
                   result = 0;
                   num2 = 1; 
                }
                opSymbol = "/";
                break;
        }

        //asking the math question
        try (Scanner userInput = new Scanner(System.in)) {

            System.out.print("What is ");
            System.out.print(num1 + " " + opSymbol + " " + num2 + " = ");

            double userAnswer = userInput.nextDouble();

            //output if they get it right or wrong
            if (userAnswer == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect the real answer is " + result);
            }
        }
    }
}
