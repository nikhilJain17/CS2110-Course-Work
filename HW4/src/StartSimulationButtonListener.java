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
			
			// Randomly populate the queues
			
			// Start the threads
			SupermarketGui.startRemovalThreads();
			
		}
		
	}
	
	

}
