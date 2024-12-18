package Events;
//Add Phidgets Library
import com.phidget22.*;
public class ButtonAndLED {
   //Counters for button presses initialized as 0 because no buttons have been pressed
   static int redButtonPresses = 0;     // Tracks the number of presses for the Red Button (Player 1)
   static int greenButtonPresses = 0;   
   static boolean gameRunning = true; 
   public static void main(String[] args) throws Exception {
       // Objects for buttons and LEDs
       DigitalInput redButton = new DigitalInput(); // Red Button input
       DigitalInput greenButton = new DigitalInput(); // Green Button input
       DigitalOutput redLED = new DigitalOutput(); // Red LED output
       DigitalOutput greenLED = new DigitalOutput(); // Green LED output
       //Address devices to their respective ports
       redButton.setHubPort(0); // Red Button port 0
       redButton.setIsHubPortDevice(true);
       greenButton.setHubPort(5); // Green Button port 5
       greenButton.setIsHubPortDevice(true);
       redLED.setHubPort(1); // Red LED port 1
       redLED.setIsHubPortDevice(true);
       greenLED.setHubPort(4); // Green LED port 4
       greenLED.setIsHubPortDevice(true);

       
       
       
       
       redButton.open(1000);
       greenButton.open(1000);
       redLED.open(1000);
       greenLED.open(1000);
       //Event for Red Button
       redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               if (gameRunning) {
                   try {
						redLED.setState(e.getState()); 
					} catch (PhidgetException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                   if (e.getState()) { // Increment counter only when button is pressed
                       redButtonPresses++; // Adds 1 to redButtonPresses
                       System.out.println("Red Button Presses: " + redButtonPresses); // Prints number of Red Button presses
                       checkWinner(redLED, greenLED); // Check if red player has won
                   }
               }
           }
       });
       //Event for Green Button
       greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               if (gameRunning) {
                   try {
						greenLED.setState(e.getState()); // Turn Green LED on when button is pressed and off when released
					} catch (PhidgetException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                   if (e.getState()) {
                	   
                	   
                       greenButtonPresses++; // Adds 1 to greenButtonPresses
                       System.out.println("Green Button Presses: " + greenButtonPresses); // Prints number of Green Button presses
                       checkWinner(redLED, greenLED); // Check if green player has won
                   }
               }
           }
       });
       while (true) {
           Thread.sleep(10); // Small delay to ensure the outputs and responses are fast
       }
   }
   // Method to check if there is a winner of the game
   public static void checkWinner(DigitalOutput redLED, DigitalOutput greenLED) {
       try {
           if (redButtonPresses >= 10) { // Check if Red player has reached 10 presses
               gameRunning = false; // Stop the game if they do
               System.out.println("Player 1 (Red) Wins! CONGRATS!"); // Print winner message for Red
               flashBothLEDs(redLED, greenLED); // Flash both LEDs once
               flashWinnerLED(redLED); // Flash the red LED 5 times for the winner
           }
           else if (greenButtonPresses >= 10) { // Check if green player has reached 10 presses
               gameRunning = false; // Stop the game if they do
               System.out.println("Player 2 (Green) Wins! CONGRATS!"); // Print winner message for Green
               flashBothLEDs(redLED, greenLED); // Flash both LEDs once
               flashWinnerLED(greenLED); // Flash the green LED 5 times for the winner
           }
       } catch (Exception ex) {
           System.out.println("Error: " + ex.getMessage()); // Print error message if any
       }
   }
   // Method to flash both LEDs once
   public static void flashBothLEDs(DigitalOutput redLED, DigitalOutput greenLED) throws Exception {
       redLED.setState(true); // Turn on red LED
       greenLED.setState(true); // Turn on green LED
       Thread.sleep(500); // Wait for half a second
       redLED.setState(false); // Turn off red LED
       greenLED.setState(false); // Turn off green LED
       Thread.sleep(500); // Wait for half a second
   }
   // Method to flash the winner's LED 5 times
   public static void flashWinnerLED(DigitalOutput winnerLED) throws Exception {
       for (int i = 0; i < 5; i++) { // Loop to flash LED 5 times
           winnerLED.setState(true); // Turn on winner's LED
           Thread.sleep(500); // Wait for half a second
           winnerLED.setState(false); // Turn off winner's LED
           Thread.sleep(500); // Wait for half a second
       }
   }
} // Close public class ButtonandLEDEvents
