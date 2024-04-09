
//Q26. WJP to merge two sorted array.(Do not use third array) array1[10] =
//1,2,4,6,9,10 array2[4] = {3, 5,7,8 }After merge : array1[10] ={1,2,3,4,5,6,7,8,9,10}
//last element of first array and first elements of second array compare and lower value shifted to first array
//10 and 3 compared,10>3,3 is smaller value so shifted to first array and 10 to second array
//9and 5,9>5, so 9 moved to second array and viceversa,then 6 and 7,6,<7 so no shifting nowonwards
//after this we are sorting first and second array[1,2,4,6,3,5]A1,[10,9,7,8]is second array and after sorting
//[1,2,3,4,5,6]A1,[7,8,9,10]A2
package JavaHackathon;

import java.util.Arrays;

public class Q26MergeSortArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arrayOne[]= {1,2,4,6,9,10 };
		int arrayTwo[]= {3, 5,7,8};
		merging(arrayOne, arrayTwo);
	}
	public static void merging(int arrayOne[],int arrayTwo[]) {
		int a1=arrayOne.length;
	int	a2=arrayTwo.length;
	int left=a1-1;
	int right=0;
while(left>=0&&right<a2) {
	if(arrayOne[left]>arrayTwo[right]) {
//swap elements
		int temp=arrayOne[left];
		arrayOne[left]=arrayTwo[right];
		arrayTwo[right]=temp;
		left--;
		right++;
	}else {
	break;
}
}
Arrays.sort(arrayOne);
Arrays.sort(arrayTwo);
System.out.println("Merged and sorted array");
for(int i=0;i<arrayOne.length;i++) {
	System.out.print(arrayOne[i]+" ");
}
for(int i=0;i<arrayTwo.length;i++) {
	System.out.print(arrayTwo[i]+" ");
}

}
}
