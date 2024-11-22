package Mastery;
import java.util.Scanner;

class Number {
    private int number;


    public Number(int number) {
        this.number = Math.abs(number);
    }

    
    public int getWholeNumber() {
        return number;
    			}
    

    public int getOnesDigit() {
        return number % 10;
    		}

    
    public int getTensPlace() {
        return (number / 10) % 10;
    }

   
    public int getHundredsPlace() {
        return (number / 100) % 10;
    		}
}

public class DigitExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the digit extractor application");

        while (true) 			{
            try {
                System.out.print("Enter your integer: ");
                int num = scanner.nextInt();

                System.out.println(" ");
                Number numberObj = new Number(num);

                while (true) {
                 
                    System.out.println("1. Get the whole number");
                    System.out.println("2. Get the one's digit");
                    System.out.println("3. Get the tens place digit");
                    System.out.println("4. Get the hundreds place digit");
                    System.out.println("5. Exit");
                    System.out.print("Choose an option: ");
             
  
                    

                    int choice = scanner.nextInt();
                    System.out.println(" ");

                    switch (choice) {
                        case 1:
                            System.out.println("Whole number: " + numberObj.getWholeNumber());
                            System.out.println(" ");
                            break;
                        case 2:
                            System.out.println("One's digit: " + numberObj.getOnesDigit());
                            System.out.println(" ");
                            break;
                        case 3:
                            System.out.println("Tens place digit: " + numberObj.getTensPlace());
                            System.out.println(" ");
                            break;
                        case 4:
                            System.out.println("Hundreds place digit: " + numberObj.getHundredsPlace());
                            System.out.println(" ");
                            break;
                        case 5:
                            System.out.println("Exiting... Goodbye!");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Invalid choice! Please choose between 1-5.");
                            break;
                 }
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); 
                
                
                
                
                
                
                
     }
            
            
            
            
   }
        
        
        
    }
    
    
    
    
    
    
	}
