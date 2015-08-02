/***
 * 
 * Gnome class
 * 
 * Having fun isn't hard when you've got a gnome!
 * 
 * @author Nick
 *
 */

public class Gnome {
	
	String name;
	boolean busy; // does he want to take the shortest path or nahhhhh
	VillageNode currentVillage;
	
	public Gnome(String name, boolean busy, VillageNode currentVillage) {
		
		this.name = name;
		this.busy = busy;
		this.currentVillage = currentVillage;
		
	} // end of constructor
	
	
	// getters and setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLazy(boolean busy) {
		this.busy = busy;
	}
	
	public boolean getBusy() {
		return busy;
	}
	
	public void setCurrentVillage(VillageNode currentVillage) {
		this.currentVillage = currentVillage;
	}
	
	public VillageNode getCurrentVillage() {
		return currentVillage;
	}
	
}
