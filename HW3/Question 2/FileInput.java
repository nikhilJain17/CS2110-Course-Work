// The purpose of this class is to input the user data from a file
// It must be separated by EITHER a space OR a newline character
import java.io.*;
import java.util.ArrayList; // see explanation below or in readme for using arraylists

class FileInput {

      String[] names;
      String fileName;

      public FileInput(String setFileName) {
            this.fileName = setFileName;
      }

      public String[] getNamesFromFile () throws Exception {

            // Only used because coming up with a size for the
            // String array "names" was becoming a pain in the neck
            // Before, I had to pass over the whole file twice
            // Once, to get the number of elements
            // Then I set that as the size of names
            // Next, I passed over again to get the actual data
            // This way is 1000x easier
            // cause now i dont have to do that
            ArrayList<String> data = new ArrayList<String>();

            try {
                  FileReader filePipe = new FileReader(fileName);
                  BufferedReader fileReader = new BufferedReader(filePipe);

                  // first have a string that holds 1 line at a time
                  // this separates each "\n"
                  // then just do .split(" ")

                  String line = "";
                  String[] tempStorage; // temporary stored in here until moved to String[] names
                  // Detects end of file, also reads in a line

                  while ((line = fileReader.readLine()) != null) {


                        // // Split by spaces
                        tempStorage = line.split(" ");

                        // copy all the strings from tempStorage to data
                        for (int i = 0; i < tempStorage.length; i++) {
                              data.add(tempStorage[i]);
                        }

                        // p(line);
                        // data.add(line);

                  }


            }
            catch (FileNotFoundException e) {
                  p("Sorry, the file was not found. Check your spelling again.");
            }

            names = new String[data.size()];
            // convert to array[]
            for (int i = 0; i < data.size(); i++) {
                  names[i] = data.get(i);
            }

            return names;
      }

      // The only purpose of this is so that I dont have to type out system.out.println
      public static void p(String message) {
            System.out.println(message);
      }

}
