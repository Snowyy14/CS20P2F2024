package Methods;
//Add Phidgets Library
import com.phidget22.*;
public class LEDBrightness {
  // Handle Exceptions
  public static void main(String[] args) throws Exception{
    // Create DigitalOutput object for the red LED
    DigitalOutput redLED = new DigitalOutput();
    // Address Red LED in port 1
    redLED.setHubPort(1); // Saying Red LED is in port 1
    redLED.setIsHubPortDevice(true);
    // Open connection to the Phidget device (times out after 1 second if no connection)
    redLED.open(1000);
    // For loop to gradually increase brightness
    for (double dutyCycle = 0.0; dutyCycle <= 1.0; dutyCycle += 0.05) { // Initialize dutyCycle as 0.0 and gradually increase by 0.05 until it is greater than 1.0
        redLED.setDutyCycle(dutyCycle);  // Increase the duty cycle (setting it to new value)
        Thread.sleep(100);
        
    }

    for (double dutyCycle = 1.0; dutyCycle >= 0.0; dutyCycle -= 0.05) { // Initialize dutyCycle as 1.0 and gradually decrease by 0.05 until it is 0.0
        redLED.setDutyCycle(dutyCycle);  // Decrease the duty cycle (setting it to new value)
        Thread.sleep(100);  // Wait for 100 milliseconds to allow for a gradual decrease
    }

    redLED.setDutyCycle(0.0);  // Set duty cycle to 0 (off)
    Thread.sleep(1000);  
  } 
} 

