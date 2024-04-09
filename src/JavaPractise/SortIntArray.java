package JavaPractise;

import java.util.Scanner;

public class SortIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of arrays");
		int n= sc.nextInt();
		System.out.println("Enter the elements of array");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
System.out.println("Arrays before sorting");
for(int i=0;i<n;i++) {
	System.out.println(arr[i]+" ");
}
int temp=0;
for(int i=0;i<arr.length;i++) 
	for(int j=i+1;j<arr.length;j++) {
		if(arr[j]<arr[i]) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;//so you got smallest number in left
				}}
System.out.println("Arrays after sorting");
for(int k=0;k<arr.length;k++) {
	System.out.println(arr[k]+" ");
}

}}