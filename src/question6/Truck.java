package question6;

public class Truck extends Vehicle {
	
	private int loadCapacity;
	private int noOfWheels;
	
	
	public int getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	
	public void getDescription()
	{
		
    	System.out.println("Loading Capacity: "+getLoadCapacity()+" lbs");
    	System.out.println("Number of Wheels: "+getNoOfWheels());
    	
    	
	}
}
