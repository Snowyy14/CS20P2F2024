package Mastery;
import java.util.Scanner;
public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner userInput = new Scanner(System.in)) {
		
			System.out.print("Please enter the election results for Mia New York: ");
			int MiaNewyork = userInput.nextInt();
		
			System.out.print("Please enter the election results for Mia Texas: ");
			int MiaTexas = userInput.nextInt();
			
			System.out.print("Please enter the election results for Mia Washignton: ");
			int MiaWash = userInput.nextInt();
			
			System.out.print("Please enter the election results for Leo New york: ");
			int LeoNewyork = userInput.nextInt();
			
			System.out.print("Please enter the election results for Leo Texas: ");
			int LeoTexas = userInput.nextInt();
			
			System.out.print("Please enter the election results for Leo Washignton: ");
			int LeoWash = userInput.nextInt();
			
			//NEW YORK
			System.out.println(" ");
			
			System.out.println("Election Results for New York: ");
			
			System.out.print("Mia: ");
			
			System.out.println(MiaNewyork);
			
			System.out.print("Leo: ");
			
			System.out.println(LeoNewyork);
		
			//TEXAS
			System.out.println(" ");
			
			System.out.println("Election Results for Texas: ");
			
			System.out.print("Mia: ");
			
			System.out.println(MiaTexas);
			
			System.out.print("Leo: ");
			
			System.out.println(LeoTexas);
			
			
			//WASHINGTON
			System.out.println(" ");
			
			System.out.println("Election Results for Washington: ");
			
			System.out.print("Mia: ");
			
			System.out.println(MiaWash);
			
			System.out.print("Leo: ");
			
			System.out.print(LeoWash);
			
			
			System.out.println(" ");
			
			//results
			int totalvotesMia = MiaNewyork + MiaTexas + MiaWash;
			
			int totalvotesLeo = LeoNewyork + LeoTexas + LeoWash;
			
			int totalvotes = totalvotesLeo + totalvotesMia;
			
			double percent2 = ((double)totalvotesLeo / totalvotes) * 100 ;
			double percent1 = ((double)totalvotesMia / totalvotes) * 100;
			

			
			System.out.print("Candidate        ");
			System.out.print("Votes         ");
			System.out.println("Percentange");
			
			
			System.out.print("Mia              ");
			System.out.print(totalvotesMia);
			System.out.print("         ");
			System.out.println(percent1);
			
			
			System.out.print("Leo              ");
			System.out.print(totalvotesLeo);
			System.out.print("          ");
		
			System.out.println(percent2);
			
			
			System.out.print("TOTAL VOTES:     ");
			System.out.println(totalvotes);
			

			

		
		
		}
	}

}
