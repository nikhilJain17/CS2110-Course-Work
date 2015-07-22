import java.util.concurrent.TimeUnit;


// Removes people from the front of the queue depending on the queue's speed
// It does this on a separate thread for each queue

public class PersonRemoverThread extends Thread {
	
	private int rate; // A new person leaves every [rate] seconds
	private CashierQueue q; // Queue that has elements removed
	private int whichQueue; // Which queue is this? (ie Queue 1, 2, ... 5)
	private int totalLength; // total length of time needed to billa
	
	
	// Getters and setters
	public double getRate() {
		return rate;
	}
	
	public int getTotalLength() {
		return totalLength;
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
	
// calculate time for queue
	public void calculateTime () {
		
		int speed = q.getRate();
		int length = q.getLength();
		
		totalLength =  speed * length;
				
	} // End of Time.
	
	
	// Remove people here
	@Override
	public void run() {
		
		// calculate time
		calculateTime();
		
		// Remove person
		// Update display
		// Wait
		// Repeat until queue is empty
		
		while (q.getLength() > 0) {
			
			// Remove person
			q.leaveQueueFromFront();
			
			// Update display
			SupermarketGui.displayNamesOnGui(q, whichQueue);
			
			System.out.println("Queue RATE: " + q.getRate());
//			System.out.println("Cashier Speed Array RATE: " + SupermarketGui.cashierSpeeds[whichQueue]);
			
			// Wait
			try {
				Thread.sleep(q.getRate() * 1000);
				
			} 
			
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// TODO do something?
				
				return;
				
			}
			
			
//			try {
//				TimeUnit.SECONDS.sleep(rate);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			// repeat
			
		} // end of while
		
	} // end of run

}
