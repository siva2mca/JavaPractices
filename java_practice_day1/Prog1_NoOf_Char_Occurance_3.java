package java_practice_day1;

public class Prog1_NoOf_Char_Occurance_3 {

	public static void main(String[] args) {
		String str="You have no choice other than following me!";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='o')
			{
				count++;
				//++count
				//count+=1
				//count=count+1;
			}
		}
System.out.println("Occurances of 'O' is:"+count);
	}

}
