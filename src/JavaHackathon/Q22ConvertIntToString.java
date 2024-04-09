package JavaHackathon;

import java.util.Scanner;

public class Q22ConvertIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");//  String str=string.toString(num)
		
		//String str=String.valueOf(num);//or String str=num+"";ie using concatenation using empty string,or String.valueof(number)
try {
	int num=sc.nextInt();
	String str=String.valueOf(num);
	System.out.println("converted String:"+str);
}catch(Exception e) {
	System.out.println(e);
	System.out.println("please enter valid form of input");
}
	}

}
