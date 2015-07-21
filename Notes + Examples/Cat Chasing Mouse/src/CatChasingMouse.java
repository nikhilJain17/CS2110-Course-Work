// main class

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;

public class CatChasingMouse {
	
	public static void main (String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run () {
				createAndShowGui();
			}
			
		});
		
	}
	
	private static void createAndShowGui() {
		System.out.println("Created GUI on EDT? " + SwingUtilities.isEventDispatchThread());
		
		JFrame frame = new JFrame ("Cat Chasing Mouse");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MyPanel());
		frame.setSize(250, 250);
		frame.setVisible(true);
		
	}
	
} // end of CatChasingMouse

	class MyPanel extends JPanel {
		
		RedSquare redSquare = new RedSquare() ;
		
		public MyPanel() {
			setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			addMouseListener (new MouseAdapter() {
				public void mousePressed (MouseEvent e) {
					moveSquare(e.getX(), e.getY());
				}
			}); // end of mouse listener
		
			
			addMouseMotionListener (new MouseAdapter() {
				
				public void mouseDragged(MouseEvent e) {
					moveSquare(e.getX(), e.getY());
				}
			});
			
			
		} // end of constructor
		
		
		private void moveSquare(int x, int y) {
			
			// current state square, to avoid repeat invocations of same method
			final int CURR_X = redSquare.getX();
	        final int CURR_Y = redSquare.getY();
	        final int CURR_W = redSquare.getWidth();
	        final int CURR_H = redSquare.getHeight();
	        final int OFFSET = 1; // how much to move
	        
	        
	        if ((CURR_X != x) || (CURR_Y != y)) {
	        	// square is moving, repaint background over old square location
	        	repaint(CURR_X, CURR_Y, CURR_W + OFFSET, CURR_H + OFFSET);
	        	
	        	// update coordinates
	        	redSquare.setX(x);
	        	redSquare.setY(y);
	        	
	        	// repaint the square at its new location
	        	repaint(redSquare.getX(), redSquare.getY(), 
	        			redSquare.getWidth() + OFFSET, redSquare.getHeight() + OFFSET);
	        	
	        	
	        	
	        } // end of if
			
		} // end of movesquare
		
		public Dimension getPreferredSize() {
	        return new Dimension(250,200);
	    }
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Custom Panel", 10, 20);
			
			redSquare.paintSquare(g);
		}
			
		
} // end of MyPanel
	
	class RedSquare {
		
		private int xPos = 50;
		private int yPos = 50;
		private int width = 20;
		private int height = 20;
		
		public void setX(int xPos){ 
	        this.xPos = xPos;
	    }

	    public int getX(){
	        return xPos;
	    }

	    public void setY(int yPos){
	        this.yPos = yPos;
	    }

	    public int getY(){
	        return yPos;
	    }

	    public int getWidth(){
	        return width;
	    } 

	    public int getHeight(){
	        return height;
	    }
	    
	    public void paintSquare(Graphics g) {
	    	g.setColor(Color.red);
	    	g.fillRect(xPos,yPos,width,height);
	        g.setColor(Color.BLACK);
	        g.drawRect(xPos,yPos,width,height);
	    }
	    
		
	} // end of RedSquare


