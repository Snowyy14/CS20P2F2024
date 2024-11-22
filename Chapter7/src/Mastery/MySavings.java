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


            public String toString() {
                return "Your piggy bank contains: " + pennies + " Pennies, " + dimes + " Dimes, " + quarters + " Quarters, " + nickels + " Nickels.";
           }
     
        }

        Piggybank piggyBank = new Piggybank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMy piggy bank: ");
            System.out.println("1. Add a penny ");
            System.out.println("2. Add a nickel ");
            System.out.println("3. Add a dime "); 
            System.out.println("4. Add a quarter "); 
            System.out.println("5. Take out money "); 
            System.out.println("6. Check balance "); 
            System.out.println("7. Quit "); 
            System.out.print("Enter your selection: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter the amount of pennies you're adding: ");
                    int addPennies = scanner.nextInt();
                    piggyBank.addCoins(addPennies, 0, 0, 0);
                    
                    System.out.println(" ");
                    System.out.println("your new balance is: " + piggyBank.mathtotalamount());
                    break;
                
                case 2: 
                    System.out.print("Enter the amount of nickels you're adding: ");
                    int addNickels = scanner.nextInt();
                    piggyBank.addCoins(0, 0, 0, addNickels);
                    
                    System.out.println(" ");
                    System.out.println("your new balance is: " + piggyBank.mathtotalamount());
                    break;
                
                case 3: 
                    System.out.print("Enter the amount of dimes you're adding: ");
                    int addDimes = scanner.nextInt();
                    piggyBank.addCoins(0, addDimes, 0, 0); 
                    System.out.println(" ");
                    System.out.println("your new balance is: " + piggyBank.mathtotalamount());
                    break;
                
                case 4: 
                    System.out.print("Enter the amount of quarters you're adding: ");
                    int addQuarters = scanner.nextInt();
                    piggyBank.addCoins(0, 0, addQuarters, 0);
                    System.out.println(" ");
                    System.out.println("your new balance is: " + piggyBank.mathtotalamount());
                    break;

                case 5: 
                    System.out.print("Please enter the amount of pennies you'd like to remove: ");
                    int removePennies = scanner.nextInt();
                    
                    
                    System.out.print("Please enter the amount of dimes you'd like to remove: ");
                    int removeDimes = scanner.nextInt();
                    
                    System.out.print("Please enter the amount of nickels you'd like to remove: ");
                    int removeNickels = scanner.nextInt();
                    
                    
                    System.out.print("Please enter the amount of quarters you'd like to remove: ");
                    int removeQuarters = scanner.nextInt();
                   

                    piggyBank.removecoins(removePennies, removeDimes, removeQuarters, removeNickels);
                    System.out.println("your coins have been removed");
                    System.out.println(" ");
                    System.out.print("Your new balance is: " + piggyBank.mathtotalamount());
                    break;

                case 6: 
                    System.out.println("Your current balance is: " + piggyBank.mathtotalamount());
                    break;

                case 7: 
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default: 
                    System.out.println("You didnt choose a correct selection please choose between 1-7");
        }
        
        }
   
    
    
    
    
    
  
    
    
    }







}
