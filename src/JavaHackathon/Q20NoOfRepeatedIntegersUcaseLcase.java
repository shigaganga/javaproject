package JavaHackathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q20NoOfRepeatedIntegersUcaseLcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string ");
String str=sc.nextLine();
countNumber(str);
	}
public static void countNumber(String str) {
	Map<Character, Integer> hmap=new HashMap<Character, Integer>();
	int uppercount=0;
	int lowercount=0;
	char[] newstr=str.toCharArray();
	for(char ch:newstr) {
		if(Character.isDigit(ch)) {
		
			hmap.put(ch, hmap.getOrDefault(ch, 0)+1);//map.getOrDefault(Object key, Default value)  is used to find value associated 
			//with the corresponding key,if key not present default value returned,if there is value associated with key then value returned
		}else if (Character.isUpperCase(ch)) {
			uppercount++;
		
		}else if (Character.isLowerCase(ch)) {
			lowercount++;
		}
	}
	
	System.out.println("Uppercase count:"+uppercount);	
	System.out.println("Lowerercase count:"+lowercount);	
	System.out.println("Repeated  integers:");
	for(Map.Entry<Character, Integer> entryob:hmap.entrySet()){
		System.out.println(entryob.getKey()+" :"+entryob.getValue()+"times");
	}
	
}
}