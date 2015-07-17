import javax.swing.*;
public class SupermarketGui {
	JFrame frame;
	JLabel label;
	
	public void createAndShowGui () {
		frame = new JFrame("Nikhil's Grocery Queue");
		label = new JLabel();
		label.setText("Hello World");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(label);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SupermarketGui gui = new SupermarketGui();
				gui.createAndShowGui();
			}
			
		});
		
	}
	
	

}
