import java.util.Scanner;

//Author: Thomas George Thomas
// Implementing Binary Search
public class BinarySearchExample {

	public static void BinarySearch(int arr[],int key){
		
		int n=arr.length,first=arr[0],last=arr[n-1];
		
		int mid=(first+last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("Key found at position "+(mid+1));
				break;
			}
			else if(arr[mid]>key){
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		
		if(first>last){
			System.out.println("Key not found");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter an array: ");
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the key to find: ");
		int key=sc.nextInt();
		sc.close();
		BinarySearch(arr, key);
	}

}
