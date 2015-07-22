import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Button Listener for Join Queue button


public class JoinQueueButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(SupermarketGui.joinQueue1)) {
			
			// disable current button
			SupermarketGui.joinQueue1.setEnabled(false);
			
			// enable all other buttons
			SupermarketGui.joinQueue2.setEnabled(true);
			SupermarketGui.joinQueue3.setEnabled(true);
			SupermarketGui.joinQueue4.setEnabled(true);
			SupermarketGui.joinQueue5.setEnabled(true);
			
			// Add you to the queue
			SupermarketGui.queueArray[0].joinQueue("YOU!");
			
			// Remove you from the back of all other queues, if applicable
			SupermarketGui.queueArray[1].leaveQueue();
			SupermarketGui.queueArray[2].leaveQueue();
			SupermarketGui.queueArray[3].leaveQueue();
			SupermarketGui.queueArray[4].leaveQueue();
			
			
			// refresh the display
			SupermarketGui.displayNamesOnGui(SupermarketGui.queueArray[0], 1);
			

		}
		
		else if (e.getSource().equals(SupermarketGui.joinQueue2)) {
			
			// disable current button
			SupermarketGui.joinQueue2.setEnabled(false);
			
			// enable all other buttons
			SupermarketGui.joinQueue1.setEnabled(true);
			SupermarketGui.joinQueue3.setEnabled(true);
			SupermarketGui.joinQueue4.setEnabled(true);
			SupermarketGui.joinQueue5.setEnabled(true);
			
			// Add you to the queue
			SupermarketGui.queueArray[1].joinQueue("YOU!");
			

			// Remove you from the back of all other queues, if applicable
			SupermarketGui.queueArray[0].leaveQueue();
			SupermarketGui.queueArray[2].leaveQueue();
			SupermarketGui.queueArray[3].leaveQueue();
			SupermarketGui.queueArray[4].leaveQueue();

			
			// refresh the display
			SupermarketGui.displayNamesOnGui(SupermarketGui.queueArray[1], 2);
			

			/***
			 * 
			 * TODO Remove ALL OTHER INSTANCES of you from the other queues!
			 * 
			 */

		}
		
		else if (e.getSource().equals(SupermarketGui.joinQueue3)) {

			// disable current button
			SupermarketGui.joinQueue3.setEnabled(false);
			

			// enable all other buttons
			SupermarketGui.joinQueue2.setEnabled(true);
			SupermarketGui.joinQueue1.setEnabled(true);
			SupermarketGui.joinQueue4.setEnabled(true);
			SupermarketGui.joinQueue5.setEnabled(true);

			// Add you to the queue
			SupermarketGui.queueArray[2].joinQueue("YOU!");

			// Remove you from the back of all other queues, if applicable
			SupermarketGui.queueArray[1].leaveQueue();
			SupermarketGui.queueArray[0].leaveQueue();
			SupermarketGui.queueArray[3].leaveQueue();
			SupermarketGui.queueArray[4].leaveQueue();
			
			// refresh the display
			SupermarketGui.displayNamesOnGui(SupermarketGui.queueArray[2], 3);
			
			

		}

		else if (e.getSource().equals(SupermarketGui.joinQueue4)) {

			// disable current button
			SupermarketGui.joinQueue4.setEnabled(false);

			// enable all other buttons
			SupermarketGui.joinQueue2.setEnabled(true);
			SupermarketGui.joinQueue3.setEnabled(true);
			SupermarketGui.joinQueue1.setEnabled(true);
			SupermarketGui.joinQueue5.setEnabled(true);

			// Add you to the queue
			SupermarketGui.queueArray[3].joinQueue("YOU!");

			// Remove you from the back of all other queues, if applicable
			SupermarketGui.queueArray[1].leaveQueue();
			SupermarketGui.queueArray[2].leaveQueue();
			SupermarketGui.queueArray[0].leaveQueue();
			SupermarketGui.queueArray[4].leaveQueue();
			
			// refresh the display
			SupermarketGui.displayNamesOnGui(SupermarketGui.queueArray[3], 4);


			/***
			 * 
			 * TODO Remove ALL OTHER INSTANCES of you from the other queues!
			 * 
			 */
			
		}
		
		else if (e.getSource().equals(SupermarketGui.joinQueue5)) {

			// disable current button
			SupermarketGui.joinQueue5.setEnabled(false);

			// enable all other buttons
			SupermarketGui.joinQueue2.setEnabled(true);
			SupermarketGui.joinQueue3.setEnabled(true);
			SupermarketGui.joinQueue4.setEnabled(true);
			SupermarketGui.joinQueue1.setEnabled(true);

			// Add you to the queue
			SupermarketGui.queueArray[4].joinQueue("YOU!");
			

			// Remove you from the back of all other queues, if applicable
			SupermarketGui.queueArray[1].leaveQueue();
			SupermarketGui.queueArray[2].leaveQueue();
			SupermarketGui.queueArray[3].leaveQueue();
			SupermarketGui.queueArray[0].leaveQueue();
			// TEST
//			SupermarketGui.queueArray[4].leaveQueue();
			
			// refresh the display
			SupermarketGui.displayNamesOnGui(SupermarketGui.queueArray[4], 5);
			

			
			
		}
		
	}
	

}
