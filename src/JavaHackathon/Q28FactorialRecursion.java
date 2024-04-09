package JavaHackathon;

import java.util.Scanner;

public class Q28FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number to find factorial");
int n=sc.nextInt();
int answer=factorial(n);
System.out.println("factorial of the number is:"+answer);

	}
public static int factorial(int n) {
	if(n==0) {//or if n==1
	return 1;
}else {
	return n* factorial(n-1);//eg 2,   2*factorial(2-1)==.>2*factorial(1)==>2*1
}
}
}