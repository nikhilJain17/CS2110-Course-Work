import java.io.*;
import java.util.ArrayList;

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
  private static int front = 0;

  private static ArrayList<String> queueArray = new ArrayList<String>();

// The only purpose of this function is so that I don't
// have to type "System.out.println()"
  public static void p (String displayThis) {
    System.out.println(displayThis);
  }

// Gets user's choice and returns it
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

 // Adds person
 public static void addPerson(String person) {
       // add to back of queue
       queueArray.add(person);
 }

 public static void removePerson() {
       // Remove from front
       queueArray.remove(front);
       front++;
 }

 public static void displayQueue() {

       for(int i = 0; i < queueArray.size(); i++) {
             p("|" + queueArray.get(i) + "|");
       }

 }

  public static void main(String[] args) throws Exception {

        InputStreamReader pipe = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(pipe);

        while (true) {
            System.out.println("Welcome to the queue program.");
            int choice = menu(); // display the menu and get their response back

            switch (choice) {

                  case 1:
                        displayQueue();
                        break;

                  case 2:
                        p("Who do you want to add?");
                        addPerson(reader.readLine());
                        break;

                  case 3:
                        removePerson();
                        break;

                  case 4:
                        displayQueue();
                        break;


            }

      }



  }



}
