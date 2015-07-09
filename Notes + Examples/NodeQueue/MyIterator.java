/*
* This class is used to iterate through the Nodes in the NodeQueue
*/

class MyIterator {

      private Node current;

      public MyIterator (Node n) {
            current = n;
      }

      // Getters and setters
      public Node getCurrent ( ) {
		return this.current;
	}

	public void setCurrent (Node n) {
		this.current = n;
	}

      // Methods to implement:
      // PlusPlus
      // atEnd

      public void PlusPlus() {

            // defensive programming
            if (current == null) return;

            current = current.getNext();

      }

      public boolean atEnd() {
            return current.getNext() == null; // if null, then atEnd
      }

}
