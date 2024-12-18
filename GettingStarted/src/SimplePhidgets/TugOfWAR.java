package SimplePhidgets;
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;
public class TugOfWAR {
   // Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
   public static void main(String[] args) throws Exception {
     // Create | Create objects for your buttons and LEDs.
     DigitalInput redButton = new DigitalInput();
     DigitalOutput redLED = new DigitalOutput();
     DigitalInput greenButton = new DigitalInput();
     DigitalOutput greenLED = new DigitalOutput();
     // Address | Address your four objects which lets your program know where to find them.
     redButton.setHubPort(0);
     redButton.setIsHubPortDevice(true);
     redLED.setHubPort(1);
     redLED.setIsHubPortDevice(true);
     greenButton.setHubPort(5);
     greenButton.setIsHubPortDevice(true);
     greenLED.setHubPort(4);
     greenLED.setIsHubPortDevice(true);
     // Open | Connect your program to your physical devices.
     redButton.open(1000);
     redLED.open(1000);
     greenButton.open(1000);
     greenLED.open(1000);
     // Variables to track the number of button presses for each player
     int redButtonPressCount = 0; // Tracks the red button presses (Ex. player 1)
     int greenButtonPressCount = 0; // Tracks the green button presses (Ex. player 2)
     // Track the previous states of the buttons
     boolean previousRedButtonState = redButton.getState(); // = to red button state
     boolean previousGreenButtonState = greenButton.getState(); // = to green button state
     while (redButtonPressCount < 10 && greenButtonPressCount < 10) { // Loop for game (players need to press their button 10 times to win)
         if (redButton.getState() && !previousRedButtonState) { // Check for state change (red button)
             redButtonPressCount++; // Increment counter for the red button presses
             System.out.println("Red Button Pressed. Total presses: " + redButtonPressCount); // Print the current number button presses for red
         }
         if (greenButton.getState() && !previousGreenButtonState) { // Check for state change (green button)
             greenButtonPressCount++; // Increment counter for the green button presses
             System.out.println("Green Button Pressed. Total presses: " + greenButtonPressCount); // Print the current number button presses for green
         }
         // Update previous button states (variables declared before while loop)
         previousRedButtonState = redButton.getState();
         previousGreenButtonState = greenButton.getState();
         if (redButton.getState()) { // Red LED lights up if Red Button is pressed
             redLED.setState(true);
         } else {
             redLED.setState(false);
         }
         if (greenButton.getState()) { // Green LED lights up if Green Button is pressed
             greenLED.setState(true);
         } else {
             greenLED.setState(false);
         }
         Thread.sleep(10);  // Sleep for 10ms so it checks the state rapidly (because this is a speed related game)
     } // Close while loop
     // Flash both LEDs once to indicate the end of the game (green and red are flashing together)
     redLED.setState(true);
     greenLED.setState(true);
     Thread.sleep(500); // Flash for half a second before moving onto the winners LEDs
     redLED.setState(false);
     greenLED.setState(false);
     Thread.sleep(500); // Pause for half a second before flashing winner's LED
     // Declare the winner and flash the winner's LED 5 times
     if (redButtonPressCount == 10) { // For if red wins
         System.out.println("Player 1 (Red) wins! nice"); 
         for (int i = 0; i < 5; i++) { // Flash red LED 5 times
             redLED.setState(true);
             Thread.sleep(500); // Flash for half a second
             redLED.setState(false);
             Thread.sleep(500); // Pause for half a second
         }
     } else if (greenButtonPressCount == 10) { // For if green wins
         System.out.println("Player 2 (Green) wins! CONGRATS!"); // Prints that they won
         for (int i = 0; i < 5; i++) { // Flash green LED 5 times
             greenLED.setState(true);
             Thread.sleep(500); // Flash for half a second
             greenLED.setState(false);
             Thread.sleep(500); // Pause for half a second
         }
     }
 } 
} 