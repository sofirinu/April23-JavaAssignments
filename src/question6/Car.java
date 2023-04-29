package question6;

public class Car extends Vehicle{
	
	private int numDoors;
	private String carType;
	
	public int getNumDoors() {
		return numDoors;
	}
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	
	
	public void getDescription()
	{
		System.out.println("Car Type:"+getCarType());
    	System.out.println("Number of Doors: "+getNumDoors());
    	
	}

}
