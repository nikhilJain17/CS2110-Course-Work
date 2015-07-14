import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

// Launch-point of program
public class Main {
	
	static Intersection[] roadNetwork;
	static Road[] masterRoadArray ; // holds master 
	
	public static void main(String[] args) throws Exception {
		
		// init size of array
		 roadNetwork = new Intersection[9];
		
		 // initialize the roadNetwork
		 init();
		 
		 int choice = 0;
		 do {
			 
			 choice = menu();
			 
			 if (choice == 1) {
				 // display info on road
				 int whichRoad = -1;
				 
				 // Input validation for street 
				 do {
					 
					 System.out.println("\nEnter 0 for First Ave.");
					 System.out.println("\nEnter 1 for Second Ave.");
					 System.out.println("\nEnter 2 for Third Ave.");
					 System.out.println("\nEnter 3 for First Street.");
					 System.out.println("\nEnter 4 for Second Street.");
					 System.out.println("\nEnter 5 for Third Street.");
					 
					 InputStreamReader pipe = new InputStreamReader(System.in);
					 BufferedReader reader = new BufferedReader(pipe);
					 
					 whichRoad = Integer.parseInt(reader.readLine());
					 
				 }
				 while(whichRoad < 0 || whichRoad > 5);
				 
				 masterRoadArray[whichRoad].displayCarsOnRoad();
				 
			}
			 
			
			 else if (choice == 2) {
				 
				 int whichIntersection = 0;
				 
				 // input validation 
				 do {
					 System.out.println("\nEnter the intersection number of the intersection (0->8)");
					 InputStreamReader pipe = new InputStreamReader(System.in);
					 BufferedReader reader = new BufferedReader(pipe);
					 
					 whichIntersection = Integer.parseInt(reader.readLine());
				 }
				 while (whichIntersection < 0 || whichIntersection > 8);
				 
				 roadNetwork[whichIntersection].busyIntersection();
				 
			 }
			 
			 
		 }
		 while (choice < 2 || choice > 1);
		 
		 
	}
	
