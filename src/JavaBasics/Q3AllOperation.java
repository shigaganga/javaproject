package JavaBasics;

import java.util.Scanner;

public class Q3AllOperation {
	public static void main(String[] args) {

	// TODO Auto-generated method stub
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter first no:");
	int a=obj.nextInt();
	System.out.println("Enter second no:");
	int b=obj.nextInt();
	Q3AllOperation obj1=new Q3AllOperation();
	obj1.operations( a,b);
	}
public void operations(int a,int b) {
	int sum=a+b;
	int substraction=a-b;
	int multiplication=a*b;
	float division=a/b;
	int remainder=a%b;
	System.out.println("sum of a and b is "+sum);
	System.out.println("substraction of a and b is "+substraction);
	System.out.println("multiplication of a and b is "+multiplication);
	System.out.println("division of a and b is "+division);
	System.out.println("remainder of a and b is "+remainder);
	
}
}
