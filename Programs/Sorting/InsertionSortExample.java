//Author: Thomas George Thomas
// Insertion Sort

public class InsertionSortExample {

	void insertionSort(int arr[])
	{
		int i,j,key,n=arr.length;
		
		for(i=1;i<n;i++)
		{
			//Select the first element in the unsorted array
			key=arr[i];
			j=i-1;
	
			while( j>=0 && arr[j] > key)
			{
				//Shift all the elements to the right to create position for the unsorted element 
				arr[j+1]=j;
				j=j-1;
			}
			
			//Insert the unsorted element to the right position			
			arr[j+1]=key;
			
		} //Repeat above till no unsorted elements are left
	}
	
}
