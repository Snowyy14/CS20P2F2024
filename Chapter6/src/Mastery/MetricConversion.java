package Mastery; 
import java.util.Scanner;
public class MetricConversion {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        //the choice and while do loop
        do {
            displayMenu();
            System.out.print("Please choose your conversion: ");
            choice = scanner.nextInt();
            
            //switch statement for menu
            switch (choice) {
                case 1 -> inchestocentimeters(scanner);
                case 2 -> centimeterstoinches(scanner);
                case 3 -> feettocentimeters(scanner);
                case 4 -> centimeterstofeet(scanner);
                case 5 -> yardstometers(scanner);
                case 6 -> meterstoyards(scanner);
                case 7 -> milestokilometers(scanner);
                case 8 -> kilometerstomiles(scanner);
                case 0 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
            System.out.println();
        } while (choice != 0);
        
        scanner.close();
    }
    //the men
    public static void displayMenu() {
        System.out.println("Please choose one of the following conversions");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Centimeters to Inches");
        System.out.println("3. Feet to Centimeters");
        System.out.println("4. Centimeters to Feet");
        System.out.println("5. Yards to Meters");
        System.out.println("6. Meters to Yards");
        System.out.println("7. Miles to Kilometers");
        System.out.println("8. Kilometers to Miles");
    }
    //calculations to turn x into y
    public static void inchestocentimeters(Scanner scanner) {
        System.out.print("Enter your inches: ");
        double inches = scanner.nextDouble();
        System.out.printf("%.2f inches = %.2f centimeters%n", inches, inches * 2.54);
    }
    
    public static void centimeterstoinches(Scanner scanner) {
        System.out.print("Enter your centimeters: ");
        double centimeters = scanner.nextDouble();
        System.out.printf("%.2f centimeters = %.2f inches%n", centimeters, centimeters / 2.54);
    }
    
    public static void feettocentimeters(Scanner scanner) {
        System.out.print("Enter your feet: ");
        double feet = scanner.nextDouble();
        System.out.printf("%.2f feet = %.2f centimeters%n", feet, feet * 30.48);
    }
    
    public static void centimeterstofeet(Scanner scanner) {
        System.out.print("Enter your centimeters: ");
        double centimeters = scanner.nextDouble();
        System.out.printf("%.2f centimeters = %.2f feet%n", centimeters, centimeters / 30.48);
    }
    
    public static void yardstometers(Scanner scanner) {
        System.out.print("Enter your yards: ");
        double yards = scanner.nextDouble();
        System.out.printf("%.2f yards = %.2f meters%n", yards, yards * 0.91);
    }
    
    public static void meterstoyards(Scanner scanner) {
        System.out.print("Enter your meters: ");
        double meters = scanner.nextDouble();
        System.out.printf("%.2f meters = %.2f yards%n", meters, meters / 0.91);
    }
    
    public static void milestokilometers(Scanner scanner) {
        System.out.print("enter your miles: ");
        double miles = scanner.nextDouble();
        System.out.printf("%.2f miles = %.2f kilometers%n", miles, miles * 1.6);
    }
    
    public static void kilometerstomiles(Scanner scanner) {
        System.out.print("Enter your kilometers: ");
        double kilometers = scanner.nextDouble();
        System.out.printf("%.2f kilometers = %.2f miles%n", kilometers, kilometers / 1.6);
    }
}