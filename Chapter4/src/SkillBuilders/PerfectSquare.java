package SkillBuilders;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
		try (Scanner userInput = new Scanner(System.in)) {

        //user input
        System.out.print("Please enter the speed of the wind: ");
        int integer = userInput.nextInt();
		
        int product = integer * integer;
        
        System.out.print("Your perfects square number is: ");
		System.out.print(product);
		
		}
	}

}
