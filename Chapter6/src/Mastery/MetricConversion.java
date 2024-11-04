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

    //the menu
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
        double inch = (inches * 2.54);
        System.out.println(inches + " inches = " + inch + " centimeters");
    }

    public static void centimeterstoinches(Scanner scanner) {
        System.out.print("Enter your centimeters: ");
        double centimeters = scanner.nextDouble();
        double centimeter = (centimeters / 2.54);
        System.out.println(centimeters + " centimeters = " + centimeter + " inches");
    }

    public static void feettocentimeters(Scanner scanner) {
        System.out.print("Enter your feet: ");
        double feet = scanner.nextDouble();
        double feets = (feet * 30.48);
        System.out.println(feet + " feet = " + feets + " centimeters");
    }

    public static void centimeterstofeet(Scanner scanner) {
        System.out.print("Enter your centimeters: ");
        double centimeters = scanner.nextDouble();
        double centimeter2 = (centimeters / 30.48);
        System.out.println(centimeters + " centimeters = " + centimeter2 + " feet");
    }

    public static void yardstometers(Scanner scanner) {
        System.out.print("Enter your yards: ");
        double yards = scanner.nextDouble();
        double yard = (yards * 0.91);
        System.out.println(yards + " yards = " + yard + " meters");
    }

    public static void meterstoyards(Scanner scanner) {
        System.out.print("Enter your meters: ");
        double meters = scanner.nextDouble();
        double meter = (meters / 0.91);
        System.out.println(meters + " meters = " + meter + " yards");
    }

    public static void milestokilometers(Scanner scanner) {
        System.out.print("Enter your miles: ");
        double miles = scanner.nextDouble();
        double mile = (miles * 1.6);
        System.out.println(miles + " miles = " + mile + " kilometers");
    }

    public static void kilometerstomiles(Scanner scanner) {
        System.out.print("Enter your kilometers: ");
        double kilometers = scanner.nextDouble();
        double kilo = (kilometers / 1.6);
        System.out.println(kilometers + " kilometers = " + kilo + " miles");
    }
}
