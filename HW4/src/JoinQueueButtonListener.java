import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Button Listener for Join Queue button


public class JoinQueueButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(SupermarketGui.joinQueue1))
			SupermarketGui.disclaimer.setText("Button 1");
		
		else if (e.getSource().equals(SupermarketGui.joinQueue2))
			SupermarketGui.disclaimer.setText("Button 2");
		
		else if (e.getSource().equals(SupermarketGui.joinQueue3))
			SupermarketGui.disclaimer.setText("Button 3");

		else if (e.getSource().equals(SupermarketGui.joinQueue4))
			SupermarketGui.disclaimer.setText("Button 4");
		
		else if (e.getSource().equals(SupermarketGui.joinQueue5))
			SupermarketGui.disclaimer.setText("Button 5");
		
	}
	

}
