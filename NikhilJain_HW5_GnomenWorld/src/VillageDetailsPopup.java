import java.awt.*;

import javax.swing.*;

/***
 * 
 * This class creates a popup message that displays details about each village
 * @author Nick
 *
 */

public class VillageDetailsPopup {
	
	JDialog dialogBox; // the actual pane that holds the goodies
	String title;
	VillageNode village; // which village this popup pertains to
	JLabel numberOfGnomes;
	
	public VillageDetailsPopup(VillageNode village) {
		
		this.village = village;
		
		dialogBox = new JDialog();
		title = "Village #" + village.getNamed();
		
		// set up the look of this dialog box
		createAndShowGui();
		
	} // end of constructor
	
	
	
	private void createAndShowGui() {
		
		
		// absolute layout 
		dialogBox.setLayout(null); 
		
		
		// set up the dialog box
		dialogBox.setBounds(500, 100, 400, 400);
		dialogBox.setPreferredSize(new Dimension(400, 400));
		dialogBox.setTitle(title);
		dialogBox.setBackground(Color.YELLOW);
		
		
		
//		gridLayout.addLayoutComponent("numberOfGnomes", numberOfGnomes);
		
		dialogBox.setVisible(true);

		
	} // end of createAndShowGui

}
