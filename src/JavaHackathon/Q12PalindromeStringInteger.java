package JavaHackathon;

import java.util.Scanner;

public class Q12PalindromeStringInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the string or number you want to check");
String pal=sc.nextLine();
int left=0;int right=pal.length()-1;
while(left<=right){
	if(pal.charAt(left)==pal.charAt(right)) {//method in string,returns character at specified index
		left++;
		right--;
	}
	else {
		break;
	}
	}
if(left>right) {//(121)left>right
	System.out.println("Input is Palindrome");
}
else {
	System.out.println("Input is not palindrome");
}
}
}