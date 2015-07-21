// The lines that people wait in

public class CashierQueue {

	private Node front;
	private Node back;
	private int length;
	private int rate; // rate that cashier serves people
	
	
	// Constructor
	public CashierQueue() {
		front = null;
		back = null;
		length = 0;
		
		// I keep getting NullPointerExceptions on the JLabels that display this, so the speeds are being generated in SupermarketGui.java
		//rate = (int) (10 * (Math.random()));
	}
	
	
	


	// join the queue
	/*
	 * have the user enter the name?
	 */
	public void joinQueue(String name) {
		
		Node wantsToJoin = new Node(name);
		
		// if only person in queue
		if (length == 0) {
			front = wantsToJoin;
			back = wantsToJoin;
			front.setNext(back);
		}
		
		// others in queue
		else {
			back.setNext(wantsToJoin);
			back = back.getNext();
		}
		
		length++;
		
	}
	
	
	// leave the queue (as if you have been served)
	public String leaveQueueFromFront() {
		
		if (length > 0) {
			length--;
			
			String name = front.getName();
			front = front.getNext();
			return name;
		}
		
		// if only 1 member in queue
		if (length == 1) {
			front.setName("");
			back.setName("");
			return "";
		}
		
		// empty queue
		else
			return "";
		
	}
	
	
	// "skip the queue"
	// basically, only for YOU! to leave queue
	// if you are at back, and want to switch to faster queue, for example
	public void leaveQueue() {
		
		// are you in the queue?
		for (QueueIterator i = new QueueIterator (front); !i.atEnd(); i.plusPlus())
			if (i.getCurrent().getName().equalsIgnoreCase("YOU!"))
				i.getCurrent().setName("");
		
		if (back.getName().equalsIgnoreCase("YOU!")) {
			back.setName(""); // rip
							  // should have probably made a Node previous
						      // oh well 
		}
		
	}
	
	
	// Used to display all members of the queue
	public void displayQueueMembers() {

		for (QueueIterator i = new QueueIterator(front); !i.atEnd(); i.plusPlus()) {
			
			System.out.println(i.getCurrent().getName());
		}
		
		// dont forget about the back
		System.out.println(back.getName());
		
	}
	
	
	// Getters and setters
	public Node getFront() {
		return front;
	}
	public void setFront(Node front) {
		this.front = front;
	}
	public Node getBack() {
		return back;
	}
	public void setBack(Node back) {
		this.back = back;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	
	
}
