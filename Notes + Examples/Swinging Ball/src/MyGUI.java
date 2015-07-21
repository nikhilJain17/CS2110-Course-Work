
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
	private JButton freeRoamButton = new JButton("Set The Ball Rolling");
	
	public MyGUI() {
		buildTheGui();
	}
	
	public void buildTheGui() {
		
		frame.setLayout(new BorderLayout());
		
		// Set the button listeners
		addBallButton.addActionListener(new AddBallButtonHandler());
		moveBallButton.addActionListener(new MoveBallButtonHandler());
		freeRoamButton.addActionListener(new FreeRoamButtonHandler());
		
		// add the components 
		actionPanel.add(addBallButton);
		actionPanel.add(moveBallButton);
		actionPanel.add(freeRoamButton);
		
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
	// add a ball to the canvas
	class AddBallButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			// Create initial ball to add
			frame.add(new Ball());
			
			// draw
			frame.invalidate();
			
		}
		
	}// end of addballhandler
	
	
	
	
	// move the ball to a new random position
	class MoveBallButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			// cheese
			 frame.add(new Ball(1) );
		        //redraw
		     frame.validate();
			
		}
		
	} // end of moveball handler
	
	
	// Set the ball into freeroam
	class FreeRoamButtonHandler implements ActionListener {
		
		public void actionPerformed (ActionEvent e) {
			
			Ball ball = new Ball();
			
			frame.add(ball);
			frame.validate();
			
			// set the ball rolling
			while (true) {
			
				// redraw the ball
				frame.validate();
				
				
				try {
					ball.moveBall();
				} 
				
				catch (InterruptedException e1) {
					e1.printStackTrace();
				} 
				
				
				
			} // end of while
			
		} // end of actionperformed
		
	}// end of button handler

} // end of class MyGUI
