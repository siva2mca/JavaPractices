package java_practice_day1;

import java.util.Scanner;

public class Prog2_Palindrome_1 {

	public static void main(String[] args) {
		//String text="malayalam";
		//String text1="testleaf"
		String  original,reverse = ""; // Objects of String class
		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter a string to check if it's a palindrome");
		    
		    original = in.nextLine();

		    int length = original.length();

		    for (int i = length - 1; i >= 0; i--)
		      reverse = reverse + original.charAt(i);

		    if (original.equals(reverse))
		      System.out.println("Yes given String is palindrome.");
		    else
		      System.out.println("Given string is not a palindrome.");
		

	}

}
