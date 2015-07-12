
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
             unsorted[sortThisQueue.getLength()] = sortThisQueue.getBack().getCustomer().getName();

       }

 }
