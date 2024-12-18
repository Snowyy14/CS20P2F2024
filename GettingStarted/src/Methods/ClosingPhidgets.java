package Methods;
//Add Phidgets Library
import com.phidget22.*;
public class ClosingPhidgets {
  public static void main(String[] args) throws Exception{
    // Create
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    // Open
    temperatureSensor.open(1000);
    // Use your Phidgets
    System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
    // Close your Phidget
    temperatureSensor.close();
    // Reopen the Phidget
    temperatureSensor.open(1000);
    // Get and print temperature again
    System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
    // Close your Phidget again
    temperatureSensor.close();
  } // Close main method
} // Close public class CLosingPhidgets

