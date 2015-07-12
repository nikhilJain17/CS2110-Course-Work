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
      int length;

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
      public Customer leaveQueue(Customer wantsToLeave) {
            // use the iterator to iterate through the nodes
            // then, when it finds a match, remove that person from the queue

            // TODO How to figure out if there is a match?
            // if (back == wantsToLeave) means points to same object
            // maybe compare name?
            // maybe compare id numbers?

            String nameWantsToLeave = wantsToLeave.getName();

            for (NodeIterator iterator = new NodeIterator(front); !iterator.atEnd(); iterator.PlusPlus()) {

                  // are they the same?
                  // TODO Refine this "is-same?" checking process
                  if (iterator.getCurrent().getCustomer().getName().equals(nameWantsToLeave)) {

                        length--;

                        Customer leavingCustomer = wantsToLeave; // to be returned

                        // Is the person who wants to leave at the front?
                        if (front.getCustomer().getName().equals(nameWantsToLeave)) {
                              front = front.getNext();
                              front.setPrevious(null);

                              return leavingCustomer;
                        }

                        // Or is it at the back?
                        else if (back.getCustomer().getName().equals(nameWantsToLeave)) {
                              back = back.getPrevious();
                              back.setNext(null);

                              return leavingCustomer;
                        }

                        // Or neither?
                        else {

                              Node current = iterator.getCurrent();

                              // remove the node 'current'
                              Node beforeCurrent = current.getPrevious();
                              Node afterCurrent = current.getNext();

                              beforeCurrent.setNext(afterCurrent);
                              afterCurrent.setPrevious(beforeCurrent);


                        }



                        // Make sure nothing is pointing at the thing wanting to leave
                        // Node newPrevious = wantsToLeave.getPrevious();
                        // Node newNext = wantsToLeave.getNext();
                        // newPrevious.setNext(newNext); // now, nothing is pointing at leaving person

                        return leavingCustomer;
                  }

            }


            // Nobody found.
            p("That person was not found.");
            return null;

      }


      // @TODO Implement this
      public void findPerson(String name) {

            boolean foundSomebody = false;

            // First check back, since iterator skips it
            if (back.getCustomer().getName().equals(name)) {
                  p(name + " is the last person in the queue.");
                  foundSomebody = true;
            }

            // For displaying where in the queue the person is
            int position = 1;

            // Iterate through the nodes
            for (NodeIterator iterator = new NodeIterator(front); !iterator.atEnd(); iterator.PlusPlus()) {

                  if (iterator.getCurrent().getCustomer().getName().equals(name)) {
                        p("\n" + name + " is in the queue at position " + position);
                        foundSomebody = true;
                  }

                  position++;

            }

            // Was somebody found?
            if (foundSomebody) {
                  return;
            }

            else {
                  p("Sorry, that person is not in the queue.");
            }

      }


      // Join queue
      // Must join at back
      public void joinQueue(Customer c) {

            // p("called joinqueue");

            Node join = new Node(c);

            // Is this Node the only Node in the queue?
            if (length == 0) {
                  front = join;
                  back = front; // since there is only 1 node
                  front.setNext(back);
                  back.setPrevious(front);
            }

            else {
                  Node oldBack = back;
                  back.setNext(join);
                  back = back.getNext();
                  back.setPrevious(oldBack);
                  // back.setNext(null);
            }

            length++;
            return;

      }


      // Show contents of queue
      public void displayQueue() {

            p("\nLength of queue: " + length + "\n");

            // why not use iterators
            for (NodeIterator iterator = new NodeIterator(front); !iterator.atEnd(); iterator.PlusPlus()) {
                  Node currentNode = iterator.getCurrent();
                  Customer c = currentNode.getCustomer();
                  p("[" + c.getName() + "]");
            }
            // iterator is off by 1, so display last person
            p("[" + back.getCustomer().getName() + "] - back");

      }



      // It is a lot easier to just type p("hello") than System.out.println("")
      // The only purpose of this function is to save time and typing
      public static void p(String print) {
            System.out.println(print);
      }


}
