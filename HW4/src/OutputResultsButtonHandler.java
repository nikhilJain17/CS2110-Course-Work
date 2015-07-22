import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;


// button handler for outputting results

public class OutputResultsButtonHandler implements ActionListener {

	@Override
	public void actionPerformed (ActionEvent e) {
		
		// popup to ALERT user
		JOptionPane.showMessageDialog(SupermarketGui.frame, "Data stored in nikhiloutputs.txt", "Døn't read this", 2, null);
		
		// calculate time lengths
		int[] times = new int[5];
		
		for (int i = 0; i < times.length; i++) {
			
			times[i] = SupermarketGui.cashierSpeeds[i] * SupermarketGui.lengths[i];
			System.out.println(times[0] + "    <- time");
			
		}
		
		try {
			FileOutputStream pipe = new FileOutputStream("nikhiloutputs.txt");
			PrintWriter write = new PrintWriter(pipe, true);
			
			write.println("+++++++++++++++");
			write.println("+   Stats     +");
			write.println("+++++++++++++++\n");
			write.println("\n    Queue 1    ");
			write.println("----------------");
			write.println("Time: " + times[0]);
			write.println("Length: " + SupermarketGui.lengths[0]);
			write.println("Rate: " + SupermarketGui.cashierSpeeds[0]);
			

			write.println("\n    Queue 2    ");
			write.println("----------------");
			write.println("Time: " + times[1]);
			write.println("Length: " + SupermarketGui.lengths[1]);
			write.println("Rate: " + SupermarketGui.cashierSpeeds[1]);

			write.println("\n    Queue 3    ");
			write.println("----------------");
			write.println("Time: " + times[2]);
			write.println("Length: " + SupermarketGui.lengths[2]);
			write.println("Rate: " + SupermarketGui.cashierSpeeds[2]);

			write.println("\n    Queue 4    ");
			write.println("----------------");
			write.println("Time: " + times[4]);
			write.println("Length: " + SupermarketGui.lengths[4]);
			write.println("Rate: " + SupermarketGui.cashierSpeeds[4]);

			write.println("\n    Queue 5    ");
			write.println("----------------");
			write.println("Time: " + times[4]);
			write.println("Length: " + SupermarketGui.lengths[4]);
			write.println("Rate: " + SupermarketGui.cashierSpeeds[4]);
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	// output to file
		
		
		
		
		
	} // end of actionPerformed
	
	
	
	
	
	
} // end of classs
