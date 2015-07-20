import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Basically resets the whole program and runs it
// Randomly generate queues
// remove people
// restart

public class StartSimulationButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// was it the proper button?
		if (e.getSource().equals(SupermarketGui.startSimulation)) {
			
//			// Randomly populate the queues
//			SupermarketGui.queueArray = Main.initialize();
//			
//			// initialize the JTextAreas with the proper data
//			for (int i = 0; i < SupermarketGui.queueArray.length; i++) {
//				SupermarketGui.displayNamesOnGui(SupermarketGui.queueArray[i], i + 1);
//			}
			
			// Start the threads
			SupermarketGui.startRemovalThreads();
			
		}
		
	}
	
	

}
