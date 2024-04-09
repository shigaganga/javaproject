package StringAssignments;

public class Q4ReverseStr {
	public static void main(String[] args) {
		Q4ReverseStr obj=new Q4ReverseStr();
		obj.reverse();
	}
	
	public void reverse() {
		String str="Java";
		System.out.println("Given string is: "+str);
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String is: "+rev);
	}


		
	}

