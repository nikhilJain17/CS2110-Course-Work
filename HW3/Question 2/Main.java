
/*
* This class contains the main method
* Basically the launchpoint of the program
*/

 import java.io.*;

 class Main {



      public static void main (String[] args) throws Exception {

            InputStreamReader pipe = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(pipe);

            p("Welcome to Nikhil Jain Inc.'s Customer Queue Program!");

            // Get file name
            p("\nPlease enter the CORRECT filename to load the names along with the extension, and check the path:");
            String fileName = reader.readLine();

            // Input names from file
            FileInput input = new FileInput(fileName);
            String[] namesFromFile = input.getNamesFromFile();

            // initialize the SuperQueue and add everybody to it IN ORDER
            Nikhil_SuperQueue superQueue = new Nikhil_SuperQueue();

            // add people to queue in ORDER
            for (int i = 0; i < namesFromFile.length; i++) {
                  Customer addCustomer = new Customer(namesFromFile[i]);
                  // Node person = new Node(addCustomer);
                  superQueue.joinQueue(addCustomer); // add the person to the queue
            }

            int choice;
            do {
                  choice = menu();

                  if (choice < 1 || choice > 5)
                        p("\n choice");

                  Customer addCustomer;

                  // call the appropriate function depending on the user's choice
                  switch (choice) {
                        case 1:
                              // Add person to queue
                              p("\nYou chose to add a person to the queue.");
                              p("\nPlease enter the person's name: ");
                              String personName = reader.readLine();
                              addCustomer = new Customer(personName);
                              // Node addNode = new Node(addCustomer);
                              // superQueue.joinQueue(new Customer("TestCustomer"));
                              p("\n" + personName + " joined the queue.");
                              superQueue.joinQueue(addCustomer);
                              p("\n" + superQueue.getBack().getCustomer().getName() + " is at the back of the queue");

                              break;

                        case 2:
                              // leave queue
                              p("\nPlease enter the person's EXACT name who wishes to leave.");
                              Customer left = superQueue.leaveQueue(new Customer(reader.readLine()));
                              p(left.getName() + " left the queue.");
                              break;

                        case 3:
                              // search for specific person in queue
                              p("\nYou chose to search for a person in the queue.");
                              p("\nPlease enter their name: ");
                              superQueue.findPerson(reader.readLine());
                              break;

                        case 4:
                              // get sorted list of all members of queue
                              SortQueue sorter = new SortQueue(superQueue);
                              int[] asciiValues = sorter.convertToAsciiValues();
                              int[] sortedValues = sorter.bubbleSort(asciiValues);

                              // // The sortedValues array must be lowercase
                              // // standard for the program
                              // for (int i = 0; i < sortedValues.length; i++) {
                              //       sortedValues[i] = sortedValues[i].toLowerCase();
                              // }

                              // sorter.convertAsciiToString(sortedValues);

                              sorter.sortAlpha();

                              break;

                        case 5:
                              superQueue.displayQueue();
                              break;


                  }
            }
            while (choice >= 1 && choice <= 5);


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
            p("Press 5 to display all members of queue");
            p("Press any other number to quit");
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
