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
			int tensplace1 = threedigit/10;
			
			//multiply tensplace1 by 10
			int divider = tensplace1 * 10;
			
			int onesplace = threedigit - divider;
			
			int x = threedigit/10 - onesplace;
			
			int tensplace2 = threedigit/10 - x;
			
			System.out.print("Your hundreds place number is ");
			System.out.println(hundredsplace);
			
			//commit to github
			System.out.print("Your tens place number is ");
			System.out.println(tensplace2);

			
			System.out.print("Your ones place number is ");
			System.out.println(onesplace);
			
		
		}
		
	}

}
