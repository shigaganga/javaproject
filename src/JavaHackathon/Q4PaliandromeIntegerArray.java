//4)Given an array of integers check the Palindrome of the series.
package JavaHackathon;
import java.util.Scanner;

public class Q4PaliandromeIntegerArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	palindrm();
		}
	public static void palindrm() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			}
		System.out.println("Arrays of integers:");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]+" ");
		}
		
	boolean palindrome=true;
	for(int i=0;i<n/2;i++) {
		if(array[i]!=array[n-i-1]) {
			palindrome=false;
			break;
		}
	}
		  
if(palindrome) {
System.out.println("The array is palindrome");
	}else {
		System.out.println("The array is not palindrome");
	}
}}