package SkillBuilders;
import java.util.Scanner;
public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try (Scanner userInput = new Scanner(System.in)) {

        //user input
        System.out.print("Please enter the minimum number: ");
        int firstnum = userInput.nextInt();
		
        System.out.print("Please enter the maximum number: ");
        int secondnum = userInput.nextInt();
		
        System.out.println("Random number: "+ (int)((secondnum - firstnum + 1) * Math.random() + firstnum));
        

        
        
        
        
        
        }
		
	}

}
