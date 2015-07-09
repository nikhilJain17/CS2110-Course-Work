
// This is an example of a queue
// However, instead of using an array or an arraylist
// This uses a "pointing-type" object known as a Node

import java.io.*;

class NodeQueue {

      private static Node front;
      private static Node back;
      private static int length;

      public NodeQueue() {
            length = 0;
            front = null;
            back = null;
      }

      // Methods needed:
      // Add person
      // Remove person
      // Display queue @TODO Use iterators for this
      // isEmpty

      // Checks if queue is empty
      public static boolean isEmpty() {
            return length == 0;
      }

      public static void addPerson(String person) {

            if (isEmpty()) {
                  // Person added to empty queue
                  front = new Node(person);
                  back = front; // back and front are same person since only 1 person
            }

            else {
                  back.setNext(new Node (person)); // add person to queue
                  back = back.getNext(); // set them at the back
            }

            length++;
            return;

      }

      public static void removePerson() {

            // check for foolishness
            if (!isEmpty()) {
                  // return front
                  // move everything back
                  String data = front.getData();
                  front = front.getNext();
                  length--;

                  System.out.println("This is the person leaving: " + data);
            }

            else
                  System.out.println("Sorry, the queue is null.");

            return;

      }

      public static void displayQueue() {

            System.out.println("Front: " + front.getData());
            System.out.println("Back: " + back.getData());

      }

      // The only purpose of this is to prevent typing "System.out.println" over again
      public static void p(String display) {
            System.out.println(display);
      }


      // for choosing what you want to do
      public static int menu() throws Exception {

            int choice;

            do {
                  InputStreamReader pipe = new InputStreamReader(System.in);
                  BufferedReader reader = new BufferedReader(pipe);

                  p("\nMenu:");
                  p("-----------------");
                  p("1 - Add Person   ");
                  p("2 - Remove Person");
                  p("3 - Display Queue");
                  p("-----------------");

                  choice = Integer.parseInt(reader.readLine());

            }
            while (choice < 1 || choice > 3);

            return choice;

      }


      public static void main(String[] args) throws Exception {

            InputStreamReader pipe = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(pipe);

            p("Welcome to the queue with nodes.");

            while (true) {
                  int choice = menu();

                  switch (choice) {

                        case 1:
                              p("What is the name of the person you want to add?");
                              addPerson(reader.readLine());
                              break;

                        case 2:
                              removePerson();
                              break;

                        case 3:
                              displayQueue();
                              break;

                  }
            }

      }

}
