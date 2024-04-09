package JavaHackathon;

import java.util.Arrays;
import java.util.Scanner;

//data must be sorted first
//divide and conquer
//check in first half
//pseudocode:binarysearch(x,A)-x is the value searching and A is the array       p (first)                   q (mid)                   r(last)
//p=0;r=A.length-1     while(p<=r)   , set q=p+r/2 you got mid point(3.5=3), ifA[q]=x return q,ie x is in q th positio
//if A[q]>x, p=0;r=q-1//ie x is present in the left side
//ifA[q]<x, p=q+1;r=A.length-1; x is present in right side
//otherwise return(-1) x is not present in this array                      
public class Q25BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int[] array=new int[5];
System.out.println("Enter 5 Array elements in ascending order");//otherwise sort
for(int i=0;i<5;i++) {
	array[i]=sc.nextInt();
}
System.out.println("Enter the element you want to search");
int x= sc.nextInt();
/*Arrays.sort(array);
System.out.println("sorted array:");
for(int num:array) {
	System.out.println(num+" ");
}*/
	int  first=0; int last=array.length-1;
	
	 while(first<=last) {                         
		 int mid=(first+last)/2;                                                                  //   1 3 5 7 9    so mid=0+4/2

		 if(array[mid]==x) {
			System.out.println("Element is found in the index:"+mid);
			break;
		 }else if(array[mid]>x) {  //if A[q]>x, first=0;last=mid-1//ie x is present in the left side
			 last=mid-1;
		 }
		 else{
			 first=mid+1;
		 }
		if(first>last) {
			System.out.println("Element is not present in this array");
		}
	 }
}
}
