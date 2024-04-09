package JavaBasics;

import java.util.Arrays;

public class Q12REmoveArray {
	public static void remArr() {
		int my_array[] = {25, 14, 56, 15, 36, 56, 77};
		System.out.println("original array : "+Arrays.toString(my_array));//print with string representation , and[]
		   int index=2;//I want to remove index 2
		   int re_array[] = new int[my_array.length-1] ;//new array declaration,one element removed size one less than original
for(int i=0,j=0;i<my_array.length;i++) {
	if(i==index) {
		continue;
	}else {
		 re_array[j++]=  my_array[i];
		 
	}
	
	
	}

System.out.println("Array after removing element: " +Arrays.toString(re_array));
//return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			remArr() ; 
			   

}



}
