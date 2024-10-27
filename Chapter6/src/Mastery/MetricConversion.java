package Mastery; 
import java.util.Scanner;
public class MetricConversion {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            displayMenu();
            System.out.print("Choose a conversion (1-8) or 0 to exit: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> inchesToCentimeters(scanner);
                case 2 -> centimetersToInches(scanner);
                case 3 -> feetToCentimeters(scanner);
                case 4 -> centimetersToFeet(scanner);
                case 5 -> yardsToMeters(scanner);
                case 6 -> metersToYards(scanner);
                case 7 -> milesToKilometers(scanner);
                case 8 -> kilometersToMiles(scanner);
                case 0 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
            System.out.println();
        } while (choice != 0);
        
        scanner.close();
    }
    
    public static void displayMenu() {
        System.out.println("Metric Conversion Menu:");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Centimeters to Inches");
        System.out.println("3. Feet to Centimeters");
        System.out.println("4. Centimeters to Feet");
        System.out.println("5. Yards to Meters");
        System.out.println("6. Meters to Yards");
        System.out.println("7. Miles to Kilometers");
        System.out.println("8. Kilometers to Miles");
        System.out.println("0. Exit");
    }
    
    public static void inchesToCentimeters(Scanner scanner) {
        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();
        System.out.printf("%.2f inches = %.2f centimeters%n", inches, inches * 2.54);
    }
    
    public static void centimetersToInches(Scanner scanner) {
        System.out.print("Enter centimeters: ");
        double centimeters = scanner.nextDouble();
        System.out.printf("%.2f centimeters = %.2f inches%n", centimeters, centimeters / 2.54);
    }
    
    public static void feetToCentimeters(Scanner scanner) {
        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.printf("%.2f feet = %.2f centimeters%n", feet, feet * 30.48);
    }
    
    public static void centimetersToFeet(Scanner scanner) {
        System.out.print("Enter centimeters: ");
        double centimeters = scanner.nextDouble();
        System.out.printf("%.2f centimeters = %.2f feet%n", centimeters, centimeters / 30.48);
    }
    
    public static void yardsToMeters(Scanner scanner) {
        System.out.print("Enter yards: ");
        double yards = scanner.nextDouble();
        System.out.printf("%.2f yards = %.2f meters%n", yards, yards * 0.91);
    }
    
    public static void metersToYards(Scanner scanner) {
        System.out.print("Enter meters: ");
        double meters = scanner.nextDouble();
        System.out.printf("%.2f meters = %.2f yards%n", meters, meters / 0.91);
    }
    
    public static void milesToKilometers(Scanner scanner) {
        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        System.out.printf("%.2f miles = %.2f kilometers%n", miles, miles * 1.6);
    }
    
    public static void kilometersToMiles(Scanner scanner) {
        System.out.print("Enter kilometers: ");
        double kilometers = scanner.nextDouble();
        System.out.printf("%.2f kilometers = %.2f miles%n", kilometers, kilometers / 1.6);
    }
}
