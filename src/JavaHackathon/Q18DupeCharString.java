package JavaHackathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q18DupeCharString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
       String str=sc.nextLine();
 
 Dupe(str);
 }
	
 public static void Dupe( String str) {
	 
	 Map<Character, Integer> hmap=new HashMap<Character, Integer>();
	 
	char strArr[]= str.toCharArray();//string is converted in to character array
 
	for(Character ch:strArr) {
		if(!String.valueOf(ch).isBlank()) //if not blankspace do these steps ,if there is space nothing do//otherwise space also print
		{
		if(hmap.containsKey(ch)) {
			hmap.put(ch, hmap.get(ch)+1);//if that character present in the map increase its size by one//get(ch)+1(returns integer value) 
			                              //   get(ch)_returns value only if that charater contains that string otherwise null
		
	}
		else {
			hmap.put(ch, 1);//only one time that character present in particular string
		}
	}}
	System.out.println(str+ ":"+hmap);
 
	//to print duplicate characters
	System.out.println("duplicate characters are:");
	for(Map.Entry<Character, Integer> entry:hmap.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey());
		}
	
		}
	}

}
