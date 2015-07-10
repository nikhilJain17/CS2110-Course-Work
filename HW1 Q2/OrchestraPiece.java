import java.io.*;
import java.util.ArrayList;


public class OrchestraPiece {

	private String composer;
	private String title;
	private ArrayList<InstrumentPart> instrumentPartArray;
	
	public OrchestraPiece(String setComposer, String setTitle, ArrayList<InstrumentPart> setInstrumentPartArray) {
		
		composer = setComposer;
		title = setTitle;
		instrumentPartArray = setInstrumentPartArray;
		
	}
	
	
	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<InstrumentPart> getInstrumentPartArray() {
		return instrumentPartArray;
	}

	public void setInstrumentPartArray(ArrayList<InstrumentPart> instrumentPartArray) {
		this.instrumentPartArray = instrumentPartArray;
	}
	
	public void addInstrumentPart (InstrumentPart part) {
		instrumentPartArray.add(part);
	}
	
	











	public static void main(String[] args) throws Exception {


		// The reason I am using ArrayLists is because I don't know how many pieces the user will store
		// Therefore, I cannot give an array a size.
		ArrayList<OrchestraPiece> orchestraPieceArray = new ArrayList<OrchestraPiece>();
		
		// When the program first starts, the user MUST create a new piece.
		// After that, they can edit, display, create, and search the OrchestraPieces.
		System.out.println("Welcome to the Orchestra Piece Program!\n");
		orchestraPieceArray.add(createNewOrchestraPiece());
		
		// The program never ends... huehuehue
		while(true) {
			
			// Display the choices and get their response
			int choice = menu();
			
			switch (choice) {
			
				case 0: 
					// TODO call the edit function here
					edit(orchestraPieceArray);
					break;
					
				case 1:
					// TODO call the search function here
					search(orchestraPieceArray);
					break;
					
				case 2:
					orchestraPieceArray.add(createNewOrchestraPiece());
					break;
					
				case 3: 
					// TODO call the display function here
					display(orchestraPieceArray);
					break;
				
				default:
					// User did not input a 0,1,2 or 3
					System.out.println("\nINVALID CHOICE, TRY AGAIN\n");
					menu();
					break;
			
			} // end of switch
			
					
		}// end of while loop
		
	} // end of main
	
