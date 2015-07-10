// The purpose of this class is to input the user data from a file
// It must be separated by EITHER a space OR a newline character
import java.io.*;

class FileInput {

      String[] names;
      String fileName;

      public FileInput(String setFileName) {
            this.fileName = setFileName;
      }

      public String[] getNamesFromFile () throws Exception {

            try {
                  FileReader filePipe = new FileReader(fileName);
                  BufferedReader fileReader = new BufferedReader(filePipe);

                  // first have a string that holds 1 line at a time
                  // this separates each "\n"
                  // then just do .split(" ")

                  String line;
                  String[] tempStorage; // temporary stored in here until moved to String[] names
                  int numberOfElements = 0;
                  // Detects end of file
                  while (fileReader.readLine() != null) {

                        // Split by newline characters
                        line = fileReader.readLine();
                        // Split by spaces
                        tempStorage = line.split("s");
                        // increment the number of elements
                        // this tells us what size to make the array
                        // since we are not allowed to use ArrayLists
                        numberOfElements++;

                        // test if splitting worked
                        for (int i = 0; i < tempStorage.length; i++) {
                              p(tempStorage[i]);
                        }

                  }

                  // Now, do the same thing
                  // But this time, copy into the names array
                  // This is necessary because the first pass got the size
                  // ArrayLists would solve this problem



            }
            catch (FileNotFoundException e) {
                  p("Sorry, the file was not found. Check your spelling again.");
            }

            return null;
      }

      // The only purpose of this is so that I dont have to type out system.out.println
      public static void p(String message) {
            System.out.println(message);
      }

}
