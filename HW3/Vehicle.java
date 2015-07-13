// Ambulance, car, etc
public class Vehicle {

	private String name;
	private boolean emergencyMode; // for ambulances
	
	public Vehicle(String setName, boolean setEmergencyMode) {
		name = setName;
		emergencyMode = setEmergencyMode;
	}
	
	// Getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public boolean getEmergency() {
		return emergencyMode;
	}
	
	public boolean setEmergency(boolean b) {
		emergencyMode = b;
	}
	
	
	
}
