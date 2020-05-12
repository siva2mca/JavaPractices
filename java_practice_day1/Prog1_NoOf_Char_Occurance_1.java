package java_practice_day1;

public class Prog1_NoOf_Char_Occurance_1 {

	public static void main(String[] args) {
		String text="You have no choice other than following me!";
		char ch='o';
		int totalCount=0;
		char[] array=text.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==ch)
			{
				totalCount++;
			}
		}
System.out.println("Occurances of "+ch+" is:"+totalCount);
	}

}
