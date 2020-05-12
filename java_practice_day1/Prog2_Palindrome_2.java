package java_practice_day1;

public class Prog2_Palindrome_2 {

	public static void main(String args[]) {
		String str = "malayalam";
		//Creating empty stringto store the reversed value
		String rev = "";
		//Iterarte over the string
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
//			if (rev.equals(str))	
//				System.out.println("this is palindrome");
//
//			else
//			
//				System.out.println("this is not palindrome");
//condition?True Statement:False Statement
		System.out.println(str.equals(rev) ? " Yes, palindrome" : "No, not a palindrome");
	}
}
