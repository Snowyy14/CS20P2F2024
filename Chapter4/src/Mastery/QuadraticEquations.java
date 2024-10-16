package Mastery;
import java.util.Scanner;
public class QuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//asking the user for the value of a,b, and c
 		try (Scanner userInput = new Scanner(System.in)) {
 			
			System.out.print("Please enter the value of a: ");
			int A = userInput.nextInt();

			System.out.print("Please enter the value of b: ");
			int B = userInput.nextInt();
			
			System.out.print("Please enter the value of c: ");
			int C = userInput.nextInt();
		
			
		//using quadratic equation formula to get the roots
        int z = (B * B) - (4*A*C);
        
        double q = Math.sqrt(z);
        
        int o = (2*A);
        
        int B1 = (B + B);
        
        int B2 = (B - B1);
        
        double w = (B2+q);
        
        double v = (w/o);
        
        double t = (B2-q);
        
        double n = (t/o);
      
    //making sure that it doesnt print two roots when there the same
    if (v==n) {
        System.out.print("The real root(s) are: " + v);
    }
    else {
        System.out.println("The real root(s) are: " + v + " " + n);
    }
        
        
 		}
    }
}