package Mastery;

import java.util.Scanner;

class Food {
	private double prices;
	private int fat;
	private int carbs;
	private int fiber;

public food(double prices, int fat, int carbs, int fiber) {
this.prices = prices;
	this.fat = fat;
	this.carbs = carbs;
	this.fiber = fiber;
}

	public double gettingprice() {
return prices;
	}

		public int getingfat() {
return fat;
	}

		public int gettingcarbs() {
return carbs;
	}

		public int gettingfiber() {
return fiber;
	}
	
}		
		
		public class LunchOrder {
			public static void main(String[] args) {

				food hamburger = new Food(1.85, 9, 33,1);
					food salad = new Food(2.00, 1, 11, 5);
					food frenchfries = new Food(1.30,11,36,4);
					food soda = new Food(0.95,0,38,0);

	Scanner scanner = new Scanner(System.in);

				System.out.println("Please enter the number of hamburgers: );
				System.out.printf("Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber");
	int numhamburgers = scanner.nextInt();

								System.out.println("Please enter the number of salad: );
				System.out.printf("Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber");
	int numsalads = scanner.nextInt();

								System.out.println("Please enter the number of french fries: );
				System.out.printf("French fries have 11.0g of fat, 36.0g of carbs, and 4.0g of fiber");
	int numfries = scanner.nextInt();

								System.out.println("Please enter the number of soda: );
				System.out.printf("Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber");
	int numsodas = scanner.nextInt();


				double totalcost = numhamburgers * hamburger.getprice() + numsalads * salad.getprice() + numfries * fries.getprice() + numsodas * sodas.getprice() + 

				
		}
		
		
		
	}

}
