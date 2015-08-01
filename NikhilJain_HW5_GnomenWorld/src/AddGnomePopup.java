//import java.awt.Dimension;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
//	boolean display; // should display
	
	JLabel enterGnomeLabel = new JLabel("Enter name");
	
	JToggleButton busyButton; // gets input if gnome is busy or not
	
	JTextField enterGnomeName;
	String nameInput = "";
	
	public AddGnomePopup(VillageNode village) {
		
		this.village = village;
		enterGnomeName = new JTextField();
		busyButton = new JToggleButton("Not busy");
		
	} // end of constructor
	
	
	public void createAndShowGui() {
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				// set up popup
				popup.setLayout(null);
				popup.setBounds(100, 100, 400, 400);
				popup.setPreferredSize(new Dimension(400, 400));
				popup.setTitle("Add a gnome to Village #" + village.getNamed());
				
				
				// set up enterGnomeName
				enterGnomeName.setBounds(155, 30, 200, 35);
				enterGnomeName.setPreferredSize(new Dimension(100, 35));
				
				
				// set up label
				enterGnomeLabel.setBounds(50, 30, 150, 35);
				
				// setup busy button
				busyButton.setBounds(155, 80, 200, 35);
			    busyButton.addChangeListener(new ChangeListener() {
			        @Override
			        public void stateChanged(ChangeEvent event) {
			            if (busyButton.isSelected()){
			            	busyButton.setText("Busy");
			            } else {
			            	busyButton.setText("Not busy");
			            }
			        }
			    });
				// pack and ship to screen
				popup.add(enterGnomeName);
				popup.add(enterGnomeLabel);
				popup.add(busyButton);
				popup.setVisible(true);
				popup.pack();
								
			} // end of run
			
			
		}); // end of runnable
		
	} // end of create and show gui
	
	
}
