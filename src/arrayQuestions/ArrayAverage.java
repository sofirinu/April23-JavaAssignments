package arrayQuestions;

public class ArrayAverage {

	public static void main(String[] args) {

		System.out.println("Question 1 - OUTPUT");
		System.out.println("***************************");
		ArrayAvg();

	}

	public static void ArrayAvg()
	{
		int arr[] = {10,15,20,25,30,35,40,45,50,55};
		int size = arr.length;
		double sum=0;

		System.out.println("Array elements:");
		
		for(int i=0; i<size;i++)
		{
			System.out.print(arr[i]+" ");
			sum = sum+arr[i];

		}
		
		System.out.println();
		System.out.println();
		
		double avrg = sum/size;
		System.out.println("Average of array elements:"+avrg);


	}
}
