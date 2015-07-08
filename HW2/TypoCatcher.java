
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
	
	/*
	 * TODO Add more dictionaries here
	 */
	
	public TypoCatcher() {
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
		
		// want to check for typos with instrument name
		if (dictionaryCode == INSTRUMENT_CODE) {
			
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
			
		}
		
		return minDifference;
		
	}
	
	
}
