package JavaHackathon;
//Q62. write an algorithm to reverse first 3 numbers, then next 3 numbers,
//then next 3 numbers, the number will be based on var k. Array =
//[3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4]
import java.util.Scanner;

public class Q60ReverseArrayGroups {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the number for grouping");
		int k=sc.nextInt();
		Reverse(array,k);
		System.out.println("Array Elements after revesing");
		for(int num:array) {
			System.out.println(num+" ");
		}

	}
public static void Reverse(int arr[],int k) {//Math.min() to take the minimum value between i + k - 1 and array.length - 1. 
	int len=arr.length;
	for(int i=0;i<len;i=i+k) {//The loop increments by k in each iteration
		int start=i;  //start is the starting index of the chunk, and end is the ending index.
		 //i + k - 1 calculates the index of the last element in the current chunk                         
		int end=Math.min(i+k-1, len-1);//The Math.min() function ensures that right does not exceed the array bounds.
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;end--;
		}
	}
}
}
