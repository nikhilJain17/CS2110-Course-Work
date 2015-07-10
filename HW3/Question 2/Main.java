
/*
* This class contains the main method
* Basically the launchpoint of the program
*/

 import java.io.*;

 class Main {



      public static void main (String[] args) throws Exception {
            p("Welcome to Nikhil Jain Inc.'s Customer Queue Program!");

            int choice;
            
            do {
                  choice = menu();

                  if (choice < 1 || choice > 5)
                        p("\n choice");
            }
            while (choice < 1 || choice > 5);

            // Now, commence input process (through file)

            // testing file input
            FileInput input = new FileInput("names.txt");
            input.getNamesFromFile();

      }

      // offers choices for the user to make
      // display queue
      // search for person
      // add person
      // remove person
      // sort people and return in a list
      public static int menu() throws Exception {

            int userChoice;

            p("\nWhat would you like to do?");
            p("------------------------------------");
            p("Press 1 to add person to queue");
            p("Press 2 to remove person from queue");
            p("Press 3 to search for person");
            p("Press 4 to get sorted list of people");
            p ("Press 5 to display all members of queue");
            p("------------------------------------");

            InputStreamReader pipe = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(pipe);

            userChoice = Integer.parseInt(reader.readLine());
            return userChoice;
      }

      // It is a lot easier to just type p("hello") than System.out.println("")
      // The only purpose of this function is to save time and typing
      public static void p(String print) {
            System.out.println(print);

      }
}
