// iterates through the nodes in the roadqueue
public class RoadQueueIterator {


      private Node current;

      public RoadQueueIterator (Node setCurrent) {
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

      // At end of queue?
      public boolean atEnd() {
            return current.getNext() == null;
      }

}


