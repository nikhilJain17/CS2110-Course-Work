
// Launchpoint of the program


public class Main {
	
	public static void initialize() {
		
		// This block of code initializes the GUI on a new thread
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SupermarketGui gui = new SupermarketGui();
				gui.createAndShowGui();
			}
			
		});
		
		
		// randomly generate people to populate queues
		randomlyPopulatePeople();
		
		
		
	}
	
	public static void randomlyPopulatePeople() {
		
		CashierQueue queue1 = new CashierQueue();
		// add people here
		// TESTING HERE
		queue1.joinQueue("Adam");
		queue1.joinQueue("jakov");
		queue1.joinQueue("jorge");
		
		
		for (QueueIterator i = new QueueIterator(queue1.getFront()); !i.atEnd(); i.plusPlus()) {
			
			System.out.println(i.getCurrent().getName());
		}
		
		// dont forget about the back
		System.out.println(queue1.getBack().getName());
		
		
		
	}
	
	
}
