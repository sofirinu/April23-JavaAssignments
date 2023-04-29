package arrayQuestions;

public class Print2DStringArray {

	public static void main(String[] args) {

		System.out.println("Question 3 - OUTPUT");
		System.out.println("***************************");

		Print2DArray();

	}


	public static void Print2DArray()
	{

		int rows = 4;
		int cols = 5;
		String[][] cars  = {{"BMW","Ford","Honda","Audi","Acura"},
				            {"Dodge","Hyundai","Jeep","GMC","Jeep"},
				            {"Kia","Lamborghini","Lexus","Mazda","Mini"},
				            {"Toyota","Suzuki","Volvo","Nissan","Hummer"}};

		System.out.println("2D Array elements:");
		System.out.println();
		for(int i=0; i<rows;i++)

		{
			for(int j=0; j<cols;j++)

			{
				System.out.print(cars[i][j]+"  ");

			}
			System.out.println();

		}
	}
}
