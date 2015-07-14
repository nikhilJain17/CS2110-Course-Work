// Launch-point of program
public class Main {
	
	public static void main(String[] args) {
		
		Vehicle[] vehicles = generateVehicles();
		
		Road FirstStreet = new Road(vehicles, true);
//		FirstStreet.displayCarsOnRoad();
		
		vehicles = generateVehicles();
		
		Road SecondStreet = new Road(vehicles, false);
		
		Road[] firstArray = new Road[2];
		firstArray[0] = FirstStreet;
		firstArray[1] = SecondStreet;
		
		boolean tempEmergency = true;
		// No emergency?
		if (!FirstStreet.emergency || !SecondStreet.emergency)
			tempEmergency = false;
		
		Intersection intersection1 = new Intersection(firstArray, tempEmergency);
		
		intersection1.busyIntersection();
		
		
//		Vehicle[] vehicles = generateVehicles();
//		
//		RoadQueue FirstStreet = new RoadQueue();
//		
//		// add vehicles to queue
//		for (Vehicle v : vehicles) {
//			FirstStreet.joinRoadQueue(v);
//		}
//		
//		vehicles = generateVehicles();
//		RoadQueue SecondStreet = new RoadQueue();
//		
//		// add vehicles to queue
//		for (Vehicle v : vehicles) {
//			SecondStreet.joinRoadQueue(v);
//		}
//		
//		RoadQueue[] qs = new RoadQueue[2];
//		qs[0] = FirstStreet;
//		qs[1] = SecondStreet;
//		
//		Intersection intersection = new Intersection(0, qs);
//		intersection.showCarsAtIntersection();
		
	}
	
	public void init(){;}
	
	
	// Generates random Vehicle objects for the roads to have
	public static Vehicle[] generateVehicles() {
		
		Vehicle[] vehicles = null;
		
		
		// randomly generate a choice for which vehicles will be created, etc
		double choice = Math.round((Math.random() * 5)); // generates 6 choices, from 0 to 5
		
		switch ((int) choice) {
		
			case 0:
				vehicles = new Vehicle[2];
				
				String[] fordNames = new String[2];
				fordNames[0] = "Harry";
				fordNames[1] = "Sally";
				
				String[] kawasakiName = new String[1];
				kawasakiName[0] = "Jessie";
				
				vehicles[0] = new Vehicle("Ford Mustang", false, 2, fordNames);
				vehicles[1] = new Vehicle("Kawasaki Motorcycle", false, 1, kawasakiName);
				break;
				
				
				
			case 1:
				vehicles = new Vehicle[5];
				
				String[] toyotaMinivanNames = new String[4];
				toyotaMinivanNames[0] = "Hubert";
				toyotaMinivanNames[1] = "Deandre";
				toyotaMinivanNames[2] = "Joany";
				toyotaMinivanNames[3] = "Sam";
				
				String[] dumpTruckNames = new String[2];
				dumpTruckNames[1] = "Margaret";
				dumpTruckNames[0] = "David";
				
				String[] bicycleName = new String[1];
				bicycleName[0] = "Lance Legstrong";
				
				String[] sportsCar = new String[2];
				sportsCar[0] = "Sarah";
				sportsCar[1] = "Isaiah";
				
				String[] chevyTruckNames = new String[3];
				chevyTruckNames[0] = "Fontenot";
				chevyTruckNames[1] = "Lebron";
				chevyTruckNames[2] = "Dave";
				
				vehicles[0] = new Vehicle("Toyota Minivan", false, 6, toyotaMinivanNames);
				vehicles[1] = new Vehicle("Dump Truck", false, 2, dumpTruckNames);
				vehicles[2] = new Vehicle("Bicycle", false, 1, bicycleName);
				vehicles[3] = new Vehicle("Ferrari Convertible", false, 2, sportsCar);
				vehicles[4] = new Vehicle("Police Truck", true, 4, chevyTruckNames);
				
				break;
				
				
			case 2:
				vehicles = new Vehicle[6];
				
				String[] minivanNames = new String[3];
				minivanNames[0] = "Yennefer";
				minivanNames[1] = "Greg";
				minivanNames[2] = "Paul";
				
				String[] sedanNames = new String[2];
				sedanNames[0] = "Harold";
				sedanNames[1] = "Kumar";
				
				String[] sedan2Names = new String[3];
				sedan2Names[0] = "Jose";
				sedan2Names[1] = "Lamarcus";
				sedan2Names[2] = "Tyson";
				
				String[] newSportsCar = new String[1];
				newSportsCar[0] = "Darren";
				
				// OKC 
				String[] sportsTeamBus = new String[5];
				sportsTeamBus[0] = "Russell"; // westbrook
				sportsTeamBus[1] = "Andre"; // roberson
				sportsTeamBus[2] = "Kevin"; // durant
				sportsTeamBus[3] = "Serge"; // ibaka
				sportsTeamBus[4] = "Steven"; // adams, not enes!
				
				String[] truckNames = new String[1];
				truckNames[0] = "Johann";
				
				String[] moreCarNames = new String[2];
				moreCarNames[0] = "Stephen";
				moreCarNames[1] = "Miriam";
				
				vehicles[0] = new Vehicle("Honda Minivan", false, 6, minivanNames);
				vehicles[1] = new Vehicle("Subaru Sedan", false, 4, sedanNames);
				vehicles[2] = new Vehicle("Mercedes Sedan", false, 4, sedan2Names);
				vehicles[3] = new Vehicle("Sports Team Bus", false, 10, sportsTeamBus);
				vehicles[4] = new Vehicle("Pickup Truck", false, 2, truckNames);
				vehicles[5] = new Vehicle("Police Chief", true, 5, moreCarNames);
				
				break;
				
			case 3:
				vehicles = new Vehicle[2];
				
				String[] coupeNames = new String[2];
				coupeNames[0] = "Ophelia";
				coupeNames[1] = "Peter";
				
				String[] sedan = new String[3];
				sedan[0] = "Frederick";
				sedan[1] = "Junior";
				sedan[2] = "Andre";
				
				vehicles[0] = new Vehicle("BMW Coupe", false, 2, coupeNames);
				vehicles[1] = new Vehicle("Cadillac Sedan", false, 5, sedan);
				
				break;
				
			case 4:
				vehicles = new Vehicle[3];
				
				String[] ambulanceNames = new String[3];
				ambulanceNames[0] = "Whitney";
				ambulanceNames[1] = "Melissa";
				ambulanceNames[2] = "Oscar";
				
				String[] firetruckNames = new String[3];
				firetruckNames[0] = "Gemma";
				firetruckNames[1] = "Ignacio";
				firetruckNames[2] = "Felix";
				
				String[] bicycle = new String[1];
				bicycle[0] = "Kyle";
				
				vehicles[0] = new Vehicle("Ambulance", true, 4, ambulanceNames);
				vehicles[1] = new Vehicle("Firetruck", true, 5, firetruckNames);
				vehicles[2] = new Vehicle("Bicycle", false, 1, bicycle);
				
				break;
				
			case 5:
				vehicles = new Vehicle[1];
				
				String[] truckkNames = new String[3];
				truckkNames[1] = "Vladimir";
				truckkNames[0] = "Ben";
				truckkNames[2] = "Boris";
				
				vehicles[0] = new Vehicle("Heavy Duty Truck", false, 4, truckkNames);
				
				break;
		
		}
		
		
		return vehicles;
	}
	

}
