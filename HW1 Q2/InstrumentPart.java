
public class InstrumentPart {
	
//	private int partID = 0;
	private String instrumentName;
	private int difficulty = 0;
	
	public InstrumentPart(String setInstrumentName, int setDifficulty) {
		instrumentName = setInstrumentName;
		
		if (setDifficulty <= 10 && setDifficulty >= 1) {
			difficulty = setDifficulty;
		}
		
		else {
			System.out.println("Sorry, the difficulty must be from 1 to 10.");
		}
		
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		if (difficulty <= 10 && difficulty >= 1) {
			this.difficulty = difficulty;
		}
		
		else {
			System.out.println("Sorry, the difficulty must be from 1 to 10.");
		}
	}
	
	

}
