//noah snell
package csce247.assignments.template;

public abstract class House {
	public final void buildHouse() {
		prepFoundation();
		createFrame();
		installDrywall();
		addWindows();
		addElectrical();
		addPlumbing();
	}
	/**
	 * calls all the methods required to create a house
	 */
	public abstract void createFrame();
	/**
	 * abstract method to create frame since frame is different for each type of house
	 */
	
	public void prepFoundation() {
		System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
	}
	/**
	 * method for creating foundation to any house
	 */
	
	public void addWindows(){
		System.out.println("Windows: Putting in the glass for the windows.");
	}
	/**
	 * method for adding windows to any house
	 */
	
	public void installDrywall() {
		System.out.println("Drywall: Creating the interior walls.");
	}
	/**
	 * method for installing dry wall to any house
	 */
	
	public void addElectrical() {
		System.out.println("Electrical: Running all the wires and hooking up the power.");
	}
	/**
	 * method for adding electrical to any house
	 */
	
	public void addPlumbing() {
		System.out.println("Plumbing: Letting water run throug the house.");
	}
	/**
	 * method for adding plumbing to any house
	 */
		
	
}
