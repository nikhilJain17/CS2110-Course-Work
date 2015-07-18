// Each element in the queue will be a node

public class Node {

	private Node next;
	private String name;
	
	public Node(String name) {
		this.name = name;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
