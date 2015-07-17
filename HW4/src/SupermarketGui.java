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
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		// Border (padding around edges)
		Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		
		// Labels for Queue 1
		queue1Label = new JLabel(); // title
		
		queue1Label.setText("Queue 1");
		queue1Label.setBackground(Color.GREEN);// TODO Change the color maybe
		queue1Label.setBorder(padding); // adds padding
		queue1Label.setBounds(10, 25, 80, 25); // sets position + size
		queue1Label.setOpaque(true); // paints every pixel in the specified region
		
		queue1Speed = new JLabel();
		queue1Speed.setText("Speed: ");
		
		
		
		
		
		// add all the components to the panel
		panel.add(queue1Label);
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
