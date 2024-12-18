import com.phidgets.*;
import com.phidgets.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class Thermostat {

    private static final double INITIAL_SET_TEMP = 21.0; // Initial set temperature in Celsius
    private double setTemperature = INITIAL_SET_TEMP;
    private double currentTemperature = 20.0; // Initial simulated temperature
    private DigitalInput greenButton;
    private DigitalInput redButton;
    private DigitalOutput greenLED;
    private DigitalOutput redLED;
    private HumiditySensor humiditySensor;

    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.run();
    }

    public Thermostat() {
        try {
            // Initialize the devices (buttons, LEDs, humidity sensor)
            humiditySensor = new HumiditySensor();
            greenButton = new DigitalInput();
            redButton = new DigitalInput();
            greenLED = new DigitalOutput();
            redLED = new DigitalOutput();

            // Attach event listeners to buttons
            greenButton.addAttachListener(new AttachListener() {
                public void attached(AttachEvent e) {
                    try {
                        greenButton.setHubPort(0);
                    } catch (PhidgetException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            redButton.addAttachListener(new AttachListener() {
                public void attached(AttachEvent e) {
                    try {
                        redButton.setHubPort(1);
                    } catch (PhidgetException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            // Attach event listeners for the button presses
            greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
                public void stateChanged(DigitalInputStateChangeEvent e) {
                    if (e.getState()) {
                        increaseSetTemperature();
                    }
                }
            });

            redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
                public void stateChanged(DigitalInputStateChangeEvent e) {
                    if (e.getState()) {
                        decreaseSetTemperature();
                    }
                }
            });

            // Attach event listener for the humidity sensor
            humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
                public void humidityChanged(HumiditySensorHumidityChangeEvent e) {
                    currentTemperature = e.getTemperature();
                }
            });

        } catch (PhidgetException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            // Open the Phidgets devices
            humiditySensor.openAny();
            greenButton.openAny();
            redButton.openAny();
            greenLED.openAny();
            redLED.openAny();

            // Start the timer to print status every 10 seconds
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    printStatus();
                }
            }, 0, 10000);

        } catch (PhidgetException e) {
            e.printStackTrace();
        }
    }

    // Increase the set temperature by 1˚C
    private void increaseSetTemperature() {
        setTemperature++;
        System.out.println("Set temperature increased to " + setTemperature + "˚C");
    }

    // Decrease the set temperature by 1˚C
    private void decreaseSetTemperature() {
        setTemperature--;
        System.out.println("Set temperature decreased to " + setTemperature + "˚C");
    }

    // Print current temperature, set temperature, and control LEDs based on temperature
    private void printStatus() {
        System.out.println("Current temperature: " + currentTemperature + "˚C");
        System.out.println("Set temperature: " + setTemperature + "˚C");

        // Control the LEDs based on temperature difference
        if (Math.abs(currentTemperature - setTemperature) <= 2) {
            greenLED.setState(true);
            redLED.setState(false);
            System.out.println("Green LED ON");
        } else {
            redLED.setState(true);
            greenLED.setState(false);
            System.out.println("Red LED ON");
        }
    }
}
