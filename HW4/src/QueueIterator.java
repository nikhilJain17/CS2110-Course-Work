// Iterate through the nodes in teh queue

public class QueueIterator {

	private Node current;
	
	// constructor
	public QueueIterator(Node current) {
		this.current = current;
	}
	
	

	// getters and setters
	public Node getCurrent() {
		return current;
	}

	public void setCurrent(Node current) {
		this.current = current;
	}
	
	
	
	// iterate through nodes
	public void plusPlus() {
		
		current = current.getNext();
		
	}
	
	
	// if at end, returns true
	public boolean atEnd() {
		return current == null;
	}
	
	
	
	
}
