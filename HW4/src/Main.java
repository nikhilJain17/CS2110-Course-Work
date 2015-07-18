
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
		
		CashierQueue queue1 = new CashierQueue();
		CashierQueue queue2 = new CashierQueue();
		CashierQueue queue3 = new CashierQueue();
		CashierQueue queue4 = new CashierQueue();
		CashierQueue queue5 = new CashierQueue();
		
		
		initializeQueue(queue1);
		initializeQueue(queue2);
		initializeQueue(queue3);
		initializeQueue(queue4);
		initializeQueue(queue5);
		
		
		System.out.println("\nQueue 1 Members: \n");
		queue1.displayQueueMembers();

		System.out.println("\nQueue 2 Members: \n");
		queue2.displayQueueMembers();

		System.out.println("\nQueue 3 Members: \n");
		queue3.displayQueueMembers();

		System.out.println("\nQueue 4 Members: \n");
		queue4.displayQueueMembers();

		System.out.println("\nQueue 5 Members: \n");
		queue5.displayQueueMembers();
		
		
		
		
	}
	
	public static void initializeQueue(CashierQueue q) {
		
		
		// Randomly choose how many people there will be, from 1 to 10 people
		int numOfPeople = (int) Math.floor(Math.random() * 10);
		
		// don't want 0 people in the queue
		if (numOfPeople == 0)
			numOfPeople++;
		
		
		for (int i = 0; i < numOfPeople; i++) {
			
			// Randomly choose a name to add to the queue
			int whichPerson = (int) Math.floor(Math.random() * 20);
			System.out.println(whichPerson);
			
			// cases are from 0 - 1
			switch (whichPerson) {
				
				case 0:
					q.joinQueue("Fred");
					break;
					
				case 1:
					q.joinQueue("Melanie");
					break;
					
				case 2:
					q.joinQueue("Paolo");
					break;
					
				case 3:
					q.joinQueue("Humphrey");
					break;
					
				case 4:
					q.joinQueue("Kevin");
					break;
					
				case 5:
					q.joinQueue("Russell");
					break;
					
				case 6:
					q.joinQueue("James");
					break;
					
				case 7:
					q.joinQueue("Darren");
					break;
					
				case 8:
					q.joinQueue("Stephanie");
					break;
					
				case 9:
					q.joinQueue("Roland");
					break;
					
				case 10:
					q.joinQueue("Allen");
					break;
					
				case 11:
					q.joinQueue("Michael");
					break;
					
				case 12:
					q.joinQueue("Mitch");
					break;
					
				case 13:
					q.joinQueue("Danilo");
					break;
					
				case 14:
					q.joinQueue("Rob");
					break;
					
				case 15:
					q.joinQueue("Brandon");
					break;
					
				case 16:
					q.joinQueue("Samantha");
					break;
					
				case 17:
					q.joinQueue("Jabez");
					break;
					
				case 18:
					q.joinQueue("Victoria");
					break;
					
				case 19:
					q.joinQueue("Patrick");
					break;
					
					
				default:
					q.joinQueue("Lea");
					break;
			
			}
			
		}
		
		
		
		
	}
	
	
	
	
}
