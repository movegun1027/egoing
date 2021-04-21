import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHome {

	public static void main(String[] args) {
		
		String address = "Java APT 1403";
		
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
		
	}

}
