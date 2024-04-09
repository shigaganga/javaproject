
package JavaHackathon;

import java.util.Scanner;

public class Q14ReverseWord {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	String newStr[]=str.split(" ");//splits the string around matches and returns array of string
	for(int i=newStr.length-1;i>=0;i--) {
		System.out.print(newStr[i]+" ");
	}
	
}
}
