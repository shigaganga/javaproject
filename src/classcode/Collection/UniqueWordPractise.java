package classcode.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string you want to find unique words");
String str=sc.nextLine();
String[] strArr=str.split("\\s+");//split string into string of array with seperator as space or multiple spaces
Set<String> hs=new HashSet<String>();
for(String word:strArr) {      //string is stored as set 
	hs.add(word);
}
System.out.println("unique words are:"+hs);
}}