import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.Border;
public class SupermarketGui {
	JFrame frame; // holds panel
	JPanel panel; // holds all components (text boxes, etc)
	
	JButton startSimulation; // kickstarts the whole program
	
	JLabel disclaimer; // there is a bug in the program because of multithreading
	
	JLabel queue1Label; // 
	JLabel queue1Speed; // cashier speed
	JLabel queue1Length; // length of q
	JScrollPane queue1ScrollPane; // holds the JTextArea and allows users to scroll through the members if necessary
	JTextArea queue1Members; // people in queue 1
	JButton joinQueue1; // a button to join queue 1
	
	
	
	JLabel queue2Label; // title
	JLabel queue2Speed; // speed
	JLabel queue2Length; // length
	JScrollPane queue2ScrollPane; // holds JTextArea
	JTextArea queue2Members;
	JButton joinQueue2;
	
	
	JLabel queue3Label; 
	JLabel queue3Speed;
	JLabel queue3Length;
	JScrollPane queue3ScrollPane;
	JTextArea queue3Members;
	JButton joinQueue3;
	
	
	JLabel queue4Label;
	JLabel queue4Speed;
	JLabel queue4Length;
	JScrollPane queue4ScrollPane;
	JTextArea queue4Members;
	JButton joinQueue4;
	
	
	JLabel queue5Label;
	JLabel queue5Speed;
	JLabel queue5Length;
	JScrollPane queue5ScrollPane;
	JTextArea queue5Members;
	JButton joinQueue5;
	
	
	public void createAndShowGui () {
		
		// for starting a simulation, and resetting program
		startSimulation = new JButton();
		startSimulation.setBounds(1100, 25, 150, 40);
		startSimulation.setText("Run simulation");
		
		// disclaimer
		disclaimer = new JLabel("If your computer's fan goes crazy or the program doesn't work, try restarting this program.\n"
				+ "There is a bug because of multithreading that makes the program stuck in an infinite loop.");
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
		queue1Speed.setText("Speed: "); // + (int) Math.floor((10 * Math.random())));
		queue1Speed.setBounds(20, 65, 80, 25);
		// add cashier speed here
		
		queue1Length = new JLabel();
		queue1Length.setText("Length: ");
		queue1Length.setBounds(20, 85, 80, 25);
		// make cashier object?
		
		
		// add the members to the scroll pane
		queue1Members = new JTextArea("TEST");
		queue1Members.setText("Nobody");
		queue1Members.setVisible(true);
        queue1Members.setPreferredSize(new Dimension(140, 500));
        
        queue1ScrollPane = new JScrollPane(queue1Members, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		queue1ScrollPane.setBounds(15, 140, 140, 500);
		queue1ScrollPane.setVisible(true);
		
		joinQueue1 = new JButton("Join");
		joinQueue1.setBounds(15, 700, 140, 35);
		joinQueue1.setEnabled(false); // TEST TEST TEST TEST TEST TEST TEST
		
		
		
		
		
		// Labels for Queue 2
		queue2Label = new JLabel("Queue 2");
		queue2Label.setBackground(Color.ORANGE);
		queue2Label.setBounds(250, 25, 80, 25);
		queue2Label.setOpaque(true);
		queue2Label.setBorder(padding);
		
		queue2Speed = new JLabel("Speed: ");
		queue2Speed.setBounds(250, 65, 80, 25);
		
		queue2Length = new JLabel("Length: ");
		queue2Length.setBounds(250, 85, 80, 25);
		
		// scroll pane code
		queue2Members = new JTextArea("Test 2\nTest2\nTest2");
		queue2Members.setPreferredSize(new Dimension(140, 500));
		
		queue2ScrollPane = new JScrollPane(queue2Members, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		queue2ScrollPane.setBounds(245, 140, 140, 500);
		
		joinQueue2 = new JButton("Join");
		joinQueue2.setBounds(245, 700, 140, 35);
		
		
		
		
		
		// Labels for Queue 3
		queue3Label = new JLabel("Queue 3");
		queue3Label.setBackground(Color.ORANGE);
		queue3Label.setBounds(475, 25, 80, 25);
		queue3Label.setOpaque(true);
		queue3Label.setBorder(padding);
		
		queue3Speed = new JLabel("Speed: ");
		queue3Speed.setBounds(475, 65, 80, 25);
		
		queue3Length = new JLabel("Length: ");
		queue3Length.setBounds(475, 85, 80, 25);
		
		// scroll pane
		queue3Members = new JTextArea("Queue 3 members");
		queue3Members.setPreferredSize(new Dimension(140, 500));
		
		queue3ScrollPane = new JScrollPane(queue3Members, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		queue3ScrollPane.setBounds(470, 140, 140, 500);
		
		joinQueue3 = new JButton("Join");
		joinQueue3.setBounds(470, 700, 140, 35);
		
		
		
		
		// Labels for Queue 4
		queue4Label = new JLabel("Queue 4");
		queue4Label.setBackground(Color.orange);
		queue4Label.setBounds(700, 25, 80, 25);
		queue4Label.setOpaque(true);
		queue4Label.setBorder(padding);
		
		queue4Speed = new JLabel("Speed: ");
		queue4Speed.setBounds(700, 65, 80, 25);
		
		queue4Length = new JLabel("Length: ");
		queue4Length.setBounds(700, 85, 80, 25);
		
		// scroll pane
		queue4Members = new JTextArea("Q4\nq4");
		queue4Members.setPreferredSize(new Dimension(140, 500));
		
		queue4ScrollPane = new JScrollPane(queue4Members);
		queue4ScrollPane.setBounds(695, 140, 140, 500);
		
		
		joinQueue4 = new JButton("Join");
		joinQueue4.setBounds(695, 700, 140, 35);
		
		
		
		
		
		
		// Labels for Queue 5
		queue5Label = new JLabel("Queue 5");
		queue5Label.setBackground(Color.orange);
		queue5Label.setBounds(925, 25, 80, 25);
		queue5Label.setOpaque(true);
		queue5Label.setBorder(padding);
	
		queue5Speed = new JLabel("Speed: ");
		queue5Speed.setBounds(925, 65, 80, 25);
		
		queue5Length = new JLabel("Length: ");
		queue5Length.setBounds(925, 85, 80, 25);
		
		// scrol poaeenene
		queue5Members = new JTextArea("Queueueueueueueueueue 5\nQueueueueueueueueueue 5\nQueueueueueueueueueue 5\nQueueueueueueueueueue 5\nQueueueueueueueueueue 5\n");
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
		
		panel.add(disclaimer);
		
		
		panel.setBorder(padding);
		
		// add the panel to the frame
		frame.add(panel);
		
		
		// finalize and display to screen
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		// call the "initialize" method
			// it sets up the gui
			// randomly populates the queues
		
		Main.initialize();
		
	}
	
	

}
