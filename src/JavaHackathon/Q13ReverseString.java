package JavaHackathon;

import java.util.Scanner;

public class Q13ReverseString {
	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);

System.out.println("Enter the string");
String str= sc.nextLine();//eg java code
for(int i=str.length()-1;i>=0;i--) {
	System.out.print(str.charAt(i));
}
}
}