//Implementing Selection sort
import java.util.*;

public class selectionSort {

	//selection sort
	
	static void selectionSortFun(int array[])
	{
		int min=0,n=array.length;
		for(int i=0;i<n-1;i++)
		{
			min=i;
			
			for(int j=i+1;j<n;j++)
			{
				
				if(array[j]<array[min])
				{
					min=j;					
				}
			}
			//swapping
			int temp=array[min];
			array[min]=array[i];
			array[i]=temp;
		}
		
	}
	
	//driver class
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers?");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the array to be sorted:\n");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		sc.close();
		
		selectionSortFun(array);
		
		System.out.println("Printing the sorted array:\n");
		for(int i=0;i<n;i++)
			System.out.print(array[i]+" ");

	}
	
}
