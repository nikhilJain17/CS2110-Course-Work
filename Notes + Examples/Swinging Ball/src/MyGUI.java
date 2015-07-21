
// Where the ball will be displayed
// Contains the main method

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyGUI {
	
	private JFrame frame = new JFrame();
	private JPanel actionPanel = new JPanel(); // where the buttons are
	private JPanel playArea = new JPanel();    // where the ball is
	private JButton addBallButton = new JButton("Add Red Ball");
	private JButton moveBallButton = new JButton("Move The Ball");
	
	public MyGUI() {
		buildTheGui();
	}
	
	public void buildTheGui() {
		
		frame.setLayout(new BorderLayout());
		
		// Set the button listeners
		addBallButton.addActionListener(new AddBallButtonHandler());
		moveBallButton.addActionListener(new MoveBallButtonHandler());
		
		// add the components 
		actionPanel.add(addBallButton);
		actionPanel.add(moveBallButton);
		
		frame.add(BorderLayout.NORTH, actionPanel);
		frame.add(BorderLayout.SOUTH, playArea);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}
	
	
	// main method, run the program
	public static void main(String[] args) {
		
		new MyGUI();
		
	}
	
	
	/*************************************************************************
	 * Button Listeners														 *
	 *************************************************************************/
	class AddBallButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			// Create initial ball to add
//			frame.add(new Ball());
			
			// draw
//			frame.invalidate();
			
		}
		
	}
	
	// move the ball
	class MoveBallButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			
			
		}
		
	}

}
