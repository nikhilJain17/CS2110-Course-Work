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
	boolean lazy; // does he want to take the shortest path or nahhhhh
	VillageNode currentVillage;
	
	public Gnome(String name, boolean lazy, VillageNode currentVillage) {
		
		this.name = name;
		this.lazy = lazy;
		this.currentVillage = currentVillage;
		
	} // end of constructor
	
	
	// getters and setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLazy(boolean lazy) {
		this.lazy = lazy;
	}
	
	public boolean getLazy() {
		return lazy;
	}
	
	public void setCurrentVillage(VillageNode currentVillage) {
		this.currentVillage = currentVillage;
	}
	
	public VillageNode getCurrentVillage() {
		return currentVillage;
	}
	
}
