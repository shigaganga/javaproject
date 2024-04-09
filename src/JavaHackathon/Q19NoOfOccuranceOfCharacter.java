package JavaHackathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q19NoOfOccuranceOfCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
       String str=sc.nextLine();
 
 freequency(str);
 }
	
 public static void freequency( String str) {
	 
	 Map<Character, Integer> hmap=new HashMap<Character, Integer>();
	 String str2=str.toLowerCase();
	char strArr[]= str2.toCharArray();//string is converted in to character array
 
	for(Character ch:strArr) {
		if(!String.valueOf(ch).isBlank()) //if not blankspace do these steps ,if there is space nothing do//ie we are not taking space character
		{
		if(hmap.containsKey(ch)) {
			hmap.put(ch, hmap.get(ch)+1);//if that character present in the map increase its size by one//get(ch)+1(returns integer value) 
			                              //   get(ch)_returns value only if that charater contains that string otherwise null
		
	}
		else {
			hmap.put(ch, 1);//only one time that character present in particular string
		}
	}}
	System.out.println("No of occurances of each characters is:"+ ":"+hmap);
}
}