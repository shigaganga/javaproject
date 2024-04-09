package JavaBasics;

import java.util.Scanner;

public class Q5Rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height of rectangle");
		int h=sc.nextInt();
		System.out.println("enter the width of rectangle");
		int b=sc.nextInt();
		Q5Rectangle obj=new Q5Rectangle();
		obj.rectangle(h,b);
	}
public void rectangle(int a,int b) {

	float area=a*b;
	float perimeter=2*(a+b);
	System.out.println("area of circle is"+area);
	System.out.println("Perimeter of circle is"+perimeter);

}
}
