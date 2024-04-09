package classcode.Collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatePractise{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string you want to remove duplicate");
String str= sc.next();
String str2=sc.nextLine();
RemoveDupe(str);
	}
public static void RemoveDupe(String str) {
	LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
	//add each character of string in to hashset
	for(int i=0;i<str.length();i++) {
		ls.add(str.charAt(i));
	}
	//set removes duplicates,so print the string after removing duplicates
	for(Character ch:ls) {
		System.out.print(ch);
	}
}}

