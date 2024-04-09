package JavaHackathon;

import java.util.Arrays;
import java.util.Scanner;

//we pass the array in to mergesort function, megesort(3,7,8,5,4,2,6,1)
//these functions divides array in to two  (3,7,8,5  )  (  4,2,6,1),ie we copy the elements in to this subarrays
//mergesort is a recursive function so we call this  two subarray ,so megesort divide this 2 sub arrays so 4 sub arrays
//mergesort(3,7) mergesort(8,5) mergesort(4,2) mergesort(6,1), so agfter this we got 8 sub arrays,so stop
//ie we are calling mergesort until array has size 1.
//we are creating a helper fn to merge ==>merge()==merge will take3 arguments,leftsubarray(3),right subarray(7), originalarray(3,7)
//merge will put them back to the original sub array in sorted order//  3 7 8 5                         3 7 8  5  ==    3 7  5 8 afterthis right
//so start with left branch and work on it after that left branch  (3,7)       (8  5)     ====  3  7         5  8
//4 2 6 1==>1 2 4 6
 //(1 2 4 6)  (3,7,5,8)  ==to original array==>1 2 3 4 5 6 7 8                                                              //3     7         8      5
public class Q29MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n= sc.nextInt();
int array[]=new int[n];
System.out.println("Enter the array elements");
for(int i=0;i<array.length;i++) {
	array[i]=sc.nextInt();
}
	MergeSort(array);//each time it will create two subarray
	System.out.println("sorted array is: "+Arrays.toString(array));
	}

	

	private static void MergeSort(int[] array) {
		// TODO Auto-generated method stub
		int length=array.length;
		if(length<=1) {
			return;//base conditin if length 1 we cant divide the array
		}
		int middle=length/2;
		int[] leftArray=new int[middle];
		int[] rightArray=new int[length-middle];
		//now we need to copy the original arrays to our left and right array
		//int i=0;//left array
		//int j=0;//right array
/*for(int i=0;i<middle;i++){
	        leftArray[i]=array[i] ;                     
			}
//for(int i=middle;i<array.length;i++) {
	rightArray[i-middle]=array[i];
		}*/
		leftArray=Arrays.copyOfRange(array, 0, middle);//we copy original array elements to left array
		
		rightArray=Arrays.copyOfRange(array, middle, length);//we copy original array elements to right arrayie middle element to end
			
		MergeSort(leftArray);
		MergeSort(rightArray);
		Merge(leftArray, rightArray, array);
	}
	private static void Merge(int leftArray[],int rightArray[],int[] array) {
		int leftSize=array.length/2;
		int rightSize=array.length-leftSize;
		int i=0;int l=0; int r=0;//indices of original,left and right arrays
		//conditions for merging
		while(l<leftSize&&r<rightSize) {//iterate up to both left and right array have elements remaining
			if(leftArray[l]<rightArray[r]) {//compare elements of left and right subarray,if left element is lesser copy that element to original array
				array[i]=leftArray[l];
				i++;
				l++;
			}else {//otherwise rihtelent<left,copy right element to the array
				array[i]=rightArray[r];
				i++;
				r++;
			}
		}
		while(l<leftSize) {//if there are remaining lelements in leftsubArray copy to original array
			array[i]=leftArray[l];
			i++;
			l++;
		}
		while(r<rightSize) {
			array[i]=rightArray[r];
			i++;
			r++;
		}
	}//once all the elements of left and right array merged to single sorted array completed
}
