package JavaHackathon;

import java.util.Scanner;

public class Q23InputAsStringIntOrBool {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter input");
	String input=sc.nextLine();
	if(isInteger(input)) {
		System.out.println("Input is an integer");
	}
	else if(isBoolean(input)) {
		System.out.println("Input is a boolean");
	}else {
		System.out.println("Input is a string");
	}
}
public static boolean isInteger(String str) {
	try {
		Integer.parseInt(str);
		return true;
	}
	catch(Exception e){
		return false;
	}
}
public static boolean isBoolean(String str) {
	return str.equalsIgnoreCase("true")||str.equalsIgnoreCase("false");

}
}
