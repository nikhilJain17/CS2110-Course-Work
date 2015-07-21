
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

// Ball Class

public class Ball extends JPanel{

	private int x, y, width, height;
	
	public Ball () {
		
		x = 100;
		y = 100;
		width = 50;
		height = 50;
		
	}
	
	public Ball (int a) {
		
		Random rand = new Random();
		
		width = 50;
		height = 50;
		x = rand.nextInt(450);
		y = rand.nextInt(450);
		
	}
	
	// draw the ball
	@Override
	public void paintComponent(Graphics g) {
		
	    super.paintComponent(g);
	    g.setColor(Color.RED);
	    g.fillOval(x, y, height, width); 
	    
	}
	
	
	
	
	
}
