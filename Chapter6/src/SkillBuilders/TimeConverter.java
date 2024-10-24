package SkillBuilders;
import java.util.Scanner;
public abstract class TimeConverter {

	 public static String Conversions(int number) {
		 switch (number) {
		 case 1: return "Hours to Minutes";
		 case 2: return "Days to Hours";
		 case 3: return "Minutes to Hours";
		 case 4: return "Hours to Days";

		 }
		return "Please 1-10";

	 }
	 
	 //hours to minutes, days to hours, minutes to hours, hours to days
	 
	 public static void main(String[] args) {
		 Scanner scanner = new
				 Scanner(System.in);
		 System.out.println("1. Hours to Minutes");
		 System.out.println("2. Days to Hours");
		 System.out.println("3. Minutes to Hours");
		 System.out.println("4. Hours to Days");
		 System.out.print("Please enter your selection: ");
		 int userInput = scanner.nextInt();
		 
		 if (userInput >= 1 && userInput <= 10) {
			 String converted = Conversions(userInput);
			 System.out.println("You have chosen " + converted);
		 
	 }
}
}