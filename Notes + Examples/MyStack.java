import java.io.*;

/*
* 0 is the bottom item of the stack
*
*/

public class MyStack {

  int maxLength = -1;
  int currentSizeOfStack = 0;
  int[] stackItems;

  MyStack(int sizeInput) {
    maxLength = sizeInput;
    stackItems = new int[maxLength];

    // initialize the array with all 0's
    for (int i = 0; i < maxLength; i++) {
      stackItems[i] = 0;
    }

  }

  public void push(int itemToBePushed) {

    // does it stretch the limits of the stack?
    if (currentSizeOfStack + 1 <= maxLength) { // no, it doesn't

      stackItems[currentSizeOfStack] = itemToBePushed;
      currentSizeOfStack++;

    }
    else {  // yes, it does
      System.out.println("\nSorry, not enough space in stack.");
    }

    return;

  }


  public int pop() {

    if (stackItems[currentSizeOfStack - 1] > 0) { // 0 = deleted

      int returnThis = stackItems[currentSizeOfStack - 1];
      stackItems[currentSizeOfStack - 1] = 0; // "delete" the item, or just set it to 0

      currentSizeOfStack--;

      return returnThis;

    }

    return 0;
  }

  public void displayStack() {

    System.out.println("\ni" + "|" + "value");
    System.out.println("---------");

    for (int i = 0; i < maxLength; i++) {
      System.out.println(i + "|" + stackItems[i]);
    }
    return;
  }


  public static void main(String[] args) throws Exception {

    PrintWriter writer = new PrintWriter(System.out, true);
    writer.println("Enter the size of the stack: ");

    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader grab = new BufferedReader(reader);
    int sizeOfStack = Integer.parseInt(grab.readLine());
    writer.println("Your stack is " + sizeOfStack + " elements long.");

    // Create the stack
    MyStack mStack = new MyStack(sizeOfStack);

    // infinite input/output
    while(true) {
      writer.println("\n1 for push, 0 for pop: ");
      int input = Integer.parseInt(grab.readLine());

      if (input == 1) {
        // User wants to push
        writer.println("\nWhat do you want to push?");
        int wantToPush = Integer.parseInt(grab.readLine());
        mStack.push(wantToPush);

        mStack.displayStack();
      }

      else {
        // User wants to pop
        mStack.displayStack();

        int popped = mStack.pop();
        writer.println("\nPopped number: " + popped);
      }


    }



  }



}
