package JavaBasics;
import java.util.Scanner;
public class Q13Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method st
	
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
System.out.println("Enter the elements");

for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}

System.out.println("Enter the location at which you want to insert");
int location=sc.nextInt();
System.out.println("Enter the value  you want to insert");
int value=sc.nextInt();
System.out.println("printing elements after inserting");

for(int i=arr.length-1;i>location;i--) {
	arr[i]=arr[i-1];//swapping last position to next last elementie 0 to 5 and 5 to 0
	}

	arr[location]=value;
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
}




	}

}
