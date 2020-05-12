package java_practice_day1;

public class Prog1_NoOf_Char_Occurance_2 {

	public static void main(String[] args) {

String str="You have no choice other than following me!";
//create
String replacedStr=str.replaceAll("[^o]", "");
System.out.println("Occurances of O:"+replacedStr.length());

	}

}
