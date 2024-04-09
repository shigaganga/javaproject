package classcode.Collection;

import java.util.HashMap;
import java.util.Scanner;

public class FreequencyPractiswWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string you want to find unique words");
String str=sc.nextLine();
String str2=str.toLowerCase();
String[] newstr=str2.split("\\s+");//split string into string of array with seperator as space or multiple spaces

HashMap<String, Integer> hmap=new HashMap<String, Integer>();//to store string as key and count as value
//geyOrDefault(key,defaultvalue):default value 0 returns when key not found else count(1)
for(String word :newstr) {
	if(hmap.containsKey(word)) {
		hmap.put(word, hmap.getOrDefault(word,0)+1);//if that string present in the map increase its size by one//get(word)+1(returns integer value) 
        //   works only with contains key

	}
	else {
			hmap.put(word, 1);//only one time that word present in particular string
		}
	
	}
System.out.println("Freequency of words:"+hmap);
}

}