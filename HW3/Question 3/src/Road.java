// Holds information about 
public class Road {
	
	// 2 way road?
	boolean bothWays;
	Vehicle[] vehiclesWaiting;
	boolean emergency;
	
	public Road(Vehicle[] setVehiclesWaiting, boolean setBothWays) {
		
		vehiclesWaiting = setVehiclesWaiting;
		bothWays = setBothWays;
		
		// determines if there is an emergency
		emergency = false;
		for (Vehicle v : vehiclesWaiting) {
			
			if (v.isEmergencyMode())
				emergency = true;
			
		}
		
	}
	
	public void displayCarsOnRoad() {
		
		if (bothWays)
			System.out.println("\n2 WAY ROAD");
		
		else
			System.out.println("\n1 WAY ROAD");
		
		if (emergency)
			System.out.println("\nEmergency Vehicle passing through!");
		
		else
			System.out.println("\nNo emergency vehicles passing through.");
		
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
