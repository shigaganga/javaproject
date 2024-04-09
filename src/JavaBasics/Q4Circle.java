package JavaBasics;

import java.util.Scanner;

public class Q4Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		int r=sc.nextInt();
		Q4Circle obj=new Q4Circle();
		obj.circle(r);
	}
public void circle(int r) {
	float pi=3.14f;
	float area=pi*r*r;
	float perimeter=2*pi*r;
	System.out.println("area of circle is"+area);
	System.out.println("Perimeter of circle is"+perimeter);

}
}
