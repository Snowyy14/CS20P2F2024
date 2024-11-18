package Mastery;
import java.util.Scanner;
public class MySavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		class Piggybank {
			private int nickels;
			private int dimes;
			private int pennies;
			private int quarters;
			
			
			public Piggybank() {
				this.pennies = 0;
				this.dimes = 0;
				this.nickels = 0;
				this.quarters = 0;
			}
		
			public void addCoins(int pennies, int dimes, int quarters, int nickels) {
				this.pennies += pennies;
				this.nickels += nickels;
				this.dimes += dimes;
				this.quarters += quarters;
			}
			
			public void removecoins(int pennies, int dimes, int quarters, int nickels) {
				this.pennies = Math.max(0, this.pennies - pennies);
				this.dimes = Math.max(0, this.dimes - dimes);
				this.nickels = Math.max(0, this.nickels - nickels);
				this.quarters = Math.max(0, this.quarters - quarters);
			}
			
			public double mathtotalamount() {
				return pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
			}
			
			public String tothestring() {
			return "whats in the piggy bank: " + pennies + " Pennies " + dimes + " Dimes " + quarters + " Quarters " + nickels + " nickels "; 
		}
			
			
			
		}
		
		public class MySavings {
			public static void main(String[] args ) {
				Piggybank piggyBank = new Piggybank();
				Scanner scanner = new Scanner(System.in);
				
				while (true) {
					System.out.println("\nMy piggy bank: ");
					System.out.println("1. Add a penny "); //1
					System.out.println("2. Add a nickel "); //2
					System.out.println("3. Add a Dime "); //3 
					System.out.println("4. Add a quarter "); //4 
					System.out.println("5. Take out money "); //5
					System.out.println("6. Check money "); // 6
					System.out.println("7. Quit "); //7
					System.out.println("Enter your selection: ");
					int choice = scanner.nextInt();
					
					switch (choice) {
					
					case 1: 
						System.out.println("Enter the amount of pennies your adding: ");
					int addPennies = scanner.nextInt();
					
					case 2: 
						System.out.println("Enter the amount of nickels your adding: ");
					int addNickels = scanner.nextInt();
					
					case 3: 
						System.out.println("Enter the amount of Dimes your adding: ");
					int addDimes = scanner.nextInt();
					
					case 4: 
						System.out.println("Enter the amount of quarters your adding: ");
					int addQuarters = scanner.nextInt();
					
					
					case 5: 
						
						System.out.println("Please enter the amount of pennies youd like to remove: ");
						int removepennies = scanner.nextInt();
						System.out.println("Please enter the amount of dimes youd like to remove: ");
						int removedimes = scanner.nextInt();
						System.out.println("Please enter the amount of nickels youd like to remove: ");
						int removenickels = scanner.nextInt();
						System.out.println("Please enter the amount of quarters youd like to remove: ");
						int removequarters = scanner.nextInt();
						
						
						
						piggyBank.removecoins(removepennies, removedimes, removenickels, removequarters);
						
						System.out.println("Yoru coins have been removed successfully ");
						break;
						
					case 6: 
						System.out.println(piggyBank);
						break;
						
					case 7: 
					System.out.println("Exiting... Goodbye!");
					scanner.close();
					return;
					
					default: System.out.println("You didnt choose a correct selection, choose between 1-7");
					
					
					
					
					
					
					
					
					
					
					
					}
				
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
		
		
		
		
		
		
		
		
	}

}
