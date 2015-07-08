
public class TypoException extends Exception {
	
	public TypoException () {
		super("\nPossible typo detected - please review your spelling and RE-ENTER the word!");
	}

}
