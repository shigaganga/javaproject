package JavaHackathon;

import java.util.Scanner;

public class Q6SelectionSortAscending {//selection sort means find the minimum element and put it at the beginning,for every iteration
	//first element is considered as minimum,then iterated through the loop you got minimum value,then you store that value in to minimum variable,
	//then move first element to the temp , then move minimum to the first and temp (ie first place variable to the minimum value position
	//now next iteration i=1,that element moved to min then go through this iteration you got next lowest value that is moved to minimum.so you got curre
	//minimum of this iteration and index 1 or the second element is moved to temp and do swaping..
	
//                                                       9 1 8 2 7 3 6 4 5
	//                                                  min      temp
	
	public static void main(String[] args) {           //9
		// TODO Auto-generated method stub             //1        9    // 1 9 8 2 
Scanner sc=new Scanner(System.in);   
System.out.println("Enter the size of array");          //8
int n=sc.nextInt();                                //     2        9      1 2 8 9  7 3 6    
int[] array=new int[n];                                 //8
                                                        //7
System.out.println("Enter the elements of array");      //3       8     1 2 3 9 7 8 3 6 4 5
for(int i=0;i<n;i++) {                              
	array[i]=sc.nextInt();                              //4         9    1 2 3 4 7 8 3 6 9 5
}
System.out.println("Arrays before sorting:");
for(int i=0;i<n;i++) {
	System.out.println(array[i]+" ");
}
System.out.println();
for(int i=0;i<array.length-1;i++) {
	int min=i;

	for(int j=i+1;j<array.length;j++) {
		if(array[min]>array[j]) {//swap> sign with<sign descending order
			min=j;
		}
	}
	int temp=array[i];
	array[i]=array[min];
	array[min]=temp;

}
System.out.println("Arrays after sorting:");
for(int k=0;k<array.length;k++) {
	System.out.println(array[k]+" ");
}
}}