	public static int menu() throws Exception {
		
		System.out.println("\n|----------------------------------|");
		System.out.println("|              CHOICES             |");
		System.out.println("|----------------------------------|");
		System.out.println("| 1. Display vehicles on road      |");
		System.out.println("| 2. Check if intersection is busy |");
		System.out.println("|   Press anything else to quit    |");
		System.out.println("|----------------------------------|");
		
		InputStreamReader pipe = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(pipe);
		
		return Integer.parseInt(reader.readLine());
		
	}
	
	
	// Initialize the roadNetwork
	public static void init(){
		
		
		System.out.println("\nWelcome to the Traffic Program by Nikhil Jain!");
		
		// sleep
		try {
		    Thread.sleep(2000);                 //1000 milliseconds is one second.
		} 
		catch (InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("\nThis is what the road network looks like: ");
		
		try {
		    Thread.sleep(2000);                 //1000 milliseconds is one second.
		} 
		catch (InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("_____________________________________________________"
				      + "\n|                     First Ave.                      |"
				      + "\n|  [0]                   [1]                      [2] |"
				      + "\n|     ________________        __________________      |"
				      + "\n|    |                |      |                  |     |"
				      + "\n|    |                |      |                  |     |"
				      + "\n|    |                |      |                  |     |"
				      + "\n| F  |                |  S   |                  |  T  |"
				      + "\n| i  |                |  e   |                  |  h  |"
				      + "\n| r  |                |  c   |                  |  i  |"
				      + "\n| s  |                |  o   |                  |  r  |"
				      + "\n| t  |                |  n   |                  |  d  |"
				      + "\n|    |                |  d   |                  |     |"
				      + "\n| S  |                |      |                  |  S  |"
				      + "\n| t  |                |  S   |                  |  t  |"
				      + "\n|    |                |  t   |                  |     |"
				      + "\n|    |                |      |                  |     |"
				      + "\n|    |                |      |                  |     |"
				      + "\n|     ________________       ___________________      |"
				      + "\n|                                                     |"
				      + "\n|                    Second Ave.                      |"
				      + "\n|  [3]                   [4]                     [5]  |"
				      + "\n|     ________________        __________________      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|    |               |        |                |      |"
				      + "\n|     ________________         _________________      |"
				      + "\n|                                                     |"
				      + "\n|                    Third Ave.                       |"
				      + "\n|  [6]                   [7]                     [8]  |"
				      + "\n|_____________________________________________________|");
		
		System.out.println("\nThe [n] represents an intersection number. You can access the intersection using its number.");
		
		// Generate random data for each intersection
		
		// Holds information about all roads
		masterRoadArray = new Road[6]; 
		
		/* 
		 *
		 * 0,1,2 are aves, 3,4,5 are streets 
		 * 
		 */
		
		for (int i = 0; i < masterRoadArray.length; i++) {
			// make Third Street and 1st Ave a 1 way road
			if (i == 2 || i == 4)
				masterRoadArray[i] = new Road(generateVehicles(), false);
			
			else
				masterRoadArray[i] = new Road(generateVehicles(), true);
			
		}
		
		// Both variables are for constructing the intersection
		Road[] subRoads; // takes values from master array depending on which intersection
		boolean emergency = true; // 
		
		
		
		// initialize intersection 0
		subRoads = new Road[2];
		subRoads[0] = masterRoadArray[0];
		subRoads[1] = masterRoadArray[3];
		
			// check for emergency
		if (!subRoads[0].emergency && !subRoads[1].emergency)
			emergency = false;
		
		roadNetwork[0] = new Intersection(subRoads, emergency);
		
		
		
		// initialize intersection 1
		subRoads = new Road[2];
		subRoads[0] = masterRoadArray[0];
		subRoads[1] = masterRoadArray[4];
		
			// check for emergency
		if (!subRoads[0].emergency && !subRoads[1].emergency)
			emergency = false;
		
		roadNetwork[1] = new Intersection(subRoads, emergency);
		
		
		
		// initialize intersection 2
		subRoads = new Road[2];
		subRoads[0] = masterRoadArray[0];
		subRoads[1] = masterRoadArray[5];
		
			// check for emergency
		if (!subRoads[0].emergency && !subRoads[1].emergency)
			emergency = false;
		
		roadNetwork[2] = new Intersection(subRoads, emergency);
		
		
		
		// initialize intersection 3
		subRoads = new Road[2];
		subRoads[0] = masterRoadArray[1];
		subRoads[1] = masterRoadArray[3];
		
			// check for emergency
		if (!subRoads[0].emergency && !subRoads[1].emergency)
			emergency = false;
		
		roadNetwork[3] = new Intersection(subRoads, emergency);
		
		
		
		// initialize intersection 4
		subRoads[0] = masterRoadArray[1];
		subRoads[1] = masterRoadArray[4];
		
			// check for emergency
		if (!subRoads[0].emergency && !subRoads[1].emergency)
			emergency = false;
		
		roadNetwork[4] = new Intersection(subRoads, emergency);
		
		
		
		// initialize intersection 5
		subRoads[0] = masterRoadArray[1];
		subRoads[1] = masterRoadArray[5];
		

			// check for emergency
		if (!subRoads[0].emergency && !subRoads[1].emergency)
			emergency = false;
		
		roadNetwork[5] = new Intersection(subRoads, emergency);
		
		
		
		// initialize intersection 6
		subRoads[0] = masterRoadArray[2];
		subRoads[1] = masterRoadArray[3];
		
			// check for emergency
		if (!subRoads[0].emergency && !subRoads[1].emergency)
			emergency = false;
		
		roadNetwork[6] = new Intersection(subRoads, emergency);
		
		
		
		// initialize intersection 7
		subRoads[0] = masterRoadArray[2];
		subRoads[1] = masterRoadArray[4];
		
			// check for emergency
		if (!subRoads[0].emergency && !subRoads[1].emergency)
			emergency = false;
		
		roadNetwork[7] = new Intersection(subRoads, emergency);
		
		
		
		// initialize intersection 8
		subRoads[0] = masterRoadArray[2];
		subRoads[1] = masterRoadArray[5];
		
			// check for emergency
		if (!subRoads[0].emergency && !subRoads[1].emergency)
			emergency = false;
		
		roadNetwork[8] = new Intersection(subRoads, emergency);
		
		
		// Done initializing 
		System.out.println("\nRandom data generated for each intersection.");
		
		
		
		
	}
	
	
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
