package classcode.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionArraylistPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterSection();
	}
public static void InterSection() {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	
	ArrayList<Integer> arr2=new ArrayList<Integer>();
	System.out.println("How many values do you want to enter");
	int n=sc.nextInt();
	System.out.println("Please enter the values of first arraylist");
	for(int i: arr1) {
		arr1.add(n);
	}
}
}
