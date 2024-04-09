package JavaBasics;

import java.util.Scanner;

public class Q1SumAverage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first no:");
		int num1=obj.nextInt();
		System.out.println("Enter second no:");
		int num2=obj.nextInt();
		System.out.println("Enter third no:");
		int num3=obj.nextInt();
		Q1SumAverage obj1=new Q1SumAverage();
		obj1.Calculate(num1, num2, num2);

}
	public float Calculate(int num1,int num2,int num3) {
		
float sum=num1+num2+num3;
		float avg=sum/3;
System.out.println("Sum of three numbers is"+sum);
		System.out.println("The average of three numbers is:"+avg);

	return(avg);
	}}