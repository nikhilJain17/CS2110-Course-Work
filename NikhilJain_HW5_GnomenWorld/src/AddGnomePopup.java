//import java.awt.Dimension;
import java.awt.*;

import javax.swing.*;

/***
 * 
 * 
 * Popup to add a gnome
 * 
 * @author Nick
 *
 */
public class AddGnomePopup {

	JDialog popup = new JDialog();
	VillageNode village;
	boolean display; // should display
	
	public AddGnomePopup(VillageNode village) {
		
		this.village = village;
		
//		EventQueue.invokeLater(new Runnable() {
//
//			@Override
//			public void run() {
//				if (display)
//					createAndShowGui();
//			}
//			
//		});
		
	} // end of constructor
	
	
	public void createAndShowGui() {
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				popup.setBounds(100, 100, 400, 400);
				popup.setPreferredSize(new Dimension(400, 400));
				popup.setTitle("Add a gnome to village " + village.getNamed());
				
				
				
				
				popup.setVisible(true);
				popup.pack();
								
			} // end of run
			
			
		}); // end of runnable
		
	} // end of create and show gui
	
	
}
