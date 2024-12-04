package Mastery;


import java.util.ArrayList;
import java.util.Random;




public class EvensAndOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		
		Random random = new Random();
		
		
		for (int i=0 ; i < 25; i++) {
			int num = random.nextInt(100);
			if (num % 2 == 0) {
				evens.add(num);
				
			} else {
				odds.add(num);
			}
		}
		
		System.out.println("ODD: " + odds);
		System.out.println("EVEN: " + evens);
		
	}

}
