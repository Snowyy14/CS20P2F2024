package SkillBuilders;
import java.util.Scanner;
public class Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try (Scanner userInput = new Scanner(System.in)) {

        //user input
        System.out.print("Please enter the length of your package: ");
        int length = userInput.nextInt();
		
        System.out.print("Please enter the width of your package: ");
        int width = userInput.nextInt();
        
        System.out.print("Please enter the height of your package: ");
        int height = userInput.nextInt();
		
        //if ones rejected its all rejected
        if (length > 10 || width > 10 || height > 10) {
        	System.out.print("Your package was rejected");
        }
        else if (length <= 10 || width <= 10 || height <= 10) {
        	System.out.print("Your package was accepted");
        }
        
        
	}
	}

}
