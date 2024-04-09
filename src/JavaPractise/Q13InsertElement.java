package JavaPractise;

import java.util.Scanner;

public class Q13InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
int n=sc.nextInt();
int arr[]=new int[n+1];
System.out.println("Enter the array elements before inserting");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
System.out.println("Enter Array Location");
int loc=sc.nextInt();
System.out.println("Enter New num to insert");
int Newnum=sc.nextInt();
for(int i=n;i>loc;i--){
	arr[i]=arr[i-1];
}arr[loc]=Newnum;
System.out.println("Arrays after inserting new value");
for(int i=0;i<arr.length;i++) {

System.out.println(arr[i]);

	}

}
}