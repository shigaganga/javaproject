package JavaBasics;

import java.util.Scanner;

public class Q14MinMaxValue {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[]= {78,56,8,9,34,76,100,91,-24,-4,99};
	int maxvalue=arr[0];
	int minvalue=arr[0];
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]>=maxvalue) {
			maxvalue=arr[i];
		}
		if(arr[i]<=minvalue) {
			minvalue=arr[i];
		}
		
	}
	System.out.println("maximum value in this array is  :" +maxvalue);
	System.out.println("minimum value in an array is    :"+ minvalue);


		}


	}

