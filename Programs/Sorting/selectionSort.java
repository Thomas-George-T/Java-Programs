//Author: Thomas George Thomas
//Implementing Selection sort
import java.util.*;

public class selectionSort {

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
	
}


