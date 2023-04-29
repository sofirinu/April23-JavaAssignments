package arrayQuestions;

public class CheckSpecificValue {

	public static void main(String[] args) {

		System.out.println("Question 4 - OUTPUT");
		System.out.println("***************************");

		readArray(5);
		checkArraySpecificValue("Audi");
		System.out.println();
		checkArraySpecificValue("Jeep");

	}


	
	  public static void readArray(int length)
	  { 
	String[] cars = {"BMW","Ford","Honda","Audi","Acura"};
	  
	  System.out.println("Array elements:"); System.out.println(); for(int i=0;
	  i<length;i++)
	  
	  {
	  
	  System.out.print(cars[i]+"  ");
	  
	  }
	  
	  System.out.println(); System.out.println(); }
	 


	public static void checkArraySpecificValue(String value)
	{
		String[] cars  = {"BMW","Ford","Honda","Audi","Acura"};
		boolean check = false;
		int i;

		for(i=0; i<cars.length;i++)

		{
			
			if (cars[i] == value) {
				check = true;
				break;
			}
			
		}

		if(check)
			System.out.println("Value "+value + " is found in the array at index "+i);
		else
			System.out.println("Value "+value + " is not found in the array");


	}	





}



