import java.util.ArrayList;


public class LevenshteinTypoAlgorithm {
	
	// This function computes the "Levenshtein distance" between 2 strings.
	// For example, the distance from "kitten" to "sitting" is 3.
	// sitting -> kitting (1 change, distance++)
	// kitting -> kittin (1 deletion, distance++)
	// kittin -> kitten (1 change, distance++)
	//
	// In this case, if the function returns a Levenshtein distance of 1 to 4 (reasonable limit for a typo), 
	// then it prompts the user to re-enter the word they wanted to answer.
	//
	// It compares the user's word to a preset array of words that act as a dictionary.
	
	private ArrayList<String> instrumentDictionary = new ArrayList<String>();
	public int cost; // levenshtein cost or distance
	
	public LevenshteinTypoAlgorithm() {
		
		// add the instrument names, these will be used to cross-check against the user's inputs
		// in the future, it would be a LOT better to actually get an english dictionary api or something
		
		instrumentDictionary.add("trombone");
		instrumentDictionary.add("trumpet");
		instrumentDictionary.add("violin");
		instrumentDictionary.add("piano");
		instrumentDictionary.add("harmonica");
		instrumentDictionary.add("cello");
		instrumentDictionary.add("tuba");
		
	}
	
	public ArrayList<String> getInstrumentDictionary() {
		return instrumentDictionary;
	}
	
	public int getLevenshteinDifference(String userInput, String compareTo) {
		
//		int LevenshteinDistance(string s, int len_s, string t, int len_t)
//		{
//		  /* base case: empty strings */
//		  if (len_s == 0) return len_t;
//		  if (len_t == 0) return len_s;
//
//		  /* test if last characters of the strings match */
//		  if (s[len_s-1] == t[len_t-1])
//		      cost = 0;
//		  else
//		      cost = 1;
//
//		  /* return minimum of delete char from s, delete char from t, and delete char from both */
//		  return minimum(LevenshteinDistance(s, len_s - 1, t, len_t    ) + 1,
//		                 LevenshteinDistance(s, len_s    , t, len_t - 1) + 1,
//		                 LevenshteinDistance(s, len_s - 1, t, len_t - 1) + cost);
//		}
			
		// empty strings
		if (userInput.length() == 0)
			return compareTo.length();
		
		if (compareTo.length() == 0)
			return userInput.length();
		
		// check last characters of strings
		// need to convert them into char arrays first
		char[] userInputChar = userInput.toCharArray();
		char[] compareToChar = compareTo.toCharArray();
		
		if (userInputChar[userInputChar.length - 1] == compareToChar[compareToChar.length-1])
			cost = 0;
		
		else
			cost = 1;
		
		// return minimum of following operations
			// delete char from s
			// delete char from t
			// delete char from both		
		
		return Math.min(getLevenshteinDifference(userInput.substring(0, userInput.length() - 1), compareTo) + 1, 
				Math.min(getLevenshteinDifference(userInput, compareTo.substring(0, compareTo.length() - 1)) + 1, 
						getLevenshteinDifference(userInput.substring(0, userInput.length() - 1), compareTo.substring(0, compareTo.length() - 1) + cost)));

		
		
		
	}
	
}
