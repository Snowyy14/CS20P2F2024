package SmartPhidgets;
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;
public class HotOrCold {
  public static void main(String[] args) throws Exception {
    // Create | Create objects for the temperature sensor and the LEDs.
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    DigitalOutput greenLED = new DigitalOutput();
    DigitalOutput redLED = new DigitalOutput();
    // Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
    temperatureSensor.open(1000);
    greenLED.setHubPort(4);
    greenLED.setIsHubPortDevice(true);
    greenLED.open(1000);
   
    redLED.setHubPort(1);
    redLED.setIsHubPortDevice(true);
    redLED.open(1000);
    // Use your Phidgets | This code will turn on the green LED if the temperature is between 20°C and 24°C and the red LED if it's outside that range.
    while (true) {
        double temperature = temperatureSensor.getTemperature();  // Get temperature in Celsius
        System.out.println("Temperature: " + temperature + " °C"); // Print the exact temperature
        if (temperature >= 20 && temperature <= 24) { // Check if the temperature is between 20°C and 24°C
            // If in range (20°C-24°C) turn on the green LED and turn off the red LED (initialized as both open)
            greenLED.setState(true);
            redLED.setState(false);
        } else {
            // If outside range (20°C-24°C) turn on the red LED and turn off the green LED
            redLED.setState(true);
            greenLED.setState(false);
        }
        Thread.sleep(150);  // Sleep for 150ms to prevent to much output
     } // Close while loop
  } // Close main method
} // Close public class ReadTemperatureandHumidity
