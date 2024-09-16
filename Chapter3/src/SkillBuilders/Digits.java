/*
Program: digits.java          Date: Sept, 16, 2024

Purpose: Codio assingment

Author: Ethan presinal
School: CHHS
Course: Computer Science 20
 
*/

package SkillBuilders;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (Scanner userInput = new Scanner(System.in)) {
			
			//Asking for the users two digit number
			System.out.print("Please enter your two digit number: ");
			int twodigit = userInput.nextInt();
			
			//dividing the two digit number by 10 to get the tens place number
			int tensplace = twodigit/10;
			
			//printing out the tens place number
			System.out.print("Your tens place number is ");
			System.out.println(tensplace);
			
			//multiplying the tens place by 10 to get it to a double digit number then subtracting it by the original number to get the ones place
			int divider = tensplace * 10;
			int onesplace = twodigit - divider;
			//printing the ones place number
			System.out.print("Your ones place number is ");
			System.out.println(onesplace);
			
			
			
			
			
		}
		
		
		
	}

}
