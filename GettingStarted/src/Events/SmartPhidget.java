package Events;
//Add Phidgets Library
import com.phidget22.*;
public class SmartPhidget {
     public static void main(String[] args) throws Exception {
    
     //Create
     HumiditySensor humiditySensor = new HumiditySensor();
     TemperatureSensor temperatureSensor = new TemperatureSensor();
     //Humidity Event | Event code runs when data input from the sensor changes. The contained code will only run when the humidity input changes.
     humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
         public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
             System.out.println("Humidity: " + e.getHumidity() + "%RH");
         }
     });
    
     //Temperature Event | Event code runs when data input from the sensor changes. The contained code will only run when the temperature input changes.
     temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
         public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
             if (e.getTemperature() > 21) { // Only print temperature if it is above 21°C
                 System.out.println("Temperature: " + e.getTemperature() + "°C");
             } else { // If the temperature is 21°C or below it will print "Room is too cold"
                 System.out.println("Room is too cold");
             }
         }
     });
     //Open
     humiditySensor.open(1000);
     temperatureSensor.open(1000);
     //Keep program running
     while (true) {
         Thread.sleep(150);
     }
 }
}
