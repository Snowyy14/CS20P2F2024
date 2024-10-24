package SkillBuilders;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
public class Exponentiation {
	
	public static double powerOf(Double base, double exponent) {
		return Math.pow(base, exponent);
	}
			
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				
				
				System.out.print("Please enter your base: ");
				double base = scanner.nextDouble();
				
				System.out.print("Please enter your exponent: ");
				double exponent = scanner.nextDouble();
				
				double result = powerOf(base, exponent);
				
				
				System.out.println(base + " raised to the power of " + exponent + " is " + result);
				
				
			}
			

		}

	