	// used for editing the OrchestraPieces
	public static void edit(ArrayList<OrchestraPiece> orchestraPieceArray) throws Exception {
		
		// Holds the name that will be displayed to user
		String displayName;
		System.out.println("\nThese are the pieces you can edit.\n");
		
		// Display a menu style thing to ask user which piece to edit
		for(int i = 0; i < orchestraPieceArray.size(); i++) {
			
			System.out.println((i + 1) + ") " + orchestraPieceArray.get(i).title + " by " + orchestraPieceArray.get(i).getComposer());
			
		}
		
		int selectedPiece; // the number the user wants to edit
		System.out.println("\nPlease enter the number of the piece you wish to edit:");
		
		// Input validation - user must enter a proper number within range of piece numbers (no -4, 2135423, etc)
		do {
			// get which piece they want to edit
			
			InputStreamReader pipe = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(pipe);
			
			// The number of the piece they wish to edit
			selectedPiece = Integer.parseInt(reader.readLine());
//			System.out.println("Index: " + (selectedPiece - 1));
			
			if (selectedPiece < 1 || selectedPiece > (orchestraPieceArray.size() + 0)) {
				// Fire a warning shot and establish authority over the petty, foolish user
				System.out.println("\nYou entered an invalid choice. Please try again");
			}
			
		}
		
		while (selectedPiece < 1 || selectedPiece > (orchestraPieceArray.size() + 0));
		
		OrchestraPiece selectedOrchestraPiece = orchestraPieceArray.get(selectedPiece - 1);
		System.out.println("\nYou chose to edit " + selectedOrchestraPiece.getTitle() + " by " + selectedOrchestraPiece.getComposer());
		System.out.println("\nTo edit title, press 1");
		System.out.println("To edit composer, press 2");
		System.out.println("To edit one of the instrument parts, press 3");
		
		InputStreamReader pipe = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(pipe);
		
		int choice = Integer.parseInt(reader.readLine());
		
		if (choice == 1) {
			System.out.println("What do you want the new title to be?");
			String newTitle = reader.readLine();
			selectedOrchestraPiece.setTitle(newTitle);
			System.out.println("Successfully edited.");
		}
		
		else if (choice == 2) {
			System.out.println("What do you want the new composer name to be?");
			String newComposerName = reader.readLine();
			selectedOrchestraPiece.setComposer(newComposerName);
			System.out.println("Successfully edited.");
		}
		
		else if (choice == 3) {
			// Display their options for InstrumentParts that they can edit
			ArrayList<InstrumentPart> instrumentParts = new ArrayList<InstrumentPart>();
			instrumentParts = selectedOrchestraPiece.getInstrumentPartArray();
			
			for (int i = 0; i < instrumentParts.size(); i++) {
				System.out.println("____________________");
				System.out.println((i + 1) + ")");
				System.out.println(instrumentParts.get(i).getInstrumentName());
				System.out.println("Difficulty: " + instrumentParts.get(i).getDifficulty());
				System.out.println("____________________");
			}
			
			System.out.println("Which instrument part do you wish to change?");
			int whichInstrumentPart = Integer.parseInt(reader.readLine()) - 1;
			
			if (whichInstrumentPart < 0 || whichInstrumentPart > instrumentParts.size()) {
				System.out.println("Invalid choice.");
			}
			
			System.out.println(instrumentParts.get(whichInstrumentPart).getInstrumentName() + " was chosen.");
			System.out.println("\nPress 1 to change the difficulty and 2 to change the instrument name: ");
			int instrumentEditChoice = Integer.parseInt(reader.readLine());
			
			if (instrumentEditChoice == 1) {
				System.out.println("What should the new difficulty be?");
				int newDifficulty = Integer.parseInt(reader.readLine());
				instrumentParts.get(whichInstrumentPart).setDifficulty(newDifficulty);
				System.out.println("Successfully changed.");
			}
			
			else if (instrumentEditChoice == 2) {
				System.out.println("What should the new instrument name be?");
				String newInstrumentName = reader.readLine();
				instrumentParts.get(whichInstrumentPart).setInstrumentName(newInstrumentName);
				System.out.println("Successfully changed.");
			}
			
			else {
				System.out.println("Invalid choice.");
			}
			
		}
		
		else {
			System.out.println("Invalid choice.");
		}
		
	}

	// used for searching through the OrchestraPieces according to a chosen range of difficulty levels for any particular instrument.
	public static void search(ArrayList<OrchestraPiece> orchestraPieceArray) throws Exception {
		
		InputStreamReader pipe = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(pipe);
		
		int lowerLevel;
		int upperLevel;
		
		System.out.println("\nYou chose to search by difficulty level.");
		
		System.out.println("\nWhat is the lower limit of the difficulty level?");
		lowerLevel = Integer.parseInt(reader.readLine());
		if (lowerLevel < 1) {
			System.out.println("Must be greater than 1");
			return;
		}
		
		System.out.println("\nWhat is the upper limit of the difficulty level?");
		upperLevel = Integer.parseInt(reader.readLine());
		if (upperLevel > 10) {
			System.out.println("Must be less than 10");
			return;
		}

		ArrayList<InstrumentPart> instrumentParts = new ArrayList<InstrumentPart>();
		InstrumentPart tempInstrumentPart;
		
		// iterate through OrchestraPieces to search through range
		for (int i = 0; i < orchestraPieceArray.size(); i++) {
			
			instrumentParts = orchestraPieceArray.get(i).getInstrumentPartArray();
			
			// iterate through instrumentParts
			for (int j = 0; j < instrumentParts.size(); j++) {
				
				tempInstrumentPart = instrumentParts.get(j);
				if (tempInstrumentPart.getDifficulty() <= upperLevel && tempInstrumentPart.getDifficulty() >= lowerLevel) {
					// InstrumentPart satisfies the requirements
					System.out.println("\nInstrument: " + tempInstrumentPart.getInstrumentName());
					System.out.println("Difficulty: " + tempInstrumentPart.getDifficulty());
				}
				
			}
			
			
			
		}
		
	}
	
