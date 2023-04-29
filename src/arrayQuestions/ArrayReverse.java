package arrayQuestions;

public class ArrayReverse {

	public static void main(String[] args) {

		System.out.println("Question 2 - OUTPUT");
		System.out.println("***************************");
		ArrayRev();

	}

	public static void ArrayRev()
	{

		int integerArr[] = {0,1,2,3,4,5,6,7,8,9,10};
		int size = integerArr.length;
		
		System.out.println("Array elements:");
		for(int i=0; i<size;i++)
		{
			System.out.print(integerArr[i]+" ");

		}

		System.out.println();
		System.out.println();

		System.out.println("Array elements in reverse order:");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(integerArr[i]+" ");

		}

	}
}


