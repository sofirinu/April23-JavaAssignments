package question8And9;

public class Area {
 public int length;
 public int breadth;
 public int side;
 public int radius;
 public double pie = 3.14;
 
 
	public static void main(String[] args) {
		
		System.out.println("Question 9 - OUTPUT");
		System.out.println("***************************");

		
		Area a = new Area();
		a.rectArea(4, 5);
		a.rectArea(4.55, 5.25);
		a.squareArea(5);
		a.squareArea(5.75);
		a.circArea(4);
		a.circArea(4.52);
		

	}
	
	public void rectArea(int length, int breadth)
	{
		int rectArea = length*breadth;
		System.out.println("Length:"+length);
		System.out.println("Breadth:"+breadth);
		System.out.println("Area of rectangle: "+rectArea);
		System.out.println();
		
	}
	
	public void squareArea(int side)
	{
	
	int squareArea = side*side;
	System.out.println("Side length:"+side);
	System.out.println("Area of square: "+squareArea);
	System.out.println();
	}
	
	
	
	public void circArea(int radius)
	{
	
	double circArea = pie*radius*radius;
	System.out.println("Radius:"+radius);
	System.out.println("Area of circle: "+circArea);
	System.out.println();
	
	}

	
	
	public double rectArea(double length, double breadth)
	{
		double rectarea = length*breadth;
		System.out.println("Length:"+length);
		System.out.println("Breadth:"+breadth);
		System.out.println("Area of rectangle: "+rectarea);
		System.out.println();
		return rectarea;
	}
	
	
	
	public double squareArea(double side)
	{
	
	double squareArea = side*side;
	System.out.println("Side length:"+side);
	System.out.println("Area of square: "+squareArea);
	System.out.println();
	return squareArea;
	}
	
	

	public double circArea(double radius)
	{
	
	double circArea = pie*radius*radius;
	System.out.println("Radius:"+radius);
	System.out.println("Area of circle: "+circArea);
	System.out.println();
	return circArea;
	}


}
