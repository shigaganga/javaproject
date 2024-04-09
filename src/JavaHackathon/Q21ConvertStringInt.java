package JavaHackathon;

import java.util.Scanner;

public class Q21ConvertStringInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the string you want to convert");
String str= sc.nextLine();
try {
	int number=Integer.valueOf(str);//2 methods used to convert a string to integer
//int number=Integer.parseInt(str);
System.out.println("Number="+number);
}
catch(NumberFormatException e) {
	System.out.println(e+ " please enter a number string");
}
	}

}
