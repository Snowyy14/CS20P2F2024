package SkillBuilders;
import java.util.Scanner;
public class Circlepart1of4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	
	try (Scanner userInput = new Scanner(System.in)) {

        //the user input
        System.out.print("Please enter your circle radius: ");
        int circle = userInput.nextInt();
	
        System.out.print("Please enter your circle radius: ");
        int circumference = userInput.nextInt();
        
        circle spot = new circle2();
	      	
	      spot.setRadius(3);
	      System.out.println("Circle radius: " + spot.getRadius());
	      System.out.println("Circle circumference: " + spot.circumference());
	
	
	
	
}
}
}