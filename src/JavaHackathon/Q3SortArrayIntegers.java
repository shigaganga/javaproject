package JavaHackathon;

import java.util.Scanner;
//bubble sorting is repeatedly swapping adjuscent elements,first two element checked,biigger element moved to temp,so next element in the place of 
//bigger element a[0]>a[1] then a[0] to temp,a[1] to a[0],then temp moved to that spot a[1]
//then check next two element a[1] and a[2] checked
public class Q3SortArrayIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
int[] array=new int[n];
System.out.println("Enter the elements of array");
for(int i=0;i<n;i++) {
	array[i]=sc.nextInt();
}
System.out.println("Arrays before sorting:");
for(int i=0;i<n;i++) {
	System.out.println(array[i]+" ");
}
System.out.println();
int temp=0;
for(int i=0;i<array.length-1;i++)
	for(int j=i+1;j<array.length;j++) {
		if(array[i]>array[j]) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;//so you got smallest number in left at the end
					}}
	System.out.println("Arrays after sorting");
	for(int k=0;k<array.length;k++) {
		System.out.println(array[k]+" ");
	}
	}

}
