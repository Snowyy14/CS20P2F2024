package Events;
// Add Phidgets Library
import com.phidget22.*;
public class Button {
   // Handle Exceptions
   public static void main(String[] args) throws Exception {
      
       // Create red button
       DigitalInput redButton = new DigitalInput();
       // Create green button
       DigitalInput greenButton = new DigitalInput();
       // Address red button (port 0)
       redButton.setIsHubPortDevice(true);
       redButton.setHubPort(0);
       // Address green button (port 5)
       greenButton.setIsHubPortDevice(true);
       greenButton.setHubPort(5);
       // Event for the Red Button
       redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               if (e.getState()) {
                   System.out.println("Red Button Pressed"); // If the Red Button is pressed
               } else {
                   System.out.println("Red Button NOT Pressed"); // If the Red Button is NOT pressed
               }
           }
       });
       // Event for the Green Button
       greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               if (e.getState()) {
                   System.out.println("Green Button Pressed"); // If the Green Button is pressed
               } else {
                   System.out.println("Green Button Not Pressed"); // If the Green Button is NOT pressed
               }
           }
       });
       // Open red and green buttons
       redButton.open(1000);
       greenButton.open(1000);
       while (true) {
           Thread.sleep(500); // Doesn't effect the print time in this code
       } // Close while loop
   } // Close main method
} // Close public class Button
