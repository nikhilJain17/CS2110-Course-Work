// Each person will be part of a Node

class Node {

      private Node next;
      private Node previous; // Implement or not?
      private Customer customer;

      public Node (Customer setCustomer) {

            customer = setCustomer;
            next = null;
            previous = null;
      }

      public void setNext(Node n) {
            next = n;
      }

      public Node getNext() {
            return next;
      }

      public void setPrevious(Node n) {
            previous = n;
      }

      public Node getPrevious() {
            return previous;
      }

      public Customer getCustomer() {
            return customer;
      }

      public void setCustomer(Customer c) {
            customer = c;
      }


}
