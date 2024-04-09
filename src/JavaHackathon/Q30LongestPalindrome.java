package JavaHackathon;

import java.util.Scanner;
// c itself is a palindrome , no center here
// string odd:find center (i)and iterate through both sides of center,if both side equal its palindrom,eg mom, enter o,both side m=m string is odd
//if the string is even center is i and i+1(i to i+1)eg:abba,here center bb(i ,i+1)
//length=right-left-1//if the length is maximum you can say current string is maximum lenth palindrome
public class Q30LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
 String str2=longestPalindrome(str);
 System.out.println(str2);    //                     sdaabbcbbaatr    len-2/2=13-1/2=6  so i-6=7-6=1=start
                               //                          i          len/2=13/2=6.5=6 so i+6=7+6=13 =end
 
	}                                                                            
public static String longestPalindrome(String str) {
	if(str==null ||str.length()<1) {
		return"";
	}
	int start=0;int end=0;//initializes to track start and end indices of palindrome
	
	for(int i=0;i<str.length();i++) {//iterate through each character of string
		//center can be single characr,or pair of adjuscent characters
	int odd=expand(str,i,i);//for each character it expand around the center, character at indices i as the center ,
	//for odd case left and right side it expand from i
	int even=expand(str,i,i+1);//even so characters at i & i+1 as center of potential palindrome
	//(strating point of checking)ie left it expand from i and right it expand from i+1
	
	int len=Math.max(odd, even);//its selecting greater of two//calls max functions in Math class,it takes two parameter if(4,7) o/p=7
	if(len>end-start) {//length of newly found palindrome is grater than current longest palindrome//if then update start and end
	//update start indices in this way to ensure indices of longest palindrom                                            //  1 2 3    
	start=i-(len-1)/2;//condider floor values eg :d a(i) d    start= 2-(3-1)/2=2-2/2=1,end=2+3/2=3.5=3(floor valu)
	end=i+len/2;   //(len-1)/2      is the distance from from center(i) to start of palindrome       
	               //len/2 gives distance from center to end of palindrome  /len is lengthof currnt palndrm
	
	}
		
	}
	return str.substring(start, end+1);//substring method does not return end value so +1
}


private static int expand(String str, int left, int right) {//input string,left=potential center of palindrome,right 
	//index is potential center of palindrome
	// TODO Auto-generated method stub
	while(left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right)) {//loop continues as long as conditions met
		left--;
		right++;
	}
	return right-left-1;
}
}