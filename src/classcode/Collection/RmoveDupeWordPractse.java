package classcode.Collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RmoveDupeWordPractse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string you want to remove duplicate");
String str=sc.nextLine();
String[] arr=str.split(" ");//splits the stringwith given regx and returns a string array
	LinkedHashSet<String> ls=new LinkedHashSet<String>();
	//add each array of string in to hashset
	for(int i=0;i<arr.length;i++) {
		ls.add(arr[i]);
	}
	//set removes duplicates,so print the string after removing duplicates
	for(String str2:ls) {
		System.out.print(str2+" ");
	}
}

	
}