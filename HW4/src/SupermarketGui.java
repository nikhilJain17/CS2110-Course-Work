import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
import javax.swing.border.Border;
public class SupermarketGui {
	JFrame frame; // holds panel
	JPanel panel; // holds all components (text boxes, etc)
	
	JLabel queue1Label; // 
	JLabel queue1Speed; // cashier speed
	JLabel queue1Length; // length of q
	
	JLabel queue2Label; // title
	JLabel queue2Speed; // speed
	JLabel queue2Length; // length
	
	/*
	 * 
	 * TODO ADD SOME FANCY PICTURES OF A GROCERY STORE!
	 * MAKE IT LOOK LIKE A GROCERY STORE!
	 * 
	 */
	
	
	public void createAndShowGui () {
		
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
		
		// Labels for Queue 1
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
		
		// each person will be represented by an x
		
		/*
		 * x
		 * x
		 * x
		 * x
		 * x
		 */
		 
		
		
		
		
		
		// add all the components to the panel
		panel.add(queue1Label);
		panel.add(queue1Length);
		panel.add(queue1Speed);
		
		panel.add(queue2Label);
		panel.add(queue2Length);
		panel.add(queue2Speed);
		
		panel.add(queue2Label);
		
		panel.setBorder(padding);
		
		// add the panel to the frame
		frame.add(panel);
		
		
		// finalize and display to screen
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SupermarketGui gui = new SupermarketGui();
				gui.createAndShowGui();
			}
			
		});
		
	}
	
	

}
