import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.Border;
public class SupermarketGui {
	
	static CashierQueue[] queueArray; // ARRAY That holds all 5 queue objects pertaining to each queue

	static PersonRemoverThread q1Remover;
	static PersonRemoverThread q2Remover;
	static PersonRemoverThread q3Remover;
	static PersonRemoverThread q4Remover;
	static PersonRemoverThread q5Remover;
	
	static JFrame frame; // holds panel
	JPanel panel; // holds all components (text boxes, etc)
	
	static JButton startSimulation; // kickstarts the whole program
	
	static JButton writeToFileBtn; // writes data to file (o rly) (ya rly)
	
	static JLabel disclaimer; // there is a bug in the program because of multithreading
	
	JLabel queue1Label; // 
	static JLabel queue1Speed; // cashier speed
	static JLabel queue1Length = new JLabel("<html><FONT COLOR=RED>RESTART</FONT></html>"); // length of q
	JScrollPane queue1ScrollPane; // holds the JTextArea and allows users to scroll through the members if necessary
	static JTextArea queue1Members = new JTextArea(); // people in queue 1
	static JButton joinQueue1; // a button to join queue 1
	
	
	
	JLabel queue2Label; // title
	static JLabel queue2Speed; // speed
	static JLabel queue2Length = new JLabel("<html><FONT COLOR=RED>RESTART</FONT></html>"); // length
	JScrollPane queue2ScrollPane; // holds JTextArea
	static JTextArea queue2Members = new JTextArea();
	static JButton joinQueue2;
	
	
	JLabel queue3Label; 
	static JLabel queue3Speed;
	static JLabel queue3Length = new JLabel("<html><FONT COLOR=RED>RESTART</FONT></html>");
	JScrollPane queue3ScrollPane;
	static JTextArea queue3Members = new JTextArea();
	static JButton joinQueue3;
	
	
	JLabel queue4Label;
	static JLabel queue4Speed;
	static JLabel queue4Length = new JLabel("<html><FONT COLOR=RED>RESTART</FONT></html>");
	JScrollPane queue4ScrollPane;
	static JTextArea queue4Members = new JTextArea();
	static JButton joinQueue4;
	
	
	JLabel queue5Label;
	static JLabel queue5Speed;
	static JLabel queue5Length = new JLabel("<html><FONT COLOR=RED>RESTART</FONT></html>");
	JScrollPane queue5ScrollPane;
	static JTextArea queue5Members = new JTextArea();
	static JButton joinQueue5;
	
	static int[] cashierSpeeds = new int[5]; // holds the speeds for the cashiers
	static int[] lengths = new int[5]; // lengths of queues (in terms of people)
	
	// make some random speeds for the cashiers
	// between 1 and 10 seconds
	public int generateRandomSpeeds() {
		
		int speed = (int) (9 * (Math.random()) + 1 );
		return speed;
		
	}
	
