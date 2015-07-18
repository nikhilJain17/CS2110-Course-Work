// Each element in the queue will be a node

public class Node {

	private Node next;
	private int id;
	
	public Node(int id) {
		this.id = id;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	
	
}
