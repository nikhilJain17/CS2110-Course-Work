
// This class is used to sort the customers alphabetically
// It returns them in a String[]

 class SortQueue {

       private String[] sorted; // to be returned (names in sorted order)
       private Nikhil_SuperQueue sortThisQueue;
       private String[] unsorted; // names scraped from SuperQueue

       public SortQueue(Nikhil_SuperQueue q) {

             sortThisQueue = q;

             // initialize the size of the array
             unsorted = new String[sortThisQueue.getLength()];
             int index = 0; // to get position for inserting string

             // Us an iterator to get all the names in the queue
             for (NodeIterator iterator = new NodeIterator(sortThisQueue.getFront()); !iterator.atEnd(); iterator.PlusPlus()) {

                  unsorted[index] = iterator.getCurrent().getCustomer().getName();
                  index++;

             }
             // Dont forget to get the back
             unsorted[sortThisQueue.getLength() - 1] = sortThisQueue.getBack().getCustomer().getName();

       }

       // Sorts the strings in the strint[] alphabetically
       // Uses ASCII values
       public int[] convertToAsciiValues() {

             int[] asciiValue = new int[unsorted.length - 1];

             for (int i = 0; i < unsorted.length - 1; i++) {
                   // Since we are using ascii, we need to make sure all the letters are the same case
                   // We make it lower case
                   unsorted[i] = unsorted[i].toLowerCase();

                  // convert each string in the string array into a char array
                  char[] charArray = unsorted[i].toCharArray();

                  int currentScore = 0;

                  // Now, iterate through the char array, and convert char to ascii
                  for (int j = 0; j < charArray.length; j++) {

                  // DONT INCLUDE NEWLINE CHARACTERS (10) OR SPACES (32) OR VERTICAL TABS (12) OR HORIZONTAL TABS (9)
                        if ((int) charArray[j] != 12 && (int) charArray[j] != 32 && (int) charArray[j] != 10 && (int) charArray[j] != 9)
                              currentScore += (int) charArray[j];

                  }

                  asciiValue[i] = currentScore;
                  p("String: " + unsorted[i] + " - " + asciiValue[i]);
             }

             return asciiValue;

       }

       // Sorts the ascii array and returns a sorted version
       public int[] bubbleSort(int[] unsortedInt) {

            int temp;

            for (int i = 0; i < unsortedInt.length; i++) {

                    // iterate trhough int array and swap adjacent values if neded
                   for (int j = 1; j < (unsortedInt.length - i); j++) {

                        // is the greater number to the left of the lesser number?
                        if (unsortedInt[j-1] > unsortedInt[j]) {
                              temp = unsortedInt[j-1];
                              unsortedInt[j-1] = unsortedInt[j];
                              unsortedInt[j] = temp;
                        }

                  }
            }

            return unsortedInt; // jokes on you, its actually sorted

       }


       // THe only purpose of this is so that I don't have to type System.out.println
       // over and over again
       public static void p (String message) {
             System.out.println(message);
       }


 }