	// create and show the gui
	public void createAndShowGui () {
		
		/*Initialize all the JComponents*/
		
		// generate some random speeds, why don't you
		for (int i = 0; i < cashierSpeeds.length; i++) {
			cashierSpeeds[i] = generateRandomSpeeds();
		}
		
		// for wrigint ot g afile
		writeToFileBtn = new JButton("Output in File");
		writeToFileBtn.setBounds(1100, 100, 150, 40);
		writeToFileBtn.addActionListener(new OutputResultsButtonHandler());
//		writeToFileBtn.set
		
		// for starting a simulation, and resetting program
		startSimulation = new JButton();
		startSimulation.setBounds(1100, 25, 150, 40);
		startSimulation.setText("Run simulation");
		
		
		
		// disclaimer DONT NEED IT
		disclaimer = new JLabel("");
//				+ "There is a bug because of multithreading that makes the program stuck in an infinite loop.");
		/**
		 * TODO Fix the disclaimer por favor
		 * **/
		
		disclaimer.setBounds(1100, 50, 150, 400);
		
		// JFrame for holding panel
		frame = new JFrame("Nikhil's Grocery Queue");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the x button closes the window
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		// JPanel for holding all components
		panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		// Border (padding around edges)
		Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		
		
		
		
		// GUI Elements for Queue 1
		queue1Label = new JLabel(); // title
		
		queue1Label.setText("Queue 1");
		queue1Label.setBackground(Color.ORANGE);// TODO Change the color maybe
		queue1Label.setBorder(padding); // adds padding
		queue1Label.setBounds(20, 25, 80, 25); // sets position + size
		queue1Label.setOpaque(true); // paints every pixel in the specified region
		
		queue1Speed = new JLabel();
		queue1Speed.setText("Speed: " + cashierSpeeds[0]); 
		queue1Speed.setBounds(20, 65, 80, 25);
		// add cashier speed here
//		
//		queue1Length = new JLabel();
////		queue1Length.setText("Length: ");
		queue1Length.setBounds(20, 85, 80, 25);
		// make cashier object?
		
		
		// add the members to the scroll pane
		queue1Members.setVisible(true);
        queue1Members.setPreferredSize(new Dimension(140, 500));
        
        queue1ScrollPane = new JScrollPane(queue1Members, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		queue1ScrollPane.setBounds(15, 140, 140, 500);
		queue1ScrollPane.setVisible(true);
		
		joinQueue1 = new JButton("Join");
		joinQueue1.setBounds(15, 700, 140, 35);
//		joinQueue1.setEnabled(false); // TEST TEST TEST TEST TEST TEST TEST
		
		
		
		
		
		// GUI for Queue 2
		queue2Label = new JLabel("Queue 2");
		queue2Label.setBackground(Color.ORANGE);
		queue2Label.setBounds(250, 25, 80, 25);
		queue2Label.setOpaque(true);
		queue2Label.setBorder(padding);
		
		queue2Speed = new JLabel("Speed: " + cashierSpeeds[1]);
		queue2Speed.setBounds(250, 65, 80, 25);
		
//		queue2Length = new JLabel();
		queue2Length.setBounds(250, 85, 80, 25);
		
		// scroll pane code
//		queue2Members = new JTextArea("Test 2\nTest2\nTest2");
		queue2Members.setPreferredSize(new Dimension(140, 500));
		
		queue2ScrollPane = new JScrollPane(queue2Members, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		queue2ScrollPane.setBounds(245, 140, 140, 500);
		
		joinQueue2 = new JButton("Join");
		joinQueue2.setBounds(245, 700, 140, 35);
		
		
		
		
		
		// Gui for Queue 3
		queue3Label = new JLabel("Queue 3");
		queue3Label.setBackground(Color.ORANGE);
		queue3Label.setBounds(475, 25, 80, 25);
		queue3Label.setOpaque(true);
		queue3Label.setBorder(padding);
		
		queue3Speed = new JLabel("Speed: " + cashierSpeeds[2]);
		queue3Speed.setBounds(475, 65, 80, 25);
		
//		queue3Length = new JLabel();
		queue3Length.setBounds(475, 85, 80, 25);
		
		// scroll pane
//		queue3Members = new JTextArea("Queue 3 members");
		queue3Members.setPreferredSize(new Dimension(140, 500));
		
		queue3ScrollPane = new JScrollPane(queue3Members, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		queue3ScrollPane.setBounds(470, 140, 140, 500);
		
		joinQueue3 = new JButton("Join");
		joinQueue3.setBounds(470, 700, 140, 35);
		
		
		
		
		// GUI for Queue 4
		queue4Label = new JLabel("Queue 4");
		queue4Label.setBackground(Color.orange);
		queue4Label.setBounds(700, 25, 80, 25);
		queue4Label.setOpaque(true);
		queue4Label.setBorder(padding);
		
		queue4Speed = new JLabel("Speed: " + cashierSpeeds[2]);
		queue4Speed.setBounds(700, 65, 80, 25);
		
//		queue4Length = new JLabel();
		queue4Length.setBounds(700, 85, 80, 25);
		
		// scroll pane
//		queue4Members = new JTextArea("Q4\nq4");
		queue4Members.setPreferredSize(new Dimension(140, 500));
		
		queue4ScrollPane = new JScrollPane(queue4Members);
		queue4ScrollPane.setBounds(695, 140, 140, 500);
		
		
		joinQueue4 = new JButton("Join");
		joinQueue4.setBounds(695, 700, 140, 35);
		
		
		
		
		
		
		// GUI for Queue 5
		queue5Label = new JLabel("Queue 5");
		queue5Label.setBackground(Color.orange);
		queue5Label.setBounds(925, 25, 80, 25);
		queue5Label.setOpaque(true);
		queue5Label.setBorder(padding);
	
		queue5Speed = new JLabel("Speed: " + cashierSpeeds[4]);
		queue5Speed.setBounds(925, 65, 80, 25);
		
//		queue5Length = new JLabel();
		queue5Length.setBounds(925, 85, 80, 25);
		
		// scrol poaeenene
//		queue5Members = new JTextArea("Queueueueueueueueueue 5\nQueueueueueueueueueue 5\nQueueueueueueueueueue 5\nQueueueueueueueueueue 5\nQueueueueueueueueueue 5\n");
		queue5Members.setPreferredSize(new Dimension(140, 500));
		
		queue5ScrollPane = new JScrollPane(queue5Members);
		queue5ScrollPane.setBounds(920, 140, 140, 500);
		
		joinQueue5 = new JButton("Join");
		joinQueue5.setBounds(920, 700, 140, 35);
		
		
		
		
		// add all the components to the panel
		panel.add(queue1Label);
		panel.add(queue1Length);
		panel.add(queue1Speed);
		panel.add(queue1ScrollPane);
		panel.add(joinQueue1);
		
		panel.add(writeToFileBtn);
		
		panel.add(queue2Label);
		panel.add(queue2Length);
		panel.add(queue2Speed);
		panel.add(queue2ScrollPane);
		panel.add(joinQueue2);
		
		panel.add(queue3Label);
		panel.add(queue3Length);
		panel.add(queue3Speed);
		panel.add(queue3ScrollPane);
		panel.add(joinQueue3);
		
		panel.add(queue4Label);
		panel.add(queue4Length);
		panel.add(queue4Speed);
		panel.add(queue4ScrollPane);
		panel.add(joinQueue4);
		
		panel.add(queue5Label);
		panel.add(queue5Length);
		panel.add(queue5Speed);
		panel.add(queue5ScrollPane);
		panel.add(joinQueue5);
		
		panel.add(startSimulation);
		
//		panel.add(disclaimer);
		
		panel.setBorder(padding);
		
		// add the button listeners
		joinQueue1.addActionListener(new JoinQueueButtonListener());
		joinQueue2.addActionListener(new JoinQueueButtonListener());
		joinQueue3.addActionListener(new JoinQueueButtonListener());
		joinQueue4.addActionListener(new JoinQueueButtonListener());
		joinQueue5.addActionListener(new JoinQueueButtonListener());
		startSimulation.addActionListener(new StartSimulationButtonListener());
		
		
		// add the panel to the frame
		frame.add(panel);
		
		
		// finalize and display to screen
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	
	/*
	 * 
	 * Unfortunately, the main function is here.
	 * 
	 * I would have much rather had it in Main.java, 
	 * but whenever I access a GUI element from there, 
	 * I get a nullpointerexception.
	 * 
	 * Additionally, some project setting in eclipse
	 * set this to have the main method and gives me
	 * an error whenever I move it.
	 * 
	 * oh well
	 * 
	 */
	
	public static void main(String[] args) {
		
		// display a warning
		JOptionPane.showMessageDialog(frame, "Hello and welcome to Nikhil's Grocery Queue Simulator!\n"
				+ "\nBefore you begin, please read the following information."
				+ "\nIf the program has red labels that say RESTART, you may need to restart the program several times."
				+ "\nThis issue and others that may pop up are due to multithreading, and while they should not occur often, if they do occur, they do several times in a row."
				+ "\n\nThanks for reading!", 
				"An Important Message", 2, null);
		
		// call the "initialize" method
			// it sets up the gui
			// randomly populates the queues
		
		queueArray = Main.initialize();
		
		
		// initialize the JTextAreas with the proper data
		// Also, set the proper speeds for each queue
		// the speeds were randomly generated in the createGuiAndDisplay() function
		for (int i = 0; i < queueArray.length; i++) {
			
			displayNamesOnGui(queueArray[i], i + 1);
			queueArray[i].setRate(cashierSpeeds[i]);
			
			lengths[i] = queueArray[i].getLength();
			
			System.out.println("LENGTHS: " + lengths[i] + " - i: " + i);
			
			displayLengthsOnGui(i);
			
			
		}
		
		
		
		
		// Create a new thread for each queue
		// Depending on its speed, it will remove elements from the queue
		// When it is finished, it will calculate the time it took to finish
		
		q1Remover = new PersonRemoverThread(cashierSpeeds[0], queueArray[0], 1);
		q2Remover = new PersonRemoverThread(cashierSpeeds[1], queueArray[1], 2);
		q3Remover = new PersonRemoverThread(cashierSpeeds[2], queueArray[2], 3);
		q4Remover = new PersonRemoverThread(cashierSpeeds[3], queueArray[3], 4);
		q5Remover = new PersonRemoverThread(cashierSpeeds[4], queueArray[4], 5);
		
		// Display the speeds on the appropriate JLabels

		for (CashierQueue q : queueArray) {
			System.out.println("Cashier speed: " + q.getRate());
		}
		
		// Removed for now
//		
//		queue1Speed.setText("Rate: " + queueArray[0].getRate() + " sec");
//		queue2Speed.setText("Rate: " + queueArray[1].getRate() + " sec");
//		queue3Speed.setText("Rate: " + queueArray[2].getRate() + " sec");
//		queue4Speed.setText("Rate: " + queueArray[3].getRate() + " sec");
//		queue5Speed.setText("Rate: " + queueArray[4].getRate() + " sec");
		
		// Start removing people from the threads
//		startRemovalThreads();
		
	}
	
	
	// display the lengths of the queues on the gui labels
	public static void displayLengthsOnGui(int whichQueue) {
		
		switch (whichQueue) {

		case 0:
			queue1Length.setText("Length: " + lengths[0]);
			break;

		case 1:
			queue2Length.setText("Length: " + lengths[1]);
			break;

		case 2:
			queue3Length.setText("Length: " + lengths[2]);
			break;

		case 3:
			queue4Length.setText("Length: " + lengths[3]);
			break;

		case 4:
			queue5Length.setText("Length: " + lengths[4]);
			break;

		
		}
		
	}
	
	
	
	// Start up the threads
	public static void startRemovalThreads() {
		
		// start the threads
		q1Remover.start();
		q2Remover.start();
		q3Remover.start();
		q4Remover.start();
		q5Remover.start();
		
	}
	

//	// make a popup which displays the results
//	// called by OutputResultsButtonHandler class
//	public static void displaySpeedResults() {
//		
//		// get the length back
//		int[] lengths = new int[5]; 
//		lengths[0] = q1Remover.getTotalLength();
//		lengths[1] = q2Remover.getTotalLength();
//		lengths[2] = q3Remover.getTotalLength();
//		lengths[3] = q4Remover.getTotalLength();
//		lengths[4] = q5Remover.getTotalLength();
//	
//		// make a popup for test
//		JOptionPane.showMessageDialog(frame, "Queue 1 took " + lengths[0] + " seconds."
//				+ "\nQueue 2 took " + lengths[1] + " seconds. "
//				+ "\nQueue 3 took " + lengths[2] + " seconds. "
//				+ "\nQueue 4 took " + lengths[3] + " seconds. "
//				+ "\nQueue 5 took " + lengths[4] + " seconds. ");
//	}
	
	
	
	// prints the names from the queueArray to the JTextArea
	public static void displayNamesOnGui(CashierQueue q, int whichQueue) {
		
		// max possible length is 11, and add a few for good luck
		String[] names = new String[14];
		
		// initialize the names array
		for (int i = 0; i < names.length; i++) 
			names[i] = "";
		
		// copy over the actual values from the queue
		int index = 0;
		for (QueueIterator j = new QueueIterator(q.getFront()); !j.atEnd(); j.plusPlus()) {
			
			names[index] = j.getCurrent().getName();
			System.out.println("Names array " + index + " " + names[index]);
			index++;
			
		}
		
		/*** 
		 * That line of code screwed up the program, since the last person was being duplicated
		 * 
		 * ***/
		// don't forget about the back! 
		//names[index] = q.getBack().getName();
		
		
		// move data from names array to the JTextArea
		StringBuilder appendinator = new StringBuilder(); // to appendinate strings together
		
		String setTextStr = ""; // to be passed to the JTextArea
		for (int i = 0; i < names.length; i++) {
			appendinator.append(names[i] + "\n");
		}
		
		setTextStr = appendinator.toString();
		
//		System.out.println("\nValue of setTextStr:\n" + setTextStr);
		
		// now, the data is stored in the String setText
		// transfer it to the JTextArea
		switch (whichQueue) {
		
		case 1:
			queue1Members.setText(setTextStr);
			break;
			
		case 2:
			queue2Members.setText(setTextStr);
			break;
			
		case 3:
			queue3Members.setText(setTextStr);
			break;
			
		case 4:
			queue4Members.setText(setTextStr);
			break;
			
		case 5:
			queue5Members.setText(setTextStr);
			break;
		
		}
		
		
		
	} // end of "displayNamesOnGui"
	
	
	
	
	

} // end of class

















// eof
// rip