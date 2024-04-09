package JavaPractise;

//Q26. WJP to merge two sorted array.(Do not use third array) array1[10] =
//1,2,4,6,9,10 array2[4] = 3, 5,7,8 After merge : array1[10] =1,2,3,4,5,6,7,8,9,10


public class MergeSortWithThirdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arrayOne[]= {1,2,4,6,9,10 };
int arrayTwo[]= {3, 5,7,8};
int arrayThree[]=new int[arrayOne.length+arrayTwo.length];
int index=arrayOne.length;
for(int i=0;i<arrayOne.length;i++) {
	arrayThree[i]=arrayOne[i];
}
for(int j=0;j<arrayTwo.length;j++) {
	arrayThree[index]=arrayTwo[j];
	index++;
}
for(int k=0;k<arrayTwo.length;k++) {
	System.out.println(arrayThree[k]);
}
}
}