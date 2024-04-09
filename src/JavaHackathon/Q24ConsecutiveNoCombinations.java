/*Write a program which inputs a positive natural number N and
prints the possible consecutive number combinations, which when added
give N. INPUT: N = 9 OUTPUT: 4 + 5   ,2 + 3+ 4*/

package JavaHackathon;

import java.util.Scanner;

public class Q24ConsecutiveNoCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
sc.close();
for(int i=1;i<num;i++) {
	int sum=0;
	int x=i;
	String sumComb="";
	while(sum<num) {
		sum=sum+x;
		sumComb=sumComb+x+"+";
		x++;
	}
	if(sum==num) {
		//System.out.println(sumComb);
		System.out.println(sumComb.substring(0, sumComb.length()-1));
	}
}
	}

}
