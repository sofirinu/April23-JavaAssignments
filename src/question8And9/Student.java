package question8And9;

public class Student {
	
	public String firstName;
	public String middleName;
	public String lastName;
	public String suffix;

	public static void main(String[] args) {

		System.out.println("Question 8 - OUTPUT");
		System.out.println("***************************");

		Displayname("John","Mart");
		System.out.println();
		Displayname("John","Mike","Mart");	
		System.out.println();
		Displayname("John","Mike","Mart","Jr.");	
		System.out.println();
		Displayname("John",'I');	
		System.out.println();


	}

	

	static void  Displayname(String firstName, String lastName)
	{  
		System.out.println("Method 1:");
		System.out.println("=======================================");
		System.out.println("Name of Student: "+firstName+" "+lastName);
	}

	static void  Displayname(String firstName, String middileName, String lastName)
	{
		System.out.println("Method 2:");
		System.out.println("=======================================");
		System.out.println("Name of Student: "+firstName+" "+middileName+" "+lastName);
	}


	

	static void Displayname(String firstName, String middileName, String lastName, String suffix)
	{
		System.out.println("Method 3:");
		System.out.println("=======================================");
		System.out.println("Name of Student :"+firstName+" "+middileName+" "+lastName+" "+suffix);
	}	
	
	static void Displayname(String firstName, char suffix)
	{  
		System.out.println("Method 4:");
		System.out.println("=======================================");
		System.out.println("Name of Student: "+firstName+" "+suffix);
	}
}
