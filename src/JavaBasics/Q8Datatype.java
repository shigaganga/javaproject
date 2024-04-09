package JavaBasics;

import java.util.Scanner;

public class Q8Datatype {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q8Datatype obj1=new Q8Datatype();
		obj1.scannarPractise();
	}
	public void scannarPractise() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter an integer no");
		int a=obj.nextInt();
		System.out.println("Enter a double no");
		double b=obj.nextDouble();
		System.out.println("Enter a float no");
		float c=obj.nextFloat();
		System.out.println("Enter a boolean no");
		boolean d=obj.nextBoolean();
	float sum=a+c;
	double sum2=a+b+c;
	//int sum3=a+b+c;
	//float sum4=a+b;	
	//boolean sum5=0;
	boolean Sum6=true;
		
}
}