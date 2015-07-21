
// Where the ball will be displayed

import java.awt.*;
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

}
