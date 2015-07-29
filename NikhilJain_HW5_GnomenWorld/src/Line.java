import java.awt.Graphics;


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

public class Line {
	
	int x1, x2, y1, y2;
	
	public Line(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	// Draw the line
	public void paint(Graphics g) {
        g.drawLine(this.x1, this.y1, this.x2, this.y2);
    }

}
