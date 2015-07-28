import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;
import javax.swing.border.BevelBorder;

/***
 * 
 * This class is the DisplayGraphGui.
 * 
 * It displays the main screen of the program, which has the graph as well as 2 buttons for adding
 * and deleting villages.
 * 
 * You can click on each village for more options.
 * 
 * @author Nick
 *
 */
public class DisplayGraphGui {
	
	JFrame frame; // main frame that holds everything
	
	/* All the components inside the graphPanel go here */
	JPanel graphPanel; // panel that only holds the graph
	List<VillageNode> villageNodeList = new ArrayList<VillageNode>();
	
	
	/* All the components inside the actionPanel go here */
	JPanel actionPanel; // panel that holds buttons for adding and deleting villages
	
	
	
	
	public DisplayGraphGui() {
		
		// initialize all the JComponents
		frame = new JFrame();
		frame.setTitle("Nikhil's GnomenWorld Simulator");
//		frame.setBounds(0, 0, 1400, 1000);
		frame.setPreferredSize(new Dimension(1000, 1000));
		frame.setBackground(Color.yellow);
		
		graphPanel = new JPanel();
		graphPanel.setBounds(0, 0, 1000, 1000);
		graphPanel.setPreferredSize(new Dimension(800, 1000));
		graphPanel.setVisible(true);
		graphPanel.setBackground(Color.GREEN);
		
		
		actionPanel = new JPanel();
//		actionPanel.setBounds(1030, 10, 200, frame.getHeight() - 10);
		actionPanel.setPreferredSize(new Dimension(200, 1000));
		actionPanel.setVisible(true);
		actionPanel.setBackground(Color.WHITE);
		actionPanel.setBorder(BorderFactory.createTitledBorder("Options"));
		
		
		/***
		 * Testing the VillageNode buttons
		 */
		
		VillageNode testNode = new VillageNode(1, null, null);
		testNode.setBounds(50, 50, 100, 100);
		testNode.setPreferredSize(new Dimension(100, 100));
		graphPanel.add(testNode);
		
		
		intializeVillage();
		
		
		// see below for what it does
		packageComponents();
		
	} // end of constructor
	
	
	
	// Adds, displays, and sets everything visible
	private void packageComponents() {
		
		
		
		// Smooth resizing
		frame.add(graphPanel);
		frame.add(actionPanel, BorderLayout.EAST);
		
		
		frame.setVisible(true);
		frame.pack();
		
	} // end of packageComponents()
	
	// TODO Finish this method
//	// initialize the graphPanel with a network of villages
	public VillageNode[] intializeVillage() {
		
		/***
		 * TODO Set the Main.VillageNodeList as the array
		 */
		
		// initialize each village, start off with no gnomes.
		
		VillageNode[] villageArray = new VillageNode[10];
		villageArray[0] = null; // DON'T USE VILLAGE #0 - IT DOESN'T EXIST!!!
		
		// empty gnome array to use for initializing VillageNodes
		Gnome[] emptyGnomeArray = new Gnome[1];
		emptyGnomeArray[0] = new Gnome("EMPTY", false, null);
		
		
		// initialize with name and empty gnome array
		for (int i = 1; i < villageArray.length; i++) {
			villageArray[i] = new VillageNode(i, null, emptyGnomeArray);
		}
		
		
		// Set up the adjacency lists 
		
		

		// make the adjacency list for Village 1
		List<VillageNode> adjacencyList1 = new ArrayList<VillageNode>();
		adjacencyList1.add(villageArray[2]);
		adjacencyList1.add(villageArray[4]);
		villageArray[1].setAdjacencyList(adjacencyList1);
		
		// make the adjacency list for Village 2
		List<VillageNode> adjacencyList2 = new ArrayList<VillageNode>();
		adjacencyList2.add(villageArray[1]);
		adjacencyList2.add(villageArray[3]);
		adjacencyList2.add(villageArray[6]);
		villageArray[2].setAdjacencyList(adjacencyList2);
		
		// make the adjacency list for Village 3
		List<VillageNode> adjacencyList3 = new ArrayList<VillageNode>();
		adjacencyList3.add(villageArray[2]);
		adjacencyList3.add(villageArray[6]);
		villageArray[3].setAdjacencyList(adjacencyList3);
		
		/*TEST*/
		List<VillageNode> testList = villageArray[1].getAdjacencyList();
		
		
		// Printing stuff for debugging
		for (VillageNode testV : testList) {
			System.out.println("Adjacent to " + testV.getNamed());
		}
		
		
		// set Main.villageList to this cheese
		
		return villageArray;
		
		
		
	} // end of initializeVillage
	

} // end of class
