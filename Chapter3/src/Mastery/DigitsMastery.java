package Mastery;
import java.util.Scanner;
public class DigitsMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner userInput = new Scanner(System.in)) {
			
		
			System.out.print("Please enter your three digit number: ");
			int threedigit = userInput.nextInt();
			
			//dividing the number 100 to get a single digit
			int hundredsplace = threedigit/100;
			
			//divide it by 10

			//takes the whole number divides it by 10 then takes the remainder
			int tensplace = threedigit / 10 % 10;
			
			int tensplace1 = threedigit/10;
			//multiply tensplace1 by 10
			int divider = tensplace1 * 10;
			
			int onesplace = threedigit - divider;
			
			
			System.out.print("Your hundreds place number is ");
			System.out.println(hundredsplace);
			
	
			System.out.print("Your tens place number is ");
			System.out.println(tensplace);

			
			System.out.print("Your ones place number is ");
			System.out.println(onesplace);
			
		
		}
		
	}

}
