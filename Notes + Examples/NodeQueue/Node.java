
// This class is the Node class
// It points to itself and the next value in the queue
// The concept of nodes is very versatile for many data structures
// such as queues, stacks, binary trees, etc

class Node {

      private Node next;
      private String data;

      public Node (String setData) {
            next = null;
            this.data = setData;
      }

      // Getters and setters
      public void setNext(Node setNext) {
            this.next = setNext;
      }

      public Node getNext() {
            return next;
      }

      public void setData(String data) {
            this.data = data;
      }

      public String getData() {
            return data;
      }




}
