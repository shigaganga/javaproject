package JavaBasics;

import java.util.Scanner;

public class Q7UserDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q7UserDetails obj1=new Q7UserDetails();
		obj1.UserDetails();
	}
		
	public static void UserDetails() {
		Scanner obj=new Scanner(System.in);
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter name of user:");
		String name=obj.next();
		
		System.out.println("Gender:");
		String gender=obj.next();
		System.out.println("address:");
		String address=obj1.nextLine();
		System.out.println("Enter age:");
		int age=obj.nextInt();
		System.out.println("name: "+name);
		
		System.out.println("gender: "+gender);
		System.out.println("address: "+address);
		System.out.println("age: "+age);

	
}
	}
