package question6;

public class VehicleTest {

	public static void main(String[] args) {
		
		System.out.println("Question 6 - OUTPUT");
		System.out.println("***************************");
		
		Vehicle v = new Vehicle();
		System.out.println("Access Super Class Data with Super Class object");
		System.out.println("===============================");
		
		v.setMake("Honda");
		v.setModel("Civic");
		v.setYear("2022");
		v.setPrice(35000);
		v.getDescription();
		System.out.println();
		
		Car c = new Car();
		
		System.out.println("Access Super Class Data with Car Sub Class object");
		System.out.println("===============================");
		
		
		c.setMake("Toyota");
		c.setModel("Camry");
		c.setYear("2023");
		c.setPrice(39000);
		c.getMake();
		c.setCarType("Base");
		c.setNumDoors(4);
		c.getDescription();
		System.out.println();
		
		
		
		Truck t = new Truck();
		System.out.println("Access Super Class Data with Truck Sub Class object");
		System.out.println("===============================");
		
		t.setMake("Toyota");
		t.setModel("Corolla");
		t.setYear("2023");
		t.setPrice(40000);
		t.setNoOfWheels(18);
		t.setLoadCapacity(5000);
		t.getDescription();
	
	}

}
