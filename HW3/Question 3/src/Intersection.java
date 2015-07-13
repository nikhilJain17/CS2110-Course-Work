// Contains roads and is critical for determining flow of traffic

public class Intersection {
	
	int intersectionID;
	RoadQueue[] roads;
	int totalNumCars;
	boolean emergency;
	boolean passThrough; // should the user travel through towards this intersection, or is it too busy?
	
	public Intersection(int setIntersectionID, RoadQueue[] setRoads) {
		
		intersectionID = setIntersectionID;
		roads = setRoads;
		
		
		
	}
	
}
