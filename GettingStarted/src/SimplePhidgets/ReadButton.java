package SimplePhidgets;
// Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;
public class ReadButton {
   // Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
   public static void main(String[] args) throws Exception {
      
       // Create | Here you've created a DigitalInput object for your button. An object represents how you interact with your device. DigitalInput is a class from the Phidgets library that's used to read the state of your button.
       DigitalInput greenButton = new DigitalInput();
       // Address | This tells your program where to find the device you want to work with. Your button is connected to port 5 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
       greenButton.setHubPort(5);
       greenButton.setIsHubPortDevice(true);
       // Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
       greenButton.open(1000);
       // Use your Phidgets | Here is where you use your Phidgets! This code checks the state of the button and prints true/false when the button is pressed/released. The sleep function means the button state is only checked every 1 second. Sleeping is used to make it easier to read the console output and to put less stress on your CPU.
       boolean previousState = false; // Assume button is initially not pressed in previous state
       while(true) { // While loop to check the button state
          
           boolean currentState = greenButton.getState(); // Get the current state of the green button
           // Check if the state has changed
           if (currentState != previousState) { // Compare
              
               System.out.println("Green Button State: " + currentState); // Print the new state when it changes
              
               previousState = currentState; // Update the previous state to the current state
           } // Close if statement
           // Sleep for 1 second before checking the state again
           Thread.sleep(1000);
       } // Close while loop
   } // Close main method
} // Close public class ReadButton
