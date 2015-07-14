// Holds information about 
public class Road {
	
	// 2 way road?
	boolean bothWays;
	Vehicle[] vehiclesWaiting;
	
	public Road(Vehicle[] setVehiclesWaiting, boolean setBothWays) {
		
		vehiclesWaiting = setVehiclesWaiting;
		bothWays = setBothWays;
		
	}
	
	public void displayCarsOnRoad() {
		
		System.out.println("\nCars Waiting: ");
		System.out.println("==============");
		
		for (Vehicle v: vehiclesWaiting) {
			System.out.println("\n-------------");
			System.out.println(v.getVehicleName().toUpperCase());
			System.out.println("-------------");
			System.out.println("Seats: " + v.getSeats());
			System.out.println("Emergency: " + v.isEmergencyMode());
			
			System.out.println("\nPassengers: ");
			
			// display passengers
			for (String s : v.getPassengers()) {
				System.out.println(s);
			}
			
			System.out.println("--------------");
			
		}
		
	}
	
}
