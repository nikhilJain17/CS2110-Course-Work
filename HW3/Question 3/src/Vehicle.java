// Constructs vehicles

public class Vehicle {
	
	String vehicleName;
	boolean emergencyMode; // for ambulances, police cars, etc
	int seats;
	String[] passengers;
	
	public Vehicle(String setVehicleName, boolean setEmergencyMode, int setSeats, String[] setPassengers) {
		
		vehicleName = setVehicleName;
		emergencyMode = setEmergencyMode;
		seats = setSeats;
		passengers = setPassengers;
		
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public boolean isEmergencyMode() {
		return emergencyMode;
	}

	public void setEmergencyMode(boolean emergencyMode) {
		this.emergencyMode = emergencyMode;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String[] getPassengers() {
		return passengers;
	}

	public void setPassengers(String[] passengers) {
		this.passengers = passengers;
	}
	
	
	
	
	
}
