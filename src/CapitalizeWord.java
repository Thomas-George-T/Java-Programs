
//WAP to capitalize each word
import java.util.*;

public class CapitalizeWord {

	public static String capitalize(String s1) {
		String full = "";
		String a[] = s1.split("\\s");
		for (String word : a) {
			String first = word.substring(0, 1);
			String rest = word.substring(1);
			full += first.toUpperCase() + rest + " ";

		}
		return full.trim();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of testcases: ");
		int T = sc.nextInt();
		sc.nextLine();
		while (T-- > 0) {
			System.out.println("Enter a string: ");
			String s1 = sc.nextLine();
			System.out.println("After capitalizing: ");
			System.out.print(CapitalizeWord.capitalize(s1));
		}
		sc.close();

	}

}
