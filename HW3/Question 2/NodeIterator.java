// used to iterate through the nodes in the queue

class NodeIterator {

      private Node current;

      public NodeIterator (Node setCurrent) {
            current = setCurrent;
      }

      public Node getCurrent() {
            return current;
      }

      public void setCurrent(Node n) {
            current = n;
      }

      // Used to "increment" through the queue
      public void PlusPlus() {
            // This happens if current is the last object in the queue
            if (atEnd())
                  return;

            current = current.getNext();
      }

      // Used to "decrement" through the queue (not sure if necessary, but good to have)
      public void MinusMinus() {

            if (atBeginning())
                  return;

            current = current.getPrevious();
      }

      // At beginning of queue?
      public boolean atBeginning() {
            return current.getPrevious() == null;
      }

      // At end of queue?
      public boolean atEnd() {
            return current.getNext() == null;
      }

}
