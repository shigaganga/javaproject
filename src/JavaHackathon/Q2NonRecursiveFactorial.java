package JavaHackathon;

import java.util.Scanner;

public class Q2NonRecursiveFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find factorial");
int n=sc.nextInt();
int fact=1;
while(n>0) {
	fact=fact*n;
	n--;
}
System.out.println(fact);
	}

}
