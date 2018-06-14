import java.util.Scanner;

//Author: Thomas George Thomas
//Implementing Linear Search


public class LinearSearchExample {

	public static void LinearSearch(int arr[],int key){
		
		int i,j,flag=0,n=arr.length,pos=0;
		
		for(i=0;i<n;i++){
			
			if(arr[i]==key){
				pos=i;
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("Key not found");
		else
			System.out.println("Key found at position "+(pos+1));
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
		LinearSearch(arr, key);
		
	}	
}
