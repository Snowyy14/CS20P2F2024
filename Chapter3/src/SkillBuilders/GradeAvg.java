package SkillBuilders;
import java.util.Scanner;
public class GradeAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner userInput = new Scanner(System.in)) {
		
			//getting all the grades
			System.out.print("Please enter your first grade: ");
			int firstgrade = userInput.nextInt();
			
			int operator = 0;
			
			System.out.print("Your grade average is: ");
			System.out.println(operator += firstgrade );
			
		   operator = 0;
		  
			
			System.out.print("Please enter your second grade: ");
			int secondgrade = userInput.nextInt();
			
			System.out.print("Your grade average is: ");
			System.out.println((operator += firstgrade + secondgrade) / 2);
			
			operator = 0;
			
			System.out.print("Please enter your third grade: ");
			int thirdgrade = userInput.nextInt();
			
			System.out.print("Your grade average is: ");
			System.out.println((operator += firstgrade + secondgrade + thirdgrade) / 3);
			
			operator = 0;
			
			System.out.print("Please enter your fourth grade: ");
			int fourthgrade = userInput.nextInt();
			
			
			System.out.print("Your grade average is: ");
			System.out.println((operator += firstgrade + secondgrade + thirdgrade + fourthgrade) / 4);
			
			operator = 0;
			
			System.out.print("Please enter your fifth grade: ");
			int fifthgrade = userInput.nextInt();
			
			operator = 0;
			
			System.out.print("Your grade average is: ");
			System.out.println((operator += firstgrade + secondgrade + thirdgrade + fourthgrade + fifthgrade) / 5);
			
			
			
				
			
		
		
		
		}
	}

}
