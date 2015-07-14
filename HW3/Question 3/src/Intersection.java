// Contains roads and is critical for determining flow of traffic

public class Intersection {

	Road[] roads;
	boolean emergency;
	
	public Intersection(Road[] setRoads, boolean setEmergency) {
		roads = setRoads;
		emergency = setEmergency;
	}
	
	public boolean busyIntersection() {
		
		// Define a "busy" intersection as:
		// 1. Have at least one 2-way road
		// 2. Have more than 5 cars at the intersection
		
		// or,
		// 1. Have more than 7 cars at the road
		
		
		// First case
		if (emergency) {
			
			int numOfCars = 0;
			// iterate through roads
			for (Road r : roads) {
				
				for (Vehicle v : r.vehiclesWaiting) 
					numOfCars++;
				
			}
			
			if (numOfCars > 5) {
				System.out.println("\nThis intersection is too busy. Don't travel through it.");
				System.out.println("There is also an emergency vehicle passing through.");
				return true;
			}
			
		}
		
		// Second case
		else {
			
			int numOfCars = 0;
			
			for (Road r : roads) {
				
				for (Vehicle v : r.vehiclesWaiting)
					numOfCars++;
			}
		
			if (numOfCars > 7) {
				System.out.println("\nThis intersection is too busy. Don't travel through it.");
				System.out.println("There is no emergency vehicle passing through.");
				return true;
			}
			
		}
		
		// Not bus.
		System.out.println("\nThis intersection is not busy, and there are no emergency vehicles in it.");
		System.out.println("You may plan to pass through.");
		return false;
		
		
	}
	
	
	
}
