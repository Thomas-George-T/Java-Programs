import java.util.Scanner;

//Author : Thomas George Thomas
// Find fibonacci series without using recursion up to count t

public class fibNonRecursive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term count: ");
		int t= sc.nextInt();
		int n1=0,n2=1,n3=0;
		
		if(t==0 || t==1)
			System.out.println(0);
		else
		{
			System.out.print(0+" "+1);
			for(int i=2;i<t;i++)
			{
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
		}
		
		
	}

}
