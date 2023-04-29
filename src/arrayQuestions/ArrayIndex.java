package arrayQuestions;

public class ArrayIndex {

	public static void main(String[] args) {

		System.out.println("Question 5 - OUTPUT");
		System.out.println("***************************");
		ArrayRev(8);

	}

	public static void ArrayRev(int size)
	{

		int arr[] = {10,12,14,16,18,20,22,24};
		size = arr.length;
		
		System.out.println("Array element   Index");
		
		for(int i=0; i<size;i++)
		{
			System.out.println("    "+arr[i]+"             "+i);

		}

		System.out.println();
		System.out.println();

		

	}
}


