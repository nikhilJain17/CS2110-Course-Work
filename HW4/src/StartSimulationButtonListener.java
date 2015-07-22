import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


// Basically resets the whole program and runs it
// Randomly generate queues
// remove people
// restart

public class StartSimulationButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// was it the proper button?
		if (e.getSource().equals(SupermarketGui.startSimulation)) {
//			
//			/**
//			 *	NOTE:
//			 *	There is a strange bug in the program. This bug causes all the threads to zip by, as if they are not executing Thread.sleep().
//			 *	I think the issue occurs if the user does not join a queue and starts the program.
//			 *	This code should take care of that issue.
//			 **/
//			
//			// check if user did not join a queue
//			// i.e. all JoinQueue buttons are enabled
//			if (SupermarketGui.joinQueue1.isEnabled() && SupermarketGui.joinQueue2.isEnabled() && 
//					SupermarketGui.joinQueue3.isEnabled() && SupermarketGui.joinQueue4.isEnabled() && SupermarketGui.joinQueue5.isEnabled()) {
//				
//				JOptionPane.showMessageDialog(SupermarketGui.frame, "Not so fast! Join a queue, then proceed.");
//				return;
//			}
			
			
			
			
//			// Randomly populate the queues
//			SupermarketGui.queueArray = Main.initialize();
//			
//			// initialize the JTextAreas with the proper data
//			for (int i = 0; i < SupermarketGui.queueArray.length; i++) {
//				SupermarketGui.displayNamesOnGui(SupermarketGui.queueArray[i], i + 1);
//			}
			
			// Start the threads
			SupermarketGui.startRemovalThreads();
			
			// disable the button from being pressed
			// this is for preventing user foolhardiness
			// also it fixes a bug where if the user joins a queue before the program started, the queues all go at once and are done in half a second
			SupermarketGui.startSimulation.setEnabled(false);
			
		}
		
	}
	
	

}
