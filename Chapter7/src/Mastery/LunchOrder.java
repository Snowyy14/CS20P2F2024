package Mastery;

import java.util.Scanner;

class Food {
    private double price;
    private int fat;
    private int carbs;
    private int fiber;

  
    public Food(double price, int fat, int carbs, int fiber) {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    				}


    public double getPrice() {
        return price;
    
    
    					}	
    
    public int getFat() {
        return fat;
    	}

    public int getCarbs() {
        return carbs;
    }
    
    public int getFiber() {
        return fiber;
    	}
}

public class LunchOrder {
    public static void main(String[] args) {

  
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food salad = new Food(2.00, 1, 11, 5);
        Food frenchFries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);

   
        Scanner scanner = new Scanner(System.in);

        System.out.println("Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber");
        System.out.print("Please enter the number of hamburgers: ");
        int numHamburgers = scanner.nextInt();
        
        
        System.out.println("Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber");
        System.out.print("Please enter the number of salads: ");
        int numSalads = scanner.nextInt();

        
        
        System.out.println("French fries have 11.0g of fat, 36.0g of carbs, and 4.0g of fiber");
        System.out.print("Please enter the number of french fries: ");
        int numFries = scanner.nextInt();

        
        System.out.println("Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber");
        System.out.print("Please enter the number of sodas: ");
        int numSodas = scanner.nextInt();


        double totalCost = numHamburgers * hamburger.getPrice() + numSalads * salad.getPrice() + numFries * frenchFries.getPrice() + numSodas * soda.getPrice();

      
        int totalFat = numHamburgers * hamburger.getFat() + numSalads * salad.getFat() + numFries * frenchFries.getFat() + numSodas * soda.getFat();

        int totalCarbs = numHamburgers * hamburger.getCarbs() + numSalads * salad.getCarbs() + numFries * frenchFries.getCarbs() + numSodas * soda.getCarbs();

        int totalFiber = numHamburgers * hamburger.getFiber() + numSalads * salad.getFiber() + numFries * frenchFries.getFiber() + numSodas * soda.getFiber();

      
        System.out.println("Your total order summary:");
        System.out.println("Total cost: $"  + totalCost);
        System.out.println("Total Fat: " + totalFat+ "g");
        System.out.println("Total Carbs: " + totalCarbs+ "g");
        System.out.println("Total Fiber: "+ totalFiber+ "g");

        scanner.close();
        
        
        
        
        
   			}
			}		
