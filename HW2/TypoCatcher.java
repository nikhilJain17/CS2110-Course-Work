
public class TypoCatcher {

	/*
	 * This class compares the user's input to a dictionary of saved "correct" words.
	 * If 1 to 3 letters are different, then the "TypoException" will be thrown.
	 * The main problem is that the dictionary of saved words is hardcoded. 
	 * It would be better to use a dictionary api or something to access a larger database of words.
	 */
	
	private String[] instrumentDictionary;
	private String[] composerDictionary;
	
	// used to tell what type of info the user is entering
	private final int INSTRUMENT_CODE = 0;
	private final int COMPOSER_CODE = 1;
	
	
	
	public TypoCatcher() {
		
		/*
		 * An optimized dictionary would have a HUGE database of names, composers, etc.
		 * Unfortunately, the dictionaries in the program are small, and therefore are limited 
		 * in the words they can check against.
		 */
		
		// initialize the instrumentDictionary
		instrumentDictionary = new String[10];
		instrumentDictionary[0] = "trombone";
		instrumentDictionary[1] = "tuba";
		instrumentDictionary[2] = "violin";
		instrumentDictionary[3] = "piano";
		instrumentDictionary[4] = "xylophone";
		instrumentDictionary[5] = "cello";
		instrumentDictionary[6] = "bass";
		instrumentDictionary[7] = "guitar";
		instrumentDictionary[8] = "saxophone";
		instrumentDictionary[9] = "clarinet";
		
		// initialize the composerDictionary
		composerDictionary = new String[11];
		composerDictionary[0] = "Mozart";
		composerDictionary[1] = "Wolfgang Amadeus Mozart";
		composerDictionary[2] = "Vivaldi";
		composerDictionary[3] = "Antoni Vivaldi";
		composerDictionary[4] = "Graeme Bailey";
		composerDictionary[5] = "Bailey";
		composerDictionary[6] = "Bach";
		composerDictionary[7] = "Johann Bach";
		composerDictionary[8] = "Johann Sebastian Bach";
		composerDictionary[9] = "Beethoven";
		composerDictionary[10] = "Ludwig van Beethoven";
		
		/*
		 * TODO add more instruments and more dictionary entries here
		 */
		
	}
	
	public int catchTypo(String input, int dictionaryCode) {
		
		char[] inputCharArray = input.toCharArray(); // convert param into char array
		char[] benchmark; // used as the benchmark to test against
		
		int difference = 0; // number of differences between letters at each position
		int minDifference = 100000; // very large number to make sure it is not min later on
		
		// to avoid ArrayOutOfBoundsExceptions
		int lengthOfUserInput = input.length();
		int lengthOfBenchmark;
		int minLength;
		
		// What kind of entry do you want to check?
		// i.e. instrument names, composer names, etc
		if (dictionaryCode == INSTRUMENT_CODE) {
			
			
			/*
			 * 
			 * TODO Make the stuff inside the for loop a standalone function
			 * Modular programming
			 * 
			 */
			
			// iterate through the entries in the dictionary
			for (int i = 0; i < instrumentDictionary.length - 1; i++) {
				
				benchmark = instrumentDictionary[i].toCharArray();
				
				lengthOfBenchmark = benchmark.length;
				
				minLength = Math.min(lengthOfBenchmark, lengthOfUserInput);
				
				for (int j = 0; j < minLength; j++) {
					
					// is there a difference between the 2 letters?
					if (benchmark[j] != inputCharArray[j]) {
						difference++;
					}
					
				}
				
				minDifference = Math.min(minDifference, difference);
				difference = 0;
				
				
			}
			
		} // end of if
		
		else if (dictionaryCode == COMPOSER_CODE) {
						
			// iterate through the entries in the dictionary
			for (int i = 0; i < composerDictionary.length - 1; i++) {
				
				benchmark = composerDictionary[i].toCharArray();
				
				lengthOfBenchmark = benchmark.length;
				
				// If one array has 5 members and another has 11, we want to iterate 5 times
				// Otherwise, we will get an ArrayOutOfBoundsException
				
				minLength = Math.min(lengthOfBenchmark, lengthOfUserInput);
				
				for(int j = 0; j < minLength; j++) {
					
					// check difference between 2 letters
					if (benchmark[j] != inputCharArray[j]) {
						difference++;
					}
					
					
				}
				
				minDifference = Math.min(minDifference, difference);
				difference = 0;
				
				
			} // end of for
	
		
		} // end of composer else if
		
		return minDifference;
		
	} // end of functoin
	
	
}
