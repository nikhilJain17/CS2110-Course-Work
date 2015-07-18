// The lines that people wait in

public class CashierQueue {

	private Node front;
	private Node back;
	private int length;
	
	
	// Constructor
	public CashierQueue() {
		front = null;
		back = null;
		length = 0;
	}
	
	
	// join the queue
	public void joinQueue(int id) {
		
		Node wantsToJoin = new Node(id);
		
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
	
	
	// leave the queue
	
	
	// "skip the queue"
	
	
	
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
	
	
	
	
}
