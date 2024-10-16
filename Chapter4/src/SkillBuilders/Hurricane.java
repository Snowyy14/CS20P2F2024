package SkillBuilders;
import java.util.Scanner;
public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try (Scanner userInput = new Scanner(System.in)) {

        //user input
        System.out.print("Please enter the speed of the wind: ");
        int windspeed = userInput.nextInt();

        
        //wind speed categories
        if (windspeed < 74) {
            System.out.println("These wind speeds are not considered tornado like");
        } else if (windspeed >= 74 && windspeed <= 96) {
            System.out.print("The tornado is a category 1 tornado: ");
        } else if (windspeed >= 97 && windspeed <= 110){
            System.out.print("The tornado is a category 2 tornado: ");
        } else if (windspeed >= 111 && windspeed <= 130){
            System.out.print("The tornado is a category 3 tornado: ");
        } else if (windspeed >= 131 && windspeed <= 155){
            System.out.print("The tornado is a category 4 tornado: ");
        } else if (windspeed > 155){
            System.out.print("The tornado is a category 5 tornado: ");
        }

        //converting the wind speed into knots and kilometers per hour
        double kt = windspeed / 1.151;
        double kmph = windspeed * 1.609;


        //what the user will see
        System.out.print("The speed of the tornado is ");
        System.out.print(windspeed);
        System.out.print(" mph or ");
        System.out.print((int)kt);
        System.out.print(" knots or ");
        System.out.print((int)kmph);
        System.out.println(" kmph");
    }
		
		
		
		
	}

}
