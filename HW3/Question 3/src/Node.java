// Nodes for the RoadQueue

public class Node {

      private Node next;
      private Vehicle vehicle;

      public Node (Vehicle v) {

            vehicle = v;
            next = null;
            
      }

      public void setNext(Node n) {
            next = n;
      }

      public Node getNext() {
            return next;
      }

      public Vehicle getVehicle() {
            return vehicle;
      }

      public void setVehicle(Vehicle v) {
            vehicle = v;
      }




}
