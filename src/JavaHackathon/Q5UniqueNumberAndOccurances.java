
//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
package JavaHackathon;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5UniqueNumberAndOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int array[]=new int[n];
System.out.println("Enter Array elements");
for(int i=0;i<n;i++) {
	array[i]=sc.nextInt();
}
sc.close();
Map<Integer, Integer> hmap=new HashMap<Integer, Integer>();

for(int num:array) {     //map.conainskey() --checks particular key is mapped into the hashmap--returs true
	if(hmap.containsKey(num)) {
	hmap.put(num, hmap.getOrDefault(num, 0)+1);//map.getOrDefault(Object key, Default value)  is used to find value associated 
	//with the corresponding key,if key not present default value returned,if there is value associated with key then value returned
}
	else {
		hmap.put(num, 1);//only one time that value present
}
	}System.out.println(hmap);
System.out.println("Unique numbers:");
	for(int num:hmap.keySet()) {
		if(hmap.get(num)==1){
			System.out.println(num);
		}
	}
	System.out.println("duplicate numbers:");
	for(int num:hmap.keySet()) {
		if(hmap.get(num)>1){
			System.out.println(num);
		}
	}
}}