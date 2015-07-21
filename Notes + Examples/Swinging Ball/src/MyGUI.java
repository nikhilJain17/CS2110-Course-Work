
// Where the ball will be displayed

import java.awt.*;
import javax.swing.*;

public class MyGUI {
	
	private JFrame frame = new JFrame();
	private JPanel actionPanel = new JPanel();
	private JPanel playArea = new JPanel();
	private JButton addBallButton = new JButton("Add Red Ball");
	private JButton moveBallButton = new JButton("Move The Ball");
	
	public MyGUI() {
		buildTheGui();
	}
	
	public void buildTheGui() {
		
		frame.setLayout(new BorderLayout());
		
	}

}
