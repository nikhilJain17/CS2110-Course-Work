import java.awt.*;

import javax.swing.*;


/**
 * 
 * This class is used to draw lines onto the JPanel
 * 
 * Each path connecting a village is a line.
 * 
 * This class is only the visual representation of that.
 * 
 * @author Nick
 *
 */

public class Line extends JComponent {
	
	int x1, x2, y1, y2;
	
	public Line(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	// Draw the line
	public void paint(Graphics g) {
		
		final int OFFSET = 25; // to draw in middle of button
		
        System.out.println(this.x1 + ", " + this.y1 + "--" + this.x2 + ", " + this.y2);

        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.BLACK);
        
        BasicStroke smoothStroke = new BasicStroke(25, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
//        smoothStroke.
        g2.setStroke(smoothStroke);
        
        
        // draw a thick black line as the border
        g2.drawLine(x1 + OFFSET, y1 + OFFSET, x2 + OFFSET, y2 + OFFSET);
        
        
        // make a road in the middle
        g2.setColor(Color.CYAN);
        BasicStroke thinStroke = new BasicStroke((float) 20);
        g2.setStroke(thinStroke);
        
        
         int BORDEROFFSET = 0;
//        
//        if (y1 - y2 > 150 && y1 - y2 < 300)
//        	g2.setColor(Color.orange);
        // draw a line above and below to make it appear like a border
        g2.drawLine(x1 - BORDEROFFSET + OFFSET, y1 - BORDEROFFSET + OFFSET, x2 - BORDEROFFSET + OFFSET, y2 - BORDEROFFSET + OFFSET);
        g2.drawLine(x1 + BORDEROFFSET + OFFSET, y1 + BORDEROFFSET + OFFSET, x2 + BORDEROFFSET + OFFSET, y2 + BORDEROFFSET + OFFSET);
        
//        System.out.println(this.x1 + ", " + this.y1 + "--" + this.x2 + ", " + this.y2);
    }

}
