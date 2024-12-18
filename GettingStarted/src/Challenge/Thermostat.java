package Challenge;
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;
public class Thermostat {
   public static void main(String[] args) throws Exception {
    // Create | Create objects for sensors, buttons, and LEDs
    HumiditySensor humiditySensor = new HumiditySensor();
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    DigitalInput redButton = new DigitalInput();
    
    
    
    DigitalInput greenButton = new DigitalInput();
    DigitalOutput redLED = new DigitalOutput();
    
    DigitalOutput greenLED = new DigitalOutput();
    double setTemperature = 21.0;  // Set the initial set temperature (starts at 21°C (70°F))
    // Open | Open sensors, buttons, and LEDs
    humiditySensor.open(1000);
    temperatureSensor.open(1000);
    redButton.setHubPort(0);
    redButton.setIsHubPortDevice(true);
    redButton.open(1000);
    greenButton.setHubPort(5);
    greenButton.setIsHubPortDevice(true);
    greenButton.open(1000);
    redLED.setHubPort(1);
    redLED.setIsHubPortDevice(true);
    redLED.open(1000);
    greenLED.setHubPort(4);
    greenLED.setIsHubPortDevice(true);
    greenLED.open(1000);
   
    while (true) {
        // Get the current temperature from the temperature sensor (will be in Celsius)
        double currentTemperature = temperatureSensor.getTemperature();

        if (greenButton.getState()) {
            setTemperature += 1; // Increases the set temperature by 1°C
        }
       
        
        
        if (redButton.getState()) {
            setTemperature -= 1; 
        }
        // Print the current temperature and set temperature every 10 seconds for user to see
        System.out.println("Current Temperature: " + currentTemperature + " °C, Set Temperature: " + setTemperature + " °C");
        // Checking if the current temperature is within 2°C of the set temperature
        if (Math.abs(currentTemperature - setTemperature) <= 2) { // I use Math.abs for absolute value (result could be negative)
            greenLED.setState(true);  // Turn on the green LED
            
            
            redLED.setState(false);   // Turn off the red LED
        } else { // For if it's no in the 2°C range
            redLED.setState(true);    // Turn on the red LED
            greenLED.setState(false); // Turn off the green LED
            
        }
        Thread.sleep(1000); // Wait for 10 seconds before checking again
     } // Close while loop
  } // Close main method
} // Close public class Thermostat
