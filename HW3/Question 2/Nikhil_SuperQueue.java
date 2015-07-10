import java.io.*;


class Nikhil_SuperQueue {

      // Functions to implement:
      // 1. Read from file (separated by line breaks OR spaces)
      // 2. Leave queue (from ANY position)
      // 3. Join queue (only at back)
      // 4. Find customer by name (Handle multiple names - exception maybe?)
      // 5. Sort customers by name (Use ASCII!)


      private Node front;
      private Node back;
      private int length;

      // constructor
      public Nikhil_SuperQueue() {
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

      // User must specify who wants to leave
      // Can leave from front OR anywhere else
      public Customer leaveQueue(Node wantsToLeave) {
            // use the iterator to iterate through the nodes
            // then, when it finds a match, remove that person from the queue

            // TODO How to figure out if there is a match?
            // if (back == wantsToLeave) means points to same object
            // maybe compare name?
            // maybe compare id numbers?

            for (NodeIterator iterator = new NodeIterator(front); !iterator.atEnd(); iterator.PlusPlus()) {

                  // are they the same?
                  // TODO Refine this "is-same?" checking process
                  if (iterator.getCurrent() == wantsToLeave) {

                        Customer leavingCustomer = wantsToLeave.getCustomer(); // to be returned

                        // Is the person who wants to leave at the front?
                        if (front == wantsToLeave {
                              front = wantsToLeave.getNext();
                              front.setPrevious(null);

                              return leavingCustomer;
                        }

                        // Or is it at the back?
                        else if (back == wantsToLeave) {
                              back = back.getPrevious();
                              back.setNext(null);

                              return leavingCustomer;
                        }



                        // Make sure nothing is pointing at the thing wanting to leave
                        Node newPrevious = wantsToLeave.getPrevious();
                        Node newNext = wantsToLeave.getNext();
                        newPrevious.setNext(newNext); // now, nothing is pointing at leaving person

                        return leavingCustomer;
                  }

            }

            // Nobody found.
            p("That person was not found.");
            return null;

      }

      

      // It is a lot easier to just type p("hello") than System.out.println("")
      // The only purpose of this function is to save time and typing
      public static void p(String print) {
            System.out.println(print);
      }


}
