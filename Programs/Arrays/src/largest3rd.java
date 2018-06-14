import java.util.*;

// Author: Thomas George Thomas
// Program to find the 3rd largest number in the array.
// Using bubble sort here, even though there are more efficient ways to do the same

public class largest3rd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: " );
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array: ");
		for(int i =0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<n-1;i++){
			int temp=0;
			for(int j=n-i+1;j<n-1;j++){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
		System.out.println("The 3 largest number is : "+arr[2]);
		
	}

}
