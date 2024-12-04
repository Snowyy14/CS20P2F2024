package Mastery;


import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your word: ");
		String input = scanner.nextLine();
		
		if(palindrome(input)) {
			System.out.println("Your word " + input + " is a palindrome"); 
			

		} else {
			
		System.out.println("Your word " + input + " isnt a palindrome");
		}
		
		scanner.close();
	}
		public static boolean palindrome(String str) {
			String cleaned = str.replaceAll("\\s+", ""). toLowerCase();
			
			String reversed = new StringBuilder(cleaned).reverse().toString();
			return cleaned.equals(reversed);
					
		}
		
		
		
		
		
		
	}

