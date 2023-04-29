package question6;

public class Vehicle {
	
	private String make;
	private String model;
	private String year;
	private double price;
	
	
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	
	
	public void getDescription()
	{
		System.out.println("Made By:"+getMake());
    	System.out.println("Model: "+getModel());
    	System.out.println("Year of Manufacturing:" +getYear());
    	System.out.println("Price:"+getPrice());
	}

}
