package Mastery;
import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner userInput = new Scanner(System.in)) {
		
			
		//Asking for the time it took for each task
		System.out.print("Please enter the time you took for designing: ");
		double Designing = userInput.nextInt();
		
		System.out.print("Please enter the time you took for coding: ");
		double Coding = userInput.nextInt();
		
		System.out.print("Please enter the time you took for debugging: ");
		double Debugging = userInput.nextInt();
		
		System.out.print("Please enter the time you took for testing: ");
		double Testing = userInput.nextInt();
		
		//Calculating percentages
		double totaltime = Designing + Coding + Debugging + Testing;
		
		double Designingpercent = (Designing / totaltime) * 100;
		
		double Coding1 = (Coding / totaltime) * 100;
		
		double Debugging1 = (Debugging / totaltime) * 100;
		
		double Testing1 = (Testing / totaltime) * 100;
		
		System.out.println(" ");
		
		//Printing percentages
		System.out.println("  Task:        % Time ");
		
		System.out.print("Designing: %");
		System.out.println(Designingpercent);

		System.out.print("Coding:    %");
		System.out.println(Coding1);
		
		System.out.print("Debugging: %");
		System.out.println(Debugging1);
		
		System.out.print("Testing:   %");
		System.out.println(Testing1);
			
			
			
			
		}
	}

}