	// used for displaying all the info about the orchestra pieces
	public static void display(ArrayList<OrchestraPiece> orchestraPieceArray) {
		
		// Iterate through the ArrayList and display info for each OrchestraPiece
		for (int i = 0; i < orchestraPieceArray.size(); i++) {
			
			System.out.println("\n==========================");
			System.out.println("ORCHESTRA PIECE #" + (i + 1));
			System.out.println("\n--------------------------");
			System.out.println(orchestraPieceArray.get(i).getTitle() + " by " + orchestraPieceArray.get(i).getComposer());
			System.out.println(orchestraPieceArray.get(i).getInstrumentPartArray().size() + " instrument parts");
			
			// Display details about each InstrumentPart
			for (int j = 0; j < orchestraPieceArray.get(i).getInstrumentPartArray().size(); j++) {
				System.out.println("\nInstrument Part #" + (j + 1));
				System.out.println("Instrument: " + orchestraPieceArray.get(i).getInstrumentPartArray().get(j).getInstrumentName());
				System.out.println("Difficulty: " + orchestraPieceArray.get(i).getInstrumentPartArray().get(j).getDifficulty());
			}
			
			System.out.println("\n==========================");
		}
		
	}
	
	// User decides to edit, display, create, or search through the OrchestraPieces
	public static int menu() throws Exception {
		
		System.out.println("\n\n__________________________");
		System.out.println("What do you want to do next?");
		System.out.println("____________________________");
		System.out.println("Edit: enter a 0");
		System.out.println("Search: enter a 1");
		System.out.println("Create: enter a 2");
		System.out.println("Display: enter a 3");
		System.out.println("___________________________\n\n");
		
		InputStreamReader pipe = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(pipe);
		
		int choice = Integer.parseInt(reader.readLine());
		
		return choice;
	}

	// Used to create a new OrchestraPiece (NOT A CONSTRUCTOR - THIS INPUTS DATA FROM USER)
	public static OrchestraPiece createNewOrchestraPiece() throws Exception {
		
		OrchestraPiece createdOrchestraPiece;
		InputStreamReader pipe = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(pipe);
		
		// Get the necessary information from the user
		// title, instrumentPart, composer name
		System.out.println("\nYou are going to create a new Orchestra Piece.");
		System.out.println("\nPlease enter the title: ");
		String title = reader.readLine();
		
		System.out.println("\nPlease enter composer name: ");
		String composerName = reader.readLine();
		
		System.out.println("\nHow many instrumental parts are there (violin 1, trombone, etc)? ");
		int numOfInstrumentalParts = Integer.parseInt(reader.readLine());
		
		ArrayList<InstrumentPart> instrumentPartArray = new ArrayList<InstrumentPart>();
		
		String nameOfInstrument;
		int difficulty;
		InstrumentPart tempPart;
		// initialize each instrumental part
		for (int i = 0; i < numOfInstrumentalParts; i++) {
			System.out.println("\n\n---------------------");
			System.out.println("Instrumental part " + (i + 1));
			System.out.println("---------------------");
			System.out.println("Please enter the instrument name: ");
			nameOfInstrument = reader.readLine();
			
			// Input validation for the difficulty
			do {
				System.out.println("\nPlease enter the difficulty from 1 to 10: ");
				difficulty = Integer.parseInt(reader.readLine());
				
				if (difficulty > 10 || difficulty < 1) {
					System.out.println("\nThe difficulty must be from 1 to 10.");
				}
			}
			while(difficulty < 1 || difficulty > 10);
			
			// Now that we have all the info we need, we have to create the InstrumentPart object and add it to the array
			tempPart = new InstrumentPart(nameOfInstrument, difficulty);
			instrumentPartArray.add(tempPart);
			
		} // end of for loop
		
		createdOrchestraPiece = new OrchestraPiece(composerName, title, instrumentPartArray);
		
		return createdOrchestraPiece;
	}
}
