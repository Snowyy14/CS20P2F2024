package SkillBuilders;

import java.util.Scanner;

public class SpanishNumbers {

 public static String SpanishNumber(int number) {
	 switch (number) {
	 case 1: return "uno";
	 case 2: return "dos";
	 case 3: return "tres";
	 case 4: return "cuatro";
	 case 5: return "cinco";
	 case 6: return "seis";
	 case 7: return "siete";
	 case 8: return "ocho";
	 case 9: return "nueve";
	 case 10: return "diez";
	 }
	return "Please 1-10";

 }
 
 public static void main(String[] args) {
	 Scanner scanner = new
			 Scanner(System.in);
	 System.out.print("Please enter a number between 1 and 10 that youd like to translate: ");
	 int userInput = scanner.nextInt();
	 
	 if (userInput >= 1 && userInput <= 10) {
		 String translted = SpanishNumber(userInput);
		 System.out.println("The number " + userInput + " in Spanish is: " + translted);
		 
	 }
	 else { 
		 System.out.println("ONLY NUMBERS FROM 1-10");
	 }
 
		
 
		
		
		
		
		
		
		
		


}
}
