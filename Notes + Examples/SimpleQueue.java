/*
* A simple queue.
* Uses an array instead of nodes
* NodeQueue has nodes
*/

class SimpleQueue {

/*
* Add person (from front)
* Remove person (from back)
* Find person (by name or some cheese) - need to make a .equals()
* Display stuff
*/

  private final int ADD_PERSON = 0;
  private final int REMOVE_PERSON = 1;
  private final int FIND_PERSON = 2;

// The only purpose of this function is so that I don't
// have to type "System.out.println()"
  public void p (String displayThis) {
    System.out.println(displayThis);
  }

  public int menu() {
    p("--------------");
    p("Menu Options: ");
    p("--------------");
    p("1 -> Display");
    p("2 -> Add Person")




  }

  public static void main(String[] args) {
    System.out.println("Welcome to the queue program.");



  }



}
