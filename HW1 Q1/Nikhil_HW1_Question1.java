/**
 * The Assignment:
 *
 * Write a program which will offer two ways to handle data to be analysed; the data being a collection of numbers (doubles).
 * The 'analysis' will comprise finding the max and the min of the collection of numbers, as well as the mean* and the standard deviation
 * The first way of gathering the data should invite the user to type in numbers at the keyboard once the program has been started,
 * with the 'typing' of an empty string or the typing of a non-number being used to terminate the list of numbers.
 * The second choice to be provided should ask the user for the name of a file to be read from, this file containing a space
 * separated list of 'doubles' spread over several lines. When the program starts, it should ask the user if they'd prefer to type in
 * data or give the name of a file holding the data, and then run accordingly. In both cases the answer should be displayed on the screen,
 * though an option should be provided to write the analysis data to a file whose name has also been asked for by the program.
 * (The goal here is to develop a program for data anaylsis of large files, so the 'first case' is just a way of encouraging you to start simply!)

You should now see if you can improve your program so that it can give you more insight into the data being analysed (e.g., how uniform is it? how wild are the outliers (if any)? etc.).
Use your imagination here to build something potentially useful, and ask questions if unsure what to do.

* The mean, m, of a list of numbers, (a1, a2, a3, ..., an), is the average, ie   m = (a1 + a2 + ... + an) / n ; and the standard deviation, s, is the square root of the average of the squares of the differences between the numbers and the mean, ie   s = sqrt[ ( (a1 - m)^2 + (a2 - m)^2 + ... + (an - m)^2 ) / n ] . (Note that there is some variation in the stats community about whether to divide by n or (n-1) when computing the standard deviation. This arises perhaps since dividing by n fits within the whole theory of moments, which puts things like means, std devs, skewness, kurtosis, etc in a consistent framework, whereas dividing by (n-1) reflects nicely the numbers of degrees of freedom, which fits well within sampling theory. Since there are good arguments for adopting each version, we'll adopt the division by n version simply to aim for consistency of answers within the course.)


 */

