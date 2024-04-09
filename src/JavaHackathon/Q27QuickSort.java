package JavaHackathon;                                                   // temp

import java.util.Scanner;

//pick our pivot,declare end value as pivot                        i   j              pivot             
//declare 2 indexes j and i==>3,1 6 ,4,5 2 -so set 2 as pivot//        3  1  6  4  5  2         //ifj>=pivot ignore it and increment j,3>2 so j=1
//  now if j<pivot  increment i and swap i and j using temp; 1<2,i=3,j=1 after swap 1 3 6 4 5 2 increment j so j=6, 6>2, then j=4 j>2,
  //                      pivot                                                          i j 
// 1(i)  3   6   4   5    2(j)                                                               pivot   
//    j=5 5>2 then j=2,ie j>=pivot, so increment i, so i=3  j=2  and swap   i and j, ==> 1    2     6   4   5   3
//so left part is less than pivot and right part is greater than pivot,so pivot is in the correct place
//partion this to two, all the elements up to pivot(excluding pivot) in one part and after pivot next parition
//quicksort is a recursive algorithm, so we passes two partions as arguments in quicksort function
//                                           2(pivot)
//                                                                         i j     pivot                            
//      quicksort(1)                                               quicksort(6,4,5,3)     
//                                                                                   
//                                                                         (3(p), 6, 4,5)             
// 
//                                                                                3(pivot)                             i   j  p        i   j   p
//                                                                                          i   6, 4, 5(p)==>   4<5 so 6, 4,  5  swap 4  ,6  ,5
//
//  i   p
//  4,6,5                      j=p,increment i, so i=6, j=5 after swap 4,5,6                       4 5(p) 6


//1 2 3 4 5 6 o/p
public class Q27QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size of array");
int n= sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements of array");
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	quicksort(arr,0,arr.length-1);
for(int i:arr) {
	System.out.print(i+" ");
}
		
	}

	private static void quicksort(int[] arr, int start, int end) {//we need to find location of pivot so patition function called
		//partion going to sort our array and find the pivot//so all elements to the left is smaller than pivot and right is larger
		//iquick sort moves smaller element to the left of a pivot
if(end<=start) {//base condition,means if more than one element sorting is needed
	return;
}
int pivot=partition(arr, start, end);// recursively sort two partition function created by pivot.
  quicksort(arr, start, pivot-1); //left partion sorted,we can pass each partion recursively in quicksort function,we donot want pivot in next 
  quicksort(arr, pivot+1, end);//right partion sorted
}
	
public static int partition(int[] arr, int start, int end) {//it will return int ie location of our pivot
	int pivot=arr[end];//choose last element as pivot
	int i=start-1;
	for(int j=start;j<=end;j++) {
		if(arr[j]<pivot) {
			i++;
			int temp=arr[i];  //so all elents lesserthan pivot in left and vicevesa
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	i++;//for inserting our pivot in to final place(j=pivot)
	int temp=arr[i]; 
	arr[i]=arr[end];
	arr[end]=temp;
	
	return i;//i will be location of our pivot
	
}
		
	}

