import java.io.*;

// @author Nikhil Jain
// 7/5/15

// The assignment:

/*
 * 
 * The objective is to build a catalogue of music. 
 * You may assume that a piece of music will have a composer, 
 * a title, instrumentation, possibly a duration, and possibly 
 * comments about the piece. There might be some additional 
 * information to be added in a later version. Your program 
 * should prompt the user to enter data for each piece of music, 
 * and should save this data to a file in such a way that it's 
 * easy for you to reload the file if the user wants to restart 
 * the program to add more music. You may assume that there won't
 *  be a horrendously large number of different composers, and that 
 *  the possible number of instruments to be used will not be overly 
 *  large either. (In a later version there may be a few standard groupings 
 *  of instruments (eg string quartet = 2 violins + 1 viola + 1 cello, or 
 *  a classical orchestra = several 1st violins, several 2nd violins, several 
 *  violas, several cellos, some double basses, 2 flutes, 2 oboes, 2 clarinets, 
 *  2 bassoons, up to 4 french horns, 2 trumpets, 3 trombones, 1 tuba, some percussion)
 *   -- don't go program for this aspect for this homework, simply put in a 'stub' 
 *   now to handle this situation if there's a chance to expand on this once you're 
 *   more comfortable with inheritance!!)). Often people make typos when entering data,
 *    so you should explore building your own exceptions to catch situations where an 
 *    entered composer or instrument is very close in spelling to a previously created 
 *    one, and use that to prompt the user to confirm or correct their input. At a 
 *    latter stage that there may well be searching and sorting of the data, so you 
 *    should think about being careful in organising your data intelligently.
 */



public class Nikhil_HW2_MusicCatalog {

	private String title;
	private String composer;
	private String[] instruments;
	private double durationInMinutes;
	private String comments;
	
	// Constructor
	public Nikhil_HW2_MusicCatalog(String setTitle, String[] setInstruments, double setDurationInMinutes, String setComments, String setComposer) {
		
		title = setTitle;
		instruments = setInstruments;
		durationInMinutes = setDurationInMinutes;
		comments = setComments;
		composer = setComposer;
		
	}	
	
	// Display details about the music catalog
	public void displayMusicCatalog() {
		System.out.println("\nTitle: " + title);
		System.out.println("Composer: " + composer);
	}
	
	
	
	// Save details about music catalog to a file
	public void saveToFile() {
		// TODO: Stuff 
	}

	
	// Getters
	public String getTitle() {
		return title;
	}

	public String getComposer() {
		return composer;
	}

	public String[] getInstruments() {
		return instruments;
	}

	public double getDurationInMinutes() {
		return durationInMinutes;
	}

	public String getComments() {
		return comments;
	}
	
	
	
	// Main method

	public static void main(String[] args) throws Exception {
		
		// Input objects
		InputStreamReader pipe = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(pipe);
		
		
		System.out.println("Welcome to the Music Catalog program.");
		System.out.println("You will enter data about musical pieces you want to enter, and it will be saved to a file.");
		System.out.println("Let's begin!");
		
		String continueProgram = "";
		
		// Keep on running the program until the user wants to quit
		do {
			
			// Parameters necessary to create a MusicCatalog object
			String title;
			String composer;
			String[] instruments;
			double durationInMinutes;
			String comments;
			
			System.out.println("\nCreating new music piece to add to the catalog.");
			
			// Get the data from the user
			System.out.println("\nWhat is the title?");
			title = reader.readLine();
			
			System.out.println("\nWhat is the composer's name?");
			composer = reader.readLine();
			
			System.out.println("\nWhat is the duration in minutes? (Ex: For 4 min 30 sec, type in 4.5.)");
			durationInMinutes = Double.parseDouble(reader.readLine());
			
			System.out.println("\nHow many instruments are there?");
			instruments = new String[Integer.parseInt(reader.readLine())];
			
				// input each of the instruments
			for (int i = 0; i < instruments.length; i++) {
				System.out.println("What is the name of instrument #" + (i + 1) + "?");
				instruments[i] = reader.readLine();
			}
			
			System.out.println("What are some comments about the piece you wish to include?");
			comments = reader.readLine();
			
			Nikhil_HW2_MusicCatalog musicCatalog = new Nikhil_HW2_MusicCatalog(title, instruments, durationInMinutes, comments, composer);
			System.out.println(musicCatalog.getComments()); // test
			
			
			
			// Repeat the program if the user wishes to do so.
			System.out.println("\nDo you want to continue using the program? If so, type Y. Otherwise, press any key to quit.");
			continueProgram = reader.readLine();
		}
		
		while (continueProgram.equalsIgnoreCase("y"));
		
	}

}
