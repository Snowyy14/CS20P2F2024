package SkillBuilders;

public class circlepart2of4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		System.out.println("Please enter the amount of pennies youd like to remove: ");
		int removepennies = scanner.nextInt();
		System.out.println("Please enter the amount of dimes youd like to remove: ");
		int removedimes = scanner.nextInt();
		System.out.println("Please enter the amount of nickels youd like to remove: ");
		int removenickels = scanner.nextInt();
		System.out.println("Please enter the amount of quarters youd like to remove: ");
		int removequarters = scanner.nextInt();
		
		
		
		piggyBank.removecoins(removepennies, removedimes, removenickels, removequarters);
	}

}
