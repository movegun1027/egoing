import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHomeInput {

	public static void main(String[] args) {
		
		String address = JOptionPane.showInputDialog("Enter a ADDRESS");
		String bright = JOptionPane.showInputDialog("Enter a Bright Level");
		
		// Elevator call		
		Elevator myElevator = new Elevator(address);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(address);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(address + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(address + " / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(address + " / moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