/**
 * @author Nikhil Jain
 * 
 * Homework #1 Question 1
 * 
 *
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.math.*;

public class Nikhil_HW1_Question1 {

	static ArrayList<Double> inputtedNumbers = new ArrayList<Double>();

	public static void main(String[] args) throws Exception {

		int input = whichMethodOfInput(); // File or Fingers?

		// If the user insists on being incorrect
		while (input == -1) {
			input = whichMethodOfInput();
		}

		// Keyboard selected
		if (input == 1) {
			inputFromKeyboard();

		}
		
		// File selected
		else if (input == 0) {
			inputFromFile();
			
			// Display the numbers that the user entered: 
			System.out.println("These are the numbers you entered: ");
			for (int i = 0; i < inputtedNumbers.size(); i++) {
				System.out.println(inputtedNumbers.get(i));
			}
					
		}
		
		// Now that we have the data, we need to calculate the mean
		double returnedMean = findMean(inputtedNumbers, false);
		System.out.println("Mean: " + returnedMean);
		
		// Now we need to calculate the standard deviation
		// NOTE: The standard deviation is the mean of all the sqrts of the differences
		// Therefore we can reuse the findMean() function
		// but first we need to find the sqrtDifferences for the standard deviation
		double standardDeviation = findStandardDeviation(inputtedNumbers, returnedMean);
		
		System.out.println("Standard Deviation with n: " + standardDeviation + "\n");
		
		showScatterPlot(inputtedNumbers);
		
		// output to file
		System.out.println("The results have also been outputted to a file called NikhilHW1.txt");
		outputToFile(standardDeviation, returnedMean, inputtedNumbers);


	} // end of main
	
	public static void outputToFile(double standardDeviation, double mean, ArrayList inputs) throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream("NikhilHW1.txt");
		PrintWriter printWriter = new PrintWriter(fileOutputStream, true);
		
		// formatting for file
		printWriter.println("Inputted Numbers");
		printWriter.println("----------------");
		
		// output all the doubles entered by the user
		for (int i = 0; i < inputs.size(); i++) {
			
			printWriter.println(inputs.get(i));
			
		}
		
		// output the standard deviation and the mean
		printWriter.println("Standard Deviation: " + standardDeviation);
		printWriter.println("Mean: " + mean);
		
		fileOutputStream.close();
		
	} // end of method
	
	
	
	
	
	public static void showScatterPlot(ArrayList inputs) {
		
		Collections.sort(inputs); // sort from lowest to highest
		
		int[] freq = new int[inputs.size()];
		
		ArrayList<Integer> frequencies = new ArrayList<Integer>(inputs.size());
		
		// initialize frequencies to zero
		for (int i = 0; i < frequencies.size(); i++) {
			frequencies.add(0);
			freq[i] = 0;
		}
		
		double min = (double) inputs.get(0);
		double max = (double) inputs.get(inputs.size() - 1); 
		
		System.out.println("Number | Frequency");
		System.out.println("------------------");
		
		// get the frequencies for each number from min to max
		
		// hold first number in array
		// check every single value in array to see if it equals the held number
		// if so, increment the frequency variable
		// else, continue
		// repeat this process for all numbers in array (from min to max)
		
		double compare;
	
		for (int i = 0; i < inputs.size(); i++) {
			compare = (double) inputs.get(i);
			
			for (int j = 0; j < inputs.size(); j++) {
			
				if ((double) inputs.get(j) == compare) {
					freq[i] = freq[i] + 1;
					
				}
			}
			
		}
		
		
		// Display in number form
		for (int i = 0; i < inputs.size(); i++) {
			System.out.println(inputs.get(i) + "    |    " + freq[i]);
		}
		
		System.out.println("______________________________________");
		
		// Display in a scatter plot
		
		for (int i = 0; i < inputs.size(); i++) {
			
			System.out.print(inputs.get(i) + "    |    ");
		
			for (int j = 0; j < freq[i]; j++) {
				System.out.print("x");
			}
			System.out.println(""); // new line
		
		
		}
		
		////////////////////////////////////////////
		// frequency table						////
		////////////////////////////////////////////

		System.out.println("______________________________________");
		
		int frequencyCounter = 0;		
		for (double bin = Math.floor(min - 1); bin <=max; bin++) {
			
			for (int i = 0; i < inputs.size(); i++) {
				
				if (((double) inputs.get(i) >= bin) && ((double) inputs.get(i) < (bin + 1))) {
					
					frequencyCounter++;
					
				}
				
				//System.out.println("checking between: " + bin + " and " + (bin + 1) + " freq: " + frequencyCounter);

			}
			
			System.out.println("Numbers from " + (bin) + " to " + (bin + 1) + ": " + frequencyCounter);
			System.out.println("----------------------------------");
			frequencyCounter = 0;
		}
		
		
	} // end of method
	
	
	
	
	
	public static double findStandardDeviation(ArrayList inputs, double mean) {
		
		// first, construct an arraylist of all the differences to the mean squared
		// then, pass that arraylist into findMean to find average of all differences
		// finally, find the sqrt of that
		
		ArrayList<Double> differences = new ArrayList();
		
		for (int i = 0; i < inputs.size(); i++) {
			
			//double diff = Math.abs((double) inputs.get(i) - mean); // find the absolute value of each difference, otherwise it will ALWAYS be 0!
			
			// without abs
			double diff = (double) inputs.get(i) - mean;
			
			diff = diff * diff; // square diff
			differences.add(diff);
			
		}
		
		double controversialStandardDeviation = Math.sqrt(findMean(differences, false)); // divided by n-1
		System.out.println("Standard Deviation with n-1: " + controversialStandardDeviation);
		
		double standardDeviation = Math.sqrt(findMean(differences, true)); // divided by n
		return standardDeviation;
		
	} // end of method

	
	
	
	
	public static double findMean(ArrayList inputs, boolean divideByNminusOne) {
		
		double mean = 0;
		double numerator = 0; // running sum of the total values of the inputs (if 4,5,6 is entered, this equals 4+5+6 or 15)
		double denominator = 0; // number of doubles in list (if 4,5,6 is entered, this equals 3)
		
		denominator = inputs.size();
		
		// calculate the total sum of all the numbers inputted
		for (int i = 0; i < inputs.size(); i++) {
			numerator += (double) inputs.get(i);
		}
		
		if (divideByNminusOne == false) {
			mean = numerator / denominator;
		}
		
		else {
			// for calculating the standard deviation with n-1
			mean = numerator / (denominator - 1);
		}
		
		return mean;
	
	} // end of method
	
	

	
	
	public static void inputFromFile() {
		
		try {
			String line = "";
			String[] splitLine;
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Please provide the CORRECT path/filename of your file: ");
			String filePath = br.readLine();
			
			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			// Detects end of file
			if ((line = bufferedReader.readLine()) != null) {
				
				splitLine = line.split(" ");
				double num;
			
				for (int i = 0; i < splitLine.length; i++) {
					
//					System.out.println(" d " + splitLine[i]);
					
					num = Double.parseDouble(splitLine[i]);
					
					if (isInputDouble(splitLine[i])) {
						// If the input is valid, then
						// add to master array
						inputtedNumbers.add(num);
					}
				}
			}
			
			fileReader.close();
		}
		
		catch (Exception e) {
			System.out.println("No file to read from in that path - ABORT ABORT ABORT!");
		}
		
	}

	
	
	
	
	public static void inputFromKeyboard() {

		boolean inputIsDouble = true;
		String line = "";

		System.out.println("Enter the doubles, separated by a RETURN, and terminate the list with a character");

		do {
			// input
			// SHould probably make this into a function of its own
			try {
				InputStreamReader read = new InputStreamReader(System.in);
				BufferedReader grab = new BufferedReader(read);
				line = grab.readLine();
			}

			catch(IOException e) {
				e.printStackTrace();
				// @TODO Exit from program here / restart program?
			}

			inputIsDouble = isInputDouble(line);

			if (inputIsDouble) {
				
				// input into arraylist
				inputtedNumbers.add(Double.parseDouble(line));
				
			}


		}
		while (inputIsDouble); // if not double, end the input stream

		System.out.println("You chose to stop entering inputs.\n");

	} // end of inputFromKeyboard




	public static boolean isInputDouble (String input) {
		try {
			Double.parseDouble(input);
		}
		catch (NumberFormatException e) {
			return false; // Exception thrown = String, boolean, etc
		}
		return true; // If the exception is not thrown, then String input is a double

	} // end of isInputDouble




	public static int whichMethodOfInput() {

		int input = -1; // silly init value to catch errors
		System.out.println("Press 1 to input from keyboard and 0 to input from file: ");

		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader grab = new BufferedReader(reader);

		try {
			input = Integer.parseInt(grab.readLine());
		}
		catch (IOException e) {
			e.printStackTrace();

		}


		if (input == 1) {
			System.out.println("You selected keyboard.");

		}

		else if (input == 0) {
			System.out.println("You selected file.");

		}

		else {
			System.out.println("Invalid input");
			input = -1; // Sentinel value if anything goes wrong
		}

		return input;

	} // end of whichMethodOfInput();






} // end of class
