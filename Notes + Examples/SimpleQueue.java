import java.io.*;

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
  public static void p (String displayThis) {
    System.out.println(displayThis);
  }

  public static int menu() throws IOException {

    int choice;

    do {
      p("\n--------------");
      p("Menu Options: ");
      p("--------------");
      p("1 -> Display");
      p("2 -> Add Person");
      p("3 -> Remove Person");
      p("4 -> Find Person");

      InputStreamReader pipe = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(pipe);

      choice = Integer.parseInt(reader.readLine());
    }
    while (choice > 4 || choice < 1);

    return choice;

  }

  public static void main(String[] args) throws Exception {
    System.out.println("Welcome to the queue program.");
    menu();


  }



}
