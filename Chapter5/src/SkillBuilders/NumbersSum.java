package SkillBuilders;
import java.util.Scanner;
public class NumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try (Scanner userInput = new Scanner(System.in)) {

		        //user input
		        System.out.print("Please enter your maximum number: ");
		        int max = userInput.nextInt();
		
		int o = 0;        
		while(o<=max) {
			System.out.println(o);
			
			o += 1;
		}
		

		
	}

}
}