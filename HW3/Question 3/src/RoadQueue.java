// This class represents a road in the traffic network, and it is essentially a queue

public class RoadQueue {
	
	private Node front, back;
	int length;
	
	public RoadQueue() {
		length = 0;
		front = null;
		back = null;
	}
	

    // getters
    public int getLength() {
          return length;
    }

    public Node getFront() {
          return front;
    }

    public Node getBack() {
          return back;
    }

    // setters
    public void setFront(Node n) {
          front = n;
    }

    public void setBack(Node n) {
          back = n;
    }
    
    // leave from front only
    public Vehicle leaveRoadQueue() {
    	
    	length--;
    	
    	Vehicle temp = front.getVehicle();
    	front = front.getNext();
		return temp;
    }
    
    // join from back only
    public void joinRoadQueue(Vehicle addVehicle) {
    	
    	length++;
    	
    	if (length == 0) {
    		front = new Node(addVehicle);
    		back = front;
    		return;
    	}
    	
    	back.setNext(new Node(addVehicle));
    	back = back.getNext();
    	
    }
    
    
	
}
