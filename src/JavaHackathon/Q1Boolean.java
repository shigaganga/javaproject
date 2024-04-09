package JavaHackathon;

import java.util.Scanner;

public class Q1Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first boolean value");
		boolean num1=sc.nextBoolean();
		System.out.println("Enter second boolean value");
		boolean num2=sc.nextBoolean();
		System.out.println("Enter third boolean value");
		boolean num3=sc.nextBoolean();
		int count=0;
		if(num1==true)
			count++;
		if(num2)
			count++;
		if(num3)
			count++;
		if(count>=2) {
			System.out.println("Atleast two boolean variables are true,condition is valid");
		}else {
			System.out.println("Atleast two variables are not true");
		}
		
			

	}

}
