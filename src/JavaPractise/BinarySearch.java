package JavaPractise;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.

		public static void main(String[] args) {
			// TODO Auto-generated method stu
			Scanner sc= new Scanner(System.in);
		
			int[] arr=new int[5];
			System.out.println("Enter the array elements in ascending order");//othrwise sort
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
	          Arrays.sort(arr);
			}
			System.out.println("Enter the key element");
			int key=sc.nextInt();
	Binary(0,arr.length-1,key,arr);
		}
		public static void Binary(int first,int last,int 
				key,int[] arr) {
			int mid = (first + last)/2;  //mid
			   while( first <= last ){  
			      if ( arr[mid] < key ){  
			        first = mid + 1;  //key is present in the right side   
			      }else if ( arr[mid] == key ){  
			        System.out.println("Element is found at index: " + mid);  
			        break;  
			      }else{  //arr[mid]>key//key in the leftside
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  
			   }  
			   if ( first > last ){  
			      System.out.println("Element is not found!");  
			   }  
		}
		

	}



