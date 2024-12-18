package SimplePhidgets;
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;
public class UseButtonsAndLEDS {
   //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
   public static void main(String[] args) throws Exception{
     //Create | Create objects for your buttons and LEDs.
     DigitalInput redButton = new DigitalInput(); // Red Button
     DigitalOutput redLED = new DigitalOutput(); // Red LED
     DigitalInput greenButton = new DigitalInput(); // Green Button
     DigitalOutput greenLED = new DigitalOutput(); // Green LED

     redButton.setHubPort(0); 
     redButton.setIsHubPortDevice(true);
     redLED.setHubPort(1); // Red LED port 1
     redLED.setIsHubPortDevice(true);
     greenButton.setHubPort(5); // Green Button port 5
     greenButton.setIsHubPortDevice(true);
     greenLED.setHubPort(4); // Green LED port 4
     greenLED.setIsHubPortDevice(true);

     redButton.open(1000);
     redLED.open(1000);
     greenButton.open(1000);
     greenLED.open(1000);
     int totalButtonPressCount = 0; // Variable to track the total number of button presses
     // Track the previous states of the buttons
     boolean previousRedButtonState = redButton.getState();
     boolean previousGreenButtonState = greenButton.getState();
     //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
     while(true){
         if(redButton.getState() && !previousRedButtonState) { 
             totalButtonPressCount++;  
             System.out.println("Total Button Presses: " + totalButtonPressCount); // Print current button presses
         }
        
         if(greenButton.getState() && !previousGreenButtonState) { // Check for state change (green button)
             totalButtonPressCount++;  // Increment counter on button press
             System.out.println("Total Button Presses: " + totalButtonPressCount); // Print current button presses
         }
         // Update previous button states
         previousRedButtonState = redButton.getState();
         previousGreenButtonState = greenButton.getState();
         // LED behavior based on button states
         if(redButton.getState()){ // Red Button is pressed Red LED lights up
             redLED.setState(true);
         } else {
             redLED.setState(false);
         }
         if(greenButton.getState()){ // Green Button is pressed Green LED lights up
             greenLED.setState(true);
         } else {
             greenLED.setState(false);
         }
         Thread.sleep(100);  // Sleep for 100ms so it doesn't check the state to often
     } // Close while loop
 } // Close main method
} // Close public class UseButtonsAndLEDs



