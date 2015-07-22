
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

// Ball Class

public class Ball extends JPanel{

	private int x, y, width, height, speedX, speedY;
	
	// default to go forwards
	boolean goForwards = true;
	
	public Ball () {
		
		x = 100;
		y = 100;
		width = 50;
		height = 50;
		
		// used as delay factor in threads
		speedX = 5;
		speedY = 5;
		
	}
	
	public Ball (int a) {
		
		Random rand = new Random();
//		
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
	
	// paint ball
	public void paintBall(Graphics g) {
		
		g.drawOval(x, y, width, height);
		
	}
	
	
	// move the ball forwards, check if it crashes into wall, move it backwards
	public void moveBall() throws InterruptedException {
		
		
		// check if it crashes into wall
		if (x == 500 - width || y == 500 - 2 * height) {
			
			// set it going backwards
			goForwards = false;
		}
		
		if (x == 0 || y == 0) {
			
			goForwards = true;
			
		}
		
		// move the ball in the horizontal direction
		Thread.sleep(speedX);
		
		if (goForwards) x++;
		if (!goForwards) x--;
		
		// move the ball in the vertical direction
		Thread.sleep(speedY);
		if (goForwards) y++;
		if (!goForwards) y--;
		
		// log the coordinates
		System.out.println(x + ", " + y);
		
		repaint(x,y,width, height);
	}
	
	
	
	
	
}
