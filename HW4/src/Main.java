
// Launchpoint of the program


public class Main {
	
	public void initialize() {
		
		// This block of code initializes the GUI on a new thread
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SupermarketGui gui = new SupermarketGui();
				gui.createAndShowGui();
			}
			
		});
		
		
		// randomly generate people to populate queues
		
		
		
		
	}
	
	
}
