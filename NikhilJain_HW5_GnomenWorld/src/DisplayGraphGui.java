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
		graphPanel.setLayout(null); // use absolute layout - only x and y coordinates
		
		
		actionPanel = new JPanel();
//		actionPanel.setBounds(1030, 10, 200, frame.getHeight() - 10);
		actionPanel.setPreferredSize(new Dimension(200, 1000));
		actionPanel.setVisible(true);
		actionPanel.setBackground(Color.WHITE);
		actionPanel.setBorder(BorderFactory.createTitledBorder("Options"));
		
		
		/***
		 * Display the initial 9 buttons/villages
		 */
		
		
		// set up the initial 9 villages
		intializeVillage();
		
		
		
		// set the size for each button
		for (int i = 1; i < villageNodeList.size(); i++) {
			
			villageNodeList.get(i).setPreferredSize(new Dimension(25, 25));
			
			// randomly set the position
			int x = (int) (800 * Math.random());
			int y = (int) (800 * Math.random());
			
			villageNodeList.get(i).setBounds(x, y, 25, 25);
			villageNodeList.get(i).setAlignmentX(x);
			villageNodeList.get(i).setAlignmentY(y);
			
			System.out.println(x + ", " + y);
			
//			 set the colour
//			villageNodeList.get(i).setBackground(Color.getColor("00DDFF", Color.blue));
			
			graphPanel.add(villageNodeList.get(i));
			
		}
		
		
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
		
		List<VillageNode> adjacencyList = new ArrayList<VillageNode>();

		// make the adjacency list for Village 1
		List<VillageNode> adjacencyList1 = new ArrayList<VillageNode>();
		adjacencyList1.add(villageArray[2]);
		adjacencyList1.add(villageArray[4]);
		villageArray[1].setAdjacencyList(adjacencyList1);
		
		// make the adjacency list for Village 2
		List<VillageNode> adjacencyList2 = new ArrayList<VillageNode>();
		adjacencyList.clear();
		adjacencyList2.add(villageArray[1]);
		adjacencyList2.add(villageArray[3]);
		adjacencyList2.add(villageArray[6]);
		villageArray[2].setAdjacencyList(adjacencyList2);
		
		// make the adjacency list for Village 3
		List<VillageNode> adjacencyList3 = new ArrayList<VillageNode>();
		adjacencyList.clear();
		adjacencyList3.add(villageArray[2]);
		adjacencyList3.add(villageArray[6]);
		villageArray[3].setAdjacencyList(adjacencyList3);
		
		// make the adjacency list for Village 4
		List<VillageNode> adjacencyList4 = new ArrayList<VillageNode>();
		adjacencyList.clear();
		adjacencyList4.add(villageArray[1]);
		adjacencyList4.add(villageArray[7]);
		adjacencyList4.add(villageArray[5]);
		villageArray[4].setAdjacencyList(adjacencyList4);
		
		// make the adjacency list for Village 5
		List<VillageNode> adjacencyList5 = new ArrayList<VillageNode>();
		adjacencyList.clear();
		adjacencyList5.add(villageArray[4]);
		adjacencyList5.add(villageArray[7]);
		adjacencyList5.add(villageArray[8]);
		adjacencyList5.add(villageArray[9]);
		adjacencyList5.add(villageArray[6]);
		villageArray[5].setAdjacencyList(adjacencyList5);
		
		// make the adjacency list for Village 6
		List<VillageNode> adjacencyList6 = new ArrayList<VillageNode>();
		adjacencyList.clear();
		adjacencyList6.add(villageArray[2]);
		adjacencyList6.add(villageArray[3]);
		adjacencyList6.add(villageArray[5]);
		villageArray[6].setAdjacencyList(adjacencyList6);
		
		// make the adjacency list for Village 7
		List<VillageNode> adjacencyList7 = new ArrayList<VillageNode>();
		adjacencyList.clear();
		adjacencyList7.add(villageArray[4]);
		adjacencyList7.add(villageArray[5]);
		adjacencyList7.add(villageArray[8]);
		villageArray[7].setAdjacencyList(adjacencyList7);
		
		// make the adjacency list for Village 8
		List<VillageNode> adjacencyList8 = new ArrayList<VillageNode>();
		adjacencyList.clear();
		adjacencyList8.add(villageArray[5]);
		adjacencyList8.add(villageArray[7]);
		villageArray[8].setAdjacencyList(adjacencyList8);
		
		// make the adjacency list for Village 9
		List<VillageNode> adjacencyList9 = new ArrayList<VillageNode>();
		adjacencyList.clear();
		adjacencyList9.add(villageArray[5]);
		villageArray[9].setAdjacencyList(adjacencyList9);
		
		
		
		/*TEST*/
//		for (int i = 1; i < 10; i++) {
//			
//			List<VillageNode> testAdj = villageArray[i].getAdjacencyList();
//			System.out.println("\n" + i + "-th Village\n");
//			
//			for (VillageNode v : testAdj) {
//				System.out.println("Adj: " + v.getNamed());
//			}
//			
//		}
		
		// set villageNodeList from here to be that
		this.villageNodeList.add(0, null);
		
		for (int i = 1; i < 10; i++) {
			this.villageNodeList.add(i, villageArray[i]);
			
//			System.out.println(villageNodeList.size());
			
		}
		
		
		return villageArray;
		
		
		
	} // end of initializeVillage
	

} // end of class
