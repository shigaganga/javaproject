package JavaHackathon;

import java.util.Scanner;

public class A16RemoveCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
String str= sc.nextLine();
System.out.println("Enter the character you want to remove");
String ch=sc.next();
if(str.contains(ch)) {
	String str2=str.replace(ch, "");
	System.out.println("The string after removing particular character is:"+str2);
}else {
System.out.println("This character is not present in the given string");
}
sc.close();
	}

}
