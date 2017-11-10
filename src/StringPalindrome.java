
//WAP to check if the string is Palindrome
import java.util.*;

public class StringPalindrome {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1 = sc.nextLine();
		sc.close();
		StringBuilder s2 = new StringBuilder(s1);
		s2.reverse();

		if (s1.equals(s2.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
