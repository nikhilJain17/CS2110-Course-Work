
// Removes people from the front of the queue depending on the queue's speed
// It does this on a separate thread for each queue

public class PersonRemoverThread extends Thread {
	
	private int rate; // A new person leaves every [rate] seconds
	private CashierQueue q; // Queue that has elements removed
	private int whichQueue; // Which queue is this? (ie Queue 1, 2, ... 5)
	
	
	// Getters and setters
	public double getRate() {
		return rate;
	}

	
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	
	// Constructor
	public PersonRemoverThread(int rate, CashierQueue q, int whichQueue) {
		this.rate = rate;
		this.q = q;
		this.whichQueue = whichQueue;
	}
	
	
	
	// Remove people here
	@Override
	public void run() {
		
		// Remove person
		// Update display
		// Wait
		// Repeat until queue is empty
		
		while (q.getLength() > 0) {
			
			// Remove person
			q.leaveQueueFromFront();
			
			// Update display
			SupermarketGui.displayNamesOnGui(q, whichQueue);
			
			// Wait
			try {
				Thread.sleep(rate * 1000);
			} 
			
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// TODO do something?
				
				return;
				
			}
			
			// repeat
			
		}
		
	}

}
