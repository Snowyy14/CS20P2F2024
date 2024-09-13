package SkillBuilders;
import java.util.Scanner;
public class Square2 {

	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
 
		try (Scanner userInput = new Scanner(System.in)) {
			//Asking for the length value
			System.out.print("Please enter a length value: ");
			int length = userInput.nextInt();
			
			//Asking for the width value
			System.out.print("Please enter a width value: ");
			int width = userInput.nextInt();
			
			//multiplying both length and width by 2
			int x = length* 2;
			int z = width * 2;
			
			//adding the multiplied values together
			int y = x+z;
			
			//giving the answer
			System.out.print("The area of your square is: " +  y);
		}
		
		
	}

}
