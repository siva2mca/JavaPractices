package java_practice_day1;

public class Prog2_Palindrome_3 {

	public static void main(String[] args) {
		String str="malayalam";
		StringBuffer sb=new StringBuffer(str);
		String rev=sb.reverse().toString();
		if(rev.equals(str))
		{
			System.out.println("Yes, Palindrome");
		}
		else
		{
			System.out.println("No, not a palindrome");
		}
	}

}
